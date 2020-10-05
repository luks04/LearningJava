import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletManejadores extends Applet implements ActionListener{
    private Button sumar, restar, multiplicar, dividir, raizX, raizY, xPowY, yPowX, modulo;
    private TextField inputX, inputY, resultado;
    private Panel panel2;
    private Label labelX, labelY, labelRes;

    public AppletManejadores() {
        Panel panel1 = new Panel(new GridLayout(2, 3, 1, 10));
        panel2 = new Panel(new GridLayout(3, 3, 2, 2));
        labelX = new Label("X", Label.CENTER);
        labelY = new Label("Y", Label.CENTER);
        labelRes = new Label("answer", Label.CENTER);
        inputX = new TextField();
        inputY = new TextField();
        resultado = new TextField();
        resultado.setEditable(false);
        sumar = new Button("+");
        restar = new Button("-");
        multiplicar = new Button("*");
        dividir = new Button("/");
        raizX = new Button("Raiz x");
        raizY = new Button("Raiz y");
        xPowY = new Button("X a la Y");
        yPowX = new Button("Y a la X");
        modulo = new Button("X mod Y");
        panel1.add(labelX);
        panel1.add(labelY);
        panel1.add(labelRes);
        panel1.add(inputX);
        panel1.add(inputY);
        panel1.add(resultado);
        panel2.add(sumar);
        panel2.add(restar);
        panel2.add(multiplicar);
        panel2.add(dividir);
        panel2.add(raizX);
        panel2.add(raizY);
        panel2.add(xPowY);
        panel2.add(yPowX);
        panel2.add(modulo);
        add(panel1);
        add(panel2);
        sumar.addActionListener(this);
        restar.addActionListener(this);
        multiplicar.addActionListener(this);
        dividir.addActionListener(this);
        raizX.addActionListener(this);
        raizY.addActionListener(this);
        xPowY.addActionListener(this);
        yPowX.addActionListener(this);
        modulo.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        String answer;
        double x, y, ans;
        x = Integer.parseInt(inputX.getText());
        y = Integer.parseInt(inputY.getText());

        System.out.println(e.getSource());
        if (e.getSource() == sumar) {
            ans = x + y;
        } else if (e.getSource() == restar) {
            ans = x - y;
        } else if (e.getSource() == multiplicar) {
            ans = x * y;
        } else if (e.getSource() == dividir) {
            ans = x / y;
        } else if (e.getSource() == raizX) {
            ans = Math.sqrt(x);
        } else if (e.getSource() == raizY) {
            ans = Math.sqrt(y);
        } else if (e.getSource() == xPowY) {
            ans = Math.pow(x, y);
        } else if (e.getSource()==yPowX) {
            ans = Math.pow(y, x);
        } else if (e.getSource()==modulo) {
            ans = x % y;
        } else {
            ans = 0.0;
        }

        answer = String.valueOf(ans);
        resultado.setText(answer);
    }
}