package com.company.d;

public class Enkapsulacja {
}

class DocumentItem {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class DocumentFactory {

    public DocumentItem create() {

        DocumentItem documentItem = new DocumentItem();
        documentItem.setName("Faktura za komputer");

        return documentItem;
    }
}


