package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import semana_02.Asesor;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Propuesto_2_4 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Propuesto_2_4 frame = new Propuesto_2_4();
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
	public Propuesto_2_4() {
		setTitle("Propuesto_2_4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(173, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 414, 403);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		Asesor a = new Asesor(25,"Gary",40,80);
		
		listado(a);
		a.setHorasTrabajadas(a.getHorasTrabajadas() + 10);
		a.setTarifaHora(a.getTarifaHora()*0.85);
		listado(a);
	}
	//  M�todos tipo void (con par�metros)
	
	public void listado(Asesor x) {
		imprimir("Código: " + x.getCodigo());
		imprimir("Nombre: " + x.getNombre());
		imprimir("Horas trabajadas: " + x.getHorasTrabajadas());
		imprimir("Tarifa por Hora: " + x.getTarifaHora());
		imprimir("Sueldo Bruto: " + x.sueldoBruto());
		imprimir("Descuento: " + x.descuento());
		imprimir("Sueldo Neto: " + x.sueldoNeto());
		imprimir("");
	}
	
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	
}