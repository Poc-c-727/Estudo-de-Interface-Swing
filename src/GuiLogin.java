import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiLogin extends JFrame
{
	private JTextField tfLogin;
	private JLabel lbSenha;
	private JLabel lbLogin;
	private JButton btLogar;
	private JButton btCancelar;
	private JPasswordField pfSenha;
	private static GuiLogin frame;

	public GuiLogin()
	{
		inicializarComponentes();
		definirEventos();
	}

	public void inicializarComponentes()
	{
		setTitle("Login do Sistema");
		setBounds(0, 0, 250, 200);
		setLayout(null);
		tfLogin = new JTextField(5);
		pfSenha = new JPasswordField(5);
		lbSenha = new JLabel("Senha:");
		lbLogin = new JLabel("Login");
		btCancelar = new JButton("Cancelar");
		btLogar = new JButton("Logar");

		tfLogin.setBounds(100, 30, 120, 25);
		lbLogin.setBounds(30, 30, 80, 25);
		lbSenha.setBounds(30, 70, 80, 25);
		pfSenha.setBounds(100, 75, 120, 25);
		btLogar.setBounds(20, 120, 100, 25);
		btCancelar.setBounds(125, 120, 100, 25);

		add(tfLogin);
		add(lbLogin);
		add(lbSenha);
		add(pfSenha);
		add(btLogar);
		add(btCancelar);
	}

	public void definirEventos()
	{
		btLogar.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				String senha = String.valueOf(pfSenha.getPassword());
				if (tfLogin.getText().equals("java8") &&  pfSenha.getText().equals("java8"))
				{
					frame.setVisible(false);
					GUIMenuPrincipal.abrir();
				} else
				{
					JOptionPane.showMessageDialog(null, "Login ou senha incorretas");
				}
			}
		});

		btCancelar.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
	}

	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				frame = new GuiLogin();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
				frame.setLocation((tela.width - frame.getSize().width) / 2,
					(tela.height - frame.getSize().height) / 2);
				frame.setVisible(true);
			}
		});
	}
}
