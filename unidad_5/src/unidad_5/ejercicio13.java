package unidad_5;

import javax.swing.JOptionPane;

public class ejercicio13 {
	public static void main(String[] args) {
		String n1_string = JOptionPane.showInputDialog("Introduce numero1.");
		double n1 = Double.parseDouble(n1_string);
		String n2_string = JOptionPane.showInputDialog("Introduce numero2.");
		double n2 = Double.parseDouble(n2_string);
		String operando = JOptionPane.showInputDialog("Introduce operando (+,-,*,/,^,%)");
		
		switch (operando) {
        case "+":
        	 JOptionPane.showMessageDialog(null,n1+n2 );
             break;
        case "-":
        	 JOptionPane.showMessageDialog(null,n1-n2);
             break;
        case "*":
        	 JOptionPane.showMessageDialog(null,n1*n2);
             break;
        case "/":
        	 JOptionPane.showMessageDialog(null,n1/n2);
             break;
        case "^":
            JOptionPane.showMessageDialog(null,Math.pow(n1,n2));
            break;
        case "%":
        	 JOptionPane.showMessageDialog(null,n1%n2);
             break;
        default:
            System.out.println("Operando no valido !");
		}
		
		
			}

}
