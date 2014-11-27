
package br.ufpa.classesRelacionadas;

import br.ufpa.Personagens.Arqueiro;
import br.ufpa.Personagens.Lanceiro;
import br.ufpa.Personagens.Legionario;
import javax.swing.JOptionPane;


public enum Menu {
    LEGIONARIO(1),ARQUEIRO(2),LANCEIRO(3); //L = Legionário, A = Arqueiro, LA = Lanceiro
    
    public int opcao;

    private Menu(int opcaao) {
       this.opcao = opcaao;
        
        
    }
    //NO MAIN INSERIR o JOptionPane com Instruçoes
    public static void escolherOpcao(Menu opcao){
        if(opcao == Menu.LEGIONARIO){
            Legionario  leg = new Legionario();
        }
        else
            if(opcao == Menu.ARQUEIRO){
            Arqueiro  a = new Arqueiro();
        }
        else
                if(opcao == Menu.LANCEIRO){
                   Lanceiro  lan = new Lanceiro(); 
                }
        else{
                    System.out.println("OPCAO INVALIDA! Insira valor Válido");            
                    }
    }
    
    
    
}
