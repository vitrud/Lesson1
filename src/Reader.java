import javax.swing.JOptionPane;

public class Reader {
    int i, k;
    String n1, n2;
    
    public void Scan(){
    	n1 = JOptionPane.showInputDialog("Введите первое001 число");
    	n2 = JOptionPane.showInputDialog("Ââåäèòå âòîðîå ÷èñëî");
    	i = Integer.parseInt(n1);
    	k = Integer.parseInt(n2);
    }
    
    public void Scan(int a, int b){
    	JOptionPane.showMessageDialog(null, "Òåïåðü âàøå ïåðâîå ÷èñëî = "+ a);
    	JOptionPane.showMessageDialog(null, "Òåïåðü âàøå âòîðîå ÷èñëî = "+ b);
    }
}
