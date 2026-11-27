
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class InterfazCalculadora {
    private JPanel pnlPrincipal;
    private JButton btnModo;
    private JButton btnBorrar;
    private JButton btnPorcentaje;
    private JButton btnDivision;
    private JButton btn9;
    private JButton btnMultiplicacion;
    private JButton btn4;
    private JButton btn2;
    private JButton btn5;
    private JButton btn6;
    private JButton btnMenos;
    private JButton btn1;
    private JButton btn3;
    private JButton btnSigno;
    private JButton btnIgual;
    private JButton btnComa;
    private JButton btn0;
    private JButton btn7;
    private JButton btn8;
    private JButton btnSuma;
    private JButton btnLimpiar;
    private JLabel lblFecha;
    private JLabel lblPantalla;
    private JPanel pnlBotones;


    //Atributos


    //Constructor

    public InterfazCalculadora(){
        Date fecha=new Date();
        System.out.println(fecha);
        SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy hh:mm a ");
        lblFecha.setText(formato.format(fecha));


    }

    public static void main(String[] args) {
        JFrame frameCalculadora=new JFrame("Calculadora");
        frameCalculadora.setContentPane(new InterfazCalculadora ().pnlPrincipal);
        frameCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameCalculadora.setSize(350,500);
        frameCalculadora.setVisible(true);
    }

}
