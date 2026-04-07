
public class StringBuilderDemo {
    public static void main(String[] args) {
        java.lang.StringBuilder s = new java.lang.StringBuilder("Samiir");
        System.out.println(s.length()+ " " + s.capacity());
        System.out.println(s);
        s.append("Singh");
        System.out.println(s);
    }
}
