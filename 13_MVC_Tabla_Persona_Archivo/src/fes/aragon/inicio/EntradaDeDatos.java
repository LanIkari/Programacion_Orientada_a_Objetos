package fes.aragon.inicio;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fes.aragon.datos.DatosPersona;
import fes.aragon.datos.DatosPersona;
import fes.aragon.datos.TablaArchivoImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;

public class EntradaDeDatos extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private TablaArchivoImpl datos;
	private JTextField textField_5;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			
			EntradaDeDatos dialog = new EntradaDeDatos(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public EntradaDeDatos(TablaArchivoImpl datos) {
		this.datos=datos;
		setBounds(100, 100, 500, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JLabel lblNombre = new JLabel("Nombre:");
		
		JLabel lblApellidoPaterno = new JLabel("Apellido Paterno:");
		
		JLabel lblApellidoMaterno = new JLabel("Apellido Materno:");
		
		JLabel lblSexo = new JLabel("Sexo:");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Femenino"}));
		comboBox.setToolTipText("Femenino\r\nMasculino");
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblNumeroTelefonico = new JLabel("Numero Telefonico:");
		
		JLabel lblNewLabel = new JLabel("Estado Civil:");
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Soltero(a)", "Casado(a)"}));
		comboBox_1.setToolTipText("");
		
		JLabel lblNewLabel_1 = new JLabel("Direccion:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lblCodigoPostal = new JLabel("Codigo Postal:");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addComponent(lblNumeroTelefonico)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addComponent(lblApellidoMaterno)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_2))
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField))
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addComponent(lblApellidoPaterno)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)))
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGap(49)
									.addComponent(lblSexo)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(comboBox, 0, 148, Short.MAX_VALUE))
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGap(41)
									.addComponent(lblNewLabel)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBox_1, 0, 131, Short.MAX_VALUE))))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblCodigoPostal)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSexo)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblApellidoPaterno)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblApellidoMaterno)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNumeroTelefonico)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCodigoPostal)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(51))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String nombre1= textField.getText();
						String ApellidoPaterno= textField_1.getText();
						String ApellidoMaterno= textField_2.getText();
						String Sexo = comboBox.getSelectedItem().toString();
						String EstadoCivil = comboBox_1.getSelectedItem().toString();
						String Direccion = textField_4.getText();
						try {
						int cp=Integer.parseInt(textField_5.getText());
						Long Telefono = Long.parseLong(textField_3.getText());
						
						
						DatosPersona dat = new DatosPersona();
						
						dat.setNombre(nombre1);
						dat.setApellidoPaterno(ApellidoPaterno);
						dat.setApellidoMaterno(ApellidoMaterno);
						dat.setSexo(Sexo);
						dat.setTelefono(Telefono);
						dat.setCodigoPostal(cp);
						dat.setEstadoCivil(EstadoCivil);
						dat.setDireccion(Direccion);
						datos.getDatos().add(dat);
						datos.fireTableDataChanged();
						limpiar();
					}catch(NumberFormatException ex) {
						JOptionPane.showMessageDialog(null, "Error en la entrada de datos");
					}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				
				JButton cancelButton = new JButton("Cancel");
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
	private void limpiar(){
		this.textField.setText("");
		this.textField_1.setText("");
		this.textField_2.setText("");
		this.textField_3.setText("");
		this.textField_4.setText("");
		this.textField_5.setText("");
	}
}
