package TrabalhoInterface;

public class PrimeiroJogo implements IJogo {
    private int numeroRandom;
    private int numeroDigitado;

    public PrimeiroJogo(int numeroRandom, int numeroDigitado) {
        this.numeroRandom = numeroRandom;
        this.numeroDigitado = numeroDigitado;
    }

    public PrimeiroJogo() {
    }

    @Override
    public boolean verificarNumero(int numeroRandom, int numeroDigitado) {
        if (numeroDigitado == numeroRandom){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean verificarValido(int numeroDigitado) {
        if (numeroDigitado < 0 || numeroDigitado > 10) {
            return false;
        }else{
            return true;
        }
    }

    @Override
    public boolean verificarTerminou(int flag) {
        if (flag == 4){
            return false;
        }
        return true;
    }
}
