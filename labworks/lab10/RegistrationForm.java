
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class RegistrationForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idtxt;
	private JTextField nametxt;
	private JTextField agetxt;
	private JTextField mobiletxt;
	private JTextField mail;
	private JPasswordField passwordField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField user;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationForm frame = new RegistrationForm();
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
	public RegistrationForm() {
		setBackground(Color.BLACK);
		setForeground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\91702\\Downloads\\wp6832202-attack-on-titan-minimalist-pc-wallpapers.jpg"));
		setTitle("Registration Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 750);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel id = new JLabel("ID");
		id.setBackground(Color.BLACK);
		id.setForeground(Color.WHITE);
		id.setFont(new Font("Arial", Font.BOLD, 15));
		id.setBounds(36, 65, 127, 28);
		contentPane.add(id);
		
		JLabel lblNewLabel_1 = new JLabel("PharmaCO Pharma");
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(94, 10, 253, 38);
		contentPane.add(lblNewLabel_1);
		
		JLabel name = new JLabel("Name");
		name.setBackground(Color.BLACK);
		name.setForeground(Color.WHITE);
		name.setFont(new Font("Arial", Font.BOLD, 15));
		name.setBounds(36, 125, 127, 28);
		contentPane.add(name);
		
		JLabel address = new JLabel("Address");
		address.setBackground(Color.BLACK);
		address.setForeground(Color.WHITE);
		address.setFont(new Font("Arial", Font.BOLD, 15));
		address.setBounds(36, 188, 127, 28);
		contentPane.add(address);
		
		JLabel gender = new JLabel("Gender");
		gender.setBackground(Color.BLACK);
		gender.setForeground(Color.WHITE);
		gender.setFont(new Font("Arial", Font.BOLD, 15));
		gender.setBounds(36, 267, 127, 28);
		contentPane.add(gender);
		
		JLabel age = new JLabel("Age");
		age.setBackground(Color.BLACK);
		age.setForeground(Color.WHITE);
		age.setFont(new Font("Arial", Font.BOLD, 15));
		age.setBounds(36, 322, 127, 28);
		contentPane.add(age);
		
		JLabel mobileno = new JLabel("Mobile No:");
		mobileno.setBackground(Color.BLACK);
		mobileno.setForeground(Color.WHITE);
		mobileno.setFont(new Font("Arial", Font.BOLD, 15));
		mobileno.setBounds(36, 380, 127, 28);
		contentPane.add(mobileno);
		
		JLabel email = new JLabel("Email");
		email.setBackground(Color.BLACK);
		email.setForeground(Color.WHITE);
		email.setFont(new Font("Arial", Font.BOLD, 15));
		email.setBounds(36, 427, 127, 28);
		contentPane.add(email);
		
		JLabel username = new JLabel("User Name");
		username.setBackground(Color.BLACK);
		username.setForeground(Color.WHITE);
		username.setFont(new Font("Arial", Font.BOLD, 15));
		username.setBounds(36, 483, 127, 28);
		contentPane.add(username);
		
		JLabel pass = new JLabel("Password");
		pass.setBackground(Color.BLACK);
		pass.setForeground(Color.WHITE);
		pass.setFont(new Font("Arial", Font.BOLD, 15));
		pass.setBounds(36, 535, 127, 28);
		contentPane.add(pass);
		
		idtxt = new JTextField();
		idtxt.setBackground(Color.WHITE);
		idtxt.setForeground(Color.BLACK);
		idtxt.setBounds(180, 71, 154, 19);
		contentPane.add(idtxt);
		idtxt.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setForeground(Color.BLACK);
		textArea.setBounds(180, 177, 154, 66);
		contentPane.add(textArea);
		
		nametxt = new JTextField();
		nametxt.setBackground(Color.WHITE);
		nametxt.setForeground(Color.BLACK);
		nametxt.setBounds(180, 131, 154, 19);
		contentPane.add(nametxt);
		nametxt.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBackground(Color.BLACK);
		rdbtnNewRadioButton.setForeground(Color.WHITE);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(184, 272, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setBackground(Color.BLACK);
		rdbtnNewRadioButton_1.setForeground(Color.WHITE);
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(300, 272, 103, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		agetxt = new JTextField();
		agetxt.setBackground(Color.WHITE);
		agetxt.setForeground(Color.BLACK);
		agetxt.setBounds(178, 324, 154, 19);
		contentPane.add(agetxt);
		agetxt.setColumns(10);
		
		mobiletxt = new JTextField();
		mobiletxt.setBackground(Color.WHITE);
		mobiletxt.setForeground(Color.BLACK);
		mobiletxt.setColumns(10);
		mobiletxt.setBounds(180, 380, 154, 19);
		contentPane.add(mobiletxt);
		
		mail = new JTextField();
		mail.setBackground(Color.WHITE);
		mail.setForeground(Color.BLACK);
		mail.setColumns(10);
		mail.setBounds(180, 437, 154, 19);
		contentPane.add(mail);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(Color.WHITE);
		passwordField.setForeground(Color.BLACK);
		passwordField.setBounds(180, 540, 154, 22);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","Rockstar@12");
					String query = "insert into registration values(?,?,?,?,?,?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(query);
					ps.setInt(1,Integer.parseInt(idtxt.getText()));
					ps.setString(2,nametxt.getText());
					ps.setString(3,textArea.getText());
					if(rdbtnNewRadioButton.isSelected())
						ps.setString(4,rdbtnNewRadioButton.getText());
					else
						ps.setString(4,rdbtnNewRadioButton_1.getText());
					ps.setInt(5,Integer.parseInt(agetxt.getText()));
					ps.setLong(6,Long.parseLong(mobiletxt.getText()));
					ps.setString(7,mail.getText());
					ps.setString(8,user.getText());
					ps.setString(9,passwordField.getText());
					
					int i = ps.executeUpdate();
					JOptionPane.showMessageDialog(btnNewButton, i+" Record Added Successfully");
					ps.close();
					con.close();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(50, 614, 127, 21);
		contentPane.add(btnNewButton);
		
		
		
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idtxt.setText("");
				nametxt.setText("");
				textArea.setText("");
				agetxt.setText("");
				mobiletxt.setText("");
				mail.setText("");
				user.setText("");
				passwordField.setText("");
				buttonGroup.clearSelection();
			}
		});
		btnReset.setBackground(Color.WHITE);
		btnReset.setForeground(Color.BLACK);
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnReset.setBounds(199, 615, 127, 21);
		contentPane.add(btnReset);
		
		user = new JTextField();
		user.setForeground(Color.BLACK);
		user.setColumns(10);
		user.setBackground(Color.WHITE);
		user.setBounds(179, 493, 154, 19);
		contentPane.add(user);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","Rockstar@12");
					String query = "update registration set name=?, address=?, gender=?, age=?, mobile=?, email=?, username=?, password=? where id=?";
					PreparedStatement ps = con.prepareStatement(query);
					ps.setString(1,nametxt.getText());
					ps.setString(2, textArea.getText());
                    if (rdbtnNewRadioButton.isSelected())
                        ps.setString(3, rdbtnNewRadioButton.getText());
                    else
                        ps.setString(3, rdbtnNewRadioButton_1.getText());
                    ps.setInt(4, Integer.parseInt(agetxt.getText()));
                    ps.setInt(5, Integer.parseInt(mobiletxt.getText()));
                    ps.setString(6, mail.getText());
                    ps.setString(7, user.getText());
                    ps.setString(8, passwordField.getText());
                    ps.setInt(9, Integer.parseInt(idtxt.getText()));
                    
                    int i = ps.executeUpdate();
                    JOptionPane.showMessageDialog(btnUpdate,i +"Record Updated Successfully");
                    ps.close();
                    con.close();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnUpdate.setForeground(Color.BLACK);
		btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnUpdate.setBackground(Color.WHITE);
		btnUpdate.setBounds(50, 662, 127, 21);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(btnDelete, "Are you sure you want to delete this record?","Confirmation",JOptionPane.YES_NO_CANCEL_OPTION);
				if(result == JOptionPane.YES_OPTION) {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
		                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "Rockstar@12");
		                String query = "DELETE FROM registration WHERE ID=?";
		                PreparedStatement ps = con.prepareStatement(query);
		                ps.setInt(1, Integer.parseInt(idtxt.getText()));

		                int i = ps.executeUpdate();
		                if (i > 0) {
		                    JOptionPane.showMessageDialog(btnDelete, "Record Deleted Successfully");
		                } else {
		                    JOptionPane.showMessageDialog(btnDelete, "Error Deleting Record");
		                }

		                ps.close();
		                con.close();
		            } catch (Exception ex) {
		                ex.printStackTrace();
		            }
		        }
			}
		});
		btnDelete.setForeground(Color.BLACK);
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setBounds(199, 663, 127, 21);
		contentPane.add(btnDelete);
	}
}
