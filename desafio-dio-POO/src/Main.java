import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso java");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso1.setTitulo("Curso Python");
        curso1.setDescricao("Descrição do curso Python");
        curso1.setCargaHoraria(24);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição da Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devHenrique = new Dev();
        devHenrique.setNome("Henrique");
        devHenrique.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Henrique:" + devHenrique.getConteudosInscritos());
        devHenrique.progredir();
        devHenrique.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Henrique:" + devHenrique.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Henrique:" + devHenrique.getConteudosConcluidos());
        System.out.println("XP:" + devHenrique.calcularTotalXp());
    }
}