import java.awt.event.*;
import javax.swing.*;

public class GUICaixaOpcao extends JPanel
{
	private JButton btVerificar, btMarcar, btDesmarcar;
	private JCheckBox ckIngles, ckInformatica;

	public GUICaixaOpcao()
	{
		inicializarEventos();
		definirEventos();
	}

	private void inicializarEventos()
	{
		btVerificar = new JButton("Verificar");
		ckIngles = new JCheckBox("Inglês");
		ckInformatica = new JCheckBox("Informática");
		btMarcar = new JButton("Marcar");
		btDesmarcar = new JButton("Desmarcar");
		setLayout(null);
		add(btVerificar);
		add(ckIngles);
		add(ckInformatica);
		add(btMarcar);
		add(btDesmarcar);

		btVerificar.setBounds(20, 70, 100, 20);
		ckIngles.setBounds(15, 15, 100, 25);
		ckInformatica.setBounds(15, 40, 100, 25);
		btMarcar.setBounds(20, 130, 100,20);
		btDesmarcar.setBounds(140, 130, 100,20);
	}

	private void definirEventos()
	{

		btVerificar.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				String selecao = "Selecionados: ";
				if (ckIngles.isSelected())
				{
					selecao += "\nInglês";
				}
				if (ckInformatica.isSelected())
				{
					selecao += "\nInformática";
				}

				JOptionPane.showMessageDialog(null, selecao);
			}
		});

		btMarcar.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				ckInformatica.setSelected(true);
				ckIngles.setSelected(true);
			}
		});

		btDesmarcar.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				ckIngles.setSelected(false);
				ckInformatica.setSelected(false);
			}
		});


	}
}
