package TestSample;

import java.util.Base64;

public class EncryptionSelenium {

	public static void main(String[] args) {
		
		String encrptData= "Password";
		
		byte[] encode= Base64.getEncoder().encode(encrptData.getBytes());
		String encodevalue= new String(encode);
		//System.out.println("encode..." + new String(encode));
		System.out.println(encodevalue);
		
		byte[] decode= Base64.getDecoder().decode(encodevalue.getBytes());
		String decodevalue= new String(decode);
		System.out.println(decodevalue);

	}

}
