package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program  {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("Maria");
        lista.add("Alex");
        lista.add("Bob");
        lista.add("Anna");
        lista.add("Marco");

        for(String s : lista){
            System.out.println(s);
        }
        System.out.println("------");

        lista.removeIf(x -> x.charAt(0) == 'M');

        for(String s : lista){
            System.out.println(s);
        }
        System.out.println("------");
        System.out.println("Index of Maria"+ lista.lastIndexOf("Maria"));
        System.out.println("------");

        List<String> result = lista.stream().filter(x -> x.charAt(0)== 'A').collect(Collectors.toList());

        for(String s : result){
            System.out.println(s);
        }
        System.out.println("------");

        String name = lista.stream().filter(x -> x.charAt(0)== 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
