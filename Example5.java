class Example5 {

    public static void main(String args[]) {

        StringBuilder sb = new StringBuilder("Welcome");
		sb.append(" to Java");
		System.out.println(sb);		//Welcome to Java
		sb.reverse();
		System.out.println(sb);		//avaJ ot emocleW
		sb.reverse();
		System.out.println(sb);		//Welcome to Java
		sb.delete(7, 10);
		System.out.println(sb);		//Welcome Java
		sb.insert(7, " to");
		System.out.println(sb);		//Welcome to Java
		StringBuffer sb1 = new StringBuffer("abcdefg");
		System.out.println(sb1.insert(3, "ijkl").reverse().delete(2, 4).toString());
    }
}

// sb1 = abcdefg
// sb1 = abcijkldefg
// sb1 = gfedlkjicba
// sb1 = gflkjicba

