package guiMantenimiento;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.InternalFrameListener;
import javax.swing.event.InternalFrameEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import utilidades.Datos;

public class Consultarceramico extends JInternalFrame implements ActionListener, InternalFrameListener, ItemListener {
	private JLabel Modelo;
	private JLabel Precio;
	private JLabel Ancho;
	private JLabel Largo;
	private JLabel Espesor;
	private JLabel contenido;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtLargo;
	private JTextField txtEspesor;
	private JTextField txtContenido;
	private JComboBox<String> cboModelo;
	private JButton btnCerrar;
	
	public static String consulcer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Consultarceramico frame = new Consultarceramico();
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
	public Consultarceramico() {
		addInternalFrameListener(this);
		
		consulcer = "consulcer";
		
		setResizable(true);
		setTitle("Consultar Cer\u00E1mico");
		setClosable(true);
		setBounds(100, 100, 450, 194);
		getContentPane().setLayout(null);
		
		Modelo = new JLabel("Modelo");
		Modelo.setBounds(10, 11, 85, 14);
		getContentPane().add(Modelo);
		
		Precio = new JLabel("Precio (S/)");
		Precio.setBounds(10, 36, 85, 14);
		getContentPane().add(Precio);
		
		Ancho = new JLabel("Ancho (cm)");
		Ancho.setBounds(10, 61, 85, 14);
		getContentPane().add(Ancho);
		
		Largo = new JLabel("Largo (cm)");
		Largo.setBounds(10, 86, 85, 14);
		getContentPane().add(Largo);
		
		Espesor = new JLabel("Espesor (mm)");
		Espesor.setBounds(10, 111, 85, 14);
		getContentPane().add(Espesor);
		
		contenido = new JLabel("Contenido");
		contenido.setBounds(10, 136, 85, 14);
		getContentPane().add(contenido);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(105, 33, 189, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtAncho = new JTextField();
		txtAncho.setEditable(false);
		txtAncho.setBounds(105, 58, 189, 20);
		getContentPane().add(txtAncho);
		txtAncho.setColumns(10);
		
		txtLargo = new JTextField();
		txtLargo.setEditable(false);
		txtLargo.setBounds(105, 83, 189, 20);
		getContentPane().add(txtLargo);
		txtLargo.setColumns(10);
		
		txtEspesor = new JTextField();
		txtEspesor.setEditable(false);
		txtEspesor.setBounds(105, 108, 189, 20);
		getContentPane().add(txtEspesor);
		txtEspesor.setColumns(10);
		
		txtContenido = new JTextField();
		txtContenido.setEditable(false);
		txtContenido.setBounds(105, 133, 189, 20);
		getContentPane().add(txtContenido);
		txtContenido.setColumns(10);
		
		cboModelo = new JComboBox<String>();
		cboModelo.addItemListener(this);
		cboModelo.addItem("Cinza Plus");
		cboModelo.addItem("Luxury");
		cboModelo.addItem("Austria");
		cboModelo.addItem("Yungay Mix");
		cboModelo.addItem("Thalía");
		cboModelo.setBounds(105, 7, 189, 22);
		getContentPane().add(cboModelo);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 7, 89, 23);
		getContentPane().add(btnCerrar);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	
	
	//Cerrar
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
		consulcer=null;
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
		consulcer=null;
	}
	
	
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cboModelo) {
			itemStateChangedCboModelo(e);
		}
	}
	
	//item del cbo
	protected void itemStateChangedCboModelo(ItemEvent e) {
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
}

