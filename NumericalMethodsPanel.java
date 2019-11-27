import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class NumericalMethodsPanel extends JPanel {
	private double idealGasConstant  = 0.082054;
	
	public NumericalMethodsPanel() {
		super();
		this.setPreferredSize(new Dimension(400, 600));
		this.setOpaque(true);
		this.setBackground(Color.GRAY);
	}
	
	public void NewtonRhapsonSolver(double a, double b, double temperature, double pressure) {
		double initialGuess = this.idealGasSolver(pressure, temperature);
		System.out.println("The initial guess is " + initialGuess);
		double newtonRhapsonGuess = initialGuess - (this.vanDerWaalsEquation(a, b, initialGuess, temperature, pressure)/this.vanDerWaalsEquationDerivative(a, b, initialGuess, temperature, pressure));
		System.out.println("The new guess is " + newtonRhapsonGuess);
		
		
	}
	
	public double idealGasSolver(double pressure, double temperature) {
		return ((this.idealGasConstant*temperature)/pressure);
	}
	
	public double vanDerWaalsEquation(double a, double b, double v, double temperature, double pressure) {
		double firstPart = pressure + (a/(Math.pow(v, 2)));
		double secondPart = v-b;
		return (firstPart * secondPart) - (this.idealGasConstant*temperature);
	}
	
	public double vanDerWaalsEquationDerivative(double a, double b, double v, double temperature, double pressure) {
		double secondPart = a/(Math.pow(v, 2));
		double thirdPart = (2*a*b)/(Math.pow(v, 3));
		return pressure - secondPart + thirdPart;
	}
	public static void main(String[] args) {
		NumericalMethodsPanel nm = new NumericalMethodsPanel();
		nm.NewtonRhapsonSolver(3.592, 0.04267, 300, 1);
	}
}

	
