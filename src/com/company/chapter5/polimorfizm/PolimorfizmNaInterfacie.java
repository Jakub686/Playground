package com.company.chapter5.polimorfizm;
//Polimorfizm Ten sam rodzaj obiektow utworzonych na podstawie interfejsu przyjmuja rozne formy.
//
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
    public static void main(String[] args) {
        PrinterService documentPrinter = new DocumentPrinter();
        PrinterService cardPrinter = new CardPrinter();
        PrinterService imagePrinter = new ImagePrinter();

        documentPrinter.printDocument();
        cardPrinter.printDocument();
        imagePrinter.printDocument();
    }
}
