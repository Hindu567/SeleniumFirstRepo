package TestSample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Base64;

public class EncryptionSelenium {

	public static void main(String[] args) throws AWTException {
		
		String encrptData= "Password";
		
		byte[] encode= Base64.getEncoder().encode(encrptData.getBytes());
		String encodevalue= new String(encode);
		//System.out.println("encode..." + new String(encode));
		System.out.println(encodevalue);
		
		byte[] decode= Base64.getDecoder().decode(encodevalue.getBytes());
		String decodevalue= new String(decode);
		System.out.println(decodevalue);
		
		StringSelection sl= new StringSelection("");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sl, null);
		Robot rb= new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);

	}

}
