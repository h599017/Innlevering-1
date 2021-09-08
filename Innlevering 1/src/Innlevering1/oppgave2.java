package Innlevering1;

import javax.swing.JOptionPane;

public class oppgave2 {
	
	public static void main(String[] args) {

		for(int x = 10;x>=1;x--) {
			
			int poeng = Integer.parseInt(JOptionPane.showInputDialog("Hvor mange poeng fikk eleven? Det er " + x + " elever igjen."));
		
			if(100 >= poeng && poeng >= 90) {
				System.out.println("karakter: A");
				}
				else if(89 >= poeng && poeng > 79) {
					System.out.println("karakter: B");
				}
				else if(79 >= poeng && poeng > 59) {
					System.out.println("karakter: C");
				}
				else if(59 >= poeng && poeng > 49) {
					System.out.println("karakter: D");
				}
				else if(49 >= poeng && poeng > 39) {
					System.out.println("karakter: E");
				}
				else if(39 >= poeng && poeng >= 0) {
					System.out.println("karakter: F");
				}
				else {
					System.out.println("Ugyldig verdi.");
					x++;
				}
			}
		}
	}
