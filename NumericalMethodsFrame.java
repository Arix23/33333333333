import javax.swing.JFrame;

	public class NumericalMethodsFrame extends JFrame {
		public NumericalMethodsFrame() {
			super("NatAriBot el juego");
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			NumericalMethodsPanel nmethod = new NumericalMethodsPanel();
			this.add(nmethod);
			this.pack();
			this.setResizable(false);
			this.setVisible(true);

		}

		public static void main(String[] args) {
			NumericalMethodsFrame na = new NumericalMethodsFrame();
		}

	}
