package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {
//    Validate Email address with a regex. The email consists of minimum 3 and
//    optional 2 more parts with mandatory @ and . abc.xyz@bridgelabz.co.in
//    Here abc, bridgelabz and co are mandatory and the remaining 2 are optional.

    // UC1 : lets validate the mandatory part and start with abc

    // UC2 : Ensure @ and validate the mandatory 2nd part i.e. bridgelabz

    // UC3 : Ensure “.” after bridgelabz and validate the mandatory 3rd part i.e. co

    // UC4 : Lets handle optional part i.e. xyz in abc.xyz@bridgelabz.co.in
    //      NOTE : make sure only the following are valid special characters _,+, -,. proceeding to xyz.

    // UC5 : Finally lets close the expression with supporting optional parts.
    // Note: Top Level Domains (TLD) in the last part is the optional country code and it is 2 characters only.

    private static final String EMAIL_PATTERN = "^[a-z]{3}([_+\\-.][a-z]+)?@[a-z]{10}\\.[a-z]{2}(\\.[a-z]{2})?$";

    public static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static void main(String[] args) {
        String emailToValidate1 = "abc@bridgelabz.co.in";     // Valid, with optional country code
        String emailToValidate2 = "abc.xyz@bridgelabz.co";     // Valid, without country code
        String emailToValidate3 = "abc.xyz@bridgelabz.co.uk";   // Valid, with optional country code
        String emailToValidate4 = "abc.xyz@bridgelabz";        // InValid, missing dot and TLD after domain

        // Validate the emails
        System.out.println(emailToValidate1 + " = " + (validateEmail(emailToValidate1) ? "Valid" : "Invalid"));
        System.out.println(emailToValidate2 + " = " + (validateEmail(emailToValidate2) ? "Valid" : "Invalid"));
        System.out.println(emailToValidate3 + " = " + (validateEmail(emailToValidate3) ? "Valid" : "Invalid"));
        System.out.println(emailToValidate4 + " = " + (validateEmail(emailToValidate4) ? "Valid" : "Invalid"));
    }
}
