package dec30;

public class input_taking {
    public static void main(String[] args) {
        int age=Integer.parseInt( args[0]);
        System.out.println(args[0]);
        System.out.println(age>25 ? "allowed to goa": "not allowed");
    }
}
