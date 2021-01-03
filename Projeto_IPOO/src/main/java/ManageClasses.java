
/**
 * Escreva a descrição da classe ManageClasses aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;

public class ManageClasses
{
    int SalasExistentes = 0;
    private InputReader dados;
    int[] Utilizador = new int [10];
    String[] nSala = new String [10];
    int[] ColunasX = new int [10];
    int[] LinhasY = new int [10];
    
    public void AddClasses (){
        
        
        dados = new InputReader();

        String sala = dados.getText("# Nº da Sala");
        int y = dados.getIntegerNumber("# Nº de Colunas (y)");
        int x = dados.getIntegerNumber("# Nº de Linhas (x)");
        
        nSala[SalasExistentes] = sala;
        ColunasX[SalasExistentes] = x;
        LinhasY[SalasExistentes] = y;
    
        System.out.println("Sala criada com sucesso!");
        System.out.println("Nº da Sala:"+ nSala[SalasExistentes] + " - Colunas:" + ColunasX[SalasExistentes] + " - Linhas:" + LinhasY[SalasExistentes]);
        SalasExistentes = SalasExistentes + 1;
                   
    }  
    
    public void RemoveClasses (){
        
        
        for(int i=0; i<SalasExistentes; i++){
          System.out.println("Opção " + i + " > Nº da Sala:"+ nSala[i]);
        }
        System.out.println("Qual a sala que deseja eliminar?");
    }
    
    public void PrintClasses (){
        
        
        for(int i=0; i<SalasExistentes; i++){
          System.out.println("Opção " + i + " > Nº:"+ nSala[i] + " - Colunas:" + ColunasX[i] + " - Linhas:" + LinhasY[i]);
        }
    }
    
}
