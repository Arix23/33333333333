
import java.awt.BorderLayout;

import javax.swing.JFrame;

	public class NumericalMethodsFrame extends JFrame  {
		
		public NumericalMethodsFrame() {
			super("Numerical Methods");
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			NumericalMethodsPanel nmethod = new NumericalMethodsPanel();
			this.add(new Panel(nmethod), BorderLayout.SOUTH); 
			this.add(nmethod);
			this.pack();
			this.setResizable(false);
			this.setVisible(true);

		}

		public static void main(String[] args) {
			NumericalMethodsFrame na = new NumericalMethodsFrame();
		}
	}
