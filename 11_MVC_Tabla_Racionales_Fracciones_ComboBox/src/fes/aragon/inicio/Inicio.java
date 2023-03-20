package fes.aragon.inicio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import fes.aragon.modelo.Datos;
import fes.aragon.modelo.ModeloTabla;
import fes.aragon.modelo.Racional;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Inicio extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private Datos modelo = null;
	private ModeloTabla modeloTabla=null;
	private JComboBox comboBox;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		this.modeloTabla= new ModeloTabla();
		this.modelo=new Datos();
		modelo.agregarOyentes(modeloTabla);
		modelo.llamar();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 158);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(modeloTabla);
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 180, 393, 70);
		contentPane.add(panel);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Suma", "Resta", "Multiplicacion", "Division"}));
		panel.add(comboBox);
		
		JButton btnCalculos = new JButton("Calculos");
		btnCalculos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				modeloTabla.oyenteDato(modelo);
				int valor= (int)comboBox.getSelectedIndex();
				modelo.calculos(valor);
			}
		});
		panel.add(btnCalculos);
		
		
		
		
		
	}
}
