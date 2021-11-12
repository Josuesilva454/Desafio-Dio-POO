package br.com.Dio.Desafio;

import java.time.LocalDate;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Objects;
import  java.util.HashSet;

public class Una {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(30);
    private Set<UniBh> UniInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();


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

    public Set<UniBh> getUniInscritos() {
        return UniInscritos;
    }

    public void setUniInscritos(Set<UniBh> uniInscritos) {
        UniInscritos = uniInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }


}

