import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIMenuPrincipal extends JFrame
{
	private Container contentPane;
	private JMenuBar mnBarra;
	private JMenu mnArquivo, mnExemplos;
	private JMenuItem miSair, miBotao, miCaixaOpcao;


	public GUIMenuPrincipal()
	{
		inicilizarComponentes();
		definirEventos();
	}

	private void inicilizarComponentes()
	{
		setTitle("Menu Principal");
		setBounds(0, 0, 800, 600);
		contentPane = getContentPane();
		mnBarra = new JMenuBar();
		mnArquivo = new JMenu("Arquivo");
		mnArquivo.setMnemonic('A');
		mnExemplos = new JMenu("Exemplos");
		mnExemplos.setMnemonic('E');
		miSair = new JMenuItem("Sair", new ImageIcon("sair.jpg"));
		miSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
		miBotao = new JMenuItem("Botão");
		miCaixaOpcao = new JMenuItem("Caixa de Opção");

		mnBarra.add(mnArquivo);
		mnBarra.add(mnExemplos);
		mnArquivo.add(miSair);
		mnExemplos.add(miBotao);
		mnExemplos.add(miCaixaOpcao);
		setJMenuBar(mnBarra);
	}

	private void definirEventos()
	{
		miSair.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});

		miBotao.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				GUIBotao botao = new GUIBotao();
				contentPane.removeAll();
				contentPane.add(botao);
				contentPane.validate();
			}
		});

		miCaixaOpcao.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				GUICaixaOpcao guiCaixaOpcao = new GUICaixaOpcao();
				contentPane.removeAll();
				contentPane.add(guiCaixaOpcao);
				contentPane.validate();
			}
		});
	}

	public static void abrir()
	{
		GUIMenuPrincipal frame = new GUIMenuPrincipal();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((tela.width - frame.getSize().width) / 2,
			(tela.height - frame.getSize().height) / 2 );
		frame.setVisible(true);

	}
}
