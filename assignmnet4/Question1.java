//1.Write a Java program that compares two wrapper objects 
// for equality and demonstrates 
//when to use equals() instead of == (try with Integer or Float classes)

package assignmnet4;

public class Question1 {
	public static void main(String[] args) {
		Integer a = new Integer(42);
		Float b = new Float(12.41f);
		System.out.println("Objects are not equals :" + a.equals(b));
		System.out.println("objects are equals :" + a.equals(a));
	}
}