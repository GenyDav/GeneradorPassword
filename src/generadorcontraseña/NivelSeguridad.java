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
        double tiempo = totalCombinaciones/(4E9*31556926); // 31,556,926: segundos en un año
        System.out.println("Tiempo: "+tiempo);
        return tiempo;
    }
    
    public int obtenerNivel(){
        double tmpProcesamiento = calcularTiempoProcesamiento();
        int nivel = 0;
        
        return nivel;
    }
}
