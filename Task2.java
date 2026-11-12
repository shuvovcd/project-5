import java.util.Scanner;

public class ResidentsOnStreet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int[] residents = new int[n];
        for (int i = 0; i < n; i++) {
            residents[i] = scanner.nextInt();
        }
        
        int totalResidents = 0;
        int leftTotal = 0;
        int rightTotal = 0;
        int leftCount = 0;
        int rightCount = 0;
        
        for (int i = 0; i < n; i++) {
            int houseNumber = i + 1;
            totalResidents = totalResidents + residents[i];
            
            if (houseNumber % 2 == 1) {
                leftTotal = leftTotal + residents[i];
                leftCount++;
            } else {
                rightTotal = rightTotal + residents[i];
                rightCount++;
            }
        }
        
        System.out.println("Total residents: " + totalResidents);
        System.out.println("Left side residents: " + leftTotal);
        System.out.println("Right side residents: " + rightTotal);
        
        if (leftCount == 0) {
            System.out.println("Left side average: N/A");
        } else {
            double leftAverage = (double) leftTotal / leftCount;
            System.out.println("Left side average: " + leftAverage);
        }
        
        if (rightCount == 0) {
            System.out.println("Right side average: N/A");
        } else {
            double rightAverage = (double) rightTotal / rightCount;
            System.out.println("Right side average: " + rightAverage);
        }
        
        scanner.close();
    }
}
