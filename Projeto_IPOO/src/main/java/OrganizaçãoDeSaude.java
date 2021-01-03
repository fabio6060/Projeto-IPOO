
/**
 * Escreva a descrição da classe OrganizaçãoDeSaude aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */

import java.util.Scanner;

public class OrganizaçãoDeSaude
{
    private InputReader opcao;
    
    public void FuncionalidadesOrganizacaoDeSaude (){
        opcao = new InputReader();
        
        
System.out.println("##############################################################");
System.out.println("#                                                            #");
System.out.println("#      SISTEMA DE RASTREIO DE CONTACTOS EM SALA DE AULA      #");  
System.out.println("#                                                            #");   
System.out.println("#             ++++++++++++++++++++++++++++++++               #");
System.out.println("#             + ÁREA DA ORGANIZAÇÃO DE SAÚDE +               #");
System.out.println("#             ++++++++++++++++++++++++++++++++               #");
System.out.println("#                                                            #");
System.out.println("#     ***************ESCOLHA A SUA OPÇÃO************         #");
System.out.println("#     * 1 - Enviar lista de doentes infetados hoje *         #");
System.out.println("#     * 2 - Ver Estatísticas                       *         #");
System.out.println("#     * 3 - Sair                                   *         #");
System.out.println("#     **********************************************         #");
System.out.println("#                                                            #");
System.out.println("#                                                            #");
System.out.println("##############################################################");
int p = opcao.getIntegerNumber("# Opção");
    if (p == 1){
    Presencas teste = new Presencas();
    teste.MenuRegistoPresencas();
    }else if(p == 2){
    ManageUser teste = new ManageUser();
    teste.getEstatisticas();
    }else{
    Sair teste = new Sair();
    teste.GoodBye();
    }
}


}
