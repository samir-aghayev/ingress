package lambda.easy;

import java.util.List;
import java.util.function.Consumer;

/*
 * Task 10: Log User Activity with Consumer Instructions:
 * Use a Consumer<String> to log user activity by appending "Activity: " before each log message.
 * Write a method that processes a list of user actions using this consumer.
 */

public class LogUserActivityWithConsumer {
    public static void main(String[] args) {
        List<String> actions = List.of(
                "Logged in",
                "Viewed profile",
                "Updated settings",
                "Logged out"
        );

        Consumer<String> consumer = action -> System.out.println("Activity " + action);

        logUserActivity(actions, consumer);

    }

    public static void logUserActivity(List<String> actions, Consumer<String> consumer) {
        actions.forEach(consumer);
    }
}
