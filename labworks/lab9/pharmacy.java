
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Pharmacy extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField qty;
	private JTextField pdtfield;
	private JTextField price;
	private JTextField textField;
    private JRadioButton M_radiobtn;
    private JRadioButton C_radiobtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pharmacy frame = new Pharmacy();
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
	public Pharmacy() {
		setTitle("Pharmacy");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 447, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Product Name");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setBounds(20, 24, 174, 29);
		contentPane.add(lblNewLabel);
		
		pdtfield = new JTextField();
		pdtfield.setBounds(204, 24, 174, 25);
		contentPane.add(pdtfield);
		pdtfield.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayProductInfo();
			}
		});
		btnNewButton.setBounds(70, 257, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				qty.setText("");
				pdtfield.setText("");
				price.setText("");
				M_radiobtn.setSelected(false);
				C_radiobtn.setSelected(false);
				textField.setText("");
			}
		});
		btnNewButton_1.setBounds(259, 257, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Quantity");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_1.setBounds(20, 77, 174, 29);
		contentPane.add(lblNewLabel_1);
		
		qty = new JTextField();
		qty.setBounds(204, 80, 174, 25);
		contentPane.add(qty);
		qty.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Price");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(20, 128, 174, 29);
		contentPane.add(lblNewLabel_1_1);
		
		price = new JTextField();
		price.setColumns(10);
		price.setBounds(204, 134, 174, 25);
		contentPane.add(price);
		
		M_radiobtn = new JRadioButton("Medicine");
        M_radiobtn.setFont(new Font("Arial", Font.BOLD, 15));
        M_radiobtn.setBounds(39, 191, 103, 21);
        contentPane.add(M_radiobtn);

        C_radiobtn = new JRadioButton("Cosmetic");
        C_radiobtn.setFont(new Font("Arial", Font.BOLD, 15));
        C_radiobtn.setBounds(225, 191, 103, 21);
        contentPane.add(C_radiobtn);

		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(C_radiobtn);
		buttonGroup.add(M_radiobtn);
		
		textField = new JTextField();
		textField.setBounds(20, 305, 358, 74);
		contentPane.add(textField);
		textField.setColumns(10);
	}
	private void displayProductInfo() {
		String productName = pdtfield.getText();
		String quantity = qty.getText();
		String productType = "";
		
		if(M_radiobtn.isSelected()) {
			productType="Medicine";
		}
		else if(C_radiobtn.isSelected()) {
			productType = "Cosmetic";
		}
		String priceValue = price.getText();

	String productInfo = String.format("Product: %s | Quantity: %s | Price: %s | Type: %s%n", productName, quantity, priceValue, productType);
	textField.setText(productInfo);
	}
}