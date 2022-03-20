import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class Principal extends JFrame {

	private JPanel Principal;
	public static JTextField saldoCuenta;
	public static JTextField saldoTarjeta;
	public static int cuenta;
	public static int tarjeta;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
					
					saldoCuenta.setText(String.valueOf(cuenta));
					saldoTarjeta.setText(String.valueOf(tarjeta));
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 300);
		Principal = new JPanel();
		Principal.setBackground(SystemColor.inactiveCaption);
		Principal.setForeground(Color.LIGHT_GRAY);
		Principal.setBorder(null);
		setContentPane(Principal);
		Principal.setLayout(null);
	
		
		//boton ingreso cuenta
		JButton btningresCuenta = new JButton("Ingreso cuenta");
		btningresCuenta.setForeground(Color.WHITE);
		btningresCuenta.setBackground(new Color(0, 102, 153));
		btningresCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cuenta=Integer.parseInt(saldoCuenta.getText());
				ingresoCuenta iC=new ingresoCuenta();
				iC.setVisible(true);
				dispose();
				
			}
		});
		btningresCuenta.setFont(new Font("Verdana", Font.PLAIN, 10));
		btningresCuenta.setBounds(34, 37, 170, 30);
		Principal.add(btningresCuenta);
		
		saldoCuenta = new JTextField();
		saldoCuenta.setFont(new Font("Verdana", Font.PLAIN, 10));
		saldoCuenta.setBounds(173, 174, 200, 30);
		Principal.add(saldoCuenta);
		saldoCuenta.setColumns(10);
		
		JLabel txtsaldo = new JLabel("Saldo en la cuenta");
		txtsaldo.setFont(new Font("Verdana", Font.PLAIN, 10));
		txtsaldo.setBounds(34, 177, 141, 14);
		Principal.add(txtsaldo);
		
		JLabel txtsaldotarjeta = new JLabel("Saldo en la tarjeta");
		txtsaldotarjeta.setFont(new Font("Verdana", Font.PLAIN, 10));
		txtsaldotarjeta.setBounds(34, 217, 141, 14);
		Principal.add(txtsaldotarjeta);
		
		saldoTarjeta = new JTextField();
		saldoTarjeta.setFont(new Font("Verdana", Font.PLAIN, 10));
		saldoTarjeta.setBounds(173, 214, 200, 30);
		Principal.add(saldoTarjeta);
		saldoTarjeta.setColumns(10);
		
		
		//boton sacar dinero de la cuenta
		JButton btnsacarcuenta = new JButton("Sacar dinero de la Cuenta");
		btnsacarcuenta.setForeground(Color.DARK_GRAY);
		btnsacarcuenta.setBackground(new Color(153, 204, 204));
		btnsacarcuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cuenta=Integer.parseInt(saldoCuenta.getText());
				sacarDineroCuenta sD=new sacarDineroCuenta();
				sD.setVisible(true);
				dispose();
			}
		});
		btnsacarcuenta.setFont(new Font("Verdana", Font.PLAIN, 9));
		btnsacarcuenta.setBounds(34, 94, 170, 30);
		Principal.add(btnsacarcuenta);
		
		
		//boton ingresar en la tarjeta
		JButton btningresotarjeta = new JButton("Ingreso tarjeta");
		btningresotarjeta.setForeground(Color.WHITE);
		btningresotarjeta.setBackground(new Color(0, 102, 153));
		btningresotarjeta.setFont(new Font("Verdana", Font.PLAIN, 10));
		btningresotarjeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tarjeta=Integer.parseInt(saldoTarjeta.getText());
				ingresoTarjeta iT=new ingresoTarjeta();
				iT.setVisible(true);
				dispose();
			}
		});
		btningresotarjeta.setBounds(234, 37, 170, 30);
		Principal.add(btningresotarjeta);
		
		
		//boton sacar dinero tarjeta
		JButton btnsacarTarjeta = new JButton("Sacar dinero de la Tarjeta");
		btnsacarTarjeta.setForeground(Color.DARK_GRAY);
		btnsacarTarjeta.setBackground(new Color(153, 204, 204));
		btnsacarTarjeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				tarjeta=Integer.parseInt(saldoTarjeta.getText());
				sacarTarjeta sT=new sacarTarjeta();
				sT.setVisible(true);
				dispose();
				
			}
		});
		btnsacarTarjeta.setFont(new Font("Verdana", Font.PLAIN, 9));
		btnsacarTarjeta.setBounds(234, 94, 170, 30);
		Principal.add(btnsacarTarjeta);
		
		
		//boton transferencia
		JButton btntransferencia = new JButton("Transferencia");
		btntransferencia.setForeground(Color.WHITE);
		btntransferencia.setBackground(new Color(0, 102, 153));
		btntransferencia.setFont(new Font("Verdana", Font.PLAIN, 10));
		btntransferencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cuenta=Integer.parseInt(saldoCuenta.getText());
				tarjeta=Integer.parseInt(saldoTarjeta.getText());
				tranferencia T=new tranferencia();
				T.setVisible(true);
				dispose();
			}
		});
		btntransferencia.setBounds(436, 37, 170, 30);
		Principal.add(btntransferencia);
		
		
		//boton salir
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		btnSalir.setForeground(Color.DARK_GRAY);
		btnSalir.setBackground(Color.LIGHT_GRAY);
		btnSalir.setFont(new Font("Verdana", Font.PLAIN, 10));
		btnSalir.setBounds(436, 191, 170, 30);
		Principal.add(btnSalir);
		setTitle("Banco Mario Bello García");//Titulo ventana
		setResizable(false); //desabilitamos la posibilidad 
	}
}
