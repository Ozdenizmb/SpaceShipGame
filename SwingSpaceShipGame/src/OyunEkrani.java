
import javax.swing.JFrame;


public class OyunEkrani extends JFrame {
    
    public OyunEkrani() {
        
        setTitle("Uzay Oyunu");
        
        Oyun oyun = new Oyun();
        oyun.requestFocus();
        oyun.addKeyListener(oyun);
        oyun.setFocusable(true);
        oyun.setFocusTraversalKeysEnabled(false);
        
        add(oyun);
        
        setVisible(true);
        setResizable(false);
        setFocusable(false);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }
    
    public static void main(String[] args) {
        
        new OyunEkrani();
        
    }
    
}
