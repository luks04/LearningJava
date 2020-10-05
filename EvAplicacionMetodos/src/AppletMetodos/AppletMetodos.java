package AppletMetodos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AppletMetodos extends JApplet implements ActionListener{
    private JLabel numCuentaLable = new JLabel();
    private JTextField numeroCuenta = new JTextField();
    private JLabel nomClienteLabel = new JLabel();
    private JTextField nombreCliente = new JTextField();
    private JLabel saldoCuentaLabel = new JLabel();
    private JTextField saldoCuenta = new JTextField();
    private ScrollPane resultadoPane = new ScrollPane();
    private JTextArea textAreaPane = new JTextArea();
    private JLabel resultadoLabel = new JLabel();

    @Override
    public void init() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppletMetodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        try {
            EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void initComponents() {
        JButton buttonDespCuenta = new JButton();

        numCuentaLable.setText("Numero de Cuenta");
        nomClienteLabel.setText("Nombre Cliente");
        saldoCuentaLabel.setText("Saldo de la cuenta");
        buttonDespCuenta.setText("Despliegue Cuenta");
        resultadoLabel.setText("Resultado");

        buttonDespCuenta.addActionListener( this);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(resultadoLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(resultadoPane, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(numCuentaLable)
                                                                .addComponent(numeroCuenta, GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                                                                .addComponent(nomClienteLabel)
                                                                .addComponent(nombreCliente)
                                                                .addComponent(saldoCuentaLabel)
                                                                .addComponent(saldoCuenta)))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(246, 246, 246)
                                                        .addComponent(buttonDespCuenta))))
                                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(numCuentaLable)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numeroCuenta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nomClienteLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombreCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(saldoCuentaLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saldoCuenta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonDespCuenta)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(resultadoPane, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                                                .addGap(19, 19, 19))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(resultadoLabel)
                                                .addGap(92, 92, 92))))
        );
    }

    public void actionPerformed(ActionEvent e) {
        int numero_cuenta = Integer.parseInt(numeroCuenta.getText());
        String nombre_cliente = nombreCliente.getText();
        double saldo_cuenta = Double.parseDouble(saldoCuenta.getText());

        CuentaBancaria nuevaCuenta = new CuentaBancaria(numero_cuenta, nombre_cliente, saldo_cuenta);

        String prevTextAreaContent = textAreaPane.getText();
        textAreaPane.setText(prevTextAreaContent
                + nuevaCuenta.getNumero() + " "
                + nuevaCuenta.getNombre() + "\t"
                + nuevaCuenta.getSaldo() + "\n");

        resultadoPane.add(textAreaPane);
    }

}