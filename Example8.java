class Example8 {
    public static void main(String args[]) {
        String str1 = "Abc";
        String str2 = "Abc";
        System.out.println(str1.compareTo(str2));       //0

        String str3 = "Abc";
        String str4 = "abc";
        System.out.println(str3.compareTo(str4));       //-32
        System.out.println(str3.compareToIgnoreCase(str4)); //0

        String str5 = "ABc";
        String str6 = "Abc";
        System.out.println(str5.compareTo(str6));       //-32
        System.out.println(str5.compareToIgnoreCase(str6));//0

        String str7 = "Abcd";
        String str8 = "Abc";
        System.out.println(str7.compareTo(str8));   //1
        System.out.println(str8.compareTo(str7));   //-1

    }
}