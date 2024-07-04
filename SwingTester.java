import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SwingTester {
    private JFrame mainframe;
 private JFrame Mainframe;
 private JLabel headerLabel;
    private  JLabel statusLabel;
    private JPanel controlPanel;
    public SwingTester()
    {
        prepareGUI();
    }
    public static void main(String[] args)
    {
        SwingTester swingControlDemo=new SwingTester();
        swingControlDemo.showaTableDemo();

    }
    private void prepareGUI(){
        mainframe=new JFrame("java swing Examples :");

        mainframe.setSize(500, 400);
        mainframe.setLayout(new GridLayout(3,1));

        mainframe.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent)
            {
                System.exit(0);
            }
        });
        headerLabel=new JLabel("",JLabel.CENTER);
        statusLabel=new JLabel("",JLabel.CENTER);
        statusLabel.setSize(350,100);
        mainframe.getContentPane().setBackground(Color.BLUE);
        controlPanel=new JPanel();
        controlPanel.setLayout(new FlowLayout());
        mainframe.add(headerLabel);
        mainframe.add(controlPanel);
        mainframe.add(statusLabel);
        mainframe.setVisible(true);

    }
    private void showaTableDemo()
    {
        headerLabel.setText("control in action:JTable");
        String[] columnNames={"Name","salary"};
        Object[][] data={
                {"Elon musko",5000000},
                {"baidoin Budo","7000"},
                { "Abishek Mishra","50000000"},
                { "Pankaj Yadav","40000000"},
                { "Harish Thapa","30000000"},
                { "pujaa Bist","2000000"},
                { "Rabina Thapa","500000"},
                { "Garima Rokha","500000"}


        };
        JTable table =new JTable(data , columnNames);
        table.setBackground(Color.green);
        JScrollPane scrollPane=new JScrollPane(table);
        scrollPane.setSize(300,300);
        table.setFillsViewportHeight(true);

        controlPanel.add(scrollPane);

        mainframe.setVisible(true);
    }

}