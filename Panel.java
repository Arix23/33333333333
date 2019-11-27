import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel extends JPanel implements ActionListener{
	private NumericalMethodsPanel pd;
	private JButton solve;

	public Panel(NumericalMethodsPanel pd) {
		super();
		this.setBackground(new Color(85, 85, 85));
		this.pd = pd;
		this.setPreferredSize(new Dimension(150,50));
		
		this.solve = new JButton("RESOLVER");
		this.solve.addActionListener(this);
		this.solve.setBackground(Color.WHITE);
		
		this.add(solve, BorderLayout.SOUTH);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == solve) {
			this.pd.leer();
		}
	}
	
	
}
