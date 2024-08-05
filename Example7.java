import java.util.StringTokenizer;

class Example7 {
    public static void main(String args[]) {
        StringTokenizer st = new StringTokenizer("this is a test string");
        while (st.hasMoreTokens()) {
	        System.out.println(st.nextToken());
        }

        StringTokenizer st1 = new StringTokenizer("this-is-another-test-string","-");
        System.out.println("Number of Tokens : " + st1.countTokens());
        while (st1.hasMoreElements()) {
	        System.out.println(st1.nextElement());
        }
    
    }
}