package practise;

/*
 * In java string objects are immutable.Immutable means unmodified or unchangeable
 */
public class TestImmutableString {

	public static void main(String[] args) {
		String s = "Sachin";
//		s.concat("Tendulkar");
//		System.out.println(s);// will print Sachin because strings are immutable objects
		s = s.concat(" Tendulkar");
		System.out.println(s);
	}
}
