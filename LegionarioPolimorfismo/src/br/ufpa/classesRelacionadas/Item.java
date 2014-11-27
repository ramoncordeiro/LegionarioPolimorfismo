/*Esta é a classe dos itens que cada personagem terá.
Os itens são instrumentos que o personagem utiliza para realizar suas tarefas, guerrear ou produzir mantimentos.
 Se o personagem for um aldeão os Itens serão Machado,inchada,martelo (por exemplo)
 Se o personagem for um Militar os Itens poderão ser: Espada, adaga, escudo.

*/


package br.ufpa.classesRelacionadas;


public class Item {
    private String item;
    
//----------------------------------------------Construtor-----------------------------------------------    
    
    public Item(String item) {
        this.item = item;
       
    }

    public Item() {
        item = "";
        
    }

  //-------------------------------------------- GETTERS E SETTERS ---------------------------------------    
    
    /**
     * @return the item
     */
    public String getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(String item) {
        this.item = item;
    }
    
  
   
}
