import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class calculo_Pontos extends JFrame implements ActionListener{

	public static void main(String[] args) {
		calculo_Pontos v3 = new calculo_Pontos ();
	}

	
	// onscreen components stored as fields
	
	private JFrame frame;
	private JTextField pacoteCaro;
	private JTextField pacoteBarato;
	private JTextField pontos;
	private JLabel  calculo_PontosLabel;
	private JButton computeButton;
	
	
	public  calculo_Pontos () {
	
		//set up components
		
		pacoteCaro = new JTextField(5);
		pacoteBarato = new JTextField(5);
		pontos = new JTextField(5);
		calculo_PontosLabel = new JLabel("Coloque o valor do pacote mais caro, do pacote mais barato e o valor pontual do pacote mais caro");
		computeButton = new JButton("Calcular");
		
		
		//attach GUI as event listener to Compute button
		
		computeButton.addActionListener(this);
		
		//layout
		JPanel north = new JPanel(new GridLayout(3,3));
		north.add(new JLabel("Pacote mais caro: "));
		north.add(pacoteCaro);
		
		north.add(new JLabel("Pacote mais barato: "));
		north.add(pacoteBarato);
		
		north.add(new JLabel("Pontos: "));
		north.add(pontos);
		
		//overall frame
		
		frame = new JFrame("Pontos de Upgrade");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.add(north, BorderLayout.NORTH);
		frame.add(calculo_PontosLabel, BorderLayout.CENTER);
		frame.add(computeButton, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
	}
	
	
	//Handles clicks on resultada on making the calculations
public void actionPerformed(ActionEvent event){
	//read pacote mais caro, mais barato e pontos
		String cpacoteCaro = pacoteCaro.getText();
		double maiscaro = Double.parseDouble(cpacoteCaro);
		String cpacoteBarato = pacoteBarato.getText();
		double maisbarato = Double.parseDouble(cpacoteBarato);
		
		String cpontos = pontos.getText();
		double pontos_pacote = Double.parseDouble(cpontos);
		
		//calculate points
		
		double diferenca = maiscaro - maisbarato;
		double total = diferenca / maiscaro * pontos_pacote;
		calculo_PontosLabel.setText("Este upgrade vale " + total  );
}










}