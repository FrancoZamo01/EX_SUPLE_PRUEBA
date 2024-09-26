package com.example.exmaps;

public class Country {
    private String name;
    private String flagUrl;  // Este campo contendrá la URL de la bandera

    public Country(String name, String flagUrl) {
        this.name = name;
        this.flagUrl = flagUrl;
    }

    public String getName() {
        return name;
    }

    public String getFlagUrl() {
        return flagUrl;
    }
}
