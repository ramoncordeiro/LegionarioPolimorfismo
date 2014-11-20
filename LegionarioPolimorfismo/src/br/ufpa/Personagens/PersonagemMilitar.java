/* Classe de Personagens Militares : Definição das caracteristicas essenciais de Personagens guerreiros 
do jogo. Este tipo de personagem possui atributos como : ataque, defesa, corrida (para caso de recuo ou fuga
imediata)

*/
package br.ufpa.Personagens;
import br.ufpa.classesRelacionadas.Item;

//FAZER SOBRESCRITA DO tipoAtaque na CLASSE LEGIONARIO;
//na documentação da Classe especificar que tipoAtaque refere-se H x H, Distancia, espada, arco.
public class PersonagemMilitar extends Personagem{
   int ataque;
   int defesa;
   int corrida; //define a velocidade de corrida ( pique ) que o personagem consegue atingir.
  

   
//-------------------------------------------------Construtores----------------------------------------------------   
    public PersonagemMilitar(int ataque, int defesa, int corrida,int id, String nome, int saude,Item[] Itens) {
        super(id, nome, saude, Itens);
        this.ataque = ataque;
        this.defesa = defesa;
        this.corrida = corrida;
        
    }

    public PersonagemMilitar() {
     super();
     this.ataque = 0;
     this.defesa = 0;
     this.corrida = 0;
     
    }
    
//------------------------------------------GETTERS E SETTERS -----------------------------------------   
    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getCorrida() {
        return corrida;
    }

    public void setCorrida(int corrida) {
        this.corrida = corrida;
    }

   
// ------------------------------------------- Sobrescrita----------------------------------------    
    @Override
    public void setNome(String nome){
        nome = "Personagem Militar";
        PersonagemMilitar.nome = nome;
            System.out.println(PersonagemMilitar.nome);
    }

    @Override
     public void setItens(Item[] Itens) {
        this.Itens = new Item[3];
           
        this.Itens = Itens;
        for(int i=0; i<3;i++){
            getItens()[i].setItem("Item Militar "+i);
            }
    }

    
        
   

//------------------------------------ METODOS DA CLASSE ----------------------------------------------

    public int aumentarAtaque(){ 
        if (getAtaque()<= 95) {
            this.ataque += 5 ;
        }
        return getAtaque();
}
    
    public int aumentarDefesa(){
        if (getDefesa()<= 95) {
            this.defesa += 5 ;
        }
        return getAtaque();
    }

    public int aumentarCorrida(){
        if (getCorrida()<= 95) {
            this.corrida += 5 ;
        }
        return getAtaque();
    }
    
    

}//fim classe