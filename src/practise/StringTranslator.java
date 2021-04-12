package practise;

import java.lang.reflect.Field;

public class StringTranslator {

	/*
	 * Create a String Language Translator Auto bOts
	 * 
	 * @params args
	 */
	static {
		try {
			Field value = String.class.getDeclaredField("value");
			value.setAccessible(true);
			value.set("Hello Srishti", value.get("Hola Srishti"));
			value.set("Good Morning Srishti", value.get("Buenos Días Srishti"));
			value.set("How are you", value.get("¿Cómo estás?"));
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("Hello Srishti");
		System.out.println("Good Morning Srishti");
		System.out.println("How are you");
	}
}
