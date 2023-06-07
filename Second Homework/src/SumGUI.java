import javax.swing.JOptionPane;

public class SumGUI {
    public static void main(String[] args){
        int number =Integer.parseInt( JOptionPane.showInputDialog("Enter your number"));


        for(int i=0;i<= number; i++){
            System.out.println(i);
        }
    }
}
