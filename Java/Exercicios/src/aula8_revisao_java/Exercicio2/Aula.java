package aula8_revisao_java.Exercicio2;

class Aula {
    private Materia materia;
    private String horarioInicio;
    private String horarioTermino;

    public Aula(Materia materia, String horarioInicio, String horarioTermino) {
        this.materia = materia;
        this.horarioInicio = horarioInicio;
        this.horarioTermino = horarioTermino;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getHorarioTermino() {
        return horarioTermino;
    }

    public void setHorarioTermino(String horarioTermino) {
        this.horarioTermino = horarioTermino;
    }
}
