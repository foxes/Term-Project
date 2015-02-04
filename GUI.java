import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;

import java.awt.BorderLayout;
import javax.swing.JPanel;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTree;


public class GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200,200, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new GridLayout(10, 2, 0, 0));
		
		JTree tree = new JTree();
		panel_1.add(tree);
		
		JToolBar toolBar = new JToolBar();
		frame.getContentPane().add(toolBar, BorderLayout.NORTH);
		
		JButton btnSave = new JButton("Save");
		toolBar.add(btnSave);
		
		JButton btnCreate = new JButton("Create");
		toolBar.add(btnCreate);
		
		JButton btnLoad = new JButton("Load");
		toolBar.add(btnLoad);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		GridLayout gl_panel = new GridLayout(10,2);
		gl_panel.setVgap(2);
		gl_panel.setHgap(2);
		panel.setLayout(gl_panel);
		
		JLabel lblName = new JLabel("Name");
		panel.add(lblName);
		
		JTextPane textPane = new JTextPane();
		JScrollPane sp = new JScrollPane(textPane);
		panel.add(sp);
		
		JLabel lblId = new JLabel("ID");
		panel.add(lblId);
		
		JTextPane textPane1 = new JTextPane();
		JScrollPane sp1 = new JScrollPane(textPane1);
		sp1.setToolTipText("This is helpful text");
		panel.add(sp1);
		
		JLabel lblDescription = new JLabel("Description");
		panel.add(lblDescription);
		
		JTextPane textPane2 = new JTextPane();
		JScrollPane sp2 = new JScrollPane(textPane2);
		panel.add(sp2);
		
		JLabel lblActorsprimaryAndSuporting = new JLabel("Actors(primary and suporting)");
		panel.add(lblActorsprimaryAndSuporting);
		
		JTextPane textPane3 = new JTextPane();
		JScrollPane sp3 = new JScrollPane(textPane3);
		panel.add(sp3);
		
		JLabel lblTriggers = new JLabel("Triggers");
		panel.add(lblTriggers);
		
		JTextPane textPane4 = new JTextPane();
		JScrollPane sp4 = new JScrollPane(textPane4);
		sp4.setToolTipText("");
		panel.add(sp4);
		
		JLabel lblPreconditions = new JLabel("Preconditions");
		panel.add(lblPreconditions);
		
		JTextPane textPane5 = new JTextPane();
		JScrollPane sp5 = new JScrollPane(textPane5);
		panel.add(sp5);
		
		JLabel lblPrimaryFlow = new JLabel("Primary flow");
		panel.add(lblPrimaryFlow);
		
		JTextPane textPane6 = new JTextPane();
		JScrollPane sp6 = new JScrollPane(textPane6);
		panel.add(sp6);
		
		JLabel lblAlternativeFlows = new JLabel("Alternative Flows");
		panel.add(lblAlternativeFlows);
		
		JTextPane textPane7 = new JTextPane();
		JScrollPane sp7 = new JScrollPane(textPane7);
		panel.add(sp7);
		
		JLabel lblMinimalGuarantees = new JLabel("Minimal Guarantees");
		panel.add(lblMinimalGuarantees);
		
		JTextPane textPane8 = new JTextPane();
		JScrollPane sp8 = new JScrollPane(textPane8);
		panel.add(sp8);
		
		JLabel lblSuccessGuarantees = new JLabel("Success Guarantees");
		panel.add(lblSuccessGuarantees);
		
		JTextPane textPane9 = new JTextPane();
		JScrollPane sp9 = new JScrollPane(textPane9);
		panel.add(sp9);
	}

}
