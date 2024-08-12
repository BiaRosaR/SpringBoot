package school.sptech.primeiraaula;

public class Filme {

    private  String titulo;

    private Diretor diretor;

    public Filme(String titulo, Diretor diretor) {
        this.titulo = titulo;
        this.diretor = diretor;
    }

    public String getTitulo() {
        return titulo;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public String getPastel(){
        return "%s: Especial de carne".formatted("pastel");
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }
}
