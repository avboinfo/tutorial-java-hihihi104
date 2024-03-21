import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Raccolta {
    ArrayList<Videogame> Lista;

    public Raccolta(String file){
        Lista = new ArrayList<>();
        File f = new File(file);
        try{
            Scanner fileInput = new Scanner(f);

            while(fileInput.hasNextLine()){
                String line = fileInput.nextLine();
                String[] field = line.split(";");
                Lista.add(new Videogame(field[0], field[1], Float.parseFloat(field[2]), Integer.parseInt(field[3])));
            }
            fileInput.close();
        } catch (Exception e){
            System.out.println("Errore: " + e.getMessage());
        } 
    }
    public String toString(){
        return lista;
    }
}