import entities.Funcionario;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Funcionario> lista = new ArrayList<>();
        String path = "d:\\workspace\\arquivo\\nomes.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String nomeSalario = br.readLine();

            while (nomeSalario != null) {
                String[] campo = nomeSalario.split(",");
                String nome = campo[0];
                double salario = Double.parseDouble(campo[1]);

                lista.add(new Funcionario(nome, salario));
                nomeSalario = br.readLine();
            }

            Collections.sort(lista);
            int i = 1;

            for (Funcionario x : lista) {
                System.out.println(i + " - " + x.toString());
                i++;
            }


        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}