/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultorio.medico.Console;

public class Consulta {
    
        String Especialidade;
        String Paciente;
        String data;
        String Hora;
        private static int codigo_gerado = 1;
        private int codigo;
    
        public Consulta(String Especialidade, String Paciente, String data, String hora){
            this.Especialidade = Especialidade;
            this.Paciente = Paciente;
            this.data = data;
            this.Hora = Hora;
            this.codigo = codigo_gerado;
            codigo_gerado++;
        
        }
        
    public String getdata() {
        return data;
    }

    public String getPaciente() {
        return Paciente;
    }

    public String getEspecialidade() {
        return Especialidade;
    }
    
    public String getHora() {
        return Hora;
    }
    private int generateCodigo(){
        return (codigo_gerado++);
        }
    
}

