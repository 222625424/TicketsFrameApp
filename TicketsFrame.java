/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author hp
 */
public class TicketsFrame extends JFrame {
    
    private JPanel headingPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel customerPnl;
    private JPanel homeTeamPnl;
    private JPanel awayTeamPnl;
    private JPanel costPricePnl;
    private JPanel noOfTicketsPnl;
    private JPanel totalAmountPnl;
    private JPanel ticketdDetailsPnl;
    private JPanel collectivePnl;
    private JPanel btnPnl;
    private JPanel mainPnl;
    
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel homeTeamLbl;
    private JLabel awayTeamLbl;
    private JLabel costPriceLbl;
    private JLabel noOfTicketsLbl;
    private JLabel totalAmountLbl;
    
    private JTextField nametxf;
    private JTextField surnametxf;
    private JTextField homeTeamtxf;
    private JTextField awayTeamtxf;
    private JTextField costPricetxf;
    private JTextField totalAmounttxf;
    
    private JSlider noOfTicketsslide;
    
    private JButton buyBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    TicketsFrame() {
        
        setTitle("Ticket sales");
        setSize(500, 500);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        customerPnl = new JPanel(new GridLayout(3, 1,1,1));
        customerPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 2), "Customer details"));
        homeTeamPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        awayTeamPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        costPricePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        noOfTicketsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        totalAmountPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        ticketdDetailsPnl = new JPanel(new GridLayout(5, 1,1,1));
        ticketdDetailsPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 1), "Ticket details"));
        btnPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        collectivePnl = new JPanel(new BorderLayout());
        mainPnl = new JPanel(new BorderLayout());
        
        headingLbl = new JLabel("Soccer Match Tickets");
        headingLbl.setFont(new Font(Font.SERIF, Font.BOLD + Font.ITALIC, 20));
        headingLbl.setForeground(Color.CYAN);
        
        nameLbl = new JLabel("Name:       ");
        surnameLbl = new JLabel("Surname:    ");
        homeTeamLbl = new JLabel("Home team:  ");
        awayTeamLbl = new JLabel("Away team:  ");
        costPriceLbl = new JLabel("Cost Price:R");
        noOfTicketsLbl = new JLabel("Number of tickets required: ");
        totalAmountLbl = new JLabel("Total amount due:R");
        
        nametxf = new JTextField(10);
        nametxf.setFocusable(true);
        surnametxf = new JTextField(10);
        homeTeamtxf = new JTextField(10);
        awayTeamtxf = new JTextField(10);
        costPricetxf = new JTextField(10);
        totalAmounttxf = new JTextField(20);
        totalAmounttxf.setText("To be calculated later.");
        totalAmounttxf.setEditable(false);
        
        noOfTicketsslide = new JSlider(1, 20);
        
        buyBtn = new JButton("Buy");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        
        headingPnl.add(headingLbl);
        
        namePnl.add(nameLbl);
        namePnl.add(nametxf);
        
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnametxf);
        
        customerPnl.add(namePnl);
        customerPnl.add(surnamePnl);
        
        homeTeamPnl.add(homeTeamLbl);
        homeTeamPnl.add(homeTeamtxf);
        
        awayTeamPnl.add(awayTeamLbl);
        awayTeamPnl.add(awayTeamtxf);
        
        costPricePnl.add(costPriceLbl);
        costPricePnl.add(costPricetxf);
        
        noOfTicketsPnl.add(noOfTicketsLbl);
        noOfTicketsPnl.add(noOfTicketsslide);
        
        totalAmountPnl.add(totalAmountLbl);
        totalAmountPnl.add(totalAmounttxf);
        
        ticketdDetailsPnl.add(homeTeamPnl);
        ticketdDetailsPnl.add(awayTeamPnl);
        ticketdDetailsPnl.add(costPricePnl);
        ticketdDetailsPnl.add(noOfTicketsPnl);
        ticketdDetailsPnl.add(totalAmountPnl);
        
        collectivePnl.add(customerPnl,BorderLayout.NORTH);
        collectivePnl.add(ticketdDetailsPnl,BorderLayout.CENTER);
        
        btnPnl.add(buyBtn);
        btnPnl.add(clearBtn);
        btnPnl.add(exitBtn);
        
        mainPnl.add(headingPnl, BorderLayout.NORTH);
        mainPnl.add(collectivePnl, BorderLayout.CENTER);
        mainPnl.add(btnPnl, BorderLayout.SOUTH);
        
        add(mainPnl);
        
        pack();
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        new TicketsFrame();
        
    }
    
}
    

