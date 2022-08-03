package generadorcontraseña;

/**
 * Clase que realiza los cálculos para determinar que tan segura es la contraseña
 * creada.
 * @author Geny
 * @version 1.0
 */
public class NivelSeguridad {
    private int longitudPasswd;     // número de caracteres que tiene la contraseña
    private int totalCaracteres;    // suma del número de caracteres de los grupos 
    
    /**
     * Constructor. Encargado de definir los valores utilizados para realizar el
     * cálculo de la cantidad de tiempo necesaria para 'romper' una contraseña que
     * tenga las características de los parámetros.
     * @param tam Longitud de la contraseña
     * @param minus Indica si la contraseña contiene o no letras minúsculas
     * @param mayus Indica si la contraseña contiene o no letras mayúsculas
     * @param nums Indica si la contraseña contiene o no números
     * @param sims Indica si la contraseña contiene o no símbolos
     */
    public NivelSeguridad(int tam, boolean minus, boolean mayus, boolean nums, boolean sims){
        longitudPasswd = tam;
        totalCaracteres = calcularTotalCaracteres(mayus, minus, nums, sims);
    }
    
    /**
     * Método que realiza la suma del número de caracteres contenidos en cada
     * grupo marcado por el usuario para obtener el valor N, que representa el 
     * total de caracteres que pueden ser utilizados para crear una contraseña.
     * @param mayus Indica si se debe sumar la cantidad de letras mayúsculas (26) al total de caracteres
     * @param minus Indica si se debe sumar la cantidad de letras minúsculas (26) al total de caracteres
     * @param nums Indica si se debe sumar la cantidad de números (10) al total de caracteres
     * @param sims Indica si se debe sumar la cantidad de símbolos (10) al total de caracteres
     * @return Cantidad de caracteres que pueden utilizarse al crear una contraseña
     */
    private int calcularTotalCaracteres(boolean mayus, boolean minus, boolean nums, boolean sims){
        int total = 0;
        if(mayus) total += 26;
        if(minus) total += 26;
        if(nums) total += 10;
        if(sims) total += 10;
        return total;
    }
    
    /**
     * Método que realiza el cálculo del tiempo (en años) requerido para romper 
     * una contraseña utilizando el método de búsqueda por fuerza bruta. Primero 
     * se calcula el número de contraseñas posibles de longitud L que se pueden 
     * crear utilizando el conjunto caracteres de tamaño N, efectuando la operación 
     * N^L. Despues, la cantidad obtenida se divide entre el resultado de multiplicar 
     * 40x10^9 (número de hashes por segundo de una tarjeta gráfica RTX 2080, 
     * utilizada como referencia para hacer los cálculos) por 31,556,926 (cantidad 
     * de segundos en un año).
     * Información obtenida de https://www.hivesystems.io/blog/are-your-passwords-in-the-green
     * @return Tiempo en años necesario para 'romper' la contraseña creada 
     */
    public double calcularTiempoProcesamiento(){
        double totalCombinaciones = Math.pow(totalCaracteres,longitudPasswd);
        //System.out.println("Combinaciones: "+ totalCombinaciones);
        double tiempo = totalCombinaciones/(40E9*31556926);
        //System.out.println("Tiempo (años): " + tiempo);
        return tiempo;
    }
    
    /**
     * Asigna un nivel de seguridad a la contraseña creada utilizando como criterio
     * la cantidad de años de procesamiento necesarios para poder romper la 
     * contraseña. La constraseña puede ser asignada en alguno de los cuatro 
     * niveles siguientes:
     * 1: El tiempo requerido es menor o igual a un año
     * 2: El tiempo requerido es mayor a un año y menor o igual a un millón de años
     * 3: El tiempo requerido es mayor a un millón de años y menor o igual a dos mil quinientos millones de años
     * 4: El tiempo requerido es mayor a dos mil quinientos millones de años (2,500,000,000)
     * @return Nivel de seguridad asignado a la contraseña
     */
    public int obtenerNivel(){
        double tmpProcesamiento = calcularTiempoProcesamiento();
        int nivel;
        if(tmpProcesamiento<=1){
            nivel = 1;
        }else if(tmpProcesamiento>1&&tmpProcesamiento<=1E6){
            nivel = 2;
        }else if(tmpProcesamiento>1E6&&tmpProcesamiento<=2.5E9){
            nivel = 3;
        }else{
            nivel = 4;
        }
        return nivel;
    }
}
