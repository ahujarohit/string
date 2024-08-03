class Example2 {
    public static void main(String args[]) {

        System.out.println("*".repeat(15) + " Java 12 " + "*".repeat(15));
        System.out.println("123\nabc\nABC".indent(4));
        String str2 = "string".transform(String::toUpperCase);
        System.out.println(str2);
        String str3 = "abc".transform(str -> str.concat("xyz")).transform(String::toUpperCase);
        System.out.println(str3);
        
        System.out.println("*".repeat(15) + " Java 15 " + "*".repeat(15));
        System.out.println("1) %s 2) %s 3) %s ".formatted("Java", "Python", "JavaScript"));

        String str4 = """
                    Id: %d
                    Name: %s
                    Marks: $%.2f
                    """.formatted(1, "Rohit Ahuja", 90.0f);
        System.out.println(str4);            
                    
        System.out.println("   123".stripIndent());
        System.out.println("123   ".stripIndent());
        System.out.println("   123   ".stripIndent());


        String str5 = "Tab \t Next Line \n Space \s Single Quote \' Double Quote \" ";
        System.out.println(str5.translateEscapes());


        // System.out.println("*".repeat(15) + " Java 8 " + "*".repeat(15));
        // String str1 = String.join("-","this","is","a","new","world");
        // System.out.println(str1);

        // System.out.println("*".repeat(15) + " Java 9 " + "*".repeat(15));
        // "abc".chars().forEach(System.out::println);
        // "abc".codePoints().forEach(System.out::println);

        // System.out.println("*".repeat(15) + " Java 11 " + "*".repeat(15));
        // System.out.println(" ".isBlank());
        // System.out.println("\t \n".isBlank());
        // System.out.println("\t Vedisoft \n".isBlank());
        
        // System.out.println("\t Vedisoft \n".lines().count());
        // System.out.println("\t Vedisoft \n\n\n".lines().count());

        // System.out.println("123".repeat(3));
        // System.out.println("VEDISOFT ".repeat(3));

        // System.out.println("\u2000   VEDISOFT   ".trim());
        // System.out.println("\u2000   VEDISOFT   ".strip());
        // System.out.println("   VEDISOFT   ".stripLeading());
        // System.out.println("   VEDISOFT   ".stripTrailing());

    }
}