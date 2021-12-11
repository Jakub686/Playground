package com.company.chapter5.polimorfizm;


interface PrinterService {

    void printDocument();
}

class DocumentPrinter implements PrinterService {

    public void printDocument() {
        System.out.println("Printing document...");
    }
}

class CardPrinter implements PrinterService {

    public void printDocument() {
        System.out.println("Printing card...");
    }
}

class ImagePrinter implements PrinterService {

    public void printDocument() {
        System.out.println("Printing image...");
    }
}


public class PolimorfizmNaInterfacie {
}
