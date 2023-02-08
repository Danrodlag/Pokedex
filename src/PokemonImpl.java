public class PokemonImpl implements Pokemon {
    private int numPok;
    private String nomPok;
    private String desc;
    private Float altura;
    private Float peso;
    private  enum genero;
    private String tipo;

    public String getGenero(){
        return genero;
    }
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


    public String toString() {
        return "Nº " + getNumPok() + "- " + getNomPok() + " - " + getDesc()
                + "\n\nAltura: " + getAltura() + "\nPeso: " + getPeso()
                + "\nSexo: " + getGenero();
    }

    public PokemonImpl(int numPok, String nomPok, String desc, Float altura, Float peso, String tipo) {
        this.numPok = numPok;
        this.nomPok = nomPok;
        this.desc = desc;
        this.altura = altura;
        this.peso = peso;
        this.tipo = tipo;
    }

}

