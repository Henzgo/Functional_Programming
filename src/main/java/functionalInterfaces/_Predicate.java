package functionalInterfaces;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("Without predicate:");
        System.out.println(isPhoneNumberValid("0444042049"));
        System.out.println(isPhoneNumberValid("0414042495"));

        System.out.println("With predicate:");
        System.out.println(isPhoneNumberValidPredicate.test("0449178574"));
        System.out.println(isPhoneNumberValidPredicate.test("0429175574"));
        System.out.println(isPhoneNumberValidPredicate.test("0449175574"));

        System.out.println(
            "Is phone number valid and contains number 3 = " +
            isPhoneNumberValidPredicate.and(containsNumber3).test("0449138576"));

            System.out.println(
                "Is phone number valid and contains number 3 = " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("0449158576"));
        }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("044") && phoneNumber.length() == 10;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
        phoneNumber.startsWith("044") && phoneNumber.length() == 10;

    static Predicate<String> containsNumber3 = phoneNumber ->
        phoneNumber.contains("3");
}
