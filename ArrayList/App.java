package ArrayList;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        String[] arrayEstatico= new String[5];
       arrayEstatico[0]="Ana";
       arrayEstatico[1]="Pedro";
       arrayEstatico[2]="Thiago";
       arrayEstatico[3]="Luan";
       arrayEstatico[4]="Victoria";

       ArrayList<String> arrayDinamico= new ArrayList<String>();
       arrayDinamico.add("ana");
       arrayDinamico.add("Victor");
       
       System.out.println("Imprimindo array Estático");
       for(int indice= 0; indice <arrayEstatico.length;indice++){
        System.out.println(arrayEstatico[indice]);
       }
       System.out.println("Tamanho do array Dinâmico: "+ arrayDinamico.size());
       for(int indice= 0; indice <arrayDinamico.size();indice++){
        System.out.println(arrayDinamico.get(indice));

    }
    System.out.println("Remover ana");
    arrayDinamico.remove(0);
    for(int indice= 0; indice <arrayDinamico.size();indice++){
        System.out.println(arrayDinamico.get(indice));
}
    for (String nome : arrayDinamico){
        System.out.println(nome);
    }
}
}

