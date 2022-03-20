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
import java.awt.Color;
import java.awt.SystemColor;

public class sacarDineroCuenta extends JFrame {

	private JPanel contentPane;
	private JTextField sacarCuenta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sacarDineroCuenta frame = new sacarDineroCuenta();
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
	public sacarDineroCuenta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 300);
		setTitle("Banco Mario Bello García");//Titulo ventana
		setResizable(false); //desabilitamos la posibilidad 
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//Boton sacar dinero
		JButton btnsacarCuenta = new JButton("Sacar dinero de la cuenta");
		btnsacarCuenta.setBackground(new Color(153, 204, 204));
		btnsacarCuenta.setForeground(Color.DARK_GRAY);
		btnsacarCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Principal p=new Principal();
				int saldo=p.cuenta;
				saldo-= Integer.parseInt(sacarCuenta.getText());
				p.saldoCuenta.setText(saldo +"");
				
				p.saldoTarjeta.setText(String.valueOf(p.tarjeta));
				p.setVisible(true);
				dispose();
			}
		});
		btnsacarCuenta.setFont(new Font("Verdana", Font.PLAIN, 10));
		btnsacarCuenta.setBounds(111, 112, 170, 30);
		contentPane.add(btnsacarCuenta);
		
		sacarCuenta = new JTextField();
		sacarCuenta.setToolTipText("Introduzca saldo a retirar de la cuenta");
		sacarCuenta.setBounds(291, 112, 200, 30);
		contentPane.add(sacarCuenta);
		sacarCuenta.setColumns(10);
	}

}
