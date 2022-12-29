import desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso da linguagem Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Curso da linguagem JavaScript");
        curso2.setCargaHoraria(4);

        //Conteudos conteudo = new Curso();
        //Conteudos conteudo2 = new Mentoria();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("mentoria de Java com o expert");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp sobre Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLigia = new Dev();
        devLigia.setNome("Ligia");
        devLigia.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devLigia.getconteudosInscritos());
        devLigia.progredir();
        devLigia.progredir();
        System.out.println("-");
        System.out.println();
        System.out.println("Conteudos Inscritos: " + devLigia.getconteudosInscritos());
        System.out.println("Conteudos concluidos: " + devLigia.getConteudosConcluidos());
        System.out.println("XP: " + devLigia.calcularTotalXp());

        System.out.println("-----------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devJoao.getconteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos: " + devJoao.getconteudosInscritos());
        System.out.println("Conteudos concluidos: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}