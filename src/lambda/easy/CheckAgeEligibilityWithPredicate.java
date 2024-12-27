package lambda.easy;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*
 * Task 3: Check Age Eligibility with Predicate Instructions:
 * Use a Predicate<Integer> to check if a person's age qualifies them as an adult (18 or older).
 * Write a method that prints whether each person in a list of ages is an adult.
 */

public class CheckAgeEligibilityWithPredicate {
    public static void main(String[] args) {
        List<Integer> ages = new ArrayList<>();
        ages.add(19);
        ages.add(14);
        ages.add(17);
        ages.add(18);
        ages.add(21);
        ages.add(15);
        ages.add(26);
        Predicate<Integer> predicate = integer -> integer >= 18;
        checkAge(ages, predicate);

    }

    public static void checkAge(List<Integer> list, Predicate<Integer> condition) {
        list.forEach(age -> {
            if (condition.test(age)) {
                System.out.println("age is:" + age + " Person is adult");
            } else {
                System.out.println("age is:" + age + " Person is child");
            }
        });
    }
}
