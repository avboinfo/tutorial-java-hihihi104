//package L_lista;

public class Lista {
    Nodo radice;

    public Lista(){
        radice=null;
    }
    public boolean isEmpty(){
        return radice==null;
    }
    public void add(Nodo n){
        if(isEmpty()) {
            radice=n;
        }else{
            Nodo p= radice;
            while(p.getSuccessivo()!=null)p=p.getSuccessivo();
            p.setSuccessivo(n);
        }
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
    public void addHead(Nodo n){
        if(isEmpty()) {
            radice=n;
        }else{
            n.setSuccessivo(radice);
            radice=n;
        }
    }
}
