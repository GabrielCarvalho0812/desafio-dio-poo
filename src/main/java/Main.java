import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main  {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Fundamentos Basicos de Java");
        curso1.setCargaHoraria(50);

        Curso curso2 = new Curso();
        curso2.setTitulo("Html");
        curso2.setDescricao("Curso Basico de Html");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}