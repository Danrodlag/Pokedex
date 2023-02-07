import java.util.HashMap;

public interface Pokedex {
    Pokemon getPokemon();
    HashMap<String,String> getDebilidad();
    Ataque getAtaque();
    Pokemon comparador(Pokemon p1, Pokemon p2);

}
