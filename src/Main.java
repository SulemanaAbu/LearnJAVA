 import javax.swing.JOptionPane;

public class Main{
    public static void main (String [] args){

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Your name is "+name);

        String school = JOptionPane.showInputDialog("Enter the name of your school");
        JOptionPane.showMessageDialog(null, "You attend "+school);

        String program = JOptionPane.showInputDialog("Enter the program you offer");
        JOptionPane.showMessageDialog(null, "You offer "+program);

        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "How old are you?"));
        JOptionPane.showMessageDialog(null, "You are "+age+" years old");

        double gpa = Double.parseDouble(JOptionPane.showInputDialog("Enter your current gpa"));
        JOptionPane.showMessageDialog(null, "Your gpa is "+gpa);




    }
}