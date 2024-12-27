package lambda.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
/*
 * Task 7: Validate Username with Predicate Instructions:
 * Use a Predicate<String> to validate usernames, ensuring they are at least 6 characters long.
 * Write a method that takes a list of usernames and filters valid ones using the predicate.\
 */

public class ValidateUsernameWithPredicate {
    public static void main(String[] args) {
        List<String> userNames = new ArrayList<>();
        userNames.add("randomUserName1");
        userNames.add("randomUserName2");
        userNames.add("randomUserName3");
        userNames.add("randomUserName4");
        userNames.add("user");

        Predicate<String> predicate = s -> s.length() >= 6;

        validateUserName(userNames, predicate);

    }

    public static void validateUserName(List<String> userNames, Predicate<String> condition) {
        userNames.forEach(s -> {
            if (condition.test(s)) {
                System.out.println(s);
            }
        });
    }
}
