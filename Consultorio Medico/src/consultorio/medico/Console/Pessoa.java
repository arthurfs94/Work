/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultorio.medico.Console;

public class Pessoa {
        
        String Nome;
        String RG;
        String DataNasc;
        
        public Pessoa (String Nome, String RG, String DataNasc){
            this.Nome = Nome;
            this.RG = RG;
            this.DataNasc = DataNasc;   
        }

    public String getNome() {
        return Nome;
    }

    public String getRG() {
        return RG;
    }

    public String getDataNasc() {
        return DataNasc;
    }
           
    
}
    

