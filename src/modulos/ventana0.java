package modulos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventana0 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel tipoConversion;
	private JTextField textFieldValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana0 frame = new ventana0();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public ventana0() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 386);
		tipoConversion = new JPanel();
		tipoConversion.setToolTipText("");
		tipoConversion.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(tipoConversion);
		tipoConversion.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Conversor monedas");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(155, 11, 199, 31);
		tipoConversion.add(lblNewLabel);
		
		JComboBox comboBoxCambio = new JComboBox();
		comboBoxCambio.setModel(new DefaultComboBoxModel(new String[] {"seleccione...", "pesos colombianos a dolares", "pesos colombianos a euros", "pesos colombianos a pesos mexicanos"}));
		comboBoxCambio.setToolTipText("seleccione..\r\npesos colombianos a dolares \r\npesos colombianos a euros\r\npesos colombianos a pesos mexicanos");
		comboBoxCambio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBoxCambio.setBounds(23, 98, 240, 31);
		tipoConversion.add(comboBoxCambio);
		
		JLabel lblNewLabel_1 = new JLabel("seleccione el tipo de conversion");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(23, 73, 214, 22);
		tipoConversion.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ingrese la cantidad de dinero");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(23, 186, 188, 31);
		tipoConversion.add(lblNewLabel_2);
		
		textFieldValor = new JTextField();
		textFieldValor.setBounds(23, 219, 240, 31);
		tipoConversion.add(textFieldValor);
		textFieldValor.setColumns(10);
	
		
		JButton btnCalcular = new JButton("calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double dolar = 0.00025;
				double euro = 0.00023;
				double pM = 0.0043;
				double re= 0;
				
				double calcula =Double.parseDouble(textFieldValor.getText()) ;
				
				int tipoDeCambioId = comboBoxCambio.getSelectedIndex();
				
				if (tipoDeCambioId == 1) {
					re = calcula*dolar;
					JOptionPane.showMessageDialog(null,"usted tiene "+re+" dolares");
				}else if(tipoDeCambioId==2) {
					re = calcula*euro;
					JOptionPane.showMessageDialog(null,"usted tiene "+re+" euros");
				}else if(tipoDeCambioId==3) {
					re = calcula*pM;
					JOptionPane.showMessageDialog(null,"usted tiene "+re+" ");
				}
				
			//	System.out.println(tipoDeCambio);
				
			//	System.out.println(calcula);
				
			}
		});
		btnCalcular.setBounds(108, 300, 89, 23);
		tipoConversion.add(btnCalcular);
		
		
}}
