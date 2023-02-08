public class AtaqueImpl implements Ataque{

    private String nomAtaque;
    private int dano;



    public String getNomAtaque() {
        return nomAtaque;
    }


    public int getDano() {
        return dano;
    }

    public AtaqueImpl(String nomAtaque, int dano) {
        this.nomAtaque = nomAtaque;
        this.dano = dano;
    }

    public String toString() {
        return nomAtaque + ", " + getDano();
    }
}
