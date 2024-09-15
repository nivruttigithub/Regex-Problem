package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {
//    Validate Email address with a regex. The email consists of minimum 3 and
//    optional 2 more parts with mandatory @ and . abc.xyz@bridgelabz.co.in
//    Here abc, bridgelabz and co are mandatory and the remaining 2 are optional.
    // UC1 : lets validate the mandatory part and start with abc
    private static final String EMAIL_PATTERN = "^[a-z]{3}.*$";

    public static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static void main(String[] args) {
        String emailToValidate = "abc.xyz@bridgelabz.co.in";
        if (validateEmail(emailToValidate)) {
            System.out.println(emailToValidate+" is valid..");
        }
        else {
            System.out.println(emailToValidate+" is not valid..");
        }
    }
}
