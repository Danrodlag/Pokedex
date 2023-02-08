import java.util.HashMap;

public class PokedexImpl implements Pokedex{

    private Pokemon pokemon;
    private HashMap<String , String> debilidad;
    private Ataque ataque;


    public Pokemon getPokemon() {
        return pokemon;
    }

    public HashMap<String, String> getDebilidad() {
        return debilidad;
    }

    public Ataque getAtaque() {
        return ataque;
    }

    public Pokemon comparador(Pokemon p1, Pokemon p2) {
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}
