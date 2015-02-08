import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener{
	private JFrame frame;
	private JButton create;
	private JButton save;
	private JButton load;
	
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try{
					GUI window = new GUI();
					window.frame.setVisible(true);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public GUI(){
		initialize();
	}
	
	private void initialize(){
		frame = new JFrame();
		frame.setBounds(200,200,900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1,BorderLayout.WEST);
		panel_1.setLayout(new GridLayout(10,2,0,0));
		
		JTree tree = new JTree();
		panel_1.add(tree);
		
		JToolBar toolBar = new JToolBar();
		frame.getContentPane().add(toolBar,BorderLayout.NORTH);
		
		save = new JButton("Save");
		toolBar.add(save);
		save.addActionListener(this);
		
		load = new JButton("Load");
		toolBar.add(load);
		load.addActionListener(this);
		
		create = new JButton("Create");
		toolBar.add(create);
		create.addActionListener(this);
		
		JButton load = new JButton("Load");
		toolBar.add(load);
		
		JPanel panel  = new JPanel();
		frame.getContentPane().add(panel,BorderLayout.CENTER);
		GridLayout g1_panel = new GridLayout(10,2);
		g1_panel.setVgap(2);
		g1_panel.setHgap(2);
		panel.setLayout(g1_panel);
		
		JLabel name = new JLabel();
		panel.add(name);
		
		JTextPane textPane1 = new JTextPane();
		JScrollPane sp1 = new JScrollPane(textPane1);
		panel.add(sp1);
		
		JLabel ID = new JLabel();
		panel.add(ID);
		
		JTextPane textPane2 = new JTextPane();
		JScrollPane sp2 = new JScrollPane(textPane2);
		sp2.setToolTipText("This is helpful text");
		panel.add(sp2);
		
		JLabel description = new JLabel();
		panel.add(description);
		
		JTextPane textPane3 = new JTextPane();
		JScrollPane sp3 = new JScrollPane(textPane3);
		panel.add(sp3);
		
		JLabel prim_actors = new JLabel("Primary Actors");
		panel.add(prim_actors);
		
		JTextPane textPane4 = new JTextPane();
		JScrollPane sp4 = new JScrollPane(textPane4);
		panel.add(sp4);
		
		JLabel triggers = new JLabel("Triggers");
		panel.add(triggers);
		
		JTextPane textPane5 = new JTextPane();
		JScrollPane sp5 = new JScrollPane(textPane5);
		sp5.setToolTipText("");
		panel.add(sp5);
		
		JLabel preconditions = new JLabel("Precondidtions");
		panel.add(preconditions);
		
		JTextPane textPane6 = new JTextPane();
		JScrollPane sp6 = new JScrollPane(textPane6);
		panel.add(sp6);
		
		JLabel primaryFlow	= new JLabel("Primary Flow");
		panel.add(primaryFlow);
		
		JTextPane textPane7 = new JTextPane();
		JScrollPane sp7 = new JScrollPane(textPane7);
		panel.add(sp7);
		
		JLabel alternativeFlow = new JLabel("Alternative Flow");
		panel.add(alternativeFlow);
		
		JTextPane textPane8 = new JTextPane();
		JScrollPane sp8 = new JScrollPane(textPane8);
		panel.add(sp8);
		
		JLabel minimal = new JLabel("Minimual Guarentees");
		panel.add(minimal);
		
		JTextPane textPane9 = new JTextPane();
		JScrollPane sp9 = new JScrollPane(textPane9);
		panel.add(sp9);
		
		JLabel success = new JLabel("Success Guearentees");
		panel.add(success);
		
		JTextPane textPane10 = new JTextPane();
		JScrollPane sp10 = new JScrollPane(textPane10);
		panel.add(sp10);
		
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == create){
			UseCase uc = new UseCase();
			UseCaseEditor uce = new UseCaseEditor();
		}
		
		if(e.getSource() == save){
			UseCase uc = new UseCase();
			uc.saveAsText("filename");
		}
		
		if(e.getSource() == load){
			UseCase uc = new UseCase();
			uc.loadFromText("filename");
		}
	}
}
