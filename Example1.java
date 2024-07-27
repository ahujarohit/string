import java.util.Scanner;
class Example1 {
    public static void main(String args[]) {
        String str = new String();
        Scanner in = new Scanner(System.in);
        loop:
        while(true) {
            System.out.print("Enter String : ");
            str = in.nextLine();
            if(str.length() < 5) {
                System.out.println("Invalid Length !!");
                continue;
            }
            for(int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(!(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z')) {
                    System.out.println("Invalid Character !!");
                    continue loop;
                }
            }
            break;
        }
        System.out.println("Valid String : " + str);
    }
}