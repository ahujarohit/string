import java.util.StringJoiner;

class Example6 {
    public static void main(String args[]) {
        StringJoiner sj = new StringJoiner(":", "[", "]");
        sj.add("Akash").add("Rohit").add("Manish");
        System.out.println("Length: " + sj.length());
        String desiredString = sj.toString(); 
        System.out.println(desiredString);

        StringJoiner sj1 = new StringJoiner(":", "[", "]");
        sj1.setEmptyValue("No Elements");
        desiredString = sj1.toString(); 
        System.out.println(desiredString);
        sj1.add("Akash").add("Rohit").add("Manish");
        desiredString = sj1.toString(); 
        System.out.println(desiredString);

        sj.merge(sj1);
        desiredString = sj.toString(); 
        System.out.println(desiredString);

    }
}