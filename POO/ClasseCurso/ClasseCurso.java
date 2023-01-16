package POO.ClasseCurso;

public class ClasseCurso {
    protected String curso, instituicao, pesoNota;
    protected int alunos, cargaHoraria;

    public ClasseCurso(String curso, String instituicao, String pesoNota, int alunos, int cargaHoraria) {
        this.curso = curso;
        this.instituicao = instituicao;
        this.pesoNota = pesoNota;
        this.alunos = alunos;
        this.cargaHoraria = cargaHoraria;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getPesoNota() {
        return pesoNota;
    }

    public void setPesoNota(String pesoNota) {
        this.pesoNota = pesoNota;
    }

    public int getAlunos() {
        return alunos;
    }

    public void setAlunos(int alunos) {
        this.alunos = alunos;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    protected void visualizar(){
        System.out.println("Curso: "+curso+
                "\nInstituicao: "+instituicao+
                "\nPeso na nota final das matérias: "+pesoNota+
                "\nAlunos: "+alunos+
                "\nCarga horária: "+cargaHoraria
        );
    }
}
