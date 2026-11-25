import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InterfazCalculadora {
    private JPanel pnlPrincipal;
    private JButton MODOButton;
    private JButton btnLimpieza;
    private JButton btnPorcentaje;
    private JButton btnDivision;
    private JButton btnBorrar;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btn;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton button20;
    private JLabel btnSuma;
    private JLabel btnLimpiar;

    public InterfazCalculadora() {
        btnSuma.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JOptionPane.showMessageDialog(null,"Suma");
            }
        });
        btnLimpiar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JOptionPane.showMessageDialog(null,"Limpieza");
            }
        });
    }
    public static void main(String[] args){
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new InterfazCalculadora().pnlPrincipal);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
