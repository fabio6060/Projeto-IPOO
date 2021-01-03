

/**
 * Escreva a descrição da classe CreateUser aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class ManageUser
{
    public int utilizadoresExistentes = 1;
    public int EstadoNormal = 1;
    public int EstadoIsolado = 0;
    public int EstadoInfetado = 0;
    private InputReader dados;
    int[] Utilizador = new int [10];
    String[] Estado = new String [10];
    String[] Cargo = new String [10];
    
     
    
    public void AddUser (){
        Utilizador [0] = 111111111;
        Estado [0] = "Normal";
        Cargo [0] = "Administrador";
        
            dados = new InputReader();

        int numero = dados.getIntegerNumber("# Nº de Identificação");

        System.out.println(" Possiveis Estados de Saúde:");
        System.out.println(" 1- Normal");
        System.out.println(" 2- Isolamento");
        System.out.println(" 3- Infetado");
        int EstadoDeSaude = dados.getIntegerNumber("# Estado ");
        
        System.out.println(" Escolha um cargo para o utilizador:");
        System.out.println(" 1- Aluno");
        System.out.println(" 2- Professor");
        System.out.println(" 3- Administrador");
        int Funcao = dados.getIntegerNumber("# Cargo ");

    if (EstadoDeSaude == 1){
        EstadoNormal ++;
        Utilizador [utilizadoresExistentes] = numero;
        Estado [utilizadoresExistentes] = "Normal";
        
        if (Funcao == 1){
        Cargo [utilizadoresExistentes] = "Aluno";    
        }else if (Funcao == 2){
        Cargo [utilizadoresExistentes] = "Professor";      
        }else{
        Cargo [utilizadoresExistentes] = "Administrador";  
        }
        
    }else if(EstadoDeSaude == 2){
        EstadoIsolado ++;
        Utilizador [utilizadoresExistentes] = numero;        
        Estado [utilizadoresExistentes] = "Isolamento";
        
        if (Funcao == 1){
        Cargo [utilizadoresExistentes] = "Aluno";    
        }else if (Funcao == 2){
        Cargo [utilizadoresExistentes] = "Professor";      
        }else{
        Cargo [utilizadoresExistentes] = "Administrador";  
        }
        
    }else {
        EstadoInfetado ++;
        Utilizador [utilizadoresExistentes] = numero;        
        Estado [utilizadoresExistentes] = "Infetado";
        
        if (Funcao == 1){
        Cargo [utilizadoresExistentes] = "Aluno";    
        }else if (Funcao == 2){
        Cargo [utilizadoresExistentes] = "Professor";      
        }else{
        Cargo [utilizadoresExistentes] = "Administrador";  
        }
       
    }
    
                   System.out.println("Utilizador criado com sucesso!");
                   System.out.println("Nº:"+ Utilizador[utilizadoresExistentes] + " - Estado:" + Estado[utilizadoresExistentes] + " - Cargo:" + Cargo[utilizadoresExistentes]);
                   utilizadoresExistentes = utilizadoresExistentes + 1;
                   
    }  
    
    public void RemoveUser (){
        Utilizador [0] = 111111111;
        Estado [0] = "Normal";
        Cargo [0] = "Administrador";
        
        for(int i=0; i<utilizadoresExistentes; i++){
          System.out.println("Opção " + i + " > Nº:"+ Utilizador[i] + " - Cargo:" + Cargo[i]);
        }
        System.out.println("Qual utilizador deseja eliminar?");
    }
    
    public void PrintUser (){
        Utilizador [0] = 111111111;
        Estado [0] = "Normal";
        Cargo [0] = "Administrador";
        
        for(int i=0; i<utilizadoresExistentes; i++){
          System.out.println("Opção " + i + " > Nº:"+ Utilizador[utilizadoresExistentes] + " - Estado:" + Estado[utilizadoresExistentes] + " - Cargo:" + Cargo[utilizadoresExistentes]);
        }
        System.out.println("Qual utilizador deseja eliminar?");
    }
    
    public void getEstatisticas (){

        System.out.println("----------ESTATISTICAS----------");
        System.out.println("# Utilizadores:" + utilizadoresExistentes);
        System.out.println("# Utilizadores Normais:" + EstadoNormal);
        System.out.println("# Utilizadores em Isolamento:" + EstadoIsolado);
        System.out.println("# Utilizadores Infetados:" + EstadoInfetado);
        System.out.println("--------------------------------");
    }
    
}  
         
         
         
     
    
    
