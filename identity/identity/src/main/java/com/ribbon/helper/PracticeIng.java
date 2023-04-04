package com.ribbon.helper;

public class PracticeIng implements Runnable {

    public int add(int a ,int b){
        int c=a+b;
        System.out.println(c);
        return c;
    }
    public int multiply(int d,int c){
        int k=c*d;
        System.out.println(k);
        return k;
    }

    @Override
    public void run() {
        PracticeIng jj=new PracticeIng();
        int d=jj.add(6,7);
        jj.multiply(d,9);

    }

    /*public static void main(String[] args) {
        PracticeIng jj=new PracticeIng();
        PracticeIng kk =new PracticeIng();
        Thread t1=new Thread(jj);
        Thread t2=new Thread(kk);
        t1.start();
        t2.start();

    }*/
}
