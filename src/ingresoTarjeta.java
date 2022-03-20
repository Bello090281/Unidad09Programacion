import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;

public class ingresoTarjeta extends JFrame {

	private JPanel contentPane;
	private JTextField ingresoTarjeta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ingresoTarjeta frame = new ingresoTarjeta();
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
	public ingresoTarjeta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 300);
		setTitle("Banco Mario Bello García");//Titulo ventana
		setResizable(false); //desabilitamos la posibilidad 
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//boton ingreso en tarjeta
		JButton btnsacarTarjeta = new JButton("Ingreso en la tarjeta");
		btnsacarTarjeta.setForeground(Color.WHITE);
		btnsacarTarjeta.setBackground(new Color(0, 102, 153));
		btnsacarTarjeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal p=new Principal();
				int saldo=p.tarjeta;
				saldo+= Integer.parseInt(ingresoTarjeta.getText());
				p.saldoTarjeta.setText(saldo +"");
				p.saldoCuenta.setText(String.valueOf(p.cuenta));
				p.setVisible(true);
				dispose();
			}
		});
		btnsacarTarjeta.setFont(new Font("Verdana", Font.PLAIN, 10));
		btnsacarTarjeta.setBounds(103, 102, 170, 30);
		contentPane.add(btnsacarTarjeta);
		
		ingresoTarjeta = new JTextField();
		ingresoTarjeta.setToolTipText("Introduzca saldo a ingresar en la tarjeta");
		ingresoTarjeta.setBounds(289, 102, 200, 30);
		contentPane.add(ingresoTarjeta);
		ingresoTarjeta.setColumns(10);
	}

}
