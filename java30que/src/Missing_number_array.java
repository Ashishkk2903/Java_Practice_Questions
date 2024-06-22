public class Missing_number_array {
    public  static  void main(String args[]) {
        int a[] = {1, 7, 2, 3, 4, 5, 8, 9, 10};
        int sum1=0,sum2=0,missedNo=0;
        for(int i:a)
        {
            sum1=sum1+i;
        }
        for(int i=0;i<=10;i++)
        {
            sum2=sum2+i;
        }
        missedNo=sum2-sum1;
        System.out.print(missedNo);

    }

}
