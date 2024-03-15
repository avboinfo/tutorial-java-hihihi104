//package L_lista;

public class Lista {

class Interatore{
    private Nodo nodo;

    private Interatore(Nodo nodo){
        this.nodo=nodo;
    }
    public boolean hasNext(){
        return nodo!=null;
    }
    public Nodo next(){
        if (nodo==null)return null;
        //Nodo result = new Nodo(nodo.getValore(), nodo.getSuccessivo());
        Nodo result = nodo ;
        nodo = nodo.getSuccessivo();
        return result; 
    }
}
    public Interatore getInterator(){
        Interatore i = new Interatore(radice);
        return i;
    }
    Nodo radice;

    public Lista(){
        radice=null;
    }
    public boolean isEmpty(){
        return radice==null;
    }
    public void addTail(Nodo n){
        if(isEmpty()) {
            radice=n;
        }else{
            Nodo p= radice;
            while(p.getSuccessivo()!=null)p=p.getSuccessivo();
            p.setSuccessivo(n);
        }
    }
    public void addHead (Nodo n){
        if(isEmpty()){
            radice =n;
        }else{
            n.setSuccessivo(radice);
            radice=n;
        }
    }
    public void addSorted(Nodo n){
        if(isEmpty()) {radice=n;n.setSuccessivo(null); return;}
            int vn= n.getValore();
            if(vn<radice.getValore()){n.setSuccessivo(radice); radice=n; return;}
            Nodo p1=radice;
            Nodo p2=radice.getSuccessivo();
            while(vn>p1.getValore() && p2!=null &&  vn>p2.getValore() ){
                p1=p2;
                p2=p1.getSuccessivo();
            }
            n.setSuccessivo(p2);
            p1.setSuccessivo(n);  
            
    }
    public String toString(){
        String s= "eelementi della lista";
        Nodo p=radice;
        while(p!=null){
            s +=p + " ";
            p=p.getSuccessivo();
        }
        s += "end!";
        return s;
    }
    public boolean addAfter(Nodo n, int pos){
        //aggiunge nodo n dopo aver passato il nodo di indice pos 
        Lista.Interatore iter = this.getInterator();
        int i=0; Nodo npos=null;
        for( i=0; i<pos; i++){
            if(iter.hasNext())npos= iter.next();
            else return false;
        }
        n.setSuccessivo(npos.getSuccessivo());
        npos.setSuccessivo(n);
        return true;

    }
    
    public boolean removePos(int pos){
        if(isEmpty()){
            return false;
        }
        if(radice.getValore() == pos){
            radice = radice.getSuccessivo();
            return true;
        }
        Nodo p1 = radice;
        Nodo p2 = radice.getSuccessivo();
        while(p2 != null){
            if(p2.getValore() == pos){
                p1.setSuccessivo(p2.getSuccessivo());
                return true;
            }
            p1 = p2;
            p2 = p2.getSuccessivo();
        }
        return false;
    }
    
    public boolean removeValue(int value){
        if(isEmpty()){
            return false;
        }
        if(radice.getValore() == value){
            radice = radice.getSuccessivo();
            return true;
        }
        Nodo p1 = radice;
        Nodo p2 = radice.getSuccessivo();
        while(p2 != null){
            if(p2.getValore() == value){
                p1.setSuccessivo(p2.getSuccessivo());
                return true;
            }
            p1 = p2;
            p2 = p2.getSuccessivo();
        }
        return false;
    }
    
    
}
