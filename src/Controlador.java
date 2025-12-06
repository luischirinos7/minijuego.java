import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;

        this.vista.asignarEventos(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int numeroUsuario = vista.getNumero();
            int resultado = modelo.verificarIntento(numeroUsuario);

            if (resultado == 0) {
                vista.actualizarResultado("¡CORRECTO! 🎉", Color.GREEN);
                vista.mostrarMensajeEmergente("¡Ganaste en " + modelo.getIntentos() + " intentos!");
                System.exit(0);
            } else if (resultado == -1) {
                vista.actualizarResultado("Demasiado BAJO \u2191", Color.RED);
            } else {
                vista.actualizarResultado("Demasiado ALTO \u2193", Color.RED);
            }

            vista.limpiarCajaTexto();

        } catch (NumberFormatException ex) {
            vista.mostrarMensajeEmergente("¡Eso no es un número válido!");
        }
    }
}