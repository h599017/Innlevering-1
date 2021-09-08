package Innlevering1;

import javax.swing.JOptionPane;

public class oppgave1 {

	public static void main(String[] args) {
		
		int bint = Integer.parseInt(JOptionPane.showInputDialog("Hva er bruttoinntekten din?"));
		
		if(bint <= 184800) {
			System.out.print("Du betaler ikke trinnskatt.");
			}
			else if(bint <= 260100) {
				System.out.print("Du betaler 1.7% trinnskatt.");
			}
			else if(bint <= 651250) {
				System.out.print("Du betaler 4.0% trinnskatt.");
			}
			else if(bint <= 1021550) {
				System.out.print("Du betaler 13.2% trinnskatt.");
			}
			else if(bint > 1021550) {
				System.out.print("Du betaler 16.2% trinnskatt.");
			}
		else {
			System.out.print("ERROR, try again");
		}
	}
}