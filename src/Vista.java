import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Vista extends JFrame {
    private JTextField cajaTexto;
    private JButton botonProbar;
    private JLabel etiquetaResultado;
    private JLabel etiquetaInstruccion;

    public Vista() {
        setTitle("Adivina el numero");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        etiquetaInstruccion = new JLabel("He pensado un número del 1 al 100:");
        etiquetaInstruccion.setBounds(50, 30, 300, 20);
        add(etiquetaInstruccion);

        cajaTexto = new JTextField();
        cajaTexto.setBounds(150, 70, 100, 30);
        add(cajaTexto);

        botonProbar = new JButton("¡Probar suerte!");
        botonProbar.setBounds(120, 120, 160, 40);
        add(botonProbar);

        etiquetaResultado = new JLabel("¿Podrás adivinarlo?", SwingConstants.CENTER);
        etiquetaResultado.setBounds(20, 180, 350, 30);
        etiquetaResultado.setFont(new Font("Arial", Font.BOLD, 14));
        etiquetaResultado.setForeground(Color.BLUE);
        add(etiquetaResultado);

        setVisible(true);
    }

    public int getNumero() throws NumberFormatException {
        return Integer.parseInt(cajaTexto.getText());
    }

    public void actualizarResultado(String mensaje, Color color) {
        etiquetaResultado.setText(mensaje);
        etiquetaResultado.setForeground(color);
    }

    public void mostrarMensajeEmergente(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    public void limpiarCajaTexto() {
        cajaTexto.setText("");
        cajaTexto.requestFocus(); // Devuelve el foco para seguir escribiendo rápido
    }

    public void asignarEventos(ActionListener listener) {
        botonProbar.addActionListener(listener);
        cajaTexto.addActionListener(listener);
    }
}