public class largestOfThreeNumbers {
    public static void main(String args[])
    {
        int a=678324;
        int b=9999932;
        int c=534;

//        if(a>b&&a>c)
//            System.out.print(a+"is greater");
//        else if (b>a&&b>c)
//            System.out.print(b+"is greater");
//        else
//            System.out.print(c+"is greater");
        int l=a>b?a:b;
        int large=l>c?l:c;
        System.out.print(large+"is greater");

    }
}
