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
import java.awt.SystemColor;
import java.awt.Color;

public class ingresoCuenta extends JFrame {

	private JPanel contentPane;
	private JTextField ingresoCuenta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ingresoCuenta frame = new ingresoCuenta();
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
	public ingresoCuenta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 300);
		setTitle("Banco Mario Bello García");//Titulo ventana
		setResizable(false); //desabilitamos la posibilidad 
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//boton ingreso en cuenta
		JButton btningreso = new JButton("Ingreso en cuenta");
		btningreso.setForeground(Color.WHITE);
		btningreso.setBackground(new Color(0, 102, 153));
		btningreso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				Principal p=new Principal();
				int saldo=p.cuenta;
				saldo+= Integer.parseInt(ingresoCuenta.getText());
				p.saldoCuenta.setText(saldo +"");
				
				p.saldoTarjeta.setText(String.valueOf(p.tarjeta));
				p.setVisible(true);
				dispose();
			
			}
		});
		btningreso.setFont(new Font("Verdana", Font.PLAIN, 10));
		btningreso.setBounds(100, 110, 170, 30);
		contentPane.add(btningreso);
		
		ingresoCuenta = new JTextField();
		ingresoCuenta.setToolTipText("Introduzca saldo a ingreso en cuenta");
		ingresoCuenta.setFont(new Font("Verdana", Font.PLAIN, 10));
		ingresoCuenta.setBounds(289, 111, 200, 30);
		contentPane.add(ingresoCuenta);
		ingresoCuenta.setColumns(10);
	}

}
