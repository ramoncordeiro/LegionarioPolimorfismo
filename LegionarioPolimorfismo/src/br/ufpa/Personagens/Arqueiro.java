
package br.ufpa.Personagens;
import br.ufpa.Interfaces.Aljava;
import br.ufpa.classesRelacionadas.Item;
import java.util.ArrayList;



public class Arqueiro extends PersonagemMilitar implements Aljava{
    int distanciaMinima;
    //int flechas;
    ArrayList<Integer>flecha;

   
// ---------------------------------------- CONSTRUTORES --------------------------------------------    
    public Arqueiro(int distanciaMinima, int ataque, int defesa, int corrida, int id, String nome, int saude, Item[] Itens) {
        super(ataque, defesa, corrida, id, nome, saude, Itens);
        
        this.distanciaMinima = distanciaMinima;
    }

    public Arqueiro() {
        this.distanciaMinima = 100; //No default o arqueiro terá distancia 100 m do adversario
    }
    
// ------------------------------------------- Getters e Setters -------------------------------------

    public int getDistanciaMinima() {
        return distanciaMinima;
    }

    public void setDistanciaMinima(int distanciaMinima) {
        this.distanciaMinima = distanciaMinima;
    }
    
    
     public ArrayList<Integer> getFlecha() {
        return flecha;
    }

    public void setFlecha(ArrayList<Integer> flecha) {
        for (int i = 0; i < 10; i++) {
            flecha.add(i);
            //this.flecha.add(i) = flecha.get(i);
        }
        this.flecha.addAll(flecha);
        
                //this.flecha = flecha;
    }
  
  // --------------------------------------------------------------------------------------------- 
    
    
    
    
    
    // --------------------------- Implementação da interface Aljava ---------------------------------
    
    @Override
     public void setItens(Item[] Itens) {
        this.Itens = new Item[3];
           
        this.Itens = Itens;
        for(int i=0; i<3;i++){
            if (i==0)
                getItens()[0].setItem("Arco");
            else
            getItens()[i].setItem("Armamento Arqueiro "+i);
            }
    }
    
    
    /*
    @Override
    public void decrementarAljava(Item[] items) {
        
        for (int i = 0; i < 3; i++) {
           if(getItens()[i].getItem().equals("Arco")){
               flechas--;
               System.out.println(" Arqueiro tem atualmente :"+flechas);
               }
        }
        
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
    
    @Override
    public void decrementarAljava(ArrayList flecha) {
        
        for (int i = 0; i < flecha.size(); i++) {
           if(getItens()[i].getItem().equals("Arco")){
               flecha.remove(i);
               System.out.println(" Arqueiro tem atualmente :"+flecha.size());
               }
        }
        
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cor(String cor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
  
    
    }

        
    

