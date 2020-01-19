package org.rudtyz.serious.multiplication.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(OutputCaptureExtension.class)
public class MultiplicationServiceTest {

    @Autowired
    MultiplicationService multiplicationService;

    @Test
    void testMultiplication_8_9(CapturedOutput output) {
        int result = multiplicationService.multiplication(8, 9);
        assertThat(result).isEqualTo(72);
        assertThat(output.getOut()).contains("8 * 9 = 72\n");
    }

    @Test
    void testMultiplication_11_11(CapturedOutput output) {
        int result = multiplicationService.multiplication(11, 11);
        assertThat(result).isEqualTo(121);
        assertThat(output.getOut()).contains("11 * 11 = 121\n");
    }
}
