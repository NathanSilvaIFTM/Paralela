package br.edu.iftm;

import java.util.ArrayList;
import java.util.List;


public class FilaProdutos {

    public static void main (String[] args)  {

        List<Integer> Lista= new ArrayList<Integer>();
        Thread thread1 = new Thread(new Produtor(Lista));
        Thread thread2 = new Thread(new Consumidor(Lista));
        thread1.start();
        thread2.start();

    }
}
