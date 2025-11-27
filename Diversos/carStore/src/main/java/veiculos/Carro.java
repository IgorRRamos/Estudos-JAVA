package veiculos;

public class Carro {
    String marcModel, cor, numRegistro;

    public Carro(String marcModel, String cor, String numRegistro) {
        this.marcModel = marcModel;
        this.cor = cor;
        this.numRegistro = numRegistro;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marcModel='" + marcModel + '\'' +
                ", cor='" + cor + '\'' +
                ", Numero de registro='" + numRegistro + '\'' +
                '}';
    }

    public String getMarcModel() {
        return marcModel;
    }

    public void setMarcModel(String marcModel) {
        this.marcModel = marcModel;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String ano) {
        this.cor = ano;
    }

    public String getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(String cor) {
        this.numRegistro = cor;
    }
}
