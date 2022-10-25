package package1;

import javax.swing.*;
import java.awt.*;

public class UI {



    JFrame window;
    JPanel titleNamePanel, startButtonPanel, maintextPanel, choiceButtonPanel, playerPanel, ;
    JLabel titleNameLabel, hpLabel, hpNumberLabel, weaponLabel, weaponNameLabel;
    JButton startButton, choice1, choice2, choice3, choice4;
    JTextArea mainTextArea;
    Font titleFont = new Font("Comic Sans", Font.PLAIN, 90);
    Font normalFont = new Font("Comic Sans", Font.PLAIN, 26);
    public void createUI(Game.ChoiceHandler cHandler){

        //WINDOW
        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.orange);
        window.setLayout(null);
        window.setVisible(true);

        //Title screen
        titleNamePanel = new JPanel();
        titleNamePanel .setBounds(100, 100, 600, 500);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("ADVENTURE");
        titleNamePanel.setForeground(Color.white);
        titleNamePanel.setFont(titleFont);
        titleNamePanel.add(titleNameLabel);
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.ORANGE);
        startButton = new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont);
        startButton.setFocusPainted(false);
        startButton.addActionListener(cHandler);
        startButton.setActionCommand("start ");
        startButtonPanel.add(startButton);
        window.add(titleNamePanel);
        window.add(startButtonPanel);

        //GAMESCREEN
        maintextPanel = new JPanel();
        maintextPanel.setBounds(100, 100, 600, 250);
        maintextPanel.setBackground(Color.black);
        window.add(maintextPanel);

        mainTextArea = new JTextArea("This is the main text area");
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        maintextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250, 350, 300, 150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        window.add(choiceButtonPanel);

        choice1 = new JButton("choice1");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(normalFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(cHandler);
        choice1.setActionCommand("c1");


        choice2 = new JButton("choice2");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(normalFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(cHandler);
        choice2.setActionCommand("c2");

        choice3 = new JButton("choice3");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(normalFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(cHandler);
        choice3.setActionCommand("c3");


        choice4 = new JButton("choice4");
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(normalFont);
        choice4.setFocusPainted(false);
        choice4.addActionListener(cHandler);
        choice4.setActionCommand("c4");

        playerPanel = new JPanel();
        playerPanel.setBounds(100, 15, 600, 50);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(1,4));
        playerPanel.setLayout(new GridLayout(1,4));
        window.add(playerPanel);



        hpLabel = new JLabel("HP:");
        hpLabel. setFont(normalFont) ;
        hpLabel. setForeground(Color.white) ;
        playerPanel.add(hpLabel) ;
        hpNumberLabel = new JLabel();
        hpNumberLabel. setForeground(Color.white) ;
        hpNumberLabel. setFont(normalFont) ;
        playerPanel.add(hpNumberLabel) ;
        weaponLabel = new JLabel("Weapon:");
        weaponLabel.setForeground(Color.white) ;
        weaponLabel.setFont(normalFont) ;
        playerPanel.add(weaponLabel) ;
        weaponNameLabel = new JLabel();
        weaponNameLabel. setForeground(Color.white) ;
        weaponNameLabel. setFont(normalFont) ;
        playerPanel.add(weaponNameLabel) ;




        window.setVisible(true);





    }


}