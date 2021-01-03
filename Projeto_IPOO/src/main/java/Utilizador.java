
/**
 * Escreva a descrição da classe Utilizador aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;

public class Utilizador
{
    private InputReader opcao;
    Main teste = new Main();
    public void MenuFuncionalidadesUtilizador (){
        opcao = new InputReader();
        
        
System.out.println("##############################################################");
System.out.println("#                                                            #");
System.out.println("#      SISTEMA DE RASTREIO DE CONTACTOS EM SALA DE AULA      #");  
System.out.println("#                                                            #");   
System.out.println("#                 +++++++++++++++++++++++++                  #");
System.out.println("#                 + Utilizador: " + teste.getSessao() + " +                  #"); 
System.out.println("#                 +++++++++++++++++++++++++                  #");
System.out.println("#                 +        Estado:        +                  #"); //colocar o estado
System.out.println("#                                                            #");
System.out.println("#                                                            #");
System.out.println("#     ***************ESCOLHA A SUA OPÇÃO*****************    #");
System.out.println("#     * 1 - Verificar indicações da Entidade de Saúde   *    #");
System.out.println("#     * 2 - Declarar-se como infetado                   *    #");
System.out.println("#     * 3 - Entrar em isolamento profilático            *    #");
System.out.println("#     * 4 - Terminar isolamento                         *    #");
System.out.println("#     * 5 - Ver estatísticas diárias                    *    #");
System.out.println("#     * 6 - Sair                                        *    #");
System.out.println("#     ***************************************************    #");
System.out.println("#                                                            #");
System.out.println("#                                                            #");
System.out.println("##############################################################");
int p = opcao.getIntegerNumber("# Opção");
   
 if (p == 1){
    IndicaçoesES(); 
        
    }else if(p == 2){
        
        
    }else if(p == 3){
    
        
    }else if(p == 4){
    
        
    }else if(p == 5){
    
        
    }else{
    Sair teste = new Sair();
    teste.GoodBye();
    } 
}

public void IndicaçoesES (){
System.out.println("##################################################################");
System.out.println("#                                                                #");
System.out.println("#           INDICAÇÕES POR PARTE DA IDENTIDADE DE SAÚDE          #");  
System.out.println("#                                                                #");   
System.out.println("#                                                                #");
System.out.println("#                                                                #");
System.out.println("#     ************************Avisos*************************    #");
System.out.println("#     * 1 - Lave bem as mãos                                *    #");
System.out.println("#     * 2 - Não partilhe objetos nem comida                 *    #");
System.out.println("#     * 3 - Se te sentires doente avisa os teus familiares  *    #");
System.out.println("#     * 4 - Tente manter uma distância de 2 metros          *    #");
System.out.println("#     * 5 - Utilize máscara sempre que possível             *    #");
System.out.println("#     * 6 - Tenha em atenção os sintomas do virus           *    #");
System.out.println("#     * 7 - Contacte o SNS24 se assim o achar indicado      *    #");
System.out.println("#     *******************************************************    #");
System.out.println("#                                                                #");
System.out.println("#                                                                #");
System.out.println("##################################################################");
}
}