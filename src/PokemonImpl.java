public class PokemonImpl implements Pokemon {
    private int numPok;
    private String nomPok;
    private String desc;
    private Float altura;
    private Float peso;
    private enum genero {Masc, Fem};
    private String tipo;

    public int getNumPok() {
        return numPok;
    }

    public String getNomPok() {
        return nomPok;
    }

    public String getDesc() {
        return desc;
    }

    public Float getAltura() {
        return altura;
    }

    public Float getPeso() {
        return peso;
    }

    public String getTipo() {
        return tipo;
    }


    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

}

