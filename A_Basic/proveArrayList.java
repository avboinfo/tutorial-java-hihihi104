import java.util.ArrayList;
import java.util.Collections;

public class proveArrayList{

    public static void main(String[]args){
        System.out.println("questo cod funziona");

        ArrayList<String > a =new ArrayList<>();
        a.add("uno");
        a.add("Babina");
        a.add("tre");
        a.add("quattro");
        a.add("cinque");

        a.remove("Babina");
        a.add(1,"due");
        
        //Collections.sort(a); //sort metodo statico 

        for(String s:a){ //stampa uno due senza quadre e con l'invio(tasto)
            System.out.println(s);
        }
        for(int i=0;i<a.size();i++){ //stesso metodo di sopra ma più lungo
            String s=a.get(i);
            System.out.println(s);
        }

        System.out.println(a);

        System.out.println("juve".compareTo("roma"));

     }
}