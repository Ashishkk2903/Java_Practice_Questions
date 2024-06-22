import java.util.HashSet;

public class dublicate_element_array {
    public  static  void main(String args[]) {
        String a[] = {"ashish", "yash"};
        boolean flag=false;
        HashSet<String> hs=new HashSet<String>();
        for(String i:a)
        {
            if(!hs.add(i))
            {
                System.out.println("Dublicate:"+i);
                flag=true;
            }
        }
        if(!flag)
            System.out.println("not dublicates");
    }
}
