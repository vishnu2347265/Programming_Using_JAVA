package  BankManagementSystem;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class BankRegistrationForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BankRegistrationForm frame = new BankRegistrationForm();
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
	public BankRegistrationForm() {
		setTitle("Bank Registration Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 572);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bank Registration Form");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(168, 27, 216, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee_ID");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(57, 110, 119, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(57, 166, 119, 23);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Age");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(57, 224, 119, 23);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Designation");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(57, 278, 119, 23);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Department");
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_4.setBounds(57, 336, 119, 23);
		contentPane.add(lblNewLabel_1_4);
		
		textField = new JTextField();
		textField.setBounds(276, 110, 135, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(276, 166, 135, 23);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(276, 224, 135, 23);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(276, 281, 135, 23);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(276, 339, 135, 23);
		contentPane.add(textField_4);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","Rockstar@12");
					 String query = "INSERT INTO Bank (Employee_ID, Name, Age, Designation, Department) VALUES (?, ?, ?, ?, ?)";
	                    PreparedStatement ps = con.prepareStatement(query);
	                        ps.setInt(1, Integer.parseInt(textField.getText()));
	                        ps.setString(2, textField_1.getText());
	                        ps.setInt(3, Integer.parseInt(textField_2.getText()));
	                        ps.setString(4, textField_3.getText());
	                        ps.setString(5, textField_4.getText());
	                        int i = ps.executeUpdate();
	    					JOptionPane.showMessageDialog(btnNewButton, i+" Record Added Successfully");
	                        if (i > 0) {
	                            System.out.println("Record added successfully.");
	                        } else {
	                            System.out.println("Error adding record.");
	                        }
	    					ps.close();
	    					con.close();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(180, 397, 165, 39);
		contentPane.add(btnNewButton);
		
		JButton btnSearchByName = new JButton("Search by Name");
        btnSearchByName.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank", "root", "Rockstar@12");

                    String searchName = textField_1.getText();
                    String query = "SELECT * FROM Bank WHERE Name = ?";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, searchName);
                    ResultSet rs = ps.executeQuery();

                    StringBuilder result = new StringBuilder();
                    boolean found = false;

                    while (rs.next()) {
                        found = true;
                        result.append("Employee ID: ").append(rs.getInt("Employee_ID")).append("\nName: ").append(rs.getString("Name"))
                                .append("\nAge: ").append(rs.getInt("Age")).append("\nDesignation: ").append(rs.getString("Designation"))
                                .append("\nDepartment: ").append(rs.getString("Department")).append("\n\n");
                    }

                    if (found) {
                        JOptionPane.showMessageDialog(btnSearchByName, result.toString(), "Search Result", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(btnSearchByName, "No matching record found", "Search Result", JOptionPane.INFORMATION_MESSAGE);
                    }

                    rs.close();
                    ps.close();
                    con.close();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
		btnSearchByName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnSearchByName.setBounds(42, 456, 165, 39);
		contentPane.add(btnSearchByName);
		
		JButton btnSearchByDepartment = new JButton("Search by Department");
		btnSearchByDepartment.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
                 try {
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank", "root", "Rockstar@12");

                     String query = "SELECT * FROM Bank WHERE Department=?";
                     PreparedStatement ps = con.prepareStatement(query);
                     ps.setString(1, textField_4.getText());

                     ResultSet rs = ps.executeQuery();

                     StringBuilder result = new StringBuilder();

                     while (rs.next()) {
                         result.append("Employee ID: ").append(rs.getInt("Employee_ID"))
                                 .append("\nName: ").append(rs.getString("Name"))
                                 .append("\nAge: ").append(rs.getInt("Age"))
                                 .append("\nDesignation: ").append(rs.getString("Designation"))
                                 .append("\nDepartment: ").append(rs.getString("Department"))
                                 .append("\n\n");
                     }

                     if (result.length() > 0) {
                         JOptionPane.showMessageDialog(btnSearchByDepartment, result.toString(), "Search Result", JOptionPane.INFORMATION_MESSAGE);
                     } else {
                         JOptionPane.showMessageDialog(btnSearchByDepartment, "No matching records found", "Search Result", JOptionPane.INFORMATION_MESSAGE);
                     }

                     rs.close();
                     ps.close();
                     con.close();

                 } catch (Exception e1) {
                     e1.printStackTrace();
                 }
             }
         });
		btnSearchByDepartment.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnSearchByDepartment.setBounds(293, 456, 196, 39);
		contentPane.add(btnSearchByDepartment);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");

			}
		});
		btnC.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnC.setBounds(355, 397, 56, 39);
		contentPane.add(btnC);
	}
}




