public class LivroTeste {

    public static void main(String[] args) {

        Livro meuLivro = new Livro("A arte da guerra", 9.99);
        //meuLivro.nome = "O Hobbit";

        meuLivro.paginas = 521;
        meuLivro.resumo = "bla bla bla bla bla";
        meuLivro.autor = "J. R. Tolkien";

        Editora editora1 = new Editora();
        //editora1.nome = "S";
        editora1.email = "s@gmail.com";
        meuLivro.editora = editora1;
        meuLivro.aplicarDesconto(0.1);

        meuLivro.exibirDados();

        Livro livroFavorito = new Livro("É", 9.99);
        livroFavorito.nome = "O Código Da Vinci";
        livroFavorito.resumo = "bla bla bla bla bla";
        livroFavorito.paginas = 500;

        livroFavorito.autor = "Dan Brown";

        livroFavorito.aplicarDesconto(0.25);

        livroFavorito.exibirDados();

    }

}
