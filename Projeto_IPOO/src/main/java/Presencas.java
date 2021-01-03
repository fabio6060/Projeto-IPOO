
/**
 * Escreva a descrição da classe Registar aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;

public class Presencas
{
    private InputReader opcao;
    
    public void MenuRegistoPresencas (){
        opcao = new InputReader();
        
        
System.out.println("##############################################################");
System.out.println("#                                                            #");
System.out.println("#      SISTEMA DE RASTREIO DE CONTACTOS EM SALA DE AULA      #");  
System.out.println("#                                                            #");   
System.out.println("#                 ++++++++++++++++++++++++                   #");
System.out.println("#                 + REGISTO DE PRESENÇAS +                   #");
System.out.println("#                 ++++++++++++++++++++++++                   #");
System.out.println("#                                                            #");
System.out.println("#     *********ESCOLHA A SUA OPÇÃO**********                 #");
System.out.println("#     * 1 - Registar presenças numa aula   *                 #");
System.out.println("#     * 2 - Terminar Aula                  *                 #");
System.out.println("#     * 3 - Sair                           *                 #");
System.out.println("#     **************************************                 #");
System.out.println("#                                                            #");
System.out.println("#                                                            #");
System.out.println("##############################################################"); 
int p = opcao.getIntegerNumber("# Opção");
    if (p == 1){
    
    }else if(p == 2){
    
    }else if(p == 3){
    Sair teste = new Sair();
    teste.GoodBye();
    }
        
} 
}
