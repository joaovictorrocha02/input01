
import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
       
        // Criei um JOptionPane
        String [] acceptableValues = {"Choise 1", "Choise 2", "Choise 3"};
        var string= (String)JOptionPane.showInputDialog(null,
                               "Esta é uma pergunta?",
                               "Título da caixa de diálogo",
                               2,
                               null,
                               acceptableValues,
                               acceptableValues[1]);
                                       
        
      
        
        
       

        
    }
}
