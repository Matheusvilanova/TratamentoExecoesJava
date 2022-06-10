package app;

import javax.swing.JOptionPane;

public class App {

	private int a;
	private int b;
	private int c;
	
	public static void main(String[] args) {
		
		App app = new App();
		
		try {
			int resultado = app.delta(7, 3, -4);
			JOptionPane.showMessageDialog(null,"Delta= "+resultado);
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "Delta menor que zero, verifique os valores e tente novamente");
		}
		
	}
	
	public int delta(int a, int b, int c) {
		
		this.a= a;
		this.b= b;
		this.c= c;
		
		int delta =b^2*4*a*c;
		
		
		if(delta<0) {
			
			throw new ArithmeticException();
		}
		
		return delta;
	}
	
}
