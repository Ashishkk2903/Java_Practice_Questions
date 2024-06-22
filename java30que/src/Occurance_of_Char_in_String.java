public class Occurance_of_Char_in_String {
    public static void main(String args[])
    {
        String a="ashish katkar";
        int b=a.length();
        String result=a.replaceAll("a","");
        int c=result.length();
        int count=b-c;
        System.out.print(count);
    }
}
