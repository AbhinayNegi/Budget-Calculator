package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.SalaryController;
import model.Salary;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BudgetFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtSal;
	private JTextField txtFifty;
	private JTextField txtThirty;
	private JTextField txtTwenty;
	
	public void setBudget(Salary sal) {
		
		int fifty = (int) sal.fifty;
		int thirty = (int) sal.thirty;
		int twenty = (int) sal.twenty;
		
		txtFifty.setText(String.valueOf(fifty));
		txtThirty.setText(String.valueOf(thirty));
		txtTwenty.setText(String.valueOf(twenty));
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BudgetFrame frame = new BudgetFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public BudgetFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 321);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblSal = new JLabel("Salary");
		lblSal.setHorizontalAlignment(SwingConstants.CENTER);
		lblSal.setFont(new Font("Arial", Font.PLAIN, 16));
		lblSal.setToolTipText("Enter you salary here");
		lblSal.setBounds(71, 41, 80, 28);
		contentPane.add(lblSal);
		
		txtSal = new JTextField();
		txtSal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSal.setBounds(186, 43, 236, 28);
		contentPane.add(txtSal);
		txtSal.setColumns(10);
		
		JButton btnCal = new JButton("Calculate");
		btnCal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double sal = Double.parseDouble(txtSal.getText());
				Salary personSal = SalaryController.calBudget(sal);
				
				setBudget(personSal);
				
				System.out.println(personSal.fifty + " " + personSal.thirty + " " + personSal.twenty);
			}
		});
		btnCal.setFont(new Font("Arial", Font.PLAIN, 14));
		btnCal.setBounds(225, 99, 122, 28);
		contentPane.add(btnCal);
		
		JLabel lblFifty = new JLabel("50%");
		lblFifty.setToolTipText("Enter you salary here");
		lblFifty.setHorizontalAlignment(SwingConstants.CENTER);
		lblFifty.setFont(new Font("Arial", Font.PLAIN, 16));
		lblFifty.setBounds(71, 160, 80, 28);
		contentPane.add(lblFifty);
		
		txtFifty = new JTextField();
		txtFifty.setEditable(false);
		txtFifty.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtFifty.setColumns(10);
		txtFifty.setBounds(186, 162, 236, 28);
		contentPane.add(txtFifty);
		
		JLabel lblThirty = new JLabel("30%");
		lblThirty.setToolTipText("Enter you salary here");
		lblThirty.setHorizontalAlignment(SwingConstants.CENTER);
		lblThirty.setFont(new Font("Arial", Font.PLAIN, 16));
		lblThirty.setBounds(71, 198, 80, 28);
		contentPane.add(lblThirty);
		
		txtThirty = new JTextField();
		txtThirty.setEditable(false);
		txtThirty.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtThirty.setColumns(10);
		txtThirty.setBounds(186, 200, 236, 28);
		contentPane.add(txtThirty);
		
		JLabel lblTwenty = new JLabel("20%");
		lblTwenty.setToolTipText("Enter you salary here");
		lblTwenty.setHorizontalAlignment(SwingConstants.CENTER);
		lblTwenty.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTwenty.setBounds(71, 235, 80, 28);
		contentPane.add(lblTwenty);
		
		txtTwenty = new JTextField();
		txtTwenty.setEditable(false);
		txtTwenty.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtTwenty.setColumns(10);
		txtTwenty.setBounds(186, 237, 236, 28);
		contentPane.add(txtTwenty);
		
		JLabel lblBudgetCalculator = new JLabel("Budget calculator");
		lblBudgetCalculator.setToolTipText("Enter you salary here");
		lblBudgetCalculator.setHorizontalAlignment(SwingConstants.CENTER);
		lblBudgetCalculator.setFont(new Font("Arial", Font.PLAIN, 16));
		lblBudgetCalculator.setBounds(225, 5, 122, 28);
		contentPane.add(lblBudgetCalculator);
	}
	
	
}
