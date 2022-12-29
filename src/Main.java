import desafio.dominio.Conteudos;
import desafio.dominio.Curso;
import desafio.dominio.Mentoria;

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

        System.out.println(curso1);
        System.out.println(curso2);

        //Conteudos conteudo = new Curso();
        //Conteudos conteudo2 = new Mentoria();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("mentoria de Java com o expert");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);

    }
}