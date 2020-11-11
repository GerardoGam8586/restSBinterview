package com.gamez.interview;


import com.gamez.interview.Entities.MessageResponse;
import com.gamez.interview.controller.InterviewController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
public class InterviewControllerTest {

    @Autowired
    InterviewController interController;

    @Test
    public void test() throws Exception {
        /*MessageResponse msgResponse = interController.getMessage();
        assertThat(interController).isNotNull();
        assertThat(msgResponse.getStrmessage()).isEqualTo("I'll show you how deep the rabbit hole goes");
        assertThat(msgResponse.getIntcode()).isEqualTo(0);*/



    }

}
