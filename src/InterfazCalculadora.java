import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InterfazCalculadora {
    private JPanel pnlPrincipal;
    private JButton modoClaroButton;
    private JButton btnBorrar;
    private JButton ACButton;
    private JButton button3;
    private JButton button4;
    private JButton a9Button;
    private JButton xButton;
    private JButton a4Button;
    private JButton a2Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton button13;
    private JButton a1Button;
    private JButton a3Button;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton a0Button;
    private JButton a7Button;
    private JButton a8Button;
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

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
