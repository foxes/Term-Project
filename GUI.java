package UseCaseEditor;

//import UseCaseEditor;



import java.awt.event.*;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.CompoundBorder;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;


/*****************************************************************

@author 
@version 
*****************************************************************/
public class GUI extends JFrame implements ActionListener{
	private JMenuBar menus;
	private JMenu fileMenu;
	private JMenu actionMenu;
	
	// fileMenu
	private JMenuItem openItem;
	private JMenuItem exitItem;
	private JMenuItem saveItem;
	
	// account Menu
	private JMenuItem AddUseCase;
	private JMenuItem editUseCase;
	private JMenuItem helpUseCase;
	
	private UseCaseEditor UCE;	


	// keep Track of Currently viewed Usecase
	private UseCase CurrentUseCase;
	
	private Project CurrentProject = new Project();
	
	
	private JLabel success_input, minimal_input, alternativeFlow_input,
	primaryFlow_input, Name, ID;
	private JLabel preconditions_input, triggers_input, prim_actors_input,
	description_input;
	private JLabel ID_input, name_input;
	
	private JTextArea area;
	final JFileChooser fc = new JFileChooser();	
	private JTree tree;
	private JLabel lblNewLabel;


	

	public GUI() {
		getContentPane().setBackground(Color.WHITE);
		setTitle("Usecase Generator 2015 #420blazeit #legalize crystal weed");		

		/** File menu */
		fileMenu = new JMenu("File");
		openItem = new JMenuItem("Open");
		exitItem = new JMenuItem("Exit");
		saveItem = new JMenuItem("Save");
		
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		saveItem.addActionListener(this);
		openItem.addActionListener(this);
		exitItem.addActionListener(this);

		/** action menu */
		actionMenu = new JMenu ("Action");
		AddUseCase = new JMenuItem("New Usecase");
		editUseCase = new JMenuItem("Edit");		
		helpUseCase = new JMenuItem("Help");
		
		actionMenu.add(AddUseCase);
		actionMenu.add(editUseCase);
		actionMenu.add(helpUseCase);
		
		AddUseCase.addActionListener(this);
		editUseCase.addActionListener(this);
		helpUseCase.addActionListener(this);

		/** Menu bar */
		menus = new JMenuBar();		
		menus.add(fileMenu); 
		menus.add(actionMenu);		
		setJMenuBar(menus);				

		setLocationRelativeTo(null);
		
		setVisible(true);
		setSize(835,418);
		getContentPane().setLayout(null);
		
		tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Test Tree") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("Aliens ");
						node_1.add(new DefaultMutableTreeNode("blue"));
						node_1.add(new DefaultMutableTreeNode("violet"));
						node_1.add(new DefaultMutableTreeNode("red"));
						node_1.add(new DefaultMutableTreeNode("yellow"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("Kanye West");
						node_1.add(new DefaultMutableTreeNode("basketball"));
						node_1.add(new DefaultMutableTreeNode("soccer"));
						node_1.add(new DefaultMutableTreeNode("football"));
						node_1.add(new DefaultMutableTreeNode("hockey"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("Spooky skeletons");
						node_1.add(new DefaultMutableTreeNode("hot dogs"));
						node_1.add(new DefaultMutableTreeNode("pizza"));
						node_1.add(new DefaultMutableTreeNode("ravioli"));
						node_1.add(new DefaultMutableTreeNode("bananas"));
					add(node_1);
				}
			}
		));
		tree.setBackground(Color.WHITE);
		tree.setBounds(0, 0, 144, 358);
		getContentPane().add(tree);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(143, 11, 611, 336);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		ID_input = new JLabel("Id");
		ID_input.setBounds(303, 290, 143, 20);
		panel.add(ID_input);
		
		Name = new JLabel("Name");
		Name.setBounds(10, 11, 143, 20);
		panel.add(Name);
		
		ID = new JLabel("ID");
		ID.setBounds(10, 290, 143, 20);
		panel.add(ID);

		JLabel description = new JLabel();
		description = new JLabel("Description");
		description.setBounds(10, 229, 143, 20);
		panel.add(description);

		JLabel prim_actors = new JLabel("Primary Actors");
		prim_actors.setBounds(10, 39, 143, 20);
		panel.add(prim_actors);

		JLabel triggers = new JLabel("Triggers");
		triggers.setBounds(10, 105, 143, 20);
		panel.add(triggers);

		JLabel preconditions = new JLabel("Precondidtions");
		preconditions.setBounds(10, 260, 143, 20);
		panel.add(preconditions);

		JLabel primaryFlow = new JLabel("Primary Flow");		
		primaryFlow.setBounds(10, 74, 143, 20);
		panel.add(primaryFlow);

		JLabel alternativeFlow = new JLabel("Alternative Flow");
		panel.add(alternativeFlow);
		alternativeFlow.setBounds(10, 136, 143, 20);

		JLabel minimal = new JLabel("Minimal Gaurantee");
		panel.add(minimal);
		minimal.setBounds(10, 167, 143, 20);

		JLabel success = new JLabel("Success Guarantee");
		panel.add(success);
		success.setBounds(10, 198, 143, 20);

		name_input = new JLabel("Name");

		name_input.setBounds(303, 11, 143, 20);
		panel.add(name_input);
		
				success_input = new JLabel("Success Guarantee");
				panel.add(success_input);
				success_input.setBounds(305, 199, 141, 18);
				
						minimal_input = new JLabel("Minimal Guarantee");
						panel.add(minimal_input);
						minimal_input.setBounds(305, 168, 141, 18);
						
								description_input = new JLabel("Descrption");
								panel.add(description_input);
								description_input.setBounds(303, 230, 141, 18);
								
										prim_actors_input = new JLabel("Primary Actors");
										panel.add(prim_actors_input);
										prim_actors_input.setBounds(303, 40, 141, 18);
										
												triggers_input = new JLabel("Triggers");
												panel.add(triggers_input);
												triggers_input.setBounds(305, 106, 141, 18);
												
														preconditions_input = new JLabel("Preconditions");
														panel.add(preconditions_input);
														preconditions_input.setBounds(303, 261, 141, 18);
														
																primaryFlow_input = new JLabel("Primary Flow");
																panel.add(primaryFlow_input);
																primaryFlow_input.setBounds(303, 75, 141, 18);
																
																		alternativeFlow_input = new JLabel("Alternative Flow");
																		panel.add(alternativeFlow_input);
																		alternativeFlow_input.setBounds(305, 137, 141, 18);

		
	}
	
