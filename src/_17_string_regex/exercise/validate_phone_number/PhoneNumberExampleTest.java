package _17_string_regex.exercise.validate_phone_number;

import _17_string_regex.exercise.validate_class.ClassExample;

public class PhoneNumberExampleTest {
    private static PhoneNumberExample phoneNumberExample;
    public static final String[] validPhoneNumber = new String[] {"(84)-(0978489648)"};
    public static final String[] invalidPhoneNumber = new String[] { "(a8)-(22222222)" };
    public static void main(String args[]) {
        phoneNumberExample = new PhoneNumberExample();
        for (String classes : validPhoneNumber) {
            boolean isvalid = phoneNumberExample.validate(classes);
            System.out.println("phone number is " + classes +" is valid: "+ isvalid);
        }
        for (String classes : invalidPhoneNumber) {
            boolean isvalid = phoneNumberExample.validate(classes);
            System.out.println("phone number is " + classes +" is valid: "+ isvalid);
        }
    }
}
