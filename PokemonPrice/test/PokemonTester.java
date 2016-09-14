/*
 
    Kasarla Lokeshwar Reddy
    lkasarla@kent.edu
    Application Assignment For Information Services
    Kent State Uuniversity
    Date: 09/14/2016
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lokeshwar
 */
public class PokemonTester {
    PokemonCart cart;
    
    public PokemonTester() {
        cart = new PokemonCart();
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void noPokemon(){
        assertEquals(0, cart.cart(0,0,0), 0);
    }
    @Test
    public void onePikachu(){
        assertEquals(6.0, cart.cart(1,0,0), 0.0);
    }
    @Test
    public void twoPikachu(){
        assertEquals(12.0, cart.cart(2,0,0), 0.0);
    }
    @Test
    public void onePikachuOneSquirtle(){
        assertEquals(9.9, cart.cart(1,1,0), 0.0);
    }
    
    @Test
    public void oneEach(){
        assertEquals(12.8, cart.cart(1,1,1), 0.0);
    }
    
    @Test
    public void twoPikachuTwoSquirtle(){
        assertEquals(19.8, cart.cart(2,2,0), 0.0);
    }
    
    
    @Test
    public void twoPikachuoneSquirtle(){
        assertEquals(15.9, cart.cart(2,1,0), 0.0);
    }
    
    
    @Test
    public void twoPikachuOneSquirtleOneCharmander(){
        assertEquals(18.8, cart.cart(2,1,1), 0.0);
    }
    
    
    @Test
    public void oneSquirtleOneCharmander(){
        assertEquals(9.0, cart.cart(0,1,1), 0.0);
    }
    
    
    
}
