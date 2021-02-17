
package eg1;

public class Demo1 {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = "Hey";
		System.out.println("s1==s2 " + (s1==s2));
		System.out.println("s1==s3 " + (s1==s3));
		System.out.println("s1==s4 " + (s1==s4));
		
		System.out.println("s1.equals(s2) " + s1.equals(s2));
		System.out.println("s1.equals(s2) " + s1.equals(s3));
		System.out.print("s1.equals(s4) " + s1.equals(s4));
		
		String s6 = "Hello there, how are you?";
		String ar1[]=s6.split(" ");
		for (int i=0; i< ar1.length; i++) {
				System.out.println(ar1[i]);
		
	}

}
}
