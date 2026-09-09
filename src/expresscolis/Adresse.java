/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expresscolis;

/**
 *
 * @author baron
 */
public class Adresse {
    private String pays;
    private int codePostal;
    private String ville;
    private String numeroVoie;
    
    public boolean estEnFrance(){
        if (pays.equals("France")){
            return true;
        }
        else{
            return false;
        }       
    }
}
