public class remove_junk_fromString {
    public static void main(String args[])
    {
//        String s="#^%^&^&HGHGHG&^%&^%&%$%";
//        String b=s.replaceAll("[^a-zA-Z]","");
//        System.out.print(b);


        //removing black space

        String s="as     hi  sh k    is  hor katkar";
        s=s.replaceAll(" ","");
        System.out.print(s);
    }
}
