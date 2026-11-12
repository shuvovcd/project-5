import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int subjects = scanner.nextInt();
        int students = scanner.nextInt();
        
        int[][] grades = new int[students][subjects];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < subjects; j++) {
                grades[i][j] = scanner.nextInt();
            }
        }
        
        double[] averages = new double[students];
        double groupTotal = 0;
        
        for (int i = 0; i < students; i++) {
            int studentTotal = 0;
            for (int j = 0; j < subjects; j++) {
                studentTotal = studentTotal + grades[i][j];
            }
            averages[i] = (double) studentTotal / subjects;
            groupTotal = groupTotal + studentTotal;
        }
        
        double groupAverage = groupTotal / (students * subjects);
        
        double highestAverage = averages[0];
        for (int i = 1; i < students; i++) {
            if (averages[i] > highestAverage) {
                highestAverage = averages[i];
            }
        }
        
        System.out.println("Student averages:");
        for (int i = 0; i < students; i++) {
            System.out.println(averages[i]);
        }
        
        System.out.println();
        System.out.println("Group average:");
        System.out.println(groupAverage);
        
        System.out.println();
        System.out.println("Highest-performing student:");
        for (int i = 0; i < students; i++) {
            if (averages[i] == highestAverage) {
                System.out.println(i + 1);
            }
        }
        
        System.out.println();
        System.out.println("Students with at least one grade below 5:");
        
        boolean found = false;
        for (int i = 0; i < students; i++) {
            boolean hasLowGrade = false;
            for (int j = 0; j < subjects; j++) {
                if (grades[i][j] < 5) {
                    hasLowGrade = true;
                }
            }
            if (hasLowGrade) {
                System.out.println(i + 1);
                found = true;
            }
        }
        
        if (found == false) {
            System.out.println("None");
        }
        
        scanner.close();
    }
}
