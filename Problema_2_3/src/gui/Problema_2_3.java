package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import semana_02.Edificio;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.Font;

public class Problema_2_3 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JLabel lblCodigo;
	private JTextField txtCodigo;
	private JLabel lblNumDptos;
	private JTextField txtNumDptos;
	private JLabel lblNumPisos;
	private JTextField txtNumPisos;	
	private JLabel lblPrecioDpto;
	private JTextField txtPrecioDpto;	
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_2_3 frame = new Problema_2_3();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Problema_2_3() {
		setTitle("Problema_2_3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCodigo = new JLabel("c\u00F3digo");
		lblCodigo.setBounds(10, 15, 50, 23);
		contentPane.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(60, 15, 70, 23);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);

		lblNumDptos = new JLabel("# dptos");
		lblNumDptos.setBounds(10, 40, 50, 23);
		contentPane.add(lblNumDptos);
		
		txtNumDptos = new JTextField();
		txtNumDptos.setBounds(60, 40, 70, 23);
		contentPane.add(txtNumDptos);
		txtNumDptos.setColumns(10);
		
		lblNumPisos = new JLabel("# pisos");
		lblNumPisos.setBounds(150, 15, 80, 23);
		contentPane.add(lblNumPisos);

		txtNumPisos = new JTextField();
		txtNumPisos.setBounds(230, 15, 70, 23);
		contentPane.add(txtNumPisos);
		txtNumPisos.setColumns(10);
		
		lblPrecioDpto = new JLabel("precio dpto $");
		lblPrecioDpto.setBounds(150, 40, 80, 23);
		contentPane.add(lblPrecioDpto);
		
		txtPrecioDpto = new JTextField();
		txtPrecioDpto.setBounds(230, 40, 70, 23);
		contentPane.add(txtPrecioDpto);
		txtPrecioDpto.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.setBounds(330, 15, 94, 23);
		btnProcesar.addActionListener(this);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(330, 40, 94, 23);
		btnBorrar.addActionListener(this);
		contentPane.add(btnBorrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 70, 415, 380);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnBorrar) {
			actionPerformedBtnBorrar(arg0);
		}
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		
		
		try {
			int codigo = leerCodigo();
			try {
				int numDptos = leerNumDptos();
				try {
					int numPisos = leerNumPisos();
					try {
						double precioDpto = leerPrecioDpto();
						
						Edificio e = new Edificio(leerCodigo(), leerNumDptos(), leerNumPisos(), leerPrecioDpto());						
						//limpieza();
						listado(e);
						e.setPrecioDolares(e.getPrecioDolares()*1.2);
						listado(e);
					}
					catch (Exception e) {
						mensaje("Ingrese PRECIO DE DEPARTAMENTO correcto", txtPrecioDpto);
					}
				}
				catch (Exception e) {
					mensaje("Ingrese N�MERO DE PISOS correcto", txtNumPisos);
				}
			}
			catch (Exception e) {
				mensaje("Ingrese N�MERO DE DEPARTAMENTOS correcto", txtNumDptos);
			}
		}
		catch (Exception e) {
			mensaje("Ingrese C�DIGO correcto", txtCodigo);
		}	
	}
	protected void actionPerformedBtnBorrar(ActionEvent arg0) {
		limpieza();
		txtS.setText("");		
	}
	//  M�todos tipo void (sin par�metros)
	void limpieza() {
		txtCodigo.setText("");
		txtNumDptos.setText("");
		txtNumPisos.setText("");
		txtPrecioDpto.setText("");
		txtCodigo.requestFocus();
	}
	//  M�todos tipo void (con par�metros)
	public void listado(Edificio x) {
		imprimir("Código: " + x.getCodigo());
		imprimir("Número de departamentos: " + x.getDepartamentos());
		imprimir("Número de pisos: " + x.getCantidadPisos());
		imprimir("Precio en Dolares: " + x.getPrecioDolares());
		imprimir("");
	}
	
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	void mensaje(String s, JTextField txt) {
		JOptionPane.showMessageDialog(this, s);
		txt.setText("");
		txt.requestFocus();
	}
	//  M�todos que retornan valor (sin par�metros)
	int leerCodigo() {
		return Integer.parseInt(txtCodigo.getText().trim());
	}
	int leerNumDptos() {
		return Integer.parseInt(txtNumDptos.getText().trim());
	}
	int leerNumPisos() {
		return Integer.parseInt(txtNumPisos.getText().trim());
	}
	double leerPrecioDpto() {
		return Double.parseDouble(txtPrecioDpto.getText().trim());
	}
	
}