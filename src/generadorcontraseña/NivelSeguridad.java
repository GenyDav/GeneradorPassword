/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorcontraseña;

/**
 *
 * @author Geny
 */
public class NivelSeguridad {
    private int longitudPasswd;
    private int totalCaracteres;
    
    public NivelSeguridad(int tam, boolean mayus, boolean minus, boolean nums, boolean sims){
        longitudPasswd = tam;
        totalCaracteres = calcularTotalCaracteres(mayus, minus, nums, sims);
    }
    
    private int calcularTotalCaracteres(boolean mayus, boolean minus, boolean nums, boolean sims){
        int total = 0;
        if(mayus) total += 26;
        if(minus) total += 26;
        if(nums) total += 10;
        if(sims) total += 10;
        System.out.println("N: " + total);
        System.out.println("L: " + longitudPasswd);
        return total;
    }
    
    public double calcularTiempoProcesamiento(){
        double totalCombinaciones = Math.pow(totalCaracteres,longitudPasswd);
        System.out.println("Combinaciones: "+ totalCombinaciones);
        System.out.println("Tiempo (seg): " + totalCombinaciones/40E9);
        double tiempo = totalCombinaciones/(40E9*31556926); // 31,556,926: segundos en un año
        System.out.println("Tiempo: "+tiempo);
        return tiempo;
    }
    
    public int obtenerNivel(){
        double tmpProcesamiento = calcularTiempoProcesamiento();
        int nivel;
        if(tmpProcesamiento<=1){
            nivel = 1;
        }else if(tmpProcesamiento>1&&tmpProcesamiento<=100000){ // 1000
            nivel = 2;
        }else if(tmpProcesamiento>100000&&tmpProcesamiento<=2.5E9){ //2500
            nivel = 3;
        }else{
            nivel = 4;
        }
        return nivel;
    }
}
