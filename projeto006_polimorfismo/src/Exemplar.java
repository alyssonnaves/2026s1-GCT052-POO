public class Exemplar implements Emprestavel{
    private String titulo;
    private boolean emprestado;

    public Exemplar(String titulo){
        this.titulo = titulo;
        this.emprestado = false;
    }

    public String getTitulo(){
        return titulo;
    }

    @Override
    public void devolver(){
        if (emprestado){
            emprestado = false;
            System.out.println("Exemplar devolvido " + titulo);
        }else{
            System.out.println("Exemplar disponivel " + titulo);
        }
    }

    @Override
    public void emprestar(){
        if (!emprestado){
            emprestado = true;
            System.out.println("Exemplar emprestado " + titulo);
        }else{
            System.out.println("Exemplar indisponivel " + titulo);
        }
    }

    @Override
    public boolean estaEmprestado(){
        return emprestado;
    }
}
