import java.util.Random;

public class Modelo {
    private int numeroSecreto;
    private int intentos;

    public Modelo() {
        // Genera el número secreto al nacer
        Random random = new Random();
        this.numeroSecreto = random.nextInt(100) + 1;
        this.intentos = 0;
    }

    public int verificarIntento(int numeroUsuario) {
        intentos++;
        if (numeroUsuario == numeroSecreto) {
            return 0; // 0 significa Éxito
        } else if (numeroUsuario < numeroSecreto) {
            return -1; // -1 significa que el número es bajo
        } else {
            return 1; // 1 significa que el número es alto
        }
    }

    public int getIntentos() {
        return intentos;
    }

    public int getNumeroSecreto() {
        return numeroSecreto;
    }
}