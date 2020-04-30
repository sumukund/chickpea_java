/*
* @author SUDARSNA MUKUND 
* @title introduction to Swing Components chapter 14/ITC 2100
* @description this program will give the user the capital city of a country they choose. 
* @date December 14 2019
*/


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// this class file makes a frame that matches countries to capitals in response to user clicks
public class JavaCapitalCities extends JFrame implements ActionListener {

    FlowLayout flow = new FlowLayout();
    JLabel countryLabel = new JLabel("Select a country");
    JTextField capitalField = new JTextField(25);

    String countries []={"Bulgaria", "Romania", "Hungary", "Czechia", "India"};
    JComboBox<String> countryBox = new JComboBox<String>(countries);


    String Capitals[]={"Sofia", "Bucharest", "Budapest", "Prague", "New Delhi"};


    public JavaCapitalCities() 
    {
        setTitle("Capital City");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(new JLabel("Select a Country"));
        add(countryBox);
        countryBox.addActionListener(this);
        //EVENT LISTENER  and "this" handles the event 
        add(capitalField);

    }

// the method that actually deals with the event. 
//It sets the capital field with the corresponding country selected.

public void actionPerformed(ActionEvent e)
{
    int index = countryBox.getSelectedIndex();
        System.out.println(index);
        capitalField.setText(Capitals[index]);
}
    public static void main(String[] arguments) {
        JavaCapitalCities frame = new JavaCapitalCities();
        frame.setSize(400, 150);
        frame.setVisible(true);      
   }

}