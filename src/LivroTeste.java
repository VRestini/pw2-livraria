public class LivroTeste {

    public static void main(String[] args) {

        Livro meuLivro = new Livro("A arte da guerra", 9.99);
        //meuLivro.nome = "O Hobbit";

        meuLivro.setPaginas(521);
        meuLivro.setResumo("Bla bla bla");
        meuLivro.setAutor("J. R. Tolkien");

        Editora editora1 = new Editora();
        //editora1.nome = "S";
        editora1.setEmail("curitia@gmail.com");
        meuLivro.setEditora(editora1);
        meuLivro.aplicarDesconto(0.3);

        meuLivro.exibirDados();

        LivroDigital livroFavorito = new LivroDigital("É", 9.99);
        livroFavorito.setNome("O Código Da Vinci");
        livroFavorito.setResumo("Bla bla");
        livroFavorito.setPaginas(500);
        livroFavorito.setTipoCapa(TipoCapa.DURA);
        livroFavorito.setAutor("Dan Brown");
        livroFavorito.setMarcaDagua("Saaaa");
        livroFavorito.aplicarDesconto(0.25);

        livroFavorito.exibirDados();

    }

}
