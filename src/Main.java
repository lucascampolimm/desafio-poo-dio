import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Desenvolvedora: Camila");
        System.out.println("Conteúdos Inscritos: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Após progresso: ");
        System.out.println("Conteúdos Inscritos: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devCamila.getConteudosConcluidos());
        System.out.println("XP Total: " + devCamila.calcularTotalXp());

        System.out.println("\n-------\n");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Desenvolvedor: João");
        System.out.println("Conteúdos Inscritos: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Após progresso: ");
        System.out.println("Conteúdos Inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("XP Total: " + devJoao.calcularTotalXp());

        Set<Dev> desenvolvedores = new HashSet<>();
        desenvolvedores.add(devCamila);
        desenvolvedores.add(devJoao);

        int totalDesenvolvedores = Dev.calcularTotalDesenvolvedores(desenvolvedores);
        int totalConteudosInscritos = Dev.calcularTotalConteudosInscritos(desenvolvedores);
        int totalConteudosConcluidos = Dev.calcularTotalConteudosConcluidos(desenvolvedores);
        double xpTotalBootcamp = Dev.calcularXPTotalBootcamp(desenvolvedores);

        System.out.println("\n------- Resumo do Bootcamp -------");
        System.out.println("Total de Desenvolvedores: " + totalDesenvolvedores);
        System.out.println("Total de Conteúdos Inscritos: " + totalConteudosInscritos);
        System.out.println("Total de Conteúdos Concluídos: " + totalConteudosConcluidos);
        System.out.println("XP Total do Bootcamp: " + xpTotalBootcamp);
        System.out.println("----------------------------------");
    }
}
