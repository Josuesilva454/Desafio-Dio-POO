package br.com.Dio.Desafio;

import java.time.LocalDate;
import java.util.Objects;

public class Mentoria extends Conteudo {
   private String Titulo;
    private String Descricao;
    private LocalDate Data;
    @Override
    public double calcular() {
        return xd_Padrao + 20;
    }

     public Mentoria(){

     }


    public LocalDate getData() {
        return Data;
    }

    public void setData(LocalDate Data) {
         this.Data = Data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "Titulo='" + getTitulo() + '\'' +
                ", Descricao='" + getDescricao() + '\'' +
                ", Data=" + Data +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mentoria mentoria = (Mentoria) o;
        return Objects.equals(Titulo, mentoria.Titulo) && Objects.equals(Descricao, mentoria.Descricao) && Objects.equals(Data, mentoria.Data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Titulo, Descricao, Data);
    }
}

