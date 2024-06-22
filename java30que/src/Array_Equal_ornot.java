import java.util.Arrays;

public class Array_Equal_ornot {
    public  static  void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {1, 2, 4, 3, 5};
        boolean result=false;
//        boolean result= Arrays.equals(a,b);
//        System.out.print(result);
        if(a.length==b.length)
        {
            for(int i=0;i<a.length;i++)
            {
                if(a[i]==b[i])
                {
                    result=true;
                }
            }
            System.out.print(result);
        }
        else
            System.out.print(result);
    }
}
