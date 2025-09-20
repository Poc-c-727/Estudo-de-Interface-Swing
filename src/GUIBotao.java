import java.awt.event.*;
import javax.swing.*;

public class GUIBotao extends JPanel
{
	private JButton btMensagem, btTeimoso;
	private ImageIcon imageIcon1;

	public GUIBotao()
	{
		inicializarComponentes();
		definireventos();
	}

	private void inicializarComponentes()
	{
		setLayout(null);
		imageIcon1 = new ImageIcon("java.jpg");
		btMensagem = new JButton("Mensagem", imageIcon1);
		btMensagem.setBounds(50, 20, 140, 38);
		btMensagem.setMnemonic(KeyEvent.VK_M);
		btMensagem.setToolTipText("Clique aqui para ver a mensagem");
		btTeimoso = new JButton("Teimoso");
		btTeimoso.setBounds(50, 70, 100, 25);

		add(btMensagem);
		add(btTeimoso);
	}

	private void definireventos()
	{
		btMensagem.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "Botão Mensagem");
			}
		});

		btTeimoso.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "Botão Teimoso");
			}
		});

		btTeimoso.addMouseListener(new MouseListener()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{

			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e)
			{
				btTeimoso.setBounds(50, 120, 100, 25);
			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				btTeimoso.setBounds(50, 70, 100, 25);
			}
		});
	}
}
