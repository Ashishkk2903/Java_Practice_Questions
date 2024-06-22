public class Even_ODD_from_Array {
    public  static  void main(String args[])
    {
        int a[] = {0, 1, 2, 3, 4, 5};
        int even=0,odd=0;
        for(int i:a)
        {
            if(i%2==0) {
                System.out.print(i);
                even++;
            }
            else
                odd++;
        }
        System.out.print(even+" odd"+odd);
    }
}
