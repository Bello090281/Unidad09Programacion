import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;

public class sacarTarjeta extends JFrame {

	private JPanel contentPane;
	private JTextField sacarTarjeta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sacarTarjeta frame = new sacarTarjeta();
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
	public sacarTarjeta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 300);
		setTitle("Banco Mario Bello García");//Titulo ventana
		setResizable(false); //desabilitamos la posibilidad 
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnsacarTarjeta = new JButton("Sacar de la tarjeta");
		btnsacarTarjeta.setForeground(Color.DARK_GRAY);
		btnsacarTarjeta.setBackground(new Color(153, 204, 204));
		btnsacarTarjeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Principal p=new Principal();
				int saldo=p.tarjeta;
				saldo-= Integer.parseInt(sacarTarjeta.getText());
				p.saldoTarjeta.setText(saldo +"");
				p.saldoCuenta.setText(String.valueOf(p.cuenta));
				p.setVisible(true);
				dispose();
				
			}
		});
		btnsacarTarjeta.setFont(new Font("Verdana", Font.PLAIN, 9));
		btnsacarTarjeta.setBounds(86, 96, 170, 30);
		contentPane.add(btnsacarTarjeta);
		
		sacarTarjeta = new JTextField();
		sacarTarjeta.setToolTipText("Introduzca saldo a retirar de la tarjeta");
		sacarTarjeta.setFont(new Font("Verdana", Font.PLAIN, 10));
		sacarTarjeta.setBounds(268, 96, 200, 30);
		contentPane.add(sacarTarjeta);
		sacarTarjeta.setColumns(10);
	}

}
