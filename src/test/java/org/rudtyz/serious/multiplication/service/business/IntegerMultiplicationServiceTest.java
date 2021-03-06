package org.rudtyz.serious.multiplication.service.business;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(OutputCaptureExtension.class)
public class IntegerMultiplicationServiceTest {

    @Autowired
    IntegerMultiplicationService multiplicationService;

    @Test
    void testMultiplication_8_9(CapturedOutput output) throws InterruptedException {
        Number result = multiplicationService.multiplication(8, 9);
        assertThat(result).isEqualTo(72);
        Thread.sleep(1000L);
        assertThat(output.getOut()).contains("8 * 9 = 72\n");
    }

    @Test
    void testMultiplication_11_11(CapturedOutput output) throws InterruptedException {
        Number result = multiplicationService.multiplication(11, 11);
        assertThat(result).isEqualTo(121);
        Thread.sleep(1000L);
        assertThat(output.getOut()).contains("11 * 11 = 121\n");
    }

    @Test
    void testMultiplicationOverflow_MAX_MAX(CapturedOutput output) {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Number result = multiplicationService.multiplication(Integer.MAX_VALUE, Integer.MAX_VALUE);
        });

        assertThat(output.getOut()).contains("overflow 2147483647 * 2147483647\n");
    }
}
