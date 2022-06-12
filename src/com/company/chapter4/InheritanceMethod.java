package com.company.chapter4;

public class InheritanceMethod {

    public static void main(String[] args) {
     Person person = new Person();
     person.setNumber("aa");
     person.setNamePerson("aa");

     Organization organization = new Organization();
     organization.setNumber("bb");
     organization.setNameOrganization("bb");


        System.out.println(person.getNumber());
        System.out.println(organization.getNumber());



    }
}

class Contact{

    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "number='" + number + '\'' +
                '}';
    }
}
class Organization extends Contact {
    private String nameOrganization;

    public String getNameOrganization() {
        return nameOrganization;
    }

    public void setNameOrganization(String nameOrganization) {
        this.nameOrganization = nameOrganization;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "nameOrganization='" + nameOrganization + '\'' +
                '}';
    }
}
class Person extends Contact{

    private String namePerson;

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    @Override
    public String toString() {
        return "Person{" +
                "namePerson='" + namePerson + '\'' +
                '}';
    }
}




