import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class BotonesApplet extends Applet implements ActionListener {
    private TextField firstTextField, resultTextField,secondTextField;
    private Button add,clear,substract,multiply,divide,sqrtFirst,sqrtSecond,identifyHigher;

    public BotonesApplet() {
        setBackground(Color.blue);
        Panel p1 = new Panel(new GridLayout(1, 2));
        Panel p2 = new Panel(new BorderLayout());
        Panel p3 = new Panel(new BorderLayout());
        Panel p4 = new Panel(new GridLayout(1, 2));
        Label firstLabel = new Label("1° Numero");
        Label secondLabel = new Label("2° numero");
        Label resultLabel = new Label("Respuesta");
        firstTextField = new TextField(8);
        resultTextField = new TextField(8);
        secondTextField = new TextField(10);
        add = new Button("Sumar");
        clear = new Button("Limpiar");
        substract = new Button("restar");
        multiply = new Button("multiplicar");
        divide = new Button("dividir");
        sqrtFirst = new Button("Raiz del 1° numero");
        sqrtSecond = new Button("Raiz de 2° numero");
        identifyHigher = new Button("Identificar numero mayor");
        p1.add(firstLabel);
        p1.add(firstTextField);
        p1.add(secondLabel);
        p1.add(secondTextField);
        p2.add(add, BorderLayout.EAST);
        p2.add(clear, BorderLayout.NORTH);
        p2.add(substract, BorderLayout.WEST);
        p2.add(identifyHigher, BorderLayout.SOUTH);
        p3.add(multiply, BorderLayout.WEST);
        p3.add(divide, BorderLayout.EAST);
        p3.add(sqrtFirst, BorderLayout.NORTH);
        p3.add(sqrtSecond, BorderLayout.SOUTH);
        p4.add(resultLabel);
        p4.add(resultTextField);
        add(p1);
        add(p2);
        add(p3);
        add(p4);

        add.addActionListener(this);
        clear.addActionListener(this);
        substract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        sqrtFirst.addActionListener(this);
        sqrtSecond.addActionListener(this);
        identifyHigher.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        String tf1 = firstTextField.getText();
        String tf2 = secondTextField.getText();
        int n = 0;
        int n2 = 0;

        if (!tf1.equals("")) n = Integer.parseInt(tf1);

        if (!tf2.equals("")) n2 = Integer.parseInt(tf2);

        if (e.getSource() == add) {
            int suma = n + n2;
            resultTextField.setText("" + suma);
        }
        if (e.getSource() == clear) {
            firstTextField.setText("");
            resultTextField.setText("");
            secondTextField.setText("");
        }
        if(e.getSource() == substract){
            int resta = n2 - n;
            resultTextField.setText("" + resta);
        }
        if(e.getSource() == multiply){
            int multiplicacion = n2 * n;
            resultTextField.setText("" + multiplicacion);
        }
        if(e.getSource() == divide){
            double division = (double) n / (double) n2;
            String roundedDivision = new DecimalFormat("#.##").format(division);
            resultTextField.setText(roundedDivision);
        }

        if(e.getSource() == sqrtFirst){
            double raiz = Math.sqrt(n);
            String roundedRaiz = new DecimalFormat("#.##").format(raiz);
            resultTextField.setText(roundedRaiz);
        }

        if(e.getSource() == sqrtSecond){
            double raiz = Math.sqrt(n2);
            String roundedRaiz = new DecimalFormat("#.##").format(raiz);
            resultTextField.setText(roundedRaiz);
        }

        if(e.getSource() == identifyHigher){
            if(n > n2){
                resultTextField.setText("" + n);
            }
            else{
                resultTextField.setText("" + n2);
            }
        }
    }
}
