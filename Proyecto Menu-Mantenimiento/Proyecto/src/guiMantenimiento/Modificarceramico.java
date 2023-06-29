package guiMantenimiento;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.InternalFrameListener;

import utilidades.Datos;

import javax.swing.event.InternalFrameEvent;
import javax.swing.DefaultComboBoxModel;

public class Modificarceramico extends JInternalFrame implements ActionListener, InternalFrameListener {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtLargo;
	private JTextField txtEspesor;
	private JTextField txtContenido;
	private JComboBox<String> cboModelo;
	private JButton btbCerrar;
	private JButton btnGrabar;

	public static String modicer;
	
	
	double p, a, l, e, c;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Modificarceramico frame = new Modificarceramico();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Modificarceramico() {
		addInternalFrameListener(this);
		
		modicer = "modicer";
		
		setTitle("Mofidicar Cer\u00E1mico");
		setResizable(true);
		setClosable(true);
		setBounds(100, 100, 450, 199);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setBounds(10, 11, 84, 14);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Precio(S/)");
		lblNewLabel_1.setBounds(10, 36, 84, 14);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Ancho (cm)");
		lblNewLabel_2.setBounds(10, 61, 84, 14);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Largo (cm)");
		lblNewLabel_3.setBounds(10, 86, 84, 14);
		getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Espesor (mm)");
		lblNewLabel_4.setBounds(10, 111, 84, 14);
		getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Contenido");
		lblNewLabel_5.setBounds(10, 136, 84, 14);
		getContentPane().add(lblNewLabel_5);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(104, 33, 200, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtAncho = new JTextField();
		txtAncho.setBounds(104, 58, 200, 20);
		getContentPane().add(txtAncho);
		txtAncho.setColumns(10);
		
		txtLargo = new JTextField();
		txtLargo.setBounds(104, 83, 200, 20);
		getContentPane().add(txtLargo);
		txtLargo.setColumns(10);
		
		txtEspesor = new JTextField();
		txtEspesor.setBounds(104, 108, 200, 20);
		getContentPane().add(txtEspesor);
		txtEspesor.setColumns(10);
		
		txtContenido = new JTextField();
		txtContenido.setBounds(104, 133, 200, 20);
		getContentPane().add(txtContenido);
		txtContenido.setColumns(10);
		
		cboModelo = new JComboBox<String>();
		cboModelo.addActionListener(this);
		cboModelo.addItem("Cinza Plus");
		cboModelo.addItem("Luxury");
		cboModelo.addItem("Austria");
		cboModelo.addItem("Yungay Mix");
		cboModelo.addItem("Thalía");
		cboModelo.setBounds(104, 7, 200, 22);
		getContentPane().add(cboModelo);
		
		btbCerrar = new JButton("Cerrar");
		btbCerrar.addActionListener(this);
		btbCerrar.setBounds(335, 7, 89, 23);
		getContentPane().add(btbCerrar);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(335, 32, 89, 23);
		getContentPane().add(btnGrabar);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(e);
		}
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
		if (e.getSource() == btbCerrar) {
			actionPerformedBtbCerrar(e);
		}
	}
	
	//cerrar
	protected void actionPerformedBtbCerrar(ActionEvent e) {
		dispose();
		modicer=null;
	}
	public void internalFrameActivated(InternalFrameEvent e) {
	}
	public void internalFrameClosed(InternalFrameEvent e) {
	}
	public void internalFrameClosing(InternalFrameEvent e) {
		if (e.getSource() == this) {
			internalFrameClosingThis(e);
		}
	}
	public void internalFrameDeactivated(InternalFrameEvent e) {
	}
	public void internalFrameDeiconified(InternalFrameEvent e) {
	}
	public void internalFrameIconified(InternalFrameEvent e) {
	}
	public void internalFrameOpened(InternalFrameEvent e) {
	}
	
	//boton X
	protected void internalFrameClosingThis(InternalFrameEvent e) {
		dispose();
		modicer=null;
	}
	
