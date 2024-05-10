

import br.com.dio.dominio.Aluno;
import br.com.dio.dominio.Escola;
import br.com.dio.dominio.Professor;

public class App {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setTitulo("Professor Ingles");
        professor.setDescricao("descrição Professor de ingles");
        professor.setCargaHoraria(8);

        Professor Professor2 = new Professor();
        Professor2.setTitulo("Professor Portugues");
        Professor2.setDescricao("descrição Professor Portugues");
        Professor2.setCargaHoraria(4);



        Escola escola = new Escola();
        escola.setNome("Escola Estadual do estado");
        escola.setDescricao("Descrição Escola Estadual");
        escola.getConteudo().add(professor);
        escola.getConteudo().add(Professor2);
       

        Aluno alunoLucas = new Aluno();
        alunoLucas.setNome("Lucas");
        alunoLucas.inscreverEscola(escola);
        System.out.println("Conteúdos Inscritos Camila:" + alunoLucas.getConteudosInscritos());
        alunoLucas.progredir();
        alunoLucas.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + alunoLucas.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + alunoLucas.getConteudosConcluidos());
        System.out.println("XP:" + alunoLucas.calcularTotalXp());

        System.out.println("-------");

        Aluno alunoHenrique = new Aluno();
        alunoHenrique.setNome("Henrique");
        alunoHenrique.inscreverEscola(escola);
        System.out.println("Conteúdos Inscritos João:" + alunoHenrique.getConteudosInscritos());
        alunoHenrique.progredir();
        alunoHenrique.progredir();
        alunoHenrique.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Henrique:" + alunoHenrique.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Henrique:" + alunoHenrique.getConteudosConcluidos());
        System.out.println("XP:" + alunoHenrique.calcularTotalXp());

    }
}
