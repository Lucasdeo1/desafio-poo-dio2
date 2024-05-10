package br.com.dio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Escola {
    private static final Set<Conteudo> conteudos = null;
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(365);
    private Set<Aluno> alunosInscritos = new HashSet<>();
    private Set<Conteudo> conteudo = new LinkedHashSet<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Aluno> getAlunosInscritos() {
        return alunosInscritos;
    }

    public void setAlunosInscritos(Set<Aluno> alunosInscritos) {
        this.alunosInscritos = alunosInscritos;
    }

    public Set<Conteudo> getConteudo() {
        return conteudo;
    }

    public void setConteudo(Set<Conteudo> conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Escola escola = (Escola) o;
        return Objects.equals(nome, escola.nome) && Objects.equals(descricao, escola.descricao) && Objects.equals(dataInicial, escola.dataInicial) && Objects.equals(dataFinal, escola.dataFinal) && Objects.equals(alunosInscritos, escola.alunosInscritos) && Objects.equals(conteudo, escola.conteudo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, alunosInscritos, conteudos);
    }
}