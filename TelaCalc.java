import com.sun.tools.javac.Main;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCalc extends JFrame {
    private JPanel pnlTelaCalc;
    private JButton btn01;
    private JButton btn02;
    private JButton btn03;
    private JButton btnSomar;
    private JButton btnRaiz;
    private JButton btn04;
    private JButton btn05;
    private JButton btn06;
    private JButton btnMenos;
    private JButton btnPorsentagem;
    private JButton btnMultiplica;
    private JButton btnResultado;
    private JButton btn09;
    private JButton btn08;
    private JButton btn07;
    private JButton btn00;
    private JButton btnVirgula;
    private JButton btnApagar;
    private JButton btnDividir;
    private JTextField txtSaida;
    private JTextPane calculadoraTextPane;

    double valor1;
    double valor2;

    String Operador;
public TelaCalc() {
    iniciarComponentes();
    addListeners();


}
    private void iniciarComponentes(){

        JPanel TelaCalc = new JPanel();
        setSize(500,350);
        setContentPane(pnlTelaCalc);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setVisible(true);
    }
    private void addListeners(){

    btn01.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtSaida.setText(txtSaida.getText()+"1");
        }
    });
        btn02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText()+"2");
            }
        });
        btn03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText()+"3");
            }
        });
        btn04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText()+"4");
            }
        });
        btn05.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText()+"5");
            }
        });
        btn06.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText()+"6");
            }
        });
        btn07.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText()+"7");
            }
        });
        btn08.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText()+"8");
            }
        });
        btn09.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText()+"9");
            }
        });
        btn00.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText()+"0");
            }
        });
        btnVirgula.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText()+",");
            }
        });
        //SOMAR
        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtSaida.getText());
                txtSaida.setText("");
                Operador = "+";
            }
        });

        //MULTIPLICACAO
        btnMultiplica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtSaida.getText());
                txtSaida.setText("");
                Operador = "*";
            }
        });

        //MENOS
        btnMenos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtSaida.getText());
                txtSaida.setText("");
                Operador = "-";
            }
        });

        //DIVIDIR
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtSaida.getText());
                txtSaida.setText("");
                Operador = "/";
            }
        });
        //PORSENTAGEM
        btnPorsentagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtSaida.getText());
                txtSaida.setText("");
                Operador = "%";
            }
        });
        //RAIZ
        btnRaiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtSaida.getText());
                txtSaida.setText("");
                Operador = "sqrt";
                Double sqrt = Math.sqrt(valor1);
                txtSaida.setText(String.valueOf(sqrt));
            }
        });


        btnResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor2 = Double.parseDouble(txtSaida.getText());
                switch (Operador){
                    case "+":
                        txtSaida.setText(String.valueOf(valor1 + valor2));
                        break;
                    case "*":
                        txtSaida.setText(String.valueOf(valor1 * valor2));
                        break;
                    case "-":
                        txtSaida.setText(String.valueOf(valor1 - valor2));
                        break;
                    case "/":
                        txtSaida.setText(String.valueOf(valor1 / valor2));
                        break;
                    case "%":
                        txtSaida.setText(String.valueOf(valor1 % valor2));
                        break;

                }

            }
        });
        btnApagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText("");
                Operador = "";
            }
        });


}

    public static void main(String[] args) {
        TelaCalc calculadora = new TelaCalc();
    }
}
