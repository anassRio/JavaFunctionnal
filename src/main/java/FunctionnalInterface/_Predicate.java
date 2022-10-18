package FunctionnalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        System.out.println("Simple Java Function");
        System.out.println(isPhoneNumberValid("0755863383"));
        System.out.println(isPhoneNumberValid("0655863383"));

        System.out.println("Predicate Functional Interface");
        System.out.println(isPhoneNumberValid.test("0755863383"));
        System.out.println(isPhoneNumberValid.test("0655863383"));

        System.out.println("Simple multi Predicate Functional Interface");
        System.out.println(isPhoneNumberValid.and(containsNumber83).test("0755863383"));
        System.out.println(isPhoneNumberValid.and(containsNumber83).test("0655863383"));
        System.out.println(isPhoneNumberValid.and(containsNumber83).test("0755863387"));
        System.out.println(isPhoneNumberValid.or(containsNumber83).test("0655863383"));

        System.out.println("BiPredicate Function");
        System.out.println(isPhoneNumberValidAndcontainsNumber83.test("0755863383","82"));
        System.out.println(isPhoneNumberValidAndcontainsNumber83.test("0755863383","83"));

    }

    static boolean isPhoneNumberValid(String phoneNumber){
        // simple validation for example
        return phoneNumber.startsWith("07") && phoneNumber.length()==10;
    }

    static Predicate<String> isPhoneNumberValid = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length()==10 && phoneNumber.contains("83");

    static Predicate<String> containsNumber83 = phoneNumber -> phoneNumber.contains("83");

    static BiPredicate<String,String> isPhoneNumberValidAndcontainsNumber83 = (phoneNumber, indic) ->
            phoneNumber.startsWith("07") && phoneNumber.length()==10 && phoneNumber.contains(indic);
}
