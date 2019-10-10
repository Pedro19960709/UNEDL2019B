package Operadores;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestOperadores extends JFrame {

    private JLabel lblValor1;
    private JLabel lblValor2;
    private JLabel lblOperadores;
    private JTextField txtValor1;
    private JTextField txtValor2;
    private JComboBox cbxOperadores;
    private JComboBox cbxOperadoresLogicos;
    private JCheckBox chbOtros;
    private JButton btn;
    private int valor1;
    private int valor2;

//Constructor: sirve para inicializar los atributos de una clase
    public TestOperadores() {
        lblValor1 = new JLabel("Valor 1: ");
        lblValor2 = new JLabel("Valor 2: ");
        lblOperadores = new JLabel("Operadores Aritméticos:");
        txtValor1 = new JTextField();
        txtValor2 = new JTextField();
        cbxOperadores = new JComboBox();
        cbxOperadoresLogicos = new JComboBox();
        chbOtros = new JCheckBox();
        btn = new JButton("Resultado");
        cbxOperadores.addItem("+");
        cbxOperadores.addItem("-");
        cbxOperadores.addItem("*");
        cbxOperadores.addItem("/");
        cbxOperadores.addItem("%");
        cbxOperadoresLogicos.addItem("<");
        cbxOperadoresLogicos.addItem(">");
        cbxOperadoresLogicos.addItem("<=");
        cbxOperadoresLogicos.addItem(">=");
        cbxOperadoresLogicos.addItem("==");
        cbxOperadoresLogicos.addItem("!=");
        cbxOperadoresLogicos.addItem("&&");
        cbxOperadoresLogicos.addItem("||");
        chbOtros.setText("Otros");
        add(lblValor1);
        add(txtValor1);
        add(lblValor2);
        add(txtValor2);
        add(lblOperadores);
        add(cbxOperadores);
        add(chbOtros);
        add(cbxOperadoresLogicos);
        add(btn);
        cbxOperadoresLogicos.setEnabled(false);
        chbOtros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (chbOtros.isSelected()) {
                    cbxOperadores.setEnabled(false);
                    cbxOperadoresLogicos.setEnabled(true);
                } else {
                    cbxOperadores.setEnabled(true);
                    cbxOperadoresLogicos.setEnabled(false);
                }
            }
        });
        btn.addActionListener(new ActionListener() {
            Operadores ref = new Operadores();

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (chbOtros.isSelected()) {
                    valor1 = Integer.parseInt(txtValor1.getText());
                    valor2 = Integer.parseInt(txtValor2.getText());
                    ref.setOperadoresLogicos(valor1, valor2, (String) cbxOperadoresLogicos.getSelectedItem());
                    System.out.println(ref.res2);
                }else{
                    valor1 = Integer.parseInt(txtValor1.getText());
                    valor2 = Integer.parseInt(txtValor2.getText());
                    ref.setOperadores(valor1, valor2, (String) cbxOperadores.getSelectedItem());
                    
                }

            }
        });

        setLayout(new GridLayout(5, 2, 10, 20));
        setLocation(500, 300);
        setVisible(true);
        pack();

    }

    public static void main(String[] args) {
        TestOperadores ref = new TestOperadores();
    }

}
