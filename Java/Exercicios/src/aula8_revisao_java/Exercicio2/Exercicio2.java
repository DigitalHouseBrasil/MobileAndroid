package aula8_revisao_java.Exercicio2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Exercicio2 {
    public static void main(String[] args) {

        Set<Aula> aulas = new HashSet<>();
        aulas.add(new Aula(new Materia("Xml e layout"), "19:00", "22:30"));
        aulas.add(new Aula(new Materia("Activity e life cycle"), "19:00", "22:30"));
        aulas.add(new Aula(new Materia("Fragments"), "19:00", "22:30"));

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Jessica", "Tomei", "123456"));
        alunos.add(new Aluno("Guilherme", "UX/Android", "654321"));
        alunos.add(new Aluno("Tadashi", "Sam", "987564"));

        Professor professor = new Professor();
        professor.setNome("Tairo");
        professor.setRd("123456789");

        Curso curso = new Curso();
        curso.setProfessor(professor);
        curso.setNome("Mobile Android");
        curso.setAlunos(alunos);
        curso.setAulas(aulas);

        Turma turma = new Turma();
        turma.setNome("Mobile 2019/S1 Noturno");
        turma.setCurso(curso);

        turma.getCurso().getProfessor().fazerChamada();
        turma.getCurso().getProfessor().darAula();
        for (Aluno aluno : turma.getCurso().getAlunos()) {
            aluno.assistirAula(curso.getAulas());
        }
    }
}
