package Innlevering1;

import javax.swing.JOptionPane;

public class oppgave3 {

	public static void main(String[] args) {
		
		int fakultert = 1;
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Hvilket tall vil du beregnet den fakulterte for?"));
		
		for(int i = n; i>0 ; i--) {
			
			fakultert = fakultert * i;
		}
		
		System.out.println(fakultert);

	}

}
