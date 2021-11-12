package br.com.Dio.Desafio;

public  abstract class   Conteudo {

    protected static final double xd_Padrao = 10d;

    private String titulo;
    private String descricao;
    private int nota;
/* o que abstract  e uma classe abstrata é desenvolvida para representar entidades e conceitos abstratos, sendo utilizada como uma classe pai, pois não pode ser instanciada. ... Uma classe abstrata normalmente possui métodos abstratos.*/
    public abstract  double calcular ();

    public String getDescricao() {
        return
                descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;

    }
}

