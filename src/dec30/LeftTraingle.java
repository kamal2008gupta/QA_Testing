package dec30;

public class LeftTraingle {

        public static void main(String[] args) {
            int n = 5; // Number of rows

            for (int i = n; i >=1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println(); // Move to next line
            }
        }

}
