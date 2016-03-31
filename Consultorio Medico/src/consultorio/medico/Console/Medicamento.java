/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultorio.medico.Console;

public class Medicamento {
        
        String medicamento;
        String marca;
        String DataVenc;
        private static int codigo_gerado;
        private int codigo;
    
        public Medicamento (String medicamento, String marca, String DataVenc){
            this.medicamento = medicamento;
            this.marca = marca;
            this.DataVenc = DataVenc;
            this.codigo = codigo_gerado;
            
        }

    public String getmedicamento() {
        return medicamento;
    }

    public String getmarca() {
        return marca;
    }

    public String getDataVenc() {
        return DataVenc;
    }
        private int generateCodigo(){
            return (codigo_gerado++);
        }
         
    
}
