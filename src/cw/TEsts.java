package cw;

import java.awt.EventQueue;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class TEsts {

	private JFrame frame;



	/**
	 * Create the application.
	 */
	public TEsts() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200	, 200, 400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		SpinnerModel HRModel = new SpinnerNumberModel(9, 0, 23, 1);
		SpinnerModel MINModel = new SpinnerNumberModel(0, 0, 59, 1);
		
		JLabel lblNewLabel = new JLabel("自動更新");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel.setBounds(17, 6, 144, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JButton button = new JButton("保存配置");
		button.setBounds(46, 343, 117, 29);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("取消");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(234, 343, 117, 29);
		frame.getContentPane().add(button_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(17, 49, 367, 282);
		frame.getContentPane().add(textPane);

	}
}
