package TrabalhoInterface;

public class SegundoJogo implements IJogo {
    private int numeroRandom;
    private int numeroDigitado;

    public SegundoJogo(int numeroRandom, int numeroDigitado) {
        this.numeroRandom = numeroRandom;
        this.numeroDigitado = numeroDigitado;
    }

    public SegundoJogo() {
    }

    @Override
    public boolean verificarNumero(int numeroRandom, int numeroDigitado) {
        if ((numeroDigitado + numeroRandom) % 2 == 0){
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
