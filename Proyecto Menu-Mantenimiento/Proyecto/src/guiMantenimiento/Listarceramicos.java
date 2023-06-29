package guiMantenimiento;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.event.InternalFrameListener;
import javax.swing.event.InternalFrameEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Listarceramicos extends JInternalFrame implements InternalFrameListener, ActionListener {
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnListar;
	private JButton btnCerrar;
	
	public static String listacer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Listarceramicos frame = new Listarceramicos();
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
	public Listarceramicos() {
		addInternalFrameListener(this);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 214);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(256, 236, 89, 23);
		getContentPane().add(btnListar);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(96, 236, 89, 23);
		getContentPane().add(btnCerrar);

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
	//botn X
	protected void internalFrameClosingThis(InternalFrameEvent e) {
		dispose();
		listacer=null;
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	//btn cerrar
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
		listacer=null;
	}
	protected void actionPerformedBtnListar(ActionEvent e) {
		listar();
	}
	//listar void
			void listar() {
				txtS.setText("");
				imprimir("LISTADO DE CERÁMICOS");
				imprimir("");
				imprimir("Modelo        : " + utilidades.Datos.modelo0);
				imprimir("Precio        : S/.  " + utilidades.Datos.precio0);
				imprimir("Ancho (cm)    : " + utilidades.Datos.ancho0 + "cm");
				imprimir("Largo (cm)    : " + utilidades.Datos.largo0 + "cm");
				imprimir("Espesor (mm)  : " + utilidades.Datos.espesor0 + "mm");
				imprimir("Contenido     : " + utilidades.Datos.contenido0 + " unidades");
				imprimir("");
				imprimir("Modelo        : " + utilidades.Datos.modelo1);
				imprimir("Precio        : S/.  " + utilidades.Datos.precio1);
				imprimir("Ancho (cm)    : " + utilidades.Datos.ancho1 + "cm");
				imprimir("Largo (cm)    : " + utilidades.Datos.largo1 + "cm");
				imprimir("Espesor (mm)  : " + utilidades.Datos.espesor1 + " mm");
				imprimir("Contenido     : " + utilidades.Datos.contenido1 + " unidades");
				imprimir("");
				imprimir("Modelo        : " + utilidades.Datos.modelo1);
				imprimir("Precio        : S/.  " + utilidades.Datos.precio2);
				imprimir("Ancho (cm)    : " + utilidades.Datos.ancho2 + "cm");
				imprimir("Largo (cm)    : " + utilidades.Datos.largo2 + "cm");
				imprimir("Espesor (mm)  : " + utilidades.Datos.espesor2 + " mm");
				imprimir("Contenido     : " + utilidades.Datos.contenido2 + " unidades");
				imprimir("");
				imprimir("Modelo        : " + utilidades.Datos.modelo3);
				imprimir("Precio        : S/.  " + utilidades.Datos.precio3);
				imprimir("Ancho (cm)    : " + utilidades.Datos.ancho3 + "cm");
				imprimir("Largo (cm)    : " + utilidades.Datos.largo3 + "cm");
				imprimir("Espesor (mm)  : " + utilidades.Datos.espesor3 + " mm");
				imprimir("Contenido     : " + utilidades.Datos.contenido3 + " unidades");
				imprimir("");
				imprimir("Modelo        : " + utilidades.Datos.modelo4);
				imprimir("Precio        : S/.  " + utilidades.Datos.precio4);
				imprimir("Ancho (cm)    : " + utilidades.Datos.ancho4 + "cm");
				imprimir("Largo (cm)    : " + utilidades.Datos.largo4 + "cm");
				imprimir("Espesor (mm)  : " + utilidades.Datos.espesor4 + " mm");
				imprimir("Contenido     : " + utilidades.Datos.contenido4 + " unidades");
				imprimir("");
			}
			//salto de linea
			void imprimir(String s) {
				txtS.append(s + "\n");
			}
}
