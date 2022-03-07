import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        for (int i = 0; i < x; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            int data = a;
            for (int j = 0; j < n; j++) {
                data += Math.pow(2, j) * b;
                System.out.printf("%s ", data);
            }
            System.out.println();
        }
        scan.close();
    }
}
