package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LambdaButtons{
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener(e -> System.out.println("1 + 1 = 2"));
		randNumber.addActionListener(e -> System.out.println((new Random().nextInt(10) + 1)));
		tellAJoke.addActionListener(e -> System.out.println("Three programmers walk into a bar. \n"
				+ "The bartender asks, \"Y\'all having beer?\"\n"
				+ "\"I don't know,\" says the first.\n"
				+ "\"I don't know,\" says the second.\n"
				+ "\"Yes,\" says the third."));
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
