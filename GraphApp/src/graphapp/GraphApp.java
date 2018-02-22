
package graphapp;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
/**
 *
 * @author lr_29
 */
public class GraphApp extends JFrame{

    int x,y;
    
public GraphApp(){

    setTitle("Aplicación de Graficación");
    setSize(700,700);
    setResizable(true);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    x=30;
    y=300;
}

public void paint(Graphics g){

    g.drawLine(300, 30, 300, 600); // Eje X
    g.drawLine(30, 300, 600, 300); // Eje Y
    g.setColor(Color.blue);
    g.fillOval(x,y,3,3);
    run();
    repaint();
}

public void run(){
  try{
      
      Thread.sleep(10);
      int ax,by;
      ax=x-300;
      by=y-300;
      
      by=(int)(150*Math.sin(0.2*ax/3.14));
      x=ax+300;
      y=300-by;
      x++;
      
  }catch(Exception e)  {
      System.out.println("¡ Error !");
  }
}
    public static void main(String[] args) {
        
    new GraphApp();    
        

    }
    
}