	//item del cbo
	protected void actionPerformedCboModelo(ActionEvent e) {
		int inicio = cboModelo.getSelectedIndex();
		 if (inicio == 0) {
				txtPrecio.setText(String.valueOf(Datos.precio0));
				txtAncho.setText(String.valueOf(Datos.ancho0));
				txtLargo.setText(String.valueOf(Datos.largo0));
				txtEspesor.setText(String.valueOf(Datos.espesor0));
				txtContenido.setText(String.valueOf(Datos.contenido0));
				}
		 if (inicio == 1) {
				txtPrecio.setText(String.valueOf(Datos.precio1));
				txtAncho.setText(String.valueOf(Datos.ancho1));
				txtLargo.setText(String.valueOf(Datos.largo1));
				txtEspesor.setText(String.valueOf(Datos.espesor1));
				txtContenido.setText(String.valueOf(Datos.contenido1));
		 }
		 if (inicio == 2) {
			 	txtPrecio.setText(String.valueOf(Datos.precio2));
				txtAncho.setText(String.valueOf(Datos.ancho2));
				txtLargo.setText(String.valueOf(Datos.largo2));
				txtEspesor.setText(String.valueOf(Datos.espesor2));
				txtContenido.setText(String.valueOf(Datos.contenido2));
		 }
		 if (inicio == 3) {
			 	txtPrecio.setText(String.valueOf(Datos.precio3));
				txtAncho.setText(String.valueOf(Datos.ancho3));
				txtLargo.setText(String.valueOf(Datos.largo3));
				txtEspesor.setText(String.valueOf(Datos.espesor3));
				txtContenido.setText(String.valueOf(Datos.contenido3));
		 }
		 if (inicio == 4) {
			 	txtPrecio.setText(String.valueOf(Datos.precio4));
				txtAncho.setText(String.valueOf(Datos.ancho4));
				txtLargo.setText(String.valueOf(Datos.largo4));
				txtEspesor.setText(String.valueOf(Datos.espesor4));
				txtContenido.setText(String.valueOf(Datos.contenido4));
		 }
	}
	
	
	//boton grabar
	protected void actionPerformedBtnGrabar(ActionEvent e) {
		//declarar variable
		String modelo = cboModelo.getSelectedItem().toString();
		//ingresar datos
	    double precio = Double.parseDouble(txtPrecio.getText());
	    double ancho = Double.parseDouble(txtAncho.getText());
	    double largo = Double.parseDouble(txtLargo.getText());
	    double espesor = Double.parseDouble(txtEspesor.getText());
	    int contenido = Integer.parseInt(txtContenido.getText());

	    int inicio = cboModelo.getSelectedIndex();
	    if (inicio >= 0 && inicio <= 4) {
	        switch (inicio) {
	            case 0:
	                utilidades.Datos.modelo0 = modelo;
	                utilidades.Datos.precio0 = precio;
	                utilidades.Datos.ancho0 = ancho;
	                utilidades.Datos.largo0 = largo;
	                utilidades.Datos.espesor0 = espesor;
	                utilidades.Datos.contenido0 = contenido;
	                break;
	            case 1:
	            	utilidades.Datos.modelo1 = modelo;
	            	utilidades.Datos.precio1 = precio;
	            	utilidades.Datos.ancho1 = ancho;
	            	utilidades.Datos.largo1 = largo;
	            	utilidades.Datos.espesor1 = espesor;
	            	utilidades.Datos.contenido0 = contenido;
	                break;
	            case 2:
	            	utilidades.Datos.modelo2 = modelo;
	            	utilidades.Datos.precio2 = precio;
	            	utilidades.Datos.ancho2 = ancho;
	                utilidades.Datos.largo2 = largo;
	                utilidades.Datos.espesor2 = espesor;
	                utilidades.Datos.contenido0 = contenido;
	                break;
	            case 3:
	            	utilidades.Datos.modelo3 = modelo;
	            	utilidades.Datos.precio3 = precio;
	            	utilidades.Datos.ancho3 = ancho;
	            	utilidades.Datos.largo3 = largo;
	            	utilidades.Datos.espesor3 = espesor;
	            	utilidades.Datos.contenido0 = contenido;
	                break;
	            default:
	            	utilidades.Datos.modelo4 = modelo;
	            	utilidades.Datos.precio4 = precio;
	            	utilidades.Datos.ancho4 = ancho;
	            	utilidades.Datos.largo4 = largo;
	            	utilidades.Datos.espesor4 = espesor;
	            	utilidades.Datos.contenido0 = contenido;
	        }}
		
	}
			
	
}

