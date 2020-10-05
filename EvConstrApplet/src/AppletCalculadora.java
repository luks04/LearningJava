import java.applet.Applet;
import java.awt.*;

public class AppletCalculadora extends Applet { 

    private Display display = new Display() ;

    public void init () {
        setLayout(new BorderLayout()) ;
        Keypad keypad = new Keypad() ;
        add ("North", display) ;
        add ("Center", keypad) ;
    }

    public boolean action (Event ev, Object arg) {
        if(ev.target instanceof Button) {
            String label = (String)arg;

            switch (label) {
                case "C":
                    display.Clear();
                    return true;
                case "CE":
                    display.Clear();
                    return true;
                case ". ":
                    display.Dot();
                    return true;
                case "+":
                    display.Plus();
                    return true;
                case "-":
                    display.Minus();
                    return true;
                case "x":
                    display.Mul();
                    return true;
                case "/":
                    display.Div();
                    return true;
                case "+/-":
                    display.Chs();
                    return true;
                case "=":
                    display.Equals();
                    return true;
                default:
                    display.Digit(label);
                    return true;
            }
        }
        return false;
    }
}

/** 
* Keypad
*/

class Keypad extends Panel {

    Keypad (){
        Button b = new Button() ;
        Font font = new Font ("Times", Font. BOLD, 14) ;
        Color functionColor = new Color (64, 0, 128) ;
        Color numberColor = new Color (0, 0, 255) ;
        Color equalsColor = new Color (255, 128, 0) ;
        setFont (font) ;
        b.setForeground (Color.black) ;

        add (b = new Button ("1" )) ;
        b.setForeground (numberColor) ;
        add (b = new Button ("2")) ;
        b.setForeground (numberColor) ;
        add (b = new Button ("3" )) ;
        b.setForeground (numberColor) ;

        add (b = new Button ("4" )) ;
        b.setForeground(numberColor) ;
        add (b = new Button ("5" )) ;
        b.setForeground(numberColor) ;
        add (b = new Button ("6" )) ;
        b.setForeground (numberColor) ;

        add (b = new Button ("7" )) ;
        b.setForeground (numberColor) ;
        add (b = new Button ("8" )) ;
        b.setForeground(numberColor) ;
        add (b = new Button ("9" )) ;
        b.setForeground (numberColor) ;

        add (b = new Button (". " )) ;
        b.setForeground (functionColor) ;
        add (b = new Button ("0" )) ;
        b.setForeground(numberColor) ;
        add (b = new Button ("CE" )) ;
        b.setForeground (equalsColor) ;

        add (b = new Button ("+" )) ;
        b.setForeground (functionColor) ;
        add (b = new Button ("-" )) ;
        b.setForeground (functionColor) ;
        add (b = new Button ("=" )) ;
        b.setForeground (equalsColor) ;

        add (b = new Button ("x" )) ;
        b.setForeground (functionColor) ;
        add (b = new Button ("/" )) ;
        b.setForeground (functionColor) ;
        add (b = new Button ("C" )) ;
        b.setForeground (equalsColor) ;

        /**
         * Dimensiones Panel
         */
        setLayout (new GridLayout (6, 3, 4, 4)) ;
    }
}

/**
 * Display
 */

class Display extends Panel {
    private double last = 0;
    private int op = 0;
    private boolean equals = false;
    private int maxlen = 10;
    private String s;
    private Label readout = new Label("0" );

    Display () {
        setLayout(new BorderLayout()) ;
        setFont (new Font ("Courier", Font. BOLD + Font. ITALIC, 30)) ;
        readout. setAlignment(1) ;
        add ("Center",readout) ;
        repaint() ;
        Clear () ;
    }

    void Digit (String digit) {
        checkEquals () ;
        /*
        * Quita los ceros precedentes
        */
        if (s.length ()== 1  &&  s.charAt(0) == '0' &&  digit.charAt(0)  !='.'){
            s = s.substring (1) ;
        }
        if (s.length () < maxlen){
            s = s + digit;
            showacc () ;
        }
    }

    void Dot () {
        checkEquals () ;
        /*
        * Ya tiene un '.'
        */
        if (s.indexOf ('.') != -1){
            return;
        }

        if(s.length () < maxlen){
            s += ".";
            showacc();
        }
    }

    private void checkEquals () {
        if (equals) {
            equals = false;
            s = "0";
        }
    }

    void Plus () {
        op = 1;
        operation () ;
    }

    void Minus () {
        op = 2;
        operation () ;
    }

    void Mul () {
        op = 3;
        operation () ;
    }

    void Div () {
        op = 4;
        operation() ;
    }

    private void operation () {
        if (s.length () == 0) return;

        Double xyz = Double.valueOf(s);
        last = xyz;

        equals = false;
        s = "0";
    }

    void Chs () {
        if (s.length () == 0) return;

        if(s.charAt (0) == '-') {
            s = s.substring (1) ;
        } else {
            s = "-" + s;
        }
        showacc () ;
    }

    void Equals () {
        double acc;

        if (s. length () == 0) return;
        Double xyz = Double. valueOf (s) ;
        switch (op) {
            case 1:
                acc = last + xyz;
                break;
            case 2:
                acc = last - xyz;
                break;
            case 3:
                acc = last * xyz;
                break;
            case 4:
                acc = last / xyz;
                break;
            default:
                acc = 0;
                break;
        }

        s = Double.toString(acc);
        showacc () ;
        equals = true;
        last = 0;
        op = 0;
    }

    void Clear () {
        last = 0;
        op = 0;
        s = "0";
        equals = false;
        showacc () ;
    }

    private void showacc () {
        readout.setText(s) ;
        repaint () ;
    }
} 