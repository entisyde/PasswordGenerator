package de.kilianbennett.passgen;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Random;

public class PasswordGenerator 
{
	public static void main(String[] args)
	{
		Random random = new Random();
		String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String specialCharacters = ",;.:!?()/\\-_•²■▬";
		String password = "";
		
		for (int i = 0; i < 20; i++)
		{
			int r = random.nextInt(7);
			if (r == 0 || r == 1) password += lowercaseLetters.charAt(random.nextInt(26));
			else if (r == 2 || r == 3) password += uppercaseLetters.charAt(random.nextInt(26));
			else if (r == 4 || r == 5) password += random.nextInt(10);
			else if (r == 6) password += specialCharacters.charAt(random.nextInt(10));
		}
		
		StringSelection stringSelection = new StringSelection(password);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
	}
}
