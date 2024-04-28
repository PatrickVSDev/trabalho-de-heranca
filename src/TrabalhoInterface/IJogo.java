package TrabalhoInterface;

public interface IJogo {
    public boolean verificarNumero(int numeroRandom, int numeroDigitado);
    public boolean verificarValido(int numeroDigitado);
    public boolean verificarTerminou(int flag);
}

