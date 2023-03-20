package fes.aragon.ventana;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldVariable;
	private JTextField textField_Binario;
	private JTextField textField_Quinario;
	private JTextField textField_Octal;
	private JTextField textField_Hexadecimal;
	private JTextField textField_Bite;
	private JTextField textField_Kilobyte;
	private JTextField textField_Megabyte;
	private JTextField textField_Gigabyte;
	private JTextField textField_Terabyte;
	private JTextField textField_Petabyte;
	private JTextField textField_Exabyte;
	private JTextField textField_Zettabyte;
	private JTextField textField_Yottabyte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Calculadora dialog = new Calculadora();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Calculadora() {
		setBounds(100, 100, 682, 398);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblIngreseNumero = new JLabel("Ingrese numero:");
		lblIngreseNumero.setBounds(10, 11, 95, 20);
		contentPanel.add(lblIngreseNumero);
		
		textFieldVariable = new JTextField();
		textFieldVariable.setBounds(115, 11, 122, 20);
		contentPanel.add(textFieldVariable);
		textFieldVariable.setColumns(10);
		
		JLabel lblBinario = new JLabel("Binario");
		lblBinario.setBounds(10, 60, 60, 20);
		contentPanel.add(lblBinario);
		
		textField_Binario = new JTextField();
		textField_Binario.setEditable(false);
		textField_Binario.setBounds(103, 60, 251, 20);
		contentPanel.add(textField_Binario);
		textField_Binario.setColumns(10);
		
		JLabel lblQuinario = new JLabel("Quinario");
		lblQuinario.setBounds(8, 102, 69, 20);
		contentPanel.add(lblQuinario);
		
		textField_Quinario = new JTextField();
		textField_Quinario.setEditable(false);
		textField_Quinario.setBounds(100, 99, 169, 20);
		contentPanel.add(textField_Quinario);
		textField_Quinario.setColumns(10);
		
		JLabel lblOctal = new JLabel("Octal ");
		lblOctal.setBounds(10, 146, 46, 14);
		contentPanel.add(lblOctal);
		
		JLabel lblHexadecimal = new JLabel("Hexadecimal");
		lblHexadecimal.setBounds(10, 188, 75, 14);
		contentPanel.add(lblHexadecimal);
		
		textField_Octal = new JTextField();
		textField_Octal.setEditable(false);
		textField_Octal.setBounds(100, 143, 169, 20);
		contentPanel.add(textField_Octal);
		textField_Octal.setColumns(10);
		
		textField_Hexadecimal = new JTextField();
		textField_Hexadecimal.setEditable(false);
		textField_Hexadecimal.setBounds(100, 185, 169, 20);
		contentPanel.add(textField_Hexadecimal);
		textField_Hexadecimal.setColumns(10);
		
		JLabel lblBite = new JLabel("Bite (B)");
		lblBite.setBounds(367, 68, 46, 14);
		contentPanel.add(lblBite);
		
		JLabel lblKilobyte = new JLabel("Kilobyte (KB)");
		lblKilobyte.setBounds(338, 105, 75, 14);
		contentPanel.add(lblKilobyte);
		
		JLabel lblMegabyte = new JLabel("Megabyte (MB)");
		lblMegabyte.setBounds(338, 130, 75, 14);
		contentPanel.add(lblMegabyte);
		
		JLabel lblGigabyte = new JLabel("Gigabyte (GB)");
		lblGigabyte.setBounds(338, 155, 75, 14);
		contentPanel.add(lblGigabyte);
		
		JLabel lblTerabyte = new JLabel("Terabyte (TB)");
		lblTerabyte.setBounds(338, 185, 75, 14);
		contentPanel.add(lblTerabyte);
		
		JLabel lblPetabyte = new JLabel("Petabyte (PB) ");
		lblPetabyte.setBounds(338, 210, 75, 14);
		contentPanel.add(lblPetabyte);
		
		JLabel lblExabyte = new JLabel("Exabyte (EB)");
		lblExabyte.setBounds(338, 235, 85, 14);
		contentPanel.add(lblExabyte);
		
		textField_Bite = new JTextField();
		textField_Bite.setEditable(false);
		textField_Bite.setBounds(423, 65, 169, 20);
		contentPanel.add(textField_Bite);
		textField_Bite.setColumns(10);
		
		textField_Kilobyte = new JTextField();
		textField_Kilobyte.setEditable(false);
		textField_Kilobyte.setBounds(423, 102, 169, 20);
		contentPanel.add(textField_Kilobyte);
		textField_Kilobyte.setColumns(10);
		
		textField_Megabyte = new JTextField();
		textField_Megabyte.setEditable(false);
		textField_Megabyte.setBounds(423, 127, 169, 20);
		contentPanel.add(textField_Megabyte);
		textField_Megabyte.setColumns(10);
		
		textField_Gigabyte = new JTextField();
		textField_Gigabyte.setEditable(false);
		textField_Gigabyte.setBounds(423, 152, 169, 20);
		contentPanel.add(textField_Gigabyte);
		textField_Gigabyte.setColumns(10);
		
		textField_Terabyte = new JTextField();
		textField_Terabyte.setEditable(false);
		textField_Terabyte.setBounds(423, 182, 169, 20);
		contentPanel.add(textField_Terabyte);
		textField_Terabyte.setColumns(10);
		
		textField_Petabyte = new JTextField();
		textField_Petabyte.setEditable(false);
		textField_Petabyte.setBounds(423, 207, 169, 20);
		contentPanel.add(textField_Petabyte);
		textField_Petabyte.setColumns(10);
		
		textField_Exabyte = new JTextField();
		textField_Exabyte.setEditable(false);
		textField_Exabyte.setBounds(421, 232, 169, 20);
		contentPanel.add(textField_Exabyte);
		textField_Exabyte.setColumns(10);
		
		JLabel lblZettabytezb = new JLabel("Zettabyte (ZB)");
		lblZettabytezb.setBounds(338, 260, 85, 14);
		contentPanel.add(lblZettabytezb);
		
		JLabel lblYottabyteyb = new JLabel("Yottabyte (YB)");
		lblYottabyteyb.setBounds(338, 285, 85, 14);
		contentPanel.add(lblYottabyteyb);
		
		textField_Zettabyte = new JTextField();
		textField_Zettabyte.setEditable(false);
		textField_Zettabyte.setBounds(423, 260, 169, 20);
		contentPanel.add(textField_Zettabyte);
		textField_Zettabyte.setColumns(10);
		
		textField_Yottabyte = new JTextField();
		textField_Yottabyte.setEditable(false);
		textField_Yottabyte.setBounds(423, 285, 169, 20);
		contentPanel.add(textField_Yottabyte);
		textField_Yottabyte.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (textFieldVariable.getText().length() != 0 &&
								textFieldVariable.getText().length() <= 10){	
			        textField_Binario.setText(Integer.toString(Integer.parseInt(textFieldVariable.getText()),2));
			        textField_Quinario.setText(String.valueOf(Integer.toString(Integer.parseInt(textFieldVariable.getText()),5)));
			        textField_Octal.setText(String.valueOf(Integer.toString(Integer.parseInt(textFieldVariable.getText()),8)));
			        textField_Hexadecimal.setText(String.valueOf(Integer.toString(
			        		Integer.parseInt(textFieldVariable.getText()),16)));
			        double variable= Integer.parseInt(textFieldVariable.getText());
			        float kilobyte = (float) (variable / Math.pow(1024, 1));
			        float megabyte = (float) (variable / Math.pow(1024, 2));
			        float gigabyte = (float) (variable / Math.pow(1024, 3));
			        float terabyte = (float) (variable / Math.pow(1024, 4));
			        double petabyte = (float) (variable / Math.pow(1024, 5));
			        double exabyte = (float) (variable / Math.pow(1024, 6));
			        double zettabyte = (float) (variable / Math.pow(1024, 7));
			        double yottabyte = (float) (variable / Math.pow(1024, 8));
			        textField_Bite.setText(String.valueOf(variable));
			        textField_Kilobyte.setText(String.valueOf(kilobyte));
			        textField_Megabyte.setText(String.valueOf(megabyte));
			        textField_Gigabyte.setText(String.valueOf(gigabyte));
			        textField_Terabyte.setText(String.valueOf(terabyte));
			        textField_Petabyte.setText(String.valueOf(petabyte));
			        textField_Exabyte.setText(String.valueOf(exabyte));
			        textField_Zettabyte.setText(String.valueOf(zettabyte));
			        textField_Yottabyte.setText(String.valueOf(yottabyte));
						}else {
							JOptionPane.showMessageDialog(null, "Ingrese una cantidad o reduzca los digitos");
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Salir");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
