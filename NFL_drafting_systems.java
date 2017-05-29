import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.ListModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class NFL_drafting_systems {

	private JFrame frame;
	private static String[] NFLteams = {"San Diego Chargers", "Oakland Raiders", "San Francisco 49ers", "New England Patrios", 
			"Los Angeles Rams", "Carolina Panthers", "Denver Broncos", "New York Jets", "Baltimore Ravens", "Miami Dolphins"};
	private JList Teams;
	private JTextField textField;
	private JPanel panelTeams;
	private JPanel panelOptions;
	private JPanel panelPositions;
	private JPanel panelPlayersPosition;
	private JPanel panelPlayerStats;
	private JPanel panelDraftPlayers;
	private JTextField textField_1;
	private JButton Next1;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NFL_drafting_systems window = new NFL_drafting_systems();
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
	public NFL_drafting_systems() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		final JPanel panelTeams = new JPanel();
		frame.getContentPane().add(panelTeams, "name_89720459454988");
		panelTeams.setLayout(null);
		
		Teams = new JList(NFLteams);
		Teams.setVisibleRowCount(10);
		Teams.setValueIsAdjusting(true);
		Teams.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		Teams.setBounds(6, 46, 438, 178);
		panelTeams.add(Teams);
		
		JLabel lblTeams = new JLabel("Teams");
		lblTeams.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeams.setBounds(6, 23, 61, 16);
		panelTeams.add(lblTeams);
		
		Next1 = new JButton("Next");
		Next1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Next1.equals(e.getActionCommand())) {
					
				}
			}

			
		});
		Next1.setBounds(358, 243, 86, 29);
		panelTeams.add(Next1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"San Diego Chargers", "Oakland Raiders", "San Francisco 49ers", "New England Patrios", "Los Angeles Rams", "Carolina Panthers", "Denver Broncos", "New York Jets", "Baltimore Ravens", "Miami Dolphins"}));
		comboBox.setBounds(79, 19, 224, 27);
		panelTeams.add(comboBox);
		
		final JPanel panelOptions = new JPanel();
		frame.getContentPane().add(panelOptions, "name_88725346309893");
		panelOptions.setLayout(null);
		
		JButton btnNext_3 = new JButton("Next");
		btnNext_3.setBounds(176, 216, 83, 29);
		panelOptions.add(btnNext_3);
		
		JComboBox comboBoxPlayers = new JComboBox();
		comboBoxPlayers.setBounds(70, 76, 189, 27);
		panelOptions.add(comboBoxPlayers);
		
		JComboBox comboBoxPositions = new JComboBox();
		comboBoxPositions.setModel(new DefaultComboBoxModel(new String[] {"Quarterback", "Running Back", "Wide Receiver", "Tight End", "Field Goal Kicker"}));
		comboBoxPositions.setBounds(90, 126, 189, 27);
		panelOptions.add(comboBoxPositions);
		
		JLabel lblPlayers = new JLabel("Players:");
		lblPlayers.setBounds(19, 80, 61, 16);
		panelOptions.add(lblPlayers);
		
		JLabel label = new JLabel("Positions:");
		label.setBounds(19, 130, 70, 16);
		panelOptions.add(label);
		
		final JPanel panelPositions = new JPanel();
		frame.getContentPane().add(panelPositions, "name_88760471741032");
		panelPositions.setLayout(null);
		
		JLabel lblPosition = new JLabel("\"Position\"");
		lblPosition.setHorizontalAlignment(SwingConstants.CENTER);
		lblPosition.setBounds(6, 34, 70, 16);
		panelPositions.add(lblPosition);
		
		JList list_1 = new JList();
		list_1.setBounds(6, 59, 438, 179);
		panelPositions.add(list_1);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(356, 243, 88, 29);
		panelPositions.add(btnNext);
		
		final JPanel panelPlayersPosition = new JPanel();
		frame.getContentPane().add(panelPlayersPosition, "name_89770423211113");
		panelPlayersPosition.setLayout(null);
		
		JLabel lblQuarterback = new JLabel("Quarterback");
		lblQuarterback.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuarterback.setBounds(6, 28, 87, 16);
		panelPlayersPosition.add(lblQuarterback);
		
		JList list_2 = new JList();
		list_2.setBounds(6, 54, 438, 182);
		panelPlayersPosition.add(list_2);
		
		JButton btnNext_2 = new JButton("Next");
		btnNext_2.setBounds(369, 248, 75, 29);
		panelPlayersPosition.add(btnNext_2);
		
		final JPanel panelPlayerStats = new JPanel();
		frame.getContentPane().add(panelPlayerStats, "name_88767391033902");
		panelPlayerStats.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(6, 34, 438, 214);
		panelPlayerStats.add(textField);
		textField.setColumns(10);
		
		JLabel lblStatistics = new JLabel("Statistics");
		lblStatistics.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatistics.setBounds(6, 17, 75, 16);
		panelPlayerStats.add(lblStatistics);
		
		final JPanel panelDraftPlayers = new JPanel();
		frame.getContentPane().add(panelDraftPlayers, "name_89797650763040");
		panelDraftPlayers.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(6, 37, 438, 216);
		panelDraftPlayers.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPotentialPlayers = new JLabel("Potential Players");
		lblPotentialPlayers.setHorizontalAlignment(SwingConstants.CENTER);
		lblPotentialPlayers.setBounds(6, 16, 122, 16);
		panelDraftPlayers.add(lblPotentialPlayers);
	}	
}
