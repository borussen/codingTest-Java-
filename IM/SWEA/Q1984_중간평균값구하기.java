import java.util.Scanner;
 
class Q1984_중간평균값구하기 {
    public static void main(String args[]) throws Exception {   
        Scanner sc = new Scanner(System.in);
         
        int T;
        T=sc.nextInt();
 
        for(int test_case = 1; test_case <= T; test_case++) {
            int num = sc.nextInt();
            int sum = num;
            int max = num;
            int min = num;
            for(int i = 2; i <= 10; i++) {
                num = sc.nextInt();
                sum += num;
                if (max < num) {
                    max = num;
                }
                if (min > num) {
                    min = num;
                }
            }
            sum = sum - max - min;
            System.out.println("#" + test_case + " " + Math.round(sum/8.0));
        }
    }
}