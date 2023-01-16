package POO.Ingresso;

public class Ingresso {
    protected String banda, local, horario, date, premium;

    public Ingresso(String banda, String local, String horario, String date, String premium) {
        this.banda = banda;
        this.local = local;
        this.horario = horario;
        this.date = date;
        this.premium = premium;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    protected void visualizar(){
        System.out.println("Banda: "+banda+
                "\nLocal: "+local+
                "\nHorário: "+horario+
                "\ndate: "+date+
                "\nPremium  : "+premium
        );
    }
}
