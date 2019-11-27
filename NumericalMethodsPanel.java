//ARI VALENZUELA (A01635584)
//NATALY HERNANDEZ (A01631314)
//FINAL PROJECT
//NUMERICAL METHODS

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;

public class NumericalMethodsPanel extends JPanel {
	private double idealGasConstant = 0.082054;
	private Image imagen;
	private JButton solve;

	public NumericalMethodsPanel() {
		super();
		this.setPreferredSize(new Dimension(400, 450));
		this.setOpaque(true);
		this.setBackground(Color.GRAY);

		this.imagen = new ImageIcon("Metodos.png").getImage();
	}

	public void paint(Graphics g) {
		g.drawImage(imagen, 0, 0, this);
	}

	public void NewtonRhapsonSolver(double a, double b, double temperature, double pressure) {
		double error = 100;
		double initialGuess = this.idealGasSolver(pressure, temperature);
		System.out.println("The initial guess is " + initialGuess);
		int count = 0;
		double guess = 0;
		while (error > 0.001) {
			count++;
			double newtonRhapsonGuess = initialGuess
					- (this.vanDerWaalsEquation(a, b, initialGuess, temperature, pressure)
							/ this.vanDerWaalsEquationDerivative(a, b, initialGuess, temperature, pressure));
			error = Math.abs(((newtonRhapsonGuess - initialGuess) / newtonRhapsonGuess));
			initialGuess = newtonRhapsonGuess;
			guess = newtonRhapsonGuess;
		}

		System.out.println("The new guess is " + guess);
		System.out.println("Solved in : " + count + " iterations");
		System.out.println("The error is " + error);
		System.out.println(" ");

	}

	public double idealGasSolver(double pressure, double temperature) {
		return ((this.idealGasConstant * temperature) / pressure);
	}

	public double vanDerWaalsEquation(double a, double b, double v, double temperature, double pressure) {
		double firstPart = pressure + (a / (Math.pow(v, 2)));
		double secondPart = v - b;
		return (firstPart * secondPart) - (this.idealGasConstant * temperature);
	}

	public double vanDerWaalsEquationDerivative(double a, double b, double v, double temperature, double pressure) {
		double secondPart = a / (Math.pow(v, 2));
		double thirdPart = (2 * a * b) / (Math.pow(v, 3));
		return pressure - secondPart + thirdPart;
	}


	public void leer() {

		JFileChooser fc = new JFileChooser();
		fc.showOpenDialog(this);
		int respArchivo = fc.showOpenDialog(this);
		if (respArchivo == JFileChooser.APPROVE_OPTION) {
			File archivo = fc.getSelectedFile();
			try {
				BufferedReader br = new BufferedReader(new FileReader(archivo.getAbsolutePath()));
				String linea;
				while ((linea = br.readLine()) != null) {

					String[] line = linea.split(" ");
					double[] lin = new double[line.length];
					for (int i = 0; i < line.length; i++) {
						lin[i] = Double.parseDouble(line[i]);
					}
					NewtonRhapsonSolver(lin[0], lin[1], lin[2], lin[3]);
				}
				br.close();
			} catch (IOException ex) {
				System.out.println("ERROR");
			}
		}

	}

}
