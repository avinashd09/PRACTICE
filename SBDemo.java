public class SBDemo {

    public static void main(String args[])
    {
    StringBuffer sb;
        sb = new StringBuffer("ABCDEFG");
    System.out.println(sb);
    sb.append("xyz");
    System.out.println(sb);
    sb.delete(2, 7);
    System.out.println(sb);
    sb.insert(2,"HELLO");
    System.out.println(sb);
    sb.replace(2, 4, "ASD");
    System.out.println(sb);
    sb.setLength(4);
    System.out.println(sb);
    sb.reverse();
    System.out.println(sb);
    sb.setCharAt(1,'p');
    System.out.println(sb);
    sb.delete(1, 4);
    System.out.println(sb);
    }
}
