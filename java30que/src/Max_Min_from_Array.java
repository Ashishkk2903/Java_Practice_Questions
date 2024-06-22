public class Max_Min_from_Array {
    public  static  void main(String args[]) {
        int a[] = {145, 3452, 354, 9534, 5,2,1231241};
        int max=a[0];
        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
                min=a[i];
        }
        System.out.println(max);
        System.out.println(min);

    }

}
