import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.*;

public class PathManager {

    public static void main(String[] args) {
        // creating a new jframe for main window
        JFrame frame = new JFrame();

        //setting elements of the frame
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // when user clicks the x button, program will terminate
        frame.setLayout(new BorderLayout()); // setting the layout of the frame to border layout
        frame.getContentPane().setBackground(GUIStyle.BACKGROUND_COLOR);

        //creating top menu panel for the tabs / buttons
        JPanel topMenuPanel = new JPanel();
        topMenuPanel.setLayout(new GridLayout(1,4, 10, 0));
        topMenuPanel.setBackground(GUIStyle.BACKGROUND_COLOR);
        topMenuPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // creating buttons for the top menu panel
        JButton DirectoryCleanser = GUIStyle.createStyledButton("Directory Cleanser");
        JButton FileRenamer = GUIStyle.createStyledButton("File Renamer");
        JButton FileMover = GUIStyle.createStyledButton("File Mover");
        JButton Console = GUIStyle.createStyledButton("Console");

        // adding buttons to the top menu panel
        topMenuPanel.add(DirectoryCleanser);
        topMenuPanel.add(FileRenamer);
        topMenuPanel.add(FileMover);
        topMenuPanel.add(Console);

        // adding the top menu panel to the frame
        frame.add(topMenuPanel, BorderLayout.NORTH);

        // creating a center panel for path input field and submit button as a FlowLayout
        JPanel pathInputPanel = new JPanel();
        pathInputPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        pathInputPanel.setBackground(GUIStyle.BACKGROUND_COLOR);

        // creating a path input field
        JTextField pathInputField = new JTextField(30);

        //creating a label for the path input field
        JLabel pathLabel = new JLabel("Enter Path:");
        pathLabel.setForeground(GUIStyle.TEXT_COLOR);
        pathLabel.setFont(new Font("Arial", Font.PLAIN, 12));

        // creating a submit button
        JButton submitButton = styledButton("Submit", GUIStyle.BUTTON_COLOR, GUIStyle.TEXT_COLOR);
        

        // adding components to the path input panel
        pathInputPanel.add(pathLabel);
        pathInputPanel.add(pathInputField);
        pathInputPanel.add(submitButton);

        // adding the path input panel to the frame
        frame.add(pathInputPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private static JButton styledButton(String text, Color bgColor, Color fgColor) {
        JButton button = new JButton(text);
        button.setBackground(bgColor);
        button.setForeground(fgColor);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setFont(new Font("Arial", Font.PLAIN, 12));
        return button;
    }
}
