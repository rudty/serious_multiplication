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
public class DoubleMultiplicationServiceTest {

    @Autowired
    DoubleMultiplicationService multiplicationService;

    @Test
    void testMultiplication_2_1_2_1(CapturedOutput output) throws InterruptedException {
        Number result = multiplicationService.multiplication(2.1, 2.1);
        assertThat(result).isEqualTo(4.41);
        Thread.sleep(1000L);
        assertThat(output.getOut()).contains("2.1 * 2.1 = 4.41\n");
    }

    @Test
    void testMultiplicationOverflow_MAX_MAX(CapturedOutput output) {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Number result = multiplicationService.multiplication(Double.MAX_VALUE, Double.MAX_VALUE);
        });
        assertThat(output.getOut()).contains("overflow " + Double.MAX_VALUE + " * " + Double.MAX_VALUE + "\n");
    }
}
