package main.model;

import java.time.LocalDate;
import java.util.Objects;

public class Jogo extends ModeloBase {

    private String nome;
    private String genero;
    private String plataforma;
    private float preco;
    private String descricao;
    private LocalDate dataLancamento;
    private int estoque;

    public Jogo(int id, String nome, String genero, String plataforma, float preco, String descricao, LocalDate dataLancamento, int estoque) {
        super(id);
        this.nome = nome;
        this.genero = genero;
        this.plataforma = plataforma;
        this.preco = preco;
        this.descricao = descricao;
        this.dataLancamento = dataLancamento;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do Jogo:");
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Preço: " + preco);
        System.out.println("Descrição: " + descricao);
        System.out.println("Data de Lançamento: " + dataLancamento);
        System.out.println("Estoque: " + estoque);
    }

    // Métodos CRUD (exemplo - os outros você pode implementar de forma similar)
    public void cadastrarJogo() {
        // Lógica para cadastrar o jogo (pode envolver salvar em um banco de dados, arquivo, etc.)
        System.out.println("Jogo " + nome + " cadastrado.");
    }

    public void alterarJogo() {
        // Lógica para alterar o jogo
        System.out.println("Jogo " + nome + " alterado.");
    }

    public void deletarJogo() {
        // Lógica para deletar o jogo
        System.out.println("Jogo " + nome + " deletado.");
    }

    public void listarJogos() {
        // Lógica para listar todos os jogos
        System.out.println("Listando todos os jogos.");
    }

    public Jogo buscarJogoPorNome(String nome) {
        // Lógica para buscar um jogo pelo nome
        System.out.println("Buscando jogo por nome: " + nome);
        return null; // Retorna null se não encontrar, ou o objeto Jogo se encontrar
    }

    //Equals e HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jogo jogo = (Jogo) o;
        return Float.compare(jogo.preco, preco) == 0 && estoque == jogo.estoque && Objects.equals(nome, jogo.nome) && Objects.equals(genero, jogo.genero) && Objects.equals(plataforma, jogo.plataforma) && Objects.equals(descricao, jogo.descricao) && Objects.equals(dataLancamento, jogo.dataLancamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, plataforma, preco, descricao, dataLancamento, estoque);
    }
}