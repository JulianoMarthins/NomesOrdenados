import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        String path = "d:\\workspace\\arquivo\\nomes.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String name = br.readLine();

            while(name != null){
                lista.add(name);
                name = br.readLine();
            }

            Collections.sort(lista);
            int i = 1;
            for(String x: lista){
                System.out.println(i + " - " + x);
                i++;
            }


        } catch (IOException e){
            System.out.println("Error: " + e);
        }
    }
}