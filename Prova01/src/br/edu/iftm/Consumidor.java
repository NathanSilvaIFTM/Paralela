package br.edu.iftm;

import java.util.List;

public class Consumidor implements Runnable {


    List<Integer> Lista = null;

    public Consumidor(List<Integer> Lista)   {
        super();
        this.Lista = Lista;
    }

    @Override
    public void run() {
        while(true) {
            try {
                consumidor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void consumidor() throws InterruptedException {
        synchronized (Lista)   {
            while(Lista.isEmpty()) {
                System.out.println("Lista esta vazia, esperando ação do produtor.");
                Lista.wait();
            }
        }

        synchronized (Lista)    {
            Thread.sleep(1000);
            System.out.println("Elemento retirado pelo consumidor " + Lista.remove(0));
            Lista.notify();
        }
    }
}
