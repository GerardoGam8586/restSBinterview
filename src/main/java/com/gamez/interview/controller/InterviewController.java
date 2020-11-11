package com.gamez.interview.controller;

import com.gamez.interview.Entities.MessageResponse;
import com.gamez.interview.Entities.Values;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterviewController {

    @RequestMapping(value = "/getMessage", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String getMessage(){

        String val = "I'll";
        Values vals = new Values();

        int cont = 1;

        do {
            switch (cont) {
                case 1:
                    transform(val, ++cont);
                    break;
                case 2:
                    vals.setValue(val);
                    transform(vals, ++cont);
                    break;
                case 3:
                    val = transform(vals.getValue().toCharArray(), ++cont);
                    break;
            }

        } while (cont < 3);

        return val;
    }

    public static void transform(Values vals, byte condition){
        vals.setValue(vals.getValue() + (condition == 2 ? " show you how deep" : "  for you with"));
    }

    public static void transform(String strval, byte condition){
        strval += condition == 1? " be waiting":" be there for you";
    }

    public static String transform(char[] strval, byte condition){
        return condition == 1 ? String.copyValueOf(strval) + " with a lot of patient": String.copyValueOf(strval) + " the rabbit hole goes";
    }

}
