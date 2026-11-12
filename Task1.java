import java.util.Scanner;

public class LargestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int[] radii = new int[n];
        for (int i = 0; i < n; i++) {
            radii[i] = scanner.nextInt();
        }
        
        int maxRadius = radii[0];
        for (int i = 1; i < n; i++) {
            if (radii[i] > maxRadius) {
                maxRadius = radii[i];
            }
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (radii[i] == maxRadius) {
                count++;
            }
        }
        
        System.out.println(maxRadius + " - " + count);
        
        scanner.close();
    }
}
