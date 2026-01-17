package controleMachine2023;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.JSpinner;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class AppliDuree {
	
	private Duree duree;
	

	private JFrame frame;
	private JTextField heureBox;
	private JTextField minuteBox;
	private JTextField secondeBox;
	private JTextField txtH;
	private JTextField txtM;
	private JTextField txtS;
	private JTextField secondsInput;
	private JTextField txtSecondes;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppliDuree window = new AppliDuree();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppliDuree() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel buttomPart = new JPanel();
		frame.getContentPane().add(buttomPart);
		buttomPart.setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton btnNewButton = new JButton("-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				duree=duree.ajouterSecondes(-1);
				secondsInput.setText(String.valueOf(duree.getTotalSeconds()));
				
				convertSeconds();
				
			}
		});
		buttomPart.add(btnNewButton);
		
		secondsInput = new JTextField();
		buttomPart.add(secondsInput);
		secondsInput.setColumns(10);
		
		txtSecondes = new JTextField();
		txtSecondes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							}
		});
		txtSecondes.setHorizontalAlignment(SwingConstants.CENTER);
		txtSecondes.setText("secondes");
		buttomPart.add(txtSecondes);
		txtSecondes.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				duree=duree.ajouterSecondes(1);
				secondsInput.setText(String.valueOf(duree.getTotalSeconds()));
				convertSeconds();
			}
		});
		buttomPart.add(btnNewButton_1);
		
		JPanel upperPart = new JPanel();
		frame.getContentPane().add(upperPart);
		upperPart.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel colonne1 = new JPanel();
		upperPart.add(colonne1);
		colonne1.setLayout(new GridLayout(3, 1, 0, 0));
		
		JButton hoursUp = new JButton("\u25B2");
		hoursUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				duree = new Duree (duree.getTotalSeconds()+3600);
				heureBox.setText(String.valueOf(duree.heure()));
				
				convertSeconds();
			}
		});
		colonne1.add(hoursUp);
		
		JButton hoursDown = new JButton("\u25BC");
		hoursDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				duree = new Duree (duree.getTotalSeconds()-3600);
				heureBox.setText(String.valueOf(duree.heure()));
				
				convertSeconds();
			}
		});
		
		heureBox = new JTextField();
		colonne1.add(heureBox);
		heureBox.setColumns(10);
		colonne1.add(hoursDown);
		
		txtH = new JTextField();
		txtH.setHorizontalAlignment(SwingConstants.CENTER);
		txtH.setText("h");
		upperPart.add(txtH);
		txtH.setColumns(10);
		
		JPanel colonne1_1 = new JPanel();
		upperPart.add(colonne1_1);
		colonne1_1.setLayout(new GridLayout(3, 1, 0, 0));
		
		JButton minutesUp = new JButton("▲");
		minutesUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				duree=new Duree (duree.getTotalSeconds()+60);
				minuteBox.setText(String.valueOf(duree.minute()));
				convertSeconds();
			}
		});
		colonne1_1.add(minutesUp);
		
		minuteBox = new JTextField();
		minuteBox.setColumns(10);
		colonne1_1.add(minuteBox);
		
		JButton minutesDown = new JButton("▼");
		minutesDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				duree=new Duree (duree.getTotalSeconds()-60);
				minuteBox.setText(String.valueOf(duree.minute()));
				convertSeconds();
			}
		});
		colonne1_1.add(minutesDown);
		
		txtM = new JTextField();
		txtM.setHorizontalAlignment(SwingConstants.CENTER);
		txtM.setText("m");
		upperPart.add(txtM);
		txtM.setColumns(10);
		
		JPanel colonne1_2 = new JPanel();
		upperPart.add(colonne1_2);
		colonne1_2.setLayout(new GridLayout(3, 1, 0, 0));
		
		JButton secondsUp = new JButton("▲");
		secondsUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				duree=new Duree (duree.getTotalSeconds()+1);
				secondeBox.setText(String.valueOf(duree.seconde()));
				convertSeconds();
			}
		});
		colonne1_2.add(secondsUp);
		
		secondeBox = new JTextField();
		secondeBox.setColumns(10);
		colonne1_2.add(secondeBox);
		
		JButton secondsDown = new JButton("▼");
		secondsDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				duree=new Duree (duree.getTotalSeconds()-1);
				secondeBox.setText(String.valueOf(duree.seconde()));
				convertSeconds();
			}
		});
		colonne1_2.add(secondsDown);
		
		txtS = new JTextField();
		txtS.setHorizontalAlignment(SwingConstants.CENTER);
		txtS.setText("s");
		upperPart.add(txtS);
		txtS.setColumns(10);
		
		
		///////////////////////// my code////////////////
		
		heureBox.setEditable(false);
		minuteBox.setEditable(false);
		secondeBox.setEditable(false);
		
		txtH.setEditable(false);
		txtM.setEditable(false);
		txtS.setEditable(false);
		txtSecondes.setEditable(false);

		duree = new Duree (3601);
		
		
		
		secondsInput.setText(String.valueOf(duree.getTotalSeconds()));
		
		
		convertSeconds();
		
		//////////My code ////////////
	}
	
	public void convertSeconds() {
		secondeBox.setText(String.valueOf(duree.seconde()));
		minuteBox.setText(String.valueOf(duree.minute()));
		heureBox.setText(String.valueOf(duree.heure()));
		secondsInput.setText(String.valueOf(duree.getTotalSeconds()));
	}

}
