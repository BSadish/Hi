public class lengthcapacity {
    public static void main(String args[])
    {
        StringBuffer s=new StringBuffer("BCA 3RD SEMESTER");
        int l=s.length();
        int c=s.capacity();

        System.out.println("Length of given string =" +l);
        System.out.println("Capacity of given string =" +c);


    }
}
