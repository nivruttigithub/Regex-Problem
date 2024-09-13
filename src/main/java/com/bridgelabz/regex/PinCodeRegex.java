package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeRegex {
    public static final String PINCODE_PATTERN = "^[1-9][0-9]{5}$";
    public static boolean validatePinCode(String pinCode)
    {
        Pattern pattern = Pattern.compile(PINCODE_PATTERN);
        Matcher matcher = pattern.matcher(pinCode);
        return matcher.matches();
    }
    public static void main(String[] args) {
        String pincodeToValidate = "400088";

        if(validatePinCode(pincodeToValidate)){
            System.out.println(pincodeToValidate+ " is valid pincode.");
        }
        else{
            System.out.println("Invalid Pincode..!");
        }
    }
}
