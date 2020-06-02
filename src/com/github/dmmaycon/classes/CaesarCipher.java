package com.github.dmmaycon.classes;

/**
 * @author dmmaycon
 * @email  mayconmoraes.dm@gmail.com
 */
public class CaesarCipher {

	private String phrase;

	public CaesarCipher(String phrase) {
		this.phrase = phrase.toLowerCase();
	}
	
	
	public String encrypt(int shift) {
		Rotor rotor = new Rotor(shift); 
		StringBuffer newPhrase = new StringBuffer();
		
		for (char letter : phrase.toCharArray()) {
			newPhrase.append(rotor.shifting(letter));
		}
		
		return newPhrase.toString();		
	}
	
	public String decrypt(int shift) {
		return encrypt(-shift);
	}
	
	
	
}
