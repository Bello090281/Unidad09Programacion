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

public class tranferencia extends JFrame {

	private JPanel contentPane;
	private JTextField Transferencia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tranferencia frame = new tranferencia();
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
	public tranferencia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 300);
		setTitle("Banco Mario Bello García");//Titulo ventana
		setResizable(false); //desabilitamos la redimensión de la ventana
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//boton transferencia cuenta a tarjeta
		JButton btnCuentaTarjeta = new JButton("Transferencia a la cuenta");
		btnCuentaTarjeta.setForeground(Color.WHITE);
		btnCuentaTarjeta.setBackground(new Color(0, 102, 153));
		btnCuentaTarjeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Principal p=new Principal();
				int saldo=p.cuenta;
				int saldoTarjeta=p.tarjeta;
				saldo+= Integer.parseInt(Transferencia.getText());
				saldoTarjeta-=Integer.parseInt(Transferencia.getText());
				p.saldoCuenta.setText(saldo +"");
				p.saldoTarjeta.setText(saldoTarjeta+"");
						
				p.setVisible(true);
				dispose();
			}
		});
		btnCuentaTarjeta.setFont(new Font("Verdana", Font.PLAIN, 9));
		btnCuentaTarjeta.setBounds(187, 109, 250, 30);
		contentPane.add(btnCuentaTarjeta);
		
		Transferencia = new JTextField();
		Transferencia.setToolTipText("Introduzca el saldo a transferir");
		Transferencia.setFont(new Font("Verdana", Font.PLAIN, 10));
		Transferencia.setBounds(187, 59, 250, 30);
		contentPane.add(Transferencia);
		Transferencia.setColumns(10);
		
		
		
		//boton transferencia tarjeta a cuenta
		JButton btmTarjetaCuenta = new JButton("Transferencia a la tarjeta");
		btmTarjetaCuenta.setForeground(Color.DARK_GRAY);
		btmTarjetaCuenta.setBackground(new Color(153, 204, 204));
		btmTarjetaCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal p=new Principal();
				int saldo=p.cuenta;
				int saldoTarjeta=p.tarjeta;
				saldoTarjeta+= Integer.parseInt(Transferencia.getText());
				saldo-=Integer.parseInt(Transferencia.getText());
				p.saldoCuenta.setText(saldo +"");
				p.saldoTarjeta.setText(saldoTarjeta+"");
						
				p.setVisible(true);
				dispose();
			}
		});
		btmTarjetaCuenta.setFont(new Font("Verdana", Font.PLAIN, 9));
		btmTarjetaCuenta.setBounds(187, 154, 250, 30);
		contentPane.add(btmTarjetaCuenta);
	}

}
