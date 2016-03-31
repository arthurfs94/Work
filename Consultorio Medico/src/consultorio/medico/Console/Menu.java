/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultorio.medico.Console;


import java.util.ArrayList;
import java.util.Scanner;


public class Menu {
    ArrayList<Pessoa> ListaNomes = new ArrayList<Pessoa>();
    ArrayList<Medicamento> ListaMedicamentos = new ArrayList<Medicamento>();
    ArrayList<Consulta> AgendamentoConsulta = new ArrayList<Consulta>();
    
    public void MenuPrincipal() { 
                int op = -1;
                do{		
		System.out.println("1-Cadastro de Pacientes");
                System.out.println("2-Cadastro de Medicamentos");
                System.out.println("3-Agendamento de Consultas");
                System.out.println("4-Registro de Consultas");
                System.out.println("5-Historico de Consultas");
                System.out.println("6-Sair");
                System.out.println("Escolha uma das opções");
		Scanner entrada = new Scanner(System.in);
		op = entrada.nextInt();
		if (op == 1) {
                    System.out.println("Cadastro de Pacientes ");
                    CadastroPaciente();
                }
		if (op == 2){
                    System.out.println("Cadastro de Medicamentos ");
                    CadastroMedicamentos();
                }
	        if (op == 3) {
                    System.out.println("Agendamento de Consultas ");
                    AgendamentoConsulta();
                }
	        if (op == 4) {
                    System.out.println("Registro de Consultas ");
                
                }
	        if (op == 5) {
                    System.out.println("Historico de Consultas ");
                
                }
                if (op == 6) {
                    System.out.println("Sair ");
                    
                }
	        
		
		}while(op != '6');
}
    public void CadastroPaciente() {
        
        String nome = Console.scanString("Nome: ");
        String RG =  Console.scanString("RG: ");
        String dataNasc = Console.scanString("dataNasc: ");
        
        Pessoa pac = new Pessoa(nome ,RG , dataNasc); 
        
        ListaNomes.add(pac);
        }
    public void Vizualizar() {
        
        for (int i=0;i<ListaNomes.size();i++){
            System.out.println(ListaNomes.get(i).getNome());
            System.out.println(ListaNomes.get(i).getRG());
            System.out.println(ListaNomes.get(i).getDataNasc());
        }
    }
    public void CadastroMedicamentos() {
        
        String medicamento = Console.scanString("Nome do Medicamento: ");
        String marca =  Console.scanString("Marca: ");
        String dataVenc = Console.scanString("dataVenc: ");
        int codigo = Console.scanInt("Codigo do Remedio: ");
        
        Medicamento med = new Medicamento(medicamento ,marca , dataVenc); 
        
        ListaMedicamentos.add(med);
        
    }
    public void AgendamentoConsulta() {
        
        String Especialidade = Console.scanString("Especialidade: ");
        String Paciente = Console.scanString("Paciente: ");
        String data = Console.scanString("Data da Cosnulta: ");
        String Hora = Console.scanString("Horario da Consulta: ");
        
        Consulta Con = new Consulta(Paciente ,Especialidade , data, Hora); 
        
        AgendamentoConsulta.add(Con);
        
    }
    
  

   

  
}

    

