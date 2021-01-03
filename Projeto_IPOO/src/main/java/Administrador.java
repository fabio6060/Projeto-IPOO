
/**
 * Escreva a descrição da classe Administrador aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */

import java.util.Scanner;

public class Administrador
{
    private InputReader opcao;
    ManageUser teste = new ManageUser();
    
public void FuncionalidadesAdministrador (){
    
        opcao = new InputReader();
        
        
System.out.println("##############################################################");
System.out.println("#                                                            #");
System.out.println("#      SISTEMA DE RASTREIO DE CONTACTOS EM SALA DE AULA      #");  
System.out.println("#                                                            #");   
System.out.println("#                 +++++++++++++++++++++++++                  #");
System.out.println("#                 + ÁREA DE ADMINISTRAÇÃO +                  #");
System.out.println("#                 +++++++++++++++++++++++++                  #");
System.out.println("#                                                            #");
System.out.println("#     *********ESCOLHA A SUA OPÇÃO*********                  #");
System.out.println("#     * 1 - Criar Utilizador              *                  #");
System.out.println("#     * 2 - Eliminar Utilizador           *                  #");
System.out.println("#     * 3 - Mostrar Lista de Utilizadores *                  #");
System.out.println("#     * 4 - Criar Sala de Aula            *                  #");
System.out.println("#     * 5 - Eliminar Sala de Aula         *                  #");
System.out.println("#     * 6 - Mostrar Lista de Salas        *                  #");
System.out.println("#     * 7 - Sair                          *                  #");
System.out.println("#     *************************************                  #");
System.out.println("#                                                            #");
System.out.println("#                                                            #");
System.out.println("##############################################################");
int p = opcao.getIntegerNumber("# Opção");

    if (p == 1){
    
    teste.AddUser();
    }else if(p == 2){
        
    teste.RemoveUser();
    }else if(p == 3){


    }else if(p == 4){


    }else{


    }
}     
}
