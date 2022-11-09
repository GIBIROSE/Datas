package stringgeneration;

import java.nio.charset.Charset;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class StrGenertr {

	
	
	
	public void display() {
		Random random=new Random();
		String id=String.format("%04d", random.nextInt(1000));
		System.out.println(id);
	}
//	public void givenUsingPlainJava_whenGeneratingRandomStringUnbounded_thenCorrect() {
//		byte[] array = new byte[7]; // length is bounded by 7
//		new Random().nextBytes(array);
//		String generatedString = new String(array, Charset.forName("UTF-8"));
//		String output = "QAtest" + generatedString;
//System.out.println("___________1_____________");
//		 System.out.println(generatedString);
//		System.out.println(output);
//	}
//
//	public void givenUsingApache_whenGeneratingRandomAlphabeticString_thenCorrect() {
//		String generatedString1 = RandomStringUtils.randomAlphabetic(3);
//		String out1 = "test" + generatedString1;
//		System.out.println("______2_________");
//		System.out.println(generatedString1);
//		System.out.println(out1);
//	}

	public static void main(String[] args) {
		StrGenertr s = new StrGenertr();
		s.display();
//		s.givenUsingPlainJava_whenGeneratingRandomStringUnbounded_thenCorrect();
//		s.givenUsingApache_whenGeneratingRandomAlphabeticString_thenCorrect();
	}
}
