package practise;

//WAP to remove junk files from string
public class RemoveJunk {

	public static void main(String[] args) {

		String s = "$$#%$#@$$%java#@$%^&^*&selenium";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
