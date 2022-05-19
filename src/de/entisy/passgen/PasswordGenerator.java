package com.entisy.passgen;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Random;

public class PasswordGenerator 
{
	private String password = "";
	private int length = 20; // Standard value of 20 characters length
	
	public PasswordGenerator(int length) {
		this.length = length;
	}

	public PasswordGenerator() {}
	
	public PasswordGenerator generateNew() {
		Random random = new Random();
		String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String specialCharacters = ",;.:!?()/\\-_•";
		
		for (int i = 0; i < length; i++) {
			int r = random.nextInt(7);
			if (r == 0 || r == 1) password += lowercaseLetters.charAt(random.nextInt(26));
			else if (r == 2 || r == 3) password += uppercaseLetters.charAt(random.nextInt(26));
			else if (r == 4 || r == 5) password += random.nextInt(10);
			else if (r == 6) password += specialCharacters.charAt(random.nextInt(13));
		}
		return this;
	}

	public Password getPassword() {
		return new Password(password);
	}
	
	public static class Password {
		
		private final String password;
		
		public Password(String password) {
			this.password = password;
		}
		
		public String getString() {
			return password;
		}
		
		public void copyToClipboard() {
			StringSelection stringSelection = new StringSelection(password);
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(stringSelection, null);
		}
	}
}
