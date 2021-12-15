package com.company.chapter5.polimorfizm;

//Polimorfizm superklasa przyjmuje rozne formy w podklasach i podklasy nadpisuja (override) metody
class DocumentItem { public String getDescription() {
        return "Class representing some document.";
    }
}
class WordDocument extends DocumentItem { public String getDescription() {
        return "Class representing word document.";
    }
}

class ExcelDocument extends DocumentItem { public String getDescription() {
        return "Class representing calculations.";
    }
}

class PdfDocument extends DocumentItem { public String getDescription() {
        return "Class representing pdf document.";
    }
}

public class PolimorfizmNaKlasie {
    public static void main(String[] args) {

        DocumentItem wordItem = new WordDocument();
        DocumentItem excelItem = new ExcelDocument();
        DocumentItem pdfItem = new PdfDocument();

        System.out.println(wordItem.getDescription());
        System.out.println(excelItem.getDescription());
        System.out.println(pdfItem.getDescription());

    }
}
