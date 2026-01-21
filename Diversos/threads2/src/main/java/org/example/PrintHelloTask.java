package org.example;
public class PrintHelloTask implements Runnable{
        private int contador;

        @Override
        public void run(){
            synchronized (this){
                contador++;
                System.out.println(Thread.currentThread().getName() + ": " + contador);
            }
        }




        public int getContador() {
            return contador;
        }

        public void setContador(int contador) {
            this.contador = contador;
        }
    }


