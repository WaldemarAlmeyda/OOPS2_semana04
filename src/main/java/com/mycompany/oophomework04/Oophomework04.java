package com.mycompany.oophomework04;

public class Oophomework04 {

    public static void main(String[] args) {
        // usando la tecnica del "upcasting"
        InstrumentoMusical guitarra = new Guitarra();
        InstrumentoMusical piano = new Piano();
        
        guitarra.tocar();
        piano.tocar();
    }
}
