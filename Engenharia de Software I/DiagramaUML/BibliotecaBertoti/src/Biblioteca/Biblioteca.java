package Biblioteca;
import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
        private List<Livro> livros;
        private List<Leitor> leitores;

        public Biblioteca() {
            livros = new ArrayList<>();
            leitores = new ArrayList<>();
        }

        // Getters e Setters
        public List<Livro> getLivros() {
            return livros;
        }

        public void setLivros(List<Livro> livros) {
            this.livros = livros;
        }

        public List<Leitor> getUsuarios() {
            return leitores;
        }

        public void setUsuarios(List<Leitor> usuarios) {
            this.leitores = usuarios;
        }

        public void adicionarLivro(Livro livro) {
            livros.add(livro);
        }

        public void removerLivro(Livro livro) {
            livros.remove(livro);
        }

        public void adicionarUsuario(Leitor leitor) {
            leitores.add(leitor);
        }

        public void removerUsuario(Leitor leitor) {
            leitores.remove(leitor);
        }
    }

