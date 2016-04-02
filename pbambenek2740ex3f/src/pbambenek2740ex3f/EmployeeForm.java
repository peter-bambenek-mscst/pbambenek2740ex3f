package pbambenek2740ex3f;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ScrollPaneConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class EmployeeForm extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField empIdTextField;
	private JTextField empNameTextField;
	private JTextField positionTextField;
	private JList employeeList;
	private DefaultListModel employeeListModel;
	private JComboBox deptComboBox;
	private JButton noArgConstructorButton;
	private JButton twoArgConstructorButton;
	private JButton fourArgConstructorButton;
	private String emp = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeForm frame = new EmployeeForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EmployeeForm() {
		setTitle("Exercise 3F: Overloaded Constructors");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 11, 464, 155);
		contentPane.add(scrollPane);
		
		employeeListModel = new DefaultListModel(); // Added manually
		employeeList = new JList(employeeListModel); // Object argument added
		scrollPane.setViewportView(employeeList);
		
		JLabel lblEmployeeId = new JLabel("Employee ID:");
		lblEmployeeId.setBounds(10, 177, 96, 14);
		contentPane.add(lblEmployeeId);
		
		empIdTextField = new JTextField();
		lblEmployeeId.setLabelFor(empIdTextField);
		empIdTextField.setText("101");
		empIdTextField.setHorizontalAlignment(SwingConstants.LEFT);
		empIdTextField.setBounds(116, 174, 86, 20);
		contentPane.add(empIdTextField);
		empIdTextField.setColumns(10);
		
		JLabel lblEmployeeName = new JLabel("Employee Name:");
		lblEmployeeName.setBounds(10, 202, 101, 14);
		contentPane.add(lblEmployeeName);
		
		empNameTextField = new JTextField();
		lblEmployeeName.setLabelFor(empNameTextField);
		empNameTextField.setText("Peter Bambenek");
		empNameTextField.setHorizontalAlignment(SwingConstants.LEFT);
		empNameTextField.setBounds(116, 199, 155, 20);
		contentPane.add(empNameTextField);
		empNameTextField.setColumns(10);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setBounds(10, 227, 96, 14);
		contentPane.add(lblDepartment);
		
		JLabel lblPosition = new JLabel("Position:");
		lblPosition.setBounds(10, 252, 96, 14);
		contentPane.add(lblPosition);
		
		deptComboBox = new JComboBox();
		deptComboBox.setModel(new DefaultComboBoxModel(new String[] {"Business Office", "Human Resources", "Manufacturing", "Shipping", "Maintenance"}));
		lblDepartment.setLabelFor(deptComboBox);
		deptComboBox.setBounds(116, 224, 155, 20);
		contentPane.add(deptComboBox);
		
		positionTextField = new JTextField();
		lblPosition.setLabelFor(positionTextField);
		positionTextField.setText("Software Engineer");
		positionTextField.setBounds(116, 249, 155, 20);
		contentPane.add(positionTextField);
		positionTextField.setColumns(10);
		
		noArgConstructorButton = new JButton("No Arg");
		noArgConstructorButton.addActionListener(this);
		noArgConstructorButton.setBounds(57, 291, 89, 23);
		contentPane.add(noArgConstructorButton);
		
		twoArgConstructorButton = new JButton("2 Arg");
		twoArgConstructorButton.addActionListener(this);
		twoArgConstructorButton.setBounds(156, 291, 89, 23);
		contentPane.add(twoArgConstructorButton);
		
		fourArgConstructorButton = new JButton("4 Arg");
		fourArgConstructorButton.addActionListener(this);
		fourArgConstructorButton.setBounds(255, 291, 89, 23);
		contentPane.add(fourArgConstructorButton);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == fourArgConstructorButton) {
			do_fourArgConstructorButton_actionPerformed(arg0);
		}
		if (arg0.getSource() == twoArgConstructorButton) {
			do_twoArgConstructorButton_actionPerformed(arg0);
		}
		if (arg0.getSource() == noArgConstructorButton) {
			do_noArgConstructorButton_actionPerformed(arg0);
		}
	}
	
	protected void do_noArgConstructorButton_actionPerformed(ActionEvent arg0) {
		
		// Call appropriate constructor for 0 arguments   ** No arguments **
		Employee emp = new Employee();
		
		employeeListModel.addElement(emp);
	}
	
	protected void do_twoArgConstructorButton_actionPerformed(ActionEvent arg0) {
		
		// Get form listed items for arguments
		int idNumber = Integer.parseInt(empIdTextField.getText());  // Get ID from text field and convert to integer
		String name = empNameTextField.getText();                   // Get employee name from text field
		
		// Call appropriate constructor for 2 arguments   **  1 integer and 1 string for arguments **
		Employee emp = new Employee(idNumber, name);
		
		employeeListModel.addElement(emp);
	}
	
	protected void do_fourArgConstructorButton_actionPerformed(ActionEvent arg0) {
		
		// Get form listed items for arguments
		int idNumber = Integer.parseInt(empIdTextField.getText());  // Get ID from text field and convert to integer
		String name = empNameTextField.getText();                   // Get employee name from text field
		String dept = (String) deptComboBox.getSelectedItem();      // Get selected string from deptComboBox
		String position = positionTextField.getText();              // Get position from text field
		
		// Call appropriate constructor for 4 arguments   ** 1 integer and 3 strings for arguments **
		Employee emp = new Employee(idNumber, name, dept, position);
		
		employeeListModel.addElement(emp);
	}
}