	public void UCE_Utility() {
		UCE.addSaveListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UseCase uc = UCE.getUC();
				System.out.println(uc.getPreconditions());
				save(uc);
			}
		});
	}
	
	/*****************************************************************
	main method, creates the instance of GUI
	*****************************************************************/
	public static void main (String[] args) {
		
		new GUI();	
	}
	
	
	
	public void save(UseCase uc) {
		//save into jlabels
		success_input.setText(uc.getSuccessGuarantees());
		minimal_input.setText(uc.getMinimalGuaruntees());
		alternativeFlow_input.setText(uc.getAlternativeflow());
		primaryFlow_input.setText(uc.getPrimaryflow());
		preconditions_input.setText(uc.getPreconditions());
		triggers_input.setText(uc.getTriggers());
		prim_actors_input.setText(uc.getPrimaryActors());
		description_input.setText(uc.getDescription());
		ID_input.setText(uc.getID());
		name_input.setText(uc.getName());
		
		//set current Usecase
		CurrentUseCase = uc;
		
		//save project
		CurrentProject.addUsecase(uc);
		
		//make edit visible if already not
//		edit.setVisible(true);
//		display();
	}
	
	/**************************************************************
	 Manages the action listeners that are currently connected to
	 GUI objects.
	 @param e the event
	 **************************************************************/
	public void actionPerformed(ActionEvent e) {
		
		if (openItem == e.getSource()) {	

			JFileChooser input = new JFileChooser();
			int result = input.showSaveDialog(this);
			if (result == JFileChooser.APPROVE_OPTION) {
			
			//Retrieves the absolute path of the file that the user selected
		   	String path = input.getSelectedFile().getAbsolutePath(); 

		   	//loads Usecase using the path retrieved
//			CurrentProject.saveToXML(path, CurrentUseCase);

			} else if (result == JFileChooser.CANCEL_OPTION) {
				
			    System.out.println("Cancel was selected");
			}
		}
		
		/** exits program when called */
		if (exitItem == e.getSource()) {		
			 
			System.exit(0);
		}
		


		
		/** performs save usecase operations using a JFilechooser menu */
		if (saveItem == e.getSource()) {			

			JFileChooser input = new JFileChooser();
			int result = input.showSaveDialog(this);
			if (result == JFileChooser.APPROVE_OPTION) {
		   	String path = input.getSelectedFile().getAbsolutePath(); 


//			CurrentProject.saveToXML(path, CurrentUseCase);	
//		   	CurrentUseCase.saveAsText(path);

			} else if (result == JFileChooser.CANCEL_OPTION) {
				
			    System.out.println("Cancel was selected");
			}						
		}
		
		/** allows user to create a new usecase, engages UseCaseEditor */
		if (AddUseCase == e.getSource()) {	
			
			UCE = new UseCaseEditor();
			UCE.setVisible(true);
			UCE_Utility();
			

		}	

		/** allows user to edit the current usecase, engages UseCaseEditor */
		if (editUseCase == e.getSource()) {
			UCE.setVisible(true);
									
		}
		

		if (helpUseCase == e.getSource()) {
			
			JOptionPane.showMessageDialog(null,	
					"for future usage i guess\n Version 1.0","Version Information",
					JOptionPane.INFORMATION_MESSAGE);
			
		
		}

	}
}
