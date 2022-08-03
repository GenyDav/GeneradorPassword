package generadorcontraseña;

import java.util.Random;

/**
 * Clase encargada de crear una contraseña nueva según las especificaciones del
 * usuario. Estas pueden ser creadas con una longitud de entre 4 y 50 caracteres.
 * Los caracteres aceptados son: letras mayúsculas y minúsculas, dígitos del 0 al
 * 9 y los símbolos !, #, $, %, &, ?, *, ^, @, +.
 * @author Geny
 * @version 1.0
 */
public class Gen {
    private final String MAYUSCULAS;
    private final String MINUSCULAS;
    private final String NUMEROS;
    private final String SIMBOLOS;
    private String caracteres;
    
    private boolean minusculas,mayusculas,numeros,simbolos;
    private int longitud;
    private StringBuilder clave;
    private Random rand;
    
    public Gen(){
        rand = new Random();
        MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
        MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        NUMEROS = "0123456789";
        SIMBOLOS = "!#$%&?*^@+";
    }
    
    public void definirPropiedades(int tam,boolean minus,boolean mayus,boolean num,boolean sim){
        caracteres = "";
        clave = new StringBuilder();
        
        longitud = tam;
        minusculas = minus;
        mayusculas = mayus;
        numeros = num;
        simbolos = sim;
        
        if(minusculas){
            caracteres += MINUSCULAS;
            longitud--;
        }
        if(mayusculas){
            caracteres += MAYUSCULAS;
            longitud--;
        }
        if(numeros){
            caracteres += NUMEROS;
            longitud--;
        }
        if(simbolos){
            caracteres += SIMBOLOS;
            longitud--;
        }
    }
    
    public String generarClave(){
        //System.out.println("=>"+rand.nextInt(0));
        for(int i=1;i<=longitud;i++){
            clave.append(caracteres.charAt(rand.nextInt(caracteres.length())));   
        }
        System.out.println("- "+clave.toString());
        if(minusculas){
            //int pos = rand.nextInt(clave.length()+1);
            //System.out.println("pos " + pos);
            clave.insert(rand.nextInt(clave.length()+1), MINUSCULAS.charAt(rand.nextInt(MINUSCULAS.length())));
        }
        if(mayusculas){
            //int pos = rand.nextInt(clave.length()+1);
            //System.out.println("pos " + pos);
            clave.insert(rand.nextInt(clave.length()+1), MAYUSCULAS.charAt(rand.nextInt(MAYUSCULAS.length())));
        }
        if(numeros){
            //int pos = rand.nextInt(clave.length()+1);
            //System.out.println("pos " + pos);
            clave.insert(rand.nextInt(clave.length()+1), NUMEROS.charAt(rand.nextInt(NUMEROS.length())));
        }
        if(simbolos){
            //int pos = rand.nextInt(clave.length()+1);
            //System.out.println("pos " + pos);
            clave.insert(rand.nextInt(clave.length()+1), SIMBOLOS.charAt(rand.nextInt(SIMBOLOS.length())));
        }
        return clave.toString();
    }
}