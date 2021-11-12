package br.com.Dio.Desafio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import  java.util.Set;

public class UniBh {

    private String nome;
    private Set<Conteudo> conteudoIncricao = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();

    public void Inscreverbootcamp(Una una) {

        this.conteudoIncricao.addAll(una.getConteudos()); /* Adicionando o conteudos*/
        una.getUniInscritos().add(this); /* Adicionando as inscrção na uni */

    }
    public void  programacao(){
        Optional<Conteudo> conteudo = this.conteudoIncricao.stream().findFirst();

        if (conteudo.isPresent()){ /*informando se está matriculado no curso caso contrario vai ser falso */
            this.conteudoConcluidos.add(conteudo.get());
            this.conteudoIncricao.remove(conteudo.get());
        }else{
            System.out.println("Você não esta matriculado !");
        }
    }
    public double Calcularxd (){
        return this.conteudoConcluidos.stream().mapToDouble(Conteudo::calcular).sum();/*Calcular os conteudos*/

    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public Set<Conteudo> getContendoIncricao() {

        return conteudoIncricao;
    }

    public void setContendoIncricao(Set<Conteudo> contendoIncricao) {

        this.conteudoIncricao = contendoIncricao;
    }

    public Set<Conteudo> getContendoConcluidos() {

        return conteudoConcluidos;
    }

    public void setContendoConcluidos(Set<Conteudo> contendoConcluidos) {
        this.conteudoConcluidos = contendoConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UniBh uniBh = (UniBh) o;
        return Objects.equals(nome, uniBh.nome) && Objects.equals(conteudoIncricao, uniBh.conteudoIncricao) && Objects.equals(conteudoConcluidos, uniBh.conteudoConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoIncricao, conteudoConcluidos);
    }
}
