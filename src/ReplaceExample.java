public class ReplaceExample {
    public static void main(String args[])
    {
        StringBuffer s=new StringBuffer("BCA 3RD SEMESTER");
        System.out.println(s);
        s.replace(4,7,"Third");
        System.out.println(s);
    }
}
