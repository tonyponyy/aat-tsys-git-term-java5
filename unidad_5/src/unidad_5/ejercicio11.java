package unidad_5;

import javax.swing.JOptionPane;

public class ejercicio11 {
	public static void main(String[] args) {
		String input_user = JOptionPane.showInputDialog("Dime un dia de la semana (minusculas) :");
		switch (input_user.toLowerCase()) {
        case "lunes":
        	 JOptionPane.showMessageDialog(null,"Dia laborable ");
             break;
        case "martes":
        	 JOptionPane.showMessageDialog(null,"Dia laborable ");
             break;
        case "miércoles":
        	 JOptionPane.showMessageDialog(null,"Dia laborable ");
             break;
        case "jueves":
        	 JOptionPane.showMessageDialog(null,"Dia laborable ");
             break;
        case "viernes":
            JOptionPane.showMessageDialog(null,"Dia laborable ");
            break;
        case "sábado":
        	 JOptionPane.showMessageDialog(null,"Dia de fiesta ");
             break;
        case "domingo":
        	JOptionPane.showMessageDialog(null,"Dia de fiesta ");
            break;
        default:
            System.out.println("dia no valido");
		}
	}
}
