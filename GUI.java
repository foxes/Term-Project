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
		UseCase uc = new UseCase();
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
		
		JLabel name_input = new JLabel("Name");
		panel.add(name_input);
		
		JLabel ID = new JLabel();
		panel.add(ID);
		
		JLabel ID_input = new JLabel("Id");
		panel.add(ID_input);
		
		JLabel description = new JLabel();
		panel.add(description);
		JScrollPane sp3 = new JScrollPane();
		panel.add(sp3);
		
		JLabel description_input = new JLabel("description");
		sp3.setViewportView(description_input);
		
		JLabel prim_actors = new JLabel("Primary Actors");
		panel.add(prim_actors);
		JScrollPane sp4 = new JScrollPane();
		panel.add(sp4);
		
		JLabel prim_actors_input = new JLabel("prim_actors");
		sp4.setViewportView(prim_actors_input);
		
		JLabel triggers = new JLabel("Triggers");
		panel.add(triggers);
		JScrollPane sp5 = new JScrollPane();
		sp5.setToolTipText("");
		panel.add(sp5);
		
		JLabel triggers_input = new JLabel("triggers");
		sp5.setViewportView(triggers_input);
		
		JLabel preconditions = new JLabel("Precondidtions");
		panel.add(preconditions);
		JScrollPane sp6 = new JScrollPane();
		panel.add(sp6);
		
		JLabel preconditions_input = new JLabel("preconditions");
		sp6.setViewportView(preconditions_input);
		
		JLabel primaryFlow	= new JLabel("Primary Flow");
		panel.add(primaryFlow);
		JScrollPane sp7 = new JScrollPane();
		panel.add(sp7);
		
		JLabel primaryFlow_input = new JLabel("primaryFlow");
		sp7.setViewportView(primaryFlow_input);
		
		JLabel alternativeFlow = new JLabel("Alternative Flow");
		panel.add(alternativeFlow);
		JScrollPane sp8 = new JScrollPane();
		panel.add(sp8);
		
		JLabel alternativeFlow_input = new JLabel("alternativeFlow");
		sp8.setViewportView(alternativeFlow_input);
		
		JLabel minimal = new JLabel("Minimual Guarentees");
		panel.add(minimal);
		JScrollPane sp9 = new JScrollPane();
		panel.add(sp9);
		
		JLabel minimal_input = new JLabel("Minimal");
		sp9.setViewportView(minimal_input);
		
		JLabel success = new JLabel("Success Guearentees");
		panel.add(success);
		JScrollPane sp10 = new JScrollPane();
		panel.add(sp10);
		
		JLabel success_input = new JLabel("Success");
		sp10.setViewportView(success_input);
		
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
