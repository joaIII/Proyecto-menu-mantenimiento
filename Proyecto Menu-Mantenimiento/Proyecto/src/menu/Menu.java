package menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import guiMantenimiento.Consultarceramico;
import guiMantenimiento.Listarceramicos;
import guiMantenimiento.Modificarceramico;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JDesktopPane;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



/**
 * @author usrcdisl
 *
 */
public class Menu extends JFrame implements ActionListener {
	
		

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnMantenimiento;
	private JMenu mnVentas;
	private JMenu mnConfiguracion;
	private JMenu mnAyuda;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmConsultarceramico;
	private JMenuItem mntmModificarceramico;
	private JMenuItem mntmListarceramicos;
	private JMenuItem mntmNewMenuItem_4;
	private JMenuItem mntmNewMenuItem_5;
	private JMenuItem mntmNewMenuItem_6;
	private JMenuItem mntmNewMenuItem_7;
	private JMenuItem mntmNewMenuItem_8;
	private JMenuItem mntmNewMenuItem_9;
	private JMenuItem mntmNewMenuItem_10;
	public static JDesktopPane escritorio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 493);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmNewMenuItem = new JMenuItem("Salir");
		mntmNewMenuItem.addActionListener(this);
		mnArchivo.add(mntmNewMenuItem);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmConsultarceramico = new JMenuItem("Consultar cer\u00E1mico");
		mntmConsultarceramico.addActionListener(this);
		mnMantenimiento.add(mntmConsultarceramico);
		
		mntmModificarceramico = new JMenuItem("Modificar cer\u00E1mico");
		mntmModificarceramico.addActionListener(this);
		mnMantenimiento.add(mntmModificarceramico);
		
		mntmListarceramicos = new JMenuItem("Listar cer\u00E1micos");
		mntmListarceramicos.addActionListener(this);
		mnMantenimiento.add(mntmListarceramicos);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mntmNewMenuItem_4 = new JMenuItem("Vender");
		mntmNewMenuItem_4.addActionListener(this);
		mnVentas.add(mntmNewMenuItem_4);
		
		mntmNewMenuItem_5 = new JMenuItem("Generar reportes");
		mntmNewMenuItem_5.addActionListener(this);
		mnVentas.add(mntmNewMenuItem_5);
		
		mnConfiguracion = new JMenu("Configuracion");
		menuBar.add(mnConfiguracion);
		
		mntmNewMenuItem_6 = new JMenuItem("Configurar descuentos");
		mntmNewMenuItem_6.addActionListener(this);
		mnConfiguracion.add(mntmNewMenuItem_6);
		
		mntmNewMenuItem_7 = new JMenuItem("Configurar obsequios");
		mntmNewMenuItem_7.addActionListener(this);
		mnConfiguracion.add(mntmNewMenuItem_7);
		
		mntmNewMenuItem_8 = new JMenuItem("Configurar cantidad \u00F3ptima");
		mntmNewMenuItem_8.addActionListener(this);
		mnConfiguracion.add(mntmNewMenuItem_8);
		
		mntmNewMenuItem_9 = new JMenuItem("Configurar cuota diaria");
		mntmNewMenuItem_9.addActionListener(this);
		mnConfiguracion.add(mntmNewMenuItem_9);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmNewMenuItem_10 = new JMenuItem("Acerca de Tienda");
		mntmNewMenuItem_10.addActionListener(this);
		mnAyuda.add(mntmNewMenuItem_10);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		escritorio = new JDesktopPane();
		contentPane.add(escritorio, BorderLayout.CENTER);
		escritorio.setLayout(new CardLayout(0, 0));
		
		

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmNewMenuItem_10) {
			actionPerformedMntmNewMenuItem_10(e);
		}
		if (e.getSource() == mntmNewMenuItem_9) {
			actionPerformedMntmNewMenuItem_9(e);
		}
		if (e.getSource() == mntmNewMenuItem_8) {
			actionPerformedMntmNewMenuItem_8(e);
		}
		if (e.getSource() == mntmNewMenuItem_7) {
			actionPerformedMntmNewMenuItem_7(e);
		}
		if (e.getSource() == mntmNewMenuItem_6) {
			actionPerformedMntmNewMenuItem_6(e);
		}
		if (e.getSource() == mntmNewMenuItem_5) {
			actionPerformedMntmNewMenuItem_5(e);
		}
		if (e.getSource() == mntmNewMenuItem_4) {
			actionPerformedMntmNewMenuItem_4(e);
		}
		if (e.getSource() == mntmListarceramicos) {
			actionPerformedMntmListarceramicos(e);
		}
		if (e.getSource() == mntmModificarceramico) {
			actionPerformedMntmModificarceramico(e);
		}
		if (e.getSource() == mntmConsultarceramico) {
			actionPerformedMntmConsultarceramico(e);
		}
		if (e.getSource() == mntmNewMenuItem) {
			actionPerformedMntmNewMenuItem(e);
		}
	}
	
	//archivo salir
	protected void actionPerformedMntmNewMenuItem(ActionEvent e) {
	}
	
	//mantenimiento consultar ceramico
	protected void actionPerformedMntmConsultarceramico(ActionEvent e) {
		String C = Consultarceramico.consulcer;
		if (C==null) {
			Consultarceramico consulcer = new Consultarceramico();
			escritorio.add(consulcer);
			consulcer.setVisible(true);
		}
		else {
			JOptionPane.showMessageDialog(null, "Ya esta activo");
		}
	}
	
	//mantenimiento modificar ceramico
	protected void actionPerformedMntmModificarceramico(ActionEvent e) {
		String M = Modificarceramico.modicer;
		if (M==null) {
			Modificarceramico modicer = new Modificarceramico();
			escritorio.add(modicer);
			modicer.setVisible(true);
		}
		else{
			JOptionPane.showMessageDialog(null, "Ya esta activo");
		}
	}
	
	//mantenimiento listar ceramico
	protected void actionPerformedMntmListarceramicos(ActionEvent e) {
		String L = Listarceramicos.listacer;
		if (L==null) {
			Listarceramicos listacer = new Listarceramicos();
			escritorio.add(listacer);
			listacer.setVisible(true);
		}
		else {
			JOptionPane.showMessageDialog(null,"Ya está activo");
		}
	}
	
	//ventas vender
	protected void actionPerformedMntmNewMenuItem_4(ActionEvent e) {
	}
	
	//ventas generar reportes
	protected void actionPerformedMntmNewMenuItem_5(ActionEvent e) {
	}
	
	//configuracion configurar descuentos
	protected void actionPerformedMntmNewMenuItem_6(ActionEvent e) {
	}
	
	//configuracion configurar obsequios
	protected void actionPerformedMntmNewMenuItem_7(ActionEvent e) {
	}
	
	//configuracion configurar cantidad optima
	protected void actionPerformedMntmNewMenuItem_8(ActionEvent e) {
	}
	
	//configuracion configurar cuota diaria
	protected void actionPerformedMntmNewMenuItem_9(ActionEvent e) {
	}
	
	//ayuda acerca de la tienda
	protected void actionPerformedMntmNewMenuItem_10(ActionEvent e) {
	}
	
}
