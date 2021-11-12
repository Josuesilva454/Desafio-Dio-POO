package br.com.Dio.Desafio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* Acionando os cruso e carga do horário xp */

        Curso curso1 = new Curso();
        curso1.setTitulo("curso: Analise e Desenvolvimento de Sistema\n");
        curso1.setDescricao(" s é uma área responsável por analisar, desenvolver, analisar, projetar, implementar e atualizar sistemas de informação.\n");
        curso1.setCargahorario(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("curso js\n");
        curso2.setDescricao("descrição curso js \n");
        curso2.setCargahorario(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java\n");
        mentoria.setDescricao("Desenvolvendo Aplication java\n");
        mentoria.setData(LocalDate.now());

        Una una1 = new Una();
        una1.setNome("Tecnologia da Informação\n");
        una1.setDescricao("Tecnologo\n");
        una1.getConteudos().add(curso1);
        una1.getConteudos().add(curso2);
        una1.getConteudos().add(mentoria);
        System.out.println("Cursos: "+ una1.getNome());
        System.out.println("Forma os alunos: "+ una1.getDescricao());





        UniBh dev1 = new UniBh();
        dev1.setNome("Camila");
        dev1. Inscreverbootcamp(una1);
        System.out.println("Conteúdos Inscritos Camila:" + dev1.getContendoIncricao());/* pega o conteudo inscritos e faça o retorno*/
        dev1.programacao();
        dev1.programacao();

        System.out.println("---------------------------------------");
        System.out.println("Conteúdos Inscritos Camila:" + dev1.getContendoIncricao()); /* Adicioonando os curso inscritos*/
        System.out.println("Conteúdos Concluídos Camila:" + dev1.getContendoConcluidos());/* Adicionando os curso concluitdos */
        System.out.println("XP:" + dev1.Calcularxd());

        System.out.println("----------------------------------------------");

        UniBh devJoao = new UniBh();
        devJoao.setNome("Joao");
        devJoao.Inscreverbootcamp(una1);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getContendoIncricao());/* pega o conteudo inscritos e faça o retorno*/
        devJoao.programacao();
        devJoao.programacao();


        System.out.println("------------------------------------------");

        System.out.println("Conteúdos Inscritos João:" + devJoao.getContendoIncricao());/* Adicioonando os curso inscritos*/
        System.out.println("Conteúdos Concluidos João:" + devJoao.getContendoIncricao()); /* Adicionando os curso concluitdos */
        System.out.println("XP:" + devJoao.Calcularxd());





            }
        }



