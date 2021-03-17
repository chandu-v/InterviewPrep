package Test;
public class StringTest {
    public static void main(String[] args) {
        String str = "Hello World";
        String str1 = "Hello ";
        String str2 = "World";
        String str3 = str1+str2;
        String str4 = str;
        System.out.println(str == str3);
        System.out.println(str.equals(str3));
    }
}