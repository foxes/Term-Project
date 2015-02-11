import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
	private JFrame frame;

	// Buttons
	private JButton create, save, edit, load;

	// Different panels
	private JPanel panel, panel2, panel_2;

	// menu
	private JToolBar toolBar;
	// Input Labels for user View
	private JLabel success_input, minimal_input, alternativeFlow_input,
			primaryFlow_input;
	private JLabel preconditions_input, triggers_input, prim_actors_input,
			description_input;
	private JLabel ID_input, name_input;

	// Respective scroll panes not implemented yet
	private JScrollPane success_Scroll, minimal_Scroll, alternativeFlow_Scroll,
			primaryFlow_Scroll;
	private JScrollPane preconditions_Scroll, triggers_Scroll,
			prim_actors_Scroll, description_Scroll;

	// Current Project for keeping trak of things
	private Project CurrentProject = new Project();

	// Instance Of the editor for uses cases
	private UseCaseEditor UCE;

	// keep Track of Currently viewed Usecase
	private UseCase CurrentUseCase;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GUI() {
		initialize();
	}

	//made this method to save the usecase from editor
	public void UCE_Utility() {
		UCE.addSaveListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UseCase uc = UCE.getUC();
				System.out.println(uc.getPreconditions());
				save(uc);
			}
		});
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		toolBar = new JToolBar();
		frame.getContentPane().add(toolBar, BorderLayout.NORTH);

		save = new JButton("Save");
		toolBar.add(save);
		save.addActionListener(this);

		load = new JButton("Load");
		toolBar.add(load);
		load.addActionListener(this);

		create = new JButton("Create");
		toolBar.add(create);
		create.addActionListener(this);

		panel2 = new JPanel();
		frame.getContentPane().add(panel2, BorderLayout.CENTER);
		GridLayout g1_panel = new GridLayout(3, 4);
		g1_panel.setVgap(10);
		g1_panel.setHgap(10);
		{
			// Center Create and load buttons
			panel2.setLayout(g1_panel);
			JLabel fill1 = new JLabel();
			panel2.add(fill1);
			JLabel fill2 = new JLabel();
			panel2.add(fill2);
			JLabel fill3 = new JLabel();
			panel2.add(fill3);
			JLabel fill4 = new JLabel();
			panel2.add(fill4);
			JLabel fill5 = new JLabel();
			panel2.add(fill5);
			panel2.add(create);
			panel2.add(load);
			JLabel fill6 = new JLabel();
			panel2.add(fill6);
			JLabel fill7 = new JLabel();
			panel2.add(fill7);
			JLabel fill8 = new JLabel();
			panel2.add(fill8);
			JLabel fill9 = new JLabel();
			panel2.add(fill9);
			JLabel fill = new JLabel();
			panel2.add(fill);
		}
		{
			// View of current Usecase
			panel = new JPanel();
			panel.setVisible(false);

			JLabel space = new JLabel();
			panel.add(space);

			name_input = new JLabel("Name");
			panel.add(name_input);

			JLabel space2 = new JLabel();
			panel.add(space2);

			ID_input = new JLabel("Id");
			panel.add(ID_input);

			JLabel description = new JLabel();
			description = new JLabel("Description");
			panel.add(description);

			JScrollPane sp3 = new JScrollPane();
			panel.add(sp3);

			description_input = new JLabel("description");
			sp3.setViewportView(description_input);

			JLabel prim_actors = new JLabel("Primary Actors");
			panel.add(prim_actors);
			JScrollPane sp4 = new JScrollPane();
			panel.add(sp4);

			prim_actors_input = new JLabel("prim_actors");
			sp4.setViewportView(prim_actors_input);

			JLabel triggers = new JLabel("Triggers");
			panel.add(triggers);
			JScrollPane sp5 = new JScrollPane();
			sp5.setToolTipText("");
			panel.add(sp5);

			triggers_input = new JLabel("triggers");
			sp5.setViewportView(triggers_input);

			JLabel preconditions = new JLabel("Precondidtions");
			panel.add(preconditions);
			JScrollPane sp6 = new JScrollPane();
			panel.add(sp6);

			preconditions_input = new JLabel("preconditions");
			sp6.setViewportView(preconditions_input);

			JLabel primaryFlow = new JLabel("Primary Flow");
			panel.add(primaryFlow);
			JScrollPane sp7 = new JScrollPane();
			panel.add(sp7);

			primaryFlow_input = new JLabel("primaryFlow");
			sp7.setViewportView(primaryFlow_input);

			JLabel alternativeFlow = new JLabel("Alternative Flow");
			panel.add(alternativeFlow);
			JScrollPane sp8 = new JScrollPane();
			panel.add(sp8);

			alternativeFlow_input = new JLabel("alternativeFlow");
			sp8.setViewportView(alternativeFlow_input);

			JLabel minimal = new JLabel("Minimual Guarentees");
			panel.add(minimal);
			JScrollPane sp9 = new JScrollPane();
			panel.add(sp9);

			minimal_input = new JLabel("Minimal");
			sp9.setViewportView(minimal_input);

			JLabel success = new JLabel("Success Guearentees");
			panel.add(success);
			JScrollPane sp10 = new JScrollPane();
			panel.add(sp10);

			success_input = new JLabel("Success");
			sp10.setViewportView(success_input);
		}

		//edit button currently has its own panel
		panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.SOUTH);
		edit = new JButton("Edit");
		edit.setVisible(false);
		panel_2.add(edit);
		edit.addActionListener(this);
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
		edit.setVisible(true);
		display();
	}

	public void display() {
		// change panels from create/load to usecase view
		panel.setVisible(true);
		panel2.setVisible(false);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		GridLayout g1_panel = new GridLayout(10, 2);
		g1_panel.setVgap(2);
		g1_panel.setHgap(2);
		
		//change location of create and load.
		toolBar.add(create);
		toolBar.add(load);
		panel.setLayout(g1_panel);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == create) {
			if (CurrentProject.GetProjectIds().size() < 1) {

			}
			UCE = new UseCaseEditor();
			UCE.setVisible(true);
			UCE_Utility();
		}

		if (e.getSource() == save) {
			if (CurrentUseCase != null)
				save(CurrentUseCase);
		}
		if (e.getSource() == edit) {
			UCE.setVisible(true);
		}
		if (e.getSource() == load) {
			UseCase uc = new UseCase();
			// uc.loadFromText("filename");
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
			edit.setVisible(true);
			display();
		}
	}
}
