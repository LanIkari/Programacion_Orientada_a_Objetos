package fes.aragon.inicio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import fes.aragon.clases.*;

public class Inicio extends JFrame {

	private JPanel contentPane;
	JTextField textField;
	private JLabel lblNewLabel;
	private JButton btnHexagono = new JButton("Hexagono");
	private ArrayList<linea> pol = new ArrayList<>();
	private Panel panel = new Panel();
	private JButton btnCuadrado;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("Nombre \r\n");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);

		JLabel lblNombre = new JLabel("puntos");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNombre, 42, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNombre, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblNombre);

		textField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField, -3, SpringLayout.NORTH, lblNombre);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 6, SpringLayout.EAST, lblNombre);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField, -166, SpringLayout.EAST, contentPane);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnAceptar = new JButton("Triangulo");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnAceptar, -4, SpringLayout.NORTH, lblNombre);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnAceptar, -32, SpringLayout.EAST, contentPane);
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(textField.getName());
				panel.setNombre("Triangulo.txt");
				panel.abrirArchivo();
				panel.repaint();
			}

		});
		contentPane.add(btnAceptar);

		lblNewLabel = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 16, SpringLayout.SOUTH, textField);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 176, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel, -133, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel, -186, SpringLayout.EAST, contentPane);
		contentPane.add(lblNewLabel);

		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 128, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, -15, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, 97, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, -83, SpringLayout.EAST, contentPane);
		contentPane.add(panel);
		
		
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnHexagono, 16, SpringLayout.SOUTH, btnAceptar);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnHexagono, 0, SpringLayout.EAST, btnAceptar);
		btnHexagono.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(textField.getName());
				panel.setNombre("Hexagono.txt");
				panel.abrirArchivo();
				panel.repaint();
			}
		});
		contentPane.add(btnHexagono);
		
		btnCuadrado = new JButton("Cuadrado");
		btnCuadrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(textField.getName());
				panel.setNombre("Cuadrado.txt");
				panel.abrirArchivo();
				panel.repaint();
			}
		});
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnCuadrado, -5, SpringLayout.NORTH, btnAceptar);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnCuadrado, 0, SpringLayout.EAST, btnAceptar);
		contentPane.add(btnCuadrado);
	}
}
