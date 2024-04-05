package opsedale;

public class ProntoSoccorso {
    Lista <Paziente> ps;
    
    public ProntoSoccorso(){
        ps=new Lista<>();
        loadFromFile();
    }
    private void loadFromFile(){
        //per il momento lo facciamo "truccato"
        ps.addTail(new Paziente("Mario","rossi","white"));
        ps.addTail(new Paziente("Maria","rossi","yellow"));
        ps.addTail(new Paziente("Riccardina","gamberetto","red"));
    }
}
