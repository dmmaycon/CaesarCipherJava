package com.github.dmmaycon.classes;
/**
 * @author dmmaycon
 * @email  mayconmoraes.dm@gmail.com
 */
public class Rotor {

	private int start = 97; // a
	private int end   = 122; // z
	private int shift;

	
	public Rotor(int shift) {
		this.shift = shift;
	}

	public Rotor(int start, int end, int shift) {
		this.start = start;
		this.end   = end;
		this.shift = shift;
	}
	
	public char shifting(char letter) {
		int position = letter;
		
		if (position < start || position > end) {
			return letter;
		}
		
		if ((position + shift) > end) {
			int diff = (shift - (end - position)) - 1;
			return (char) (start + diff);
		} else if ((position + shift) < start) {
			int diff = (shift - (start - position)) + 1;			
			return (char) (end + diff);
		}
		return (char)(position + shift);
	}
	
}
