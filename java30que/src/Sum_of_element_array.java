public class Sum_of_element_array {
    public  static  void main(String args[])
    {
        int a[]={1,2,3,4,5};
        int sum=0;
//        for(int i=0;i<a.length;i++)
//        {
//            sum=a[i]+sum;
//        }
        for(int i:a)
            sum=sum+i;
        System.out.print(sum);
    }
}
