package br.edu.iftm;

import java.util.List;

public class Produtor implements Runnable {

    List<Integer> Lista = null;
    final int MAX = 5;
    private int i = 0;

    public Produtor(List<Integer> Lista)   {
        super();
        this.Lista = Lista;
    }

    @Override
    public void run() {
        while(true) {
            try {
                produtor(i++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void produtor(int i) throws InterruptedException {
        synchronized (Lista)   {
            while(Lista.size() == MAX) {
                System.out.println("Lista esta cheia, esperando ação do consumidor.");
                Lista.wait();
            }
        }

        synchronized (Lista)    {
            System.out.println("Produtor adicionou elemento " + i);
            Lista.add(i);
            Thread.sleep(1000);
            Lista.notify();
        }
    }
}
