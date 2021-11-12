package br.com.Dio.Desafio;

public class Curso extends  Conteudo {
    private  String titulo;
    private String descricao;
    private int cargahorario;

    @Override
    public double calcular() {
        return xd_Padrao * cargahorario;
    }

        public Curso (){

    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargahorario() {
        return cargahorario;
    }

    public void setCargahorario(int cargahorario) {
        this.cargahorario = cargahorario;
    }

    @Override
    public String toString() {
        return  "Curso {" +
                "Titulo='" + getTitulo() + '\'' +
                ", Descricao='" + getDescricao() + '\'' +
                ", Data=" + cargahorario +
                '}';
    }

}




