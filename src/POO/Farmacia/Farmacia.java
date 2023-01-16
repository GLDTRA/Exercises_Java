package POO.Farmacia;

public class Farmacia {
    protected String remedio, quantidade, cnpj, cosmetico, funcionario;

    protected Farmacia(String remedio, String quantidade, String cnpj, String cosmetico, String funcionario) {
        this.remedio = remedio;
        this.quantidade = quantidade;
        this.cnpj = cnpj;
        this.cosmetico = cosmetico;
        this.funcionario = funcionario;
    }

    protected String getRemedio() {
        return remedio;
    }

    protected void setRemedio(String remedio) {
        this.remedio = remedio;
    }

    protected String getQuantidade() {
        return quantidade;
    }

    protected void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    protected String getCnpj() {
        return cnpj;
    }

    protected void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    protected String getCosmetico() {
        return cosmetico;
    }

    protected void setCosmetico(String cosmetico) {
        this.cosmetico = cosmetico;
    }

    protected String getFuncionario() {
        return funcionario;
    }

    protected void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }
    protected void visualizar(){
        System.out.printf("Remédio: "+remedio+
                "\nQuantidae: "+quantidade+
                "\nCNPJ: "+cnpj+
                "\nCosmético: "+cosmetico+
                "\nFuncionario  : "+funcionario
        );
    }
}
