import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setDate(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlexandre = new Dev();
        devAlexandre.setNome("Alexandre");
        devAlexandre.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Alexandre" + devAlexandre.getConteudosInscritos());
        devAlexandre.progredir();
        devAlexandre.progredir();
        System.out.println("Conteúdos Inscritos Alexandre" + devAlexandre.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Alexandre" + devAlexandre.getConteudosConcluidos());
        System.out.println("XP:" + devAlexandre.calcularXp());

        System.out.println("-------------------------------------------------------------------------------------");


        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Matheus" + devMatheus.getConteudosInscritos());
        devMatheus.progredir();
        devMatheus.progredir();
        devMatheus.progredir();
        System.out.println("Conteúdos Inscritos Matheus" + devMatheus.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Matheus" + devMatheus.getConteudosConcluidos());
        System.out.println("XP:" + devMatheus.calcularXp());

    }

}
