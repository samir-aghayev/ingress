package homework2;

import java.util.*;

public class StudentGrade {
    private static HashMap<String, ArrayList<Integer>> students;

    public static void main(String[] args) {
        students = new HashMap<>();
        students.put("Emil", new ArrayList<>(Arrays.asList(90, 65, 75, 80)));
        students.put("Ali", new ArrayList<>(Arrays.asList(90, 95, 100, 80)));
        students.put("Nicat", new ArrayList<>(Arrays.asList(80, 78, 57, 90)));
        students.put("Vuqar", new ArrayList<>(Arrays.asList(67, 98, 10, 50)));
        String highAverageScoreStudent = findHighAverageScoreStudent();
        System.out.println(highAverageScoreStudent);

    }

    public static void addScores(String name, int score) {
        students.get(name).add(score);
    }

    public static double averageScore(String name) {
        List<Integer> scores = students.get(name);
        if (scores == null || scores.isEmpty()) {
            return 0;
        }
        double totalSum = 0;
        for (Integer score : scores) {
            totalSum += score;
        }
        return totalSum / scores.size();
    }

    public static String findHighAverageScoreStudent() {
        double maxScore = 0;
        String maxPointStudentName = null;
        String[] names = students.keySet().toArray(new String[0]);
        for (String name : names) {
            double grade = averageScore(name);
            if (maxScore < grade) {
                maxScore = grade;
                maxPointStudentName = name;
            }
        }
        return maxPointStudentName;
    }
}
