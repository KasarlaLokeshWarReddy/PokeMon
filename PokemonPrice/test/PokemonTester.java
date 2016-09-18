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
    public void threePikachuThreeSquirtle(){
        // Setting delta value to retain imprecision of Double data type
        assertEquals(29.7, cart.cart(3,3,0), 0.0000000000001);
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
    
    @Test
    public void noPurchase(){
        assertEquals(0, cart.cart(0,0,0), 0.0);
    }
    
    @Test
    public void negativePurchase(){
        assertEquals(0, cart.cart(-1,-1,-1), 0.0);
    }
    
    @Test
    public void negativePikachuOneSquirtle(){
        assertEquals(5.0, cart.cart(-1,1,0), 0.0);
    }
    
    @Test
    public void onePikachuNegativeSquirtleOneCharmander(){
        assertEquals(9.9, cart.cart(1,-1,1), 0.0);
    }
    
    
}
