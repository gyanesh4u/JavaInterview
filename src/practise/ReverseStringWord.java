package practise;

public class ReverseStringWord {

public static void main(String[] args) {
	String s="i live in India";
	String [] split=s.split(" ");
	String result="";
	for(int i=split.length-1;i>=0;i--){
		result +=(split[i] + " ");
		
	}
	System.out.println(result.trim());
}
}
