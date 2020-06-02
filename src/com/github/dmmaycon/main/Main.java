/**
 * 
 */
package com.github.dmmaycon.main;

import com.github.dmmaycon.classes.CaesarCipher;
import com.github.dmmaycon.classes.Rotor;

/**
 * @author dmmaycon
 * @email  mayconmoraes.dm@gmail.com
 */
public class Main {


	public static void main(String[] args) {
		System.out.println("--- Caesar Cipher Java ---");
		
		CaesarCipher cc  = new CaesarCipher("As mensagens serão convertidas para minúsculas tanto para a criptografia quanto para descriptografia");
		System.out.println(cc.encrypt(10));
		
		CaesarCipher cc2 = new CaesarCipher(cc.encrypt(10));
		System.out.println(cc2.decrypt(10));
	}

}
