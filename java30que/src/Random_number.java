import java.util.Random;
import java.util.Scanner;

public class Random_number {
    public  static  void main(String args[])
    {
        Random random=new Random();
        int n= random.nextInt(12,22);
        System.out.print(n);
    }
}
