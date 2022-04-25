package _17_string_regex.exercise.validate_class;

import _17_string_regex.practice.validate_account.AccountExample;

public class ClassExampleTest {
    private static ClassExample classExample;
    public static final String[] validClass = new String[] { "C0318G" };
    public static final String[] invalidClass = new String[] { "M0318G, P0323A" };
    public static void main(String args[]) {
        classExample = new ClassExample();
        for (String classes : validClass) {
            boolean isvalid = classExample.validate(classes);
            System.out.println("Account is " + classes +" is valid: "+ isvalid);
        }
        for (String classes : invalidClass) {
            boolean isvalid = classExample.validate(classes);
            System.out.println("Account is " + classes +" is valid: "+ isvalid);
        }
    }
}

