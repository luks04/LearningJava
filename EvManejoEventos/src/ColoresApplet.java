import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class ColoresApplet extends Applet implements AdjustmentListener {

    private Label l1,l2,l3;
    private Scrollbar scrollbar1,scrollbar2,scrollbar3;
    private int deslizador1,deslizador2,deslizador3;

    public ColoresApplet() {
        Panel p1 = new Panel(new GridLayout(2, 3));
        l1 = new Label("Deslizador 1");
        l2 = new Label("Deslizador 2");
        l3 = new Label("Deslizador 3");
        scrollbar1 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 255);
        scrollbar2 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);
        scrollbar3 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);

        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(scrollbar1);
        p1.add(scrollbar2);
        p1.add(scrollbar3);
        add(p1);
        scrollbar1.addAdjustmentListener(this);
        scrollbar2.addAdjustmentListener(this);
        scrollbar3.addAdjustmentListener(this);
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        deslizador1 = scrollbar1.getValue();
        deslizador2 = scrollbar2.getValue();
        deslizador3 = scrollbar3.getValue();

        l1.setText("" + deslizador1);
        l2.setText("" + deslizador2);
        l3.setText("" + deslizador3);
        repaint();
    }
    
    public void paint(Graphics g) {
        Color valor=new Color(deslizador1, deslizador2, deslizador3);
        g.drawRect(0,0, 500, 500);
        g.setColor  (valor) ;
        g.fillRect(0,0,500,500);
    }

}