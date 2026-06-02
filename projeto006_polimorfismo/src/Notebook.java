public class Notebook implements Emprestavel{
    private String marca;
    private boolean emprestado;

    public Notebook(String marca){
        this.marca = marca;
        this.emprestado = false;
    }

    public String getMarca(){
        return marca;
    }

    @Override
    public void devolver(){
        if (emprestado){
            emprestado = false;
            System.out.println("Notebook devolvido " + marca);
        }else{
            System.out.println("Notebook disponivel " + marca);
        }
    }

    @Override
    public void emprestar(){
        if (!emprestado){
            emprestado = true;
            System.out.println("Notebook emprestado " + marca);
        }else{
            System.out.println("Notebook indisponivel " + marca);
        }
    }

    @Override
    public boolean estaEmprestado(){
        return emprestado;
    }
}
