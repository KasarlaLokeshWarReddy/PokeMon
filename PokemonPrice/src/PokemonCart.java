/*
 
    Kasarla Lokeshwar Reddy
    lkasarla@kent.edu
    Application Assignment For Information Services
    Kent State Uuniversity
    Date: 09/14/2016
 */


public class PokemonCart {
  

    // Declaring Prices as final
    public static final int PIKACHU = 6;
    public static final int SQUIRTLE = 5;
    public static final int CHARMANDAR = 5;
    
    //Initializing Cost of purchased product to zero
    public double bill=0;
    
    //Function to calculate bill value
    double cart(int pika, int squi, int charm){
       
        // initializing sold array with sold pokemons
        int [] sold = new int[]{pika,squi,charm};
        
        //Calculating the max sold pokemon
        int maxSold = Math.max(Math.max(pika,squi),charm);
        
        // if maxSold lessthan zero making it zero, to make it possible to create an array with index maxSold
        if(maxSold<0)
        {
            maxSold =0;
        }
        
        //Creating an 2D array with 3 rows for three pokemon and max sold coloumns
        boolean[][] setMatrix = new boolean [3][maxSold];
        
        //Looping to store true in rows where the pokemons are sold and
        // setting sold items to true
        for (int row = 0;row<3;row++)
            for( int col = 0; col<sold[row];col++) 
                setMatrix[row][col] = true;
        
        //initialing the temp bill calculator to calculate price in batches of discount
        double setBill;
        
        for( int col = 0; col<maxSold;col++) {
            setBill =0.0;
            for (int row = 0;row<3;row++){
                // adding value of pokemon to setBill where pokemon in boolean array is true
                if(setMatrix[row][col]){
                    switch (row) {
                        case 0:
                            setBill+=PIKACHU;
                            break;
                        case 1:
                            setBill+=SQUIRTLE;
                            break;
                        default:
                            setBill+=CHARMANDAR;
                            break;
                                }
                    }
                }
            if(setBill == (PIKACHU+SQUIRTLE+CHARMANDAR))
                setBill = setBill-(setBill*0.2);
            else if( (setBill == (PIKACHU+SQUIRTLE)) || (setBill == (PIKACHU+SQUIRTLE))||(setBill ==(SQUIRTLE+CHARMANDAR)))
                setBill = setBill-(setBill*0.1);
            bill+=setBill;
            }
            return bill;
        }


}
