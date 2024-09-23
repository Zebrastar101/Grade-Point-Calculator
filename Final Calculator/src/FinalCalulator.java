import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
public class FinalCalulator extends JFrame{
    public FinalCalulator() {
        //Set up frame
        setTitle("Final Calculator");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        //Create Labels
        JLabel totalTermWeight = new JLabel("Total Term Weight:");
        totalTermWeight.setBounds(10, 10, 150, 30);
        add(totalTermWeight);
        JLabel finalWeight = new JLabel("Final Weight:");
        finalWeight.setBounds(10, 50, 150, 30);
        add(finalWeight);
        JLabel numberofTerms = new JLabel("Number of Terms:");
        numberofTerms.setBounds(10, 90, 150, 30);
        add(numberofTerms);
        JLabel gradeWanted = new JLabel("Grade Wanted:");
        gradeWanted.setBounds(10, 130, 150, 30);
        add(gradeWanted);
        //Create TextFields
        JTextField totalTermWeightField = new JTextField();
        totalTermWeightField.setBounds(160, 10, 150, 30);
        totalTermWeightField.setBorder(BorderFactory.createLineBorder(Color.black));
        totalTermWeightField.setBackground(Color.white);
        add(totalTermWeightField);
        totalTermWeightField.setText("85");
        JTextField finalWeightField = new JTextField();
        finalWeightField.setBounds(160, 50, 150, 30);
        finalWeightField.setBorder(BorderFactory.createLineBorder(Color.black));
        finalWeightField.setBackground(Color.white);
        add(finalWeightField);
        String[] terms = {"1", "2", "3", "4", "5"};
        finalWeightField.setText("15");
        JComboBox numberofTermsField = new JComboBox<String>(terms);
        numberofTermsField.setBounds(160, 90, 150, 30);
        add(numberofTermsField);
        JTextField gradeWantedField = new JTextField();
        gradeWantedField.setBounds(160, 130, 150, 30);
        gradeWantedField.setBorder(BorderFactory.createLineBorder(Color.black));
        gradeWantedField.setBackground(Color.white);
        add(gradeWantedField);
        gradeWantedField.setText("90");
        //Create Term labels
        JLabel term1 = new JLabel("Term 1:");
        term1.setBounds(10, 190, 150, 30);
        term1.setEnabled(true);
        add(term1);
        JLabel term2 = new JLabel("Term 2:");
        term2.setBounds(10, 230, 150, 30);
        term2.setEnabled(false);
        add(term2);
        JLabel term3 = new JLabel("Term 3:");
        term3.setBounds(10, 270, 150, 30);
        term3.setEnabled(false);
        add(term3);
        JLabel term4 = new JLabel("Term 4:");
        term4.setBounds(10, 310, 150, 30);
        term4.setEnabled(false);
        add(term4);
        JLabel term5 = new JLabel("Term 5:");
        term5.setBounds(10, 350, 150, 30);
        term5.setEnabled(false);
        add(term5);
        //Create Term TextFields
        JTextField term1Field = new JTextField();
        term1Field.setBounds(160, 190, 150, 30);
        term1Field.setBackground(Color.white);
        term1Field.setEnabled(true);
        add(term1Field);
        JTextField term2Field = new JTextField();
        term2Field.setBounds(160, 230, 150, 30);
        term2Field.setBackground(Color.white);
        term2Field.setEnabled(false);
        add(term2Field);
        JTextField term3Field = new JTextField();
        term3Field.setBounds(160, 270, 150, 30);
        term3Field.setBackground(Color.white);
        term3Field.setEnabled(false);
        add(term3Field);
        JTextField term4Field = new JTextField();
        term4Field.setBounds(160, 310, 150, 30);
        term4Field.setBackground(Color.white);
        term4Field.setEnabled(false);
        add(term4Field);
        JTextField term5Field = new JTextField();
        term5Field.setBounds(160, 350, 150, 30);
        term5Field.setBackground(Color.white);
        term5Field.setEnabled(false);
        add(term5Field);
        //Create Buttons
        JButton calculate = new JButton("Calculate");
        calculate.setBounds(10, 410, 330, 30);
        add(calculate);
        JButton clear = new JButton("Clear");
        clear.setBounds(10, 450, 330, 30);
        add(clear);
        //Create Results Label
        JLabel results = new JLabel("Calculate Grade required On Final");
        results.setBounds(10, 490, 330, 30);
        results.setHorizontalAlignment(JLabel.CENTER);
        add(results);
        //Create Results TextArea
        JLabel resultsArea = new JLabel();
        resultsArea.setBounds(10, 530, 330, 30);
        resultsArea.setHorizontalAlignment(JLabel.CENTER);
        add(resultsArea);
        setVisible(true);
        //Add action listeners
        numberofTermsField.addActionListener(e -> {
            switch (numberofTermsField.getSelectedIndex()) {
                case 0:
                    term1.setEnabled(true);
                    term1Field.setEnabled(true);
                    term2.setEnabled(false);
                    term2Field.setEnabled(false);
                    term2Field.setText("");
                    term3.setEnabled(false);
                    term3Field.setEnabled(false);
                    term3Field.setText("");
                    term4.setEnabled(false);
                    term4Field.setEnabled(false);
                    term4Field.setText("");
                    term5.setEnabled(false);
                    term5Field.setEnabled(false);
                    term5Field.setText("");
                    break;
                case 1:
                    term1.setEnabled(true);
                    term1Field.setEnabled(true);
                    term2.setEnabled(true);
                    term2Field.setEnabled(true);
                    term3.setEnabled(false);
                    term3Field.setEnabled(false);
                    term3Field.setText("");
                    term4.setEnabled(false);
                    term4Field.setEnabled(false);
                    term4Field.setText("");
                    term5.setEnabled(false);
                    term5Field.setEnabled(false);
                    term5Field.setText("");
                    break;
                case 2:
                    term1.setEnabled(true);
                    term1Field.setEnabled(true);
                    term2.setEnabled(true);
                    term2Field.setEnabled(true);
                    term3.setEnabled(true);
                    term3Field.setEnabled(true);
                    term4.setEnabled(false);
                    term4Field.setEnabled(false);
                    term4Field.setText("");
                    term5.setEnabled(false);
                    term5Field.setEnabled(false);
                    term5Field.setText("");
                    break;
                case 3:
                    term1.setEnabled(true);
                    term1Field.setEnabled(true);
                    term2.setEnabled(true);
                    term2Field.setEnabled(true);
                    term3.setEnabled(true);
                    term3Field.setEnabled(true);
                    term4.setEnabled(true);
                    term4Field.setEnabled(true);
                    term5.setEnabled(false);
                    term5Field.setEnabled(false);
                    term5Field.setText("");
                    break;
                case 4:
                    term1.setEnabled(true);
                    term1Field.setEnabled(true);
                    term2.setEnabled(true);
                    term2Field.setEnabled(true);
                    term3.setEnabled(true);
                    term3Field.setEnabled(true);
                    term4.setEnabled(true);
                    term4Field.setEnabled(true);
                    term5.setEnabled(true);
                    term5Field.setEnabled(true);
                    break;
            }
            });
        calculate.addActionListener(e -> {
            if(totalTermWeightField.getText().equals("")||finalWeightField.getText().equals("")||(Double.parseDouble(totalTermWeightField.getText())+Double.parseDouble(finalWeightField.getText())!=100)){
                JOptionPane.showMessageDialog(null, "Please enter valid weights for the term and final exams. The total weight must be 100%.");

            }
            else{
                //Required = (Goal − Current × .85*Current)/.15
                if(gradeWantedField.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter a grade wanted");
                }else{
                    double goal = Double.parseDouble(gradeWantedField.getText());
                    if(numberofTermsField.getSelectedIndex()==0&&!(term1Field.getText().equals(""))){
                        double current = Double.parseDouble(term1Field.getText());
                        double required = (goal - (current*(Double.parseDouble(totalTermWeightField.getText())/100))) / (Double.parseDouble(finalWeightField.getText())/100);
                        resultsArea.setText(required+ "");
                    } else if (numberofTermsField.getSelectedIndex()==1&&!(term1Field.getText().equals(""))&&!(term2Field.getText().equals(""))) {
                        double current = (Double.parseDouble(term1Field.getText()) + Double.parseDouble(term2Field.getText()))/2;
                        double required = (goal - (current*(Double.parseDouble(totalTermWeightField.getText())/100))) / (Double.parseDouble(finalWeightField.getText())/100);
                        resultsArea.setText(required+ "");
                    } else if (numberofTermsField.getSelectedIndex()==2&&!(term1Field.getText().equals(""))&&!(term2Field.getText().equals(""))&&!(term3Field.getText().equals(""))) {
                        double current = (Double.parseDouble(term1Field.getText()) + Double.parseDouble(term2Field.getText()) + Double.parseDouble(term3Field.getText()))/3;
                        double required = (goal - (current*(Double.parseDouble(totalTermWeightField.getText())/100))) / (Double.parseDouble(finalWeightField.getText())/100);
                        resultsArea.setText(required+ "");
                    } else if (numberofTermsField.getSelectedIndex()==3&&!(term1Field.getText().equals(""))&&!(term2Field.getText().equals(""))&&!(term3Field.getText().equals(""))&&!(term4Field.getText().equals(""))) {
                        double current = (Double.parseDouble(term1Field.getText()) + Double.parseDouble(term2Field.getText()) + Double.parseDouble(term3Field.getText()) + Double.parseDouble(term4Field.getText()))/4;
                        double required = (goal - (current*(Double.parseDouble(totalTermWeightField.getText())/100))) / (Double.parseDouble(finalWeightField.getText())/100);
                        resultsArea.setText(required+ "");
                    } else if (numberofTermsField.getSelectedIndex()==4&&!(term1Field.getText().equals(""))&&!(term2Field.getText().equals(""))&&!(term3Field.getText().equals(""))&&!(term4Field.getText().equals(""))&&!(term5Field.getText().equals(""))) {
                        double current = (Double.parseDouble(term1Field.getText()) + Double.parseDouble(term2Field.getText()) + Double.parseDouble(term3Field.getText()) + Double.parseDouble(term4Field.getText()) + Double.parseDouble(term5Field.getText()))/5;
                        double required = (goal - (current*(Double.parseDouble(totalTermWeightField.getText())/100))) / (Double.parseDouble(finalWeightField.getText())/100);
                        resultsArea.setText(required+ "");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Please enter valid term grades");
                    }
                }



            }
        });
        clear.addActionListener(e -> {
            term1Field.setText("");
            term2Field.setText("");
            term3Field.setText("");
            term4Field.setText("");
            term5Field.setText("");
            resultsArea.setText("");
            });









    }




}
