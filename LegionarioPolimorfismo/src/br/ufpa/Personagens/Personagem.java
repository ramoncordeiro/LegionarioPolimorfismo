/* Esta classe é a Classe Base. Nela contém atributos e métodos que todo personagem possui
indepentemente se este seja militar ou um aldeão.
    O objetivo desta classe é ter implementado ( para reaproveitamento)
caracteristicas ( variaveis e metodos ) genéricos para todos os personagens.
Todos os personagens Possuem : ID (identificador; Nome(Será nome da classe, p.ex : Legionario, aldeao, arqueiro);
saude ( máx 100), Itens ( para trabalho como um aldeão, ou para guerra como um legionário).
Também os personagens possuem um atributo força Máxima (100).
A partir dessa classe será possivel criar Personagens Militares (Arqueiro, legionário, etc..), bem como 
personagens civis ( caso de aldeões )

*/



/* REQUISITOS 
*Todos os atributos e funções membros devem estar relacionados a classe
  
1. Pelo menos 4 atributos x
2. Pelo menos 4 funções membros sem incluir get e set X 

Requisitos de implementação
3. Cinco classes: uma superclasse e duas subclasses, e duas classes relacionadas ao projeto
4. Sempre usar o super para o máximo de reaproveitamento de código
5. Diagrama de classes (obrigatório salvar também o png do diagrama no gitHub) 
6. Todos os atributos devem ser inicializados. Fez validação de dados? X
7. Dois construtores X 
8. Um atributo static. X
9. Um atributo const static X
Correta modelagem dos statics?
10. Um array X
11. Método static – deve ser chamado no main
12. Sobrescrita de método: chamar dentro do método da classe. Usar o @override
13. Usar Protected acessando diretamente os atributos na classe derivada
14. Usar suas classes no main
Opcionais que garantem pontos extras:
Trabalhar com ENUM
Trabalhar com pacotes
*/
package br.ufpa.Personagens;
import br.ufpa.classesRelacionadas.Item;

public class Personagem {

    int id; //cada personagem terá um identifiador para diferencia-lo de outros da mesma classe.
    static String nome; //nome da classe do personagem,na classe derivada será inserido este atributo.
    int saude; //indica se personagem está ou não ferido (0% - 100%); 
    Item[] Itens; //Personagem terá 3 armas distintas 1 principal e 2 secundárias.
    private static final int forcaMaxima=100; //cada personagem terá uma força que chegará até 100 pts.
    
    //Construtor da Classe
    //ANALISAR SE POSSO UTILIZAR O SET DENTRO DO CONSTRUTOR
    public Personagem(int id, String nome, int saude, Item[] Itens) {
        setId(id);
        setNome(nome);
        setSaude(saude);
        print();
        //this.id = id;
        //this.nome = nome;
        //this.saude = saude;
        //this.familia = familia;
    }
    
    //Construtor DEFAULT.ANLISAR SE PRECISA CORRIGIR
    public Personagem() {
        this.id = 0;
        this.nome = "";
        this.saude = 100;
        print();
    }
    
    
//----------------------DECLARAÇÃO DOS METODOS GET E SET DOS ATRIBUTOS.------------------------
    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        System.out.println("Por favor insira o ID ");   
        this.id = id;
    }

    

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        nome = "Personagem";
        this.nome = nome;
        System.out.println(this.nome);
    }

    /**
     * @return the saude
     */
    public int getSaude() {
        return saude;
    }

    /**
     * @param saude the saude to set
     */
    public void setSaude(int saude) {
        this.saude = saude;
    }
    
    /**
     * @return the Itens
     */
    public Item[] getItens() {
        for(int i=0;i<3;i++){
            System.out.println(" "+Itens[i]);
        }
        return Itens;
    }

    /**
     * @param Itens the Itens to set
     */
    public void setItens(Item[] Itens) {
        this.Itens = new Item[3];
           
        this.Itens = Itens;
        for(int i=0; i<3;i++){
            getItens()[i].setItem("Item Default "+i);
            }
    }

    /**
     * @return the forcaMaxima
     */
    public static int getForcaMaxima() {
        return forcaMaxima;
    }
    
    // --------------------------- DECLARAÇÃO DOS MÉTODOS DA CLASSE ---------------------------------
    
   
    
    public int Curar(int saude){
        saude = saude + 10;
        return saude;
    }
       
    
    public int reduzirSaude(int saude){
        saude = saude - 10;
        return saude;
    }

    /**
     *
     */
    public void print(){
        System.out.println("Personagem Criado com Sucesso\n");
        getId();
        getNome();
        getSaude();
    }
    
    public void checkSaude(int saude){
    if((saude >10)&&(saude <30)){
        System.out.println("Personagem em perigo de vida, Por Favor Insira item de Cura");
        }else    
        if(saude <= 10){
            System.out.println("Saude em estado crítico! Leve o personagem a um lugar seguro para usar Item de cura");
    }
}

    
           
      
            
     
        
     
    
    
}//finaliza classe personagem