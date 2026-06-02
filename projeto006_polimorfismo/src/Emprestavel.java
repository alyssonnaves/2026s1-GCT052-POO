public interface Emprestavel {
    void emprestar();
    void devolver();
    abstract boolean estaEmprestado();
    // por padrao todos os metodos em uma interface sao abstratos
}
