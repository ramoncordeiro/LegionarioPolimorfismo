/*
Lanceiro é um tipo de Soldado que possui como Arma principal uma Lança, normalmente nos exercitos
antigos era o soldado da frente de batalha para impedir o avanço da cavalaria adversária. 
*/
package br.ufpa.Personagens;

import br.ufpa.classesRelacionadas.Item;


public class Lanceiro extends PersonagemMilitar{
    boolean lancar; // O lanceiro possui uma lanca que dependendo do caso lanca no adversario.

//--------------------------------------------- Construtores ---------------------------------------    
    public Lanceiro(int ataque, int defesa, int corrida, int id, String nome, int saude, Item[] Itens) {
        super(ataque, defesa, corrida, id, nome, saude, Itens);
        
        this.lancar = false;
    }

    public Lanceiro() {
        this.lancar = false;
    }
    
    public Lanceiro(Lanceiro l){
        //Nao foi inserido ID no construtor , pois 2 personagens nao devem ter o mesmo ID.
        this.lancar = l.lancar;
        Lanceiro.nome = l.getNome();
        this.Itens = l.Itens;
        this.ataque = l.ataque;
        this.corrida = l.corrida;
        this.defesa = l.defesa;
        this.saude = l.saude;
        
    }

//------------------------------------------- Get e Set ------------------------------------------

    public boolean isLancar() {
        return lancar;
    }

    public void setLancar(boolean lancar) {
        this.lancar = lancar;
    }
    



// -------------------------------------------- Métodos -----------------------------------------


public void usarEspada(Item[] Itens)  {
    if(isLancar()==true){
        getItens()[0]= null;
        
    }
}  
    
    
    
    
    
 @Override
     public void setItens(Item[] Itens) {
        this.Itens = new Item[3];
           
        this.Itens = Itens;
        for(int i=0; i<3;i++){
            if (i==0)
                getItens()[0].setItem("Lanca");
            else 
                if(i==1)
            getItens()[i].setItem("Espada");
            else
                     getItens()[i].setItem("Armamento Arqueiro"+i);
            }
    }

    @Override
    public void cor(String cor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}