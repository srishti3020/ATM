
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;





public class signupTwo extends JFrame implements ActionListener{
    
    
    JTextField pan, aadhar; 
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, category, occuption,education, incomecategory;
    String formno;
    
    
    signupTwo(String formno) {
        this.formno =  formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM PAGE 2:");
        
        
        
        JLabel additionalDetails = new JLabel("PAGE 2: ADDITIONAL DETAILS");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD, 22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD, 20));
        name.setBounds(100,140,100,30);
        add(name);
        
        String ValReligion[] = {"HINDU", "MUSLIM", "CHRISTIAN", "SIKH", "OTHER"};
        religion = new JComboBox(ValReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
                               
        JLabel catgory = new JLabel("Category:");
        catgory.setFont(new Font("Raleway",Font.BOLD, 20));
        catgory.setBounds(100,190,200,30);
        add(catgory);
        
        String ValCategory[] = {"General", "OBC", "SC", "ST", "OTHER"};
        category = new JComboBox(ValCategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway",Font.BOLD, 20));
        income.setBounds(100,240,200,30);
        add(income);
        
        String incomeCategory[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        incomecategory = new JComboBox(incomeCategory);
        incomecategory.setBounds(300,240,400,30);
        incomecategory.setBackground(Color.WHITE);
        add(incomecategory);
           
        JLabel edu = new JLabel("Educational");
        edu.setFont(new Font("Raleway",Font.BOLD, 20));
        edu.setBounds(100,290,200,30);
        add(edu);
        
        
        JLabel Quali = new JLabel("Qualification:");
        Quali.setFont(new Font("Raleway",Font.BOLD, 20));
        Quali.setBounds(100,315,200,30);
        add(Quali);
        
        String educationValues[] = {"Non-Graduation", "Graducate", "Post-Graduation", "Doctrate", "Other"};
        education = new JComboBox(educationValues);
        education.setBounds(300,310,400,30);
        education.setBackground(Color.WHITE);
        add(education);
        
                
        JLabel occup= new JLabel("Occuption:");
        occup.setFont(new Font("Raleway",Font.BOLD, 20));
        occup.setBounds(100,390,200,30);
        add(occup);
        
        String occuptionValues[] = {"Salaried", "Self-employed", "Bussiness", "Student", "Retried", "Other"};
        occuption = new JComboBox(occuptionValues);
        occuption.setBounds(300,390,400,30);
        occuption.setBackground(Color.WHITE);
        add(occuption);
        
       
        JLabel panno = new JLabel("PAN Number:");
        panno.setFont(new Font("Raleway",Font.BOLD, 20));
        panno.setBounds(100,440,200,30);
        add(panno);
        
        pan = new JTextField();
        pan.setFont(new Font("Ralewat", Font.BOLD, 14));
        pan.setBounds(300,440,400,30);
        add(pan);
        
        
        JLabel aadharno = new JLabel("Aadhar Number:");
        aadharno.setFont(new Font("Raleway",Font.BOLD, 20));
        aadharno.setBounds(100,490,200,30);
        add(aadharno);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);
        
        JLabel seniorcitizen = new JLabel("Senior Citizen:");
        seniorcitizen.setFont(new Font("Raleway",Font.BOLD, 20));
        seniorcitizen.setBounds(100,540,200,30);
        add(seniorcitizen);
        
        syes = new JRadioButton("yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
                                       
        ButtonGroup seniorcitizengroup = new ButtonGroup();
        seniorcitizengroup.add(syes);
        seniorcitizengroup.add(sno);
        
        JLabel existingaccount = new JLabel("Existing Account:");
        existingaccount.setFont(new Font("Raleway",Font.BOLD, 20));
        existingaccount.setBounds(100,590,200,30);
        add(existingaccount);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
                                       
        ButtonGroup existingaccountgroup = new ButtonGroup();
        existingaccountgroup.add(eyes);
        existingaccountgroup.add(eno);
        
        
        
        next = new JButton("next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway" , Font.BOLD, 14));
        next.setBounds(620 , 660, 80, 30);
        next.addActionListener(this);
        add(next);
                  
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,800);
        setLocation(350,10);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        
        
        String sreligion = (String) religion.getSelectedItem();//set text
        String scategory = (String) category.getSelectedItem();
        String sincomecategory =  (String) incomecategory.getSelectedItem();
        String seducation =  (String) education.getSelectedItem();
        String soccuption =  (String) occuption.getSelectedItem();
        
        String seniorcitizen = null;
        
        if(syes.isSelected()){
            seniorcitizen = "Yes";
        } else if (sno.isSelected()){
            seniorcitizen= "no";
        }
        
        String existingaccount = null;
        if (eyes.isSelected()){
            existingaccount = "yes";
        }else if (eno.isSelected()){
            existingaccount = "no";
        
        }
        String span = pan.getText();
        String saadhar = aadhar.getText();
        
        
        try {
              Conn c = new Conn();
              String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincomecategory+"', '"+seducation+"', '"+soccuption+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+existingaccount+"')";
              c.s.executeUpdate(query); 
                                        
              //signup3 object
              setVisible(false);
              new SignupThree(formno).setVisible(true);
              
              
        }catch (Exception e) {
            System.out.println(e);
        }
               
    }
    
    
    public static void main(String args[])  {
        new signupTwo("");
    }


   
}   
