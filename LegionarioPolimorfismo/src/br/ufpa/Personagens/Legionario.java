/* Classe Principal do Programa 

*/
package br.ufpa.Personagens;
import br.ufpa.Interfaces.Desgaste;
import br.ufpa.classesRelacionadas.Item;
import br.ufpa.Interfaces.Cor;


public class Legionario extends PersonagemMilitar implements Desgaste,Cor{

    
    int velocidadeAtaque;
    private static final String tipoAtaque = "Espada"; //Os legionários terão só um tipo de ataque, todos.
    boolean estado; // indica se o inimigo está proximo para que haja ataque automatico 
    boolean recuar; // Legionario retorna a base por Saude ou outro motivo 

  
    
 // ------------------------------------ CONSTRUTORES ------------------------------------------------   
    public Legionario(int velocidadeAtaque,int ataque, int defesa, int corrida,int id, String nome, int saude,Item[] Itens) {
        super(ataque, defesa, corrida, id, nome, saude, Itens);
        this.velocidadeAtaque = velocidadeAtaque;
        print();
        }

    public Legionario() {
        super();
        this.velocidadeAtaque = 0;
        print();
    }
   
  //-----------------------------------------Getters e Setters ------------------------------------------- 
    public int getVelocidadeAtaque() {
        return velocidadeAtaque;
    }

    public void setVelocidadeAtaque(int velocidadeAtaque) {
        this.velocidadeAtaque = velocidadeAtaque;
    }

    public boolean getEstado(){
        return estado;
    }

    public void setEstado(boolean estado) {
        estado = false;
        this.estado = estado;
    }

    public boolean getRecuar(){
        return recuar;
    }

    public void setRecuar(boolean recuar) {
        recuar = false;
        this.recuar = recuar;
    }
    
    public static String getTipoAtaque() {
        return tipoAtaque;
    }
    
// ------------------------------------------Sobrescrita-----------------------------------------    
     
    @Override
    public void setNome(String nome){
        nome = "Legionário";
        PersonagemMilitar.nome = nome;
            System.out.println(PersonagemMilitar.nome);
    }

    @Override
     public void setItens(Item[] Itens) {
        this.Itens = new Item[3];
           
        this.Itens = Itens;
        for(int i=0; i<3;i++){
            getItens()[i].setItem("Armamento "+i);
            }
    }
    
    
// ------------------------------------------Métodos da Classe -----------------------------------
     
    public int upVelocidadeAtaque(int velocidadeAtaque){
        if(getVelocidadeAtaque() <= 95 ){
        this.velocidadeAtaque += 5; 
                }
        return getVelocidadeAtaque();
    }
    
    public boolean  mudarEstado(boolean estado){
        
        setEstado(estado);
        return estado;
    }
     
    public boolean  Recuar(){
        recuar = true;
        setRecuar(recuar);
        return recuar;
    }
    
    @Override
    public void print(){
        System.out.println("Legionário Criado com Sucesso");
              
    }

    // Método da Classe Intereface desgaste
    //Necessário Implementar.
    @Override
    public void Desgaste(int velocidadeAtaque) {
        
        throw new UnsupportedOperationException("Nao foi realizado desgaste."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String ToString(){
        System.out.println("Nome "+getNome()); 
        System.out.println("Ataque "+getAtaque());
        System.out.println("Corrida "+getCorrida());
        System.out.println("Defesa "+getDefesa());
        System.out.println("Estado "+getEstado());
       return getNome();
    }

    @Override
    public void cor(String cor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
}// fim classe







