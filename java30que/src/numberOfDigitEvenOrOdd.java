import java.util.Scanner;

public class numberOfDigitEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int even = 0;
        int odd=0;
        while (a > 0) {
           int rem=a%10;
            if(rem%2==0)
                even++;
            else
                odd++;
            a = a / 10;
        }
        System.out.print("even count"+even + "odd Count:"+odd);
    }


}
