
/**
 * Escreva a descrição da classe Main aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;
//olalaura
public class Main
{
    
    private InputReader opcao;
    public int SessaoInicial;
    
    
    public static void main (String[] args){
        
        
    }
    
    public void Menuprincipal (){
        
        opcao = new InputReader();
        
System.out.println("#######################################################################################################################");
System.out.println("#                                                                                                                     #");
System.out.println("#     SISTEMA DE RASTREIO DE CONTACTOS EM SALA DE AULA             ir.   i.rujir. sPX                                 #");  
System.out.println("#                                                                 77i.rS:v1  :. si  uj                                #");   
System.out.println("#     ++++++++++++++                                          7v  .. BQ:  :7BBK  r5    :.rq                           #");
System.out.println("#     + BEM-VINDO! +                                      :::  :QDDr  .BE1  i:PMq1MB. iL: ivv                         #");
System.out.println("#     ++++++++++++++                                    g. :i: KBqr. :PBbRr :iJPXIi   IdJ1u .7g                       #");
System.out.println("#                                                      iZ .:    j1Qg7:.L2:    :QXgKr::JBBB  r .K.                     #");
System.out.println("#     ********ESCOLHA A SUA OPÇÃO********            .q..:BBXB::Bdv.  .::5bi  P: .vI1vrrqBBZr7 iB                     #");
System.out.println("#     * 1 - Registo de Presenças        *           .b:    s2:.YB7.::  .ud5D2: ..:iLrrrJBBBP7bIr 7K                   #");
System.out.println("#     * 2 - Área de Utilizador          *          qr rUMX.Xv      .  .:rrv7.bi::1Pri      :Br   .Qj                  #");
System.out.println("#     * 3 - Área da Autoridade de Saúde *          :    :.    ...LB..r  ..:2E1Y: .:LBBB  : .RB7.:.:B                  #");
System.out.println("#     * 4 - Área do Administrador       *              E7     iibB775EI.  ::: vi7:..MB2r:BB.    sM                    #");
System.out.println("#     * 5 - Sair                        *           i 7BBBEZS2:7.riv5bv   7r. :Yr:D.I   :7J.rBBPu                     #");
System.out.println("#     ***********************************          Q.   7BBr1dYrrv  .:   :SSr:i77iBMEQBJ.   BBS5  :Y                  #");
System.out.println("#                      |                           .r.        :r:r .:: : UsIi.    .ijMBDiDBBBB7   iB                  #");
System.out.println("#                      |                            j  .i..   .irsJsvYr.. .s:        r7   iQBBY   B.                  #");
System.out.println("#                      |                            r:.::. Pg5XQrrii::rir:  :LsuBgvri15vD.  .Qg.sXr                   #");
System.out.println("#                      |                             Sr    :QS1BB7si. .:.. .rr.rB7KBBrgBBr rSI                        #");
System.out.println("#                      |                              . .7    ..bg5 ...srrsE7:     :BBqrP   . ir                      #");
System.out.println("#                      |                                 Yi   UJ7  .ivjr:r..gBZBB. . ZBBB :iq7IU                      #");
System.out.println("#                      |                                  .. uEv.:.r.7BEBJ  .dBBX  BBBBD   :ri                        #");
System.out.println("#                   *******                                    riLi :rvrr iX :BPP   .   X.                            #");
System.out.println("#                     ***                                      .r.   r   sBg  q .s::b2rj                              #");
System.out.println("#                      *                                         ..  2i.:Qqr:.:g  ..i:            SARS-COV-19         #");
System.out.println("#                                                                                                                     #");
System.out.println("#######################################################################################################################");
int p = opcao.getIntegerNumber("# Opção");
    if (p == 1){
    int sessao = opcao.getIntegerNumber("# Nº de Utilizador");
    SessaoInicial = sessao;
    Presencas teste = new Presencas();
    teste.MenuRegistoPresencas();
    }else if(p == 2){
    int sessao = opcao.getIntegerNumber("# Nº de Utilizador");
    SessaoInicial = sessao;
    Utilizador teste = new Utilizador();
    teste.MenuFuncionalidadesUtilizador();
    }else if(p == 3){
    int sessao = opcao.getIntegerNumber("# Nº de Utilizador");
    SessaoInicial = sessao;
    OrganizaçãoDeSaude teste = new OrganizaçãoDeSaude();
    teste.FuncionalidadesOrganizacaoDeSaude();
    }else if(p == 4){
    int sessao = opcao.getIntegerNumber("# Nº de Utilizador");
    SessaoInicial = sessao;
    Administrador teste = new Administrador();
    teste.FuncionalidadesAdministrador();
    }else{
    Sair teste = new Sair();
    teste.GoodBye();
    }

}

public int getSessao (){
    return SessaoInicial;
}
    
    
    
    
    
    
    
    
    
}

    

