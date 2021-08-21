package br.com.johne.cadastro;

public class Formulario {

    private String name;
    private String phone;
    private String mail;
    private boolean listMail;
    private String gender;
    private String city;
    private String state;

    public Formulario(String name, String phone, String mail, boolean listMail, String gender, String city, String state) {
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.listMail = listMail;
        this.gender = gender;
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Formulario" + '\n' +
                "name: " + name + '\n' +
                "phone: " + phone + '\n' +
                "mail: " + mail + '\n' +
                "In list mail: " + (listMail ? "Sim" : "Não")  + '\n' +
                "gender: " + gender +  '\n' +
                "city: " + city  + '\n' +
                "state: " + state;
    }
}
