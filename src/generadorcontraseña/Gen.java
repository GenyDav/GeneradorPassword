package generadorcontraseña;

import java.util.Random;

/**
 * Clase encargada de crear una contraseña nueva según las especificaciones del
 * usuario. Estas pueden ser creadas con una longitud de entre 4 y 50 caracteres.
 * Los caracteres aceptados son letras mayúsculas y minúsculas, dígitos del 0 al
 * 9 y los símbolos !, #, $, %, &, ?, *, ^, @, +.
 * @author Geny
 * @version 1.0
 */
public class Gen {
    private final String MAYUSCULAS;    // String que contiene caracteres de letras mayúsculas
    private final String MINUSCULAS;    // String que contiene caracteres de letras minúsculas
    private final String NUMEROS;       // String que contiene caracteres de números
    private final String SIMBOLOS;      // String que contiene caracteres de los símbolos
    private String universoCaracteres;  // Conjunto de todos los caracteres que pueden ser tomados en cuenta para crear la contraseña
    
    private boolean requiereMinusculas; // Indica si la contrase debe contener letras minúsculas
    private boolean requiereMayusculas; // Indica si la contrase debe contener letras mayúsculas
    private boolean requiereNumeros;    // Indica si la contrase debe contener números
    private boolean requiereSimbolos;   // Indica si la contrase debe contener símbolos especiales
    private int longitud;           // Número de caracteres en la contraseña
    private StringBuilder clave;    // Contraseña que se está formando
    private Random rand;            // Para insertar caracteres de forma aleatoria
    
    /**
     * Inicializa las cadenas de caracteres de letras mayúsculas, minúsculas,
     * números y símbolos.
     */
    public Gen(){
        rand = new Random();
        MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
        MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        NUMEROS = "0123456789";
        SIMBOLOS = "!#$%&?*^@+";
    }
    
    /**
     * Método utilizado para establecer las propiedades que tendrá la nueva 
     * contraseña.
     * @param tam Número de caracteres que endrá la contraseña
     * @param minus Indica si la contraseña va a incluir minúsculas
     * @param mayus Indica si la contraseña va a incluir mayúsculas
     * @param num Indica si la contraseña va a incluir números
     * @param sim Indica si la contraseña va a incluir símbolos
     */
    public void definirPropiedades(int tam, boolean minus, boolean mayus, boolean num, boolean sim){
        universoCaracteres = "";
        clave = new StringBuilder(); 
        longitud = tam;
        requiereMinusculas = minus;
        requiereMayusculas = mayus;
        requiereNumeros = num;
        requiereSimbolos = sim;
        
        // Por cada tipo de caracter que se va a incluir en la contraseña, se
        // van concatenando los caracteres que pertenecen a ese grupo en la 
        // variable universoCaracteres.
        
        // Por cada tipo de caracter que se va a incluir en la contraseña, se resta
        // uno a la longitud para reservar ese espacio, el cual se ocupará despues
        // para incluir un caracter de cada tipo marcado para garantizar que la 
        // contraseña incluya todos los tipos de caracteres marcados por el usuario
        if(requiereMinusculas){
            universoCaracteres += MINUSCULAS;
            longitud--;
        }
        if(requiereMayusculas){
            universoCaracteres += MAYUSCULAS;
            longitud--;
        }
        if(requiereNumeros){
            universoCaracteres += NUMEROS;
            longitud--;
        }
        if(requiereSimbolos){
            universoCaracteres += SIMBOLOS;
            longitud--;
        }
    }
    
    public String generarClave(){
        //System.out.println("=>"+rand.nextInt(0));
        for(int i=1;i<=longitud;i++){
            clave.append(universoCaracteres.charAt(rand.nextInt(universoCaracteres.length())));   
        }
        System.out.println("- "+clave.toString());
        if(requiereMinusculas){
            //int pos = rand.nextInt(clave.length()+1);
            //System.out.println("pos " + pos);
            clave.insert(rand.nextInt(clave.length()+1), MINUSCULAS.charAt(rand.nextInt(MINUSCULAS.length())));
        }
        if(requiereMayusculas){
            //int pos = rand.nextInt(clave.length()+1);
            //System.out.println("pos " + pos);
            clave.insert(rand.nextInt(clave.length()+1), MAYUSCULAS.charAt(rand.nextInt(MAYUSCULAS.length())));
        }
        if(requiereNumeros){
            //int pos = rand.nextInt(clave.length()+1);
            //System.out.println("pos " + pos);
            clave.insert(rand.nextInt(clave.length()+1), NUMEROS.charAt(rand.nextInt(NUMEROS.length())));
        }
        if(requiereSimbolos){
            //int pos = rand.nextInt(clave.length()+1);
            //System.out.println("pos " + pos);
            clave.insert(rand.nextInt(clave.length()+1), SIMBOLOS.charAt(rand.nextInt(SIMBOLOS.length())));
        }
        return clave.toString();
    }
}