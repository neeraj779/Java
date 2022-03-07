import java.util.Scanner;
class Solution{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.printf("================================\n");
        for(int i = 0; i<3; i++){
            String str = scan.next();
            int x = scan.nextInt();
            System.out.printf("%-15s", str);
            System.out.printf("%03d\n", x);
        }
        System.out.printf("================================");
    }
}
