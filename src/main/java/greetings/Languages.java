package greetings;

public enum Languages {
    English("Hello, "),
    Venda("Ndaa, "),
    Xhosa("Molo, "),
    Zulu("Sawbona, ");

    //enums with values
    private String greeting;

    public String getLanguage() {
        return greeting;
    }

    private Languages(String greeting) {
        this.greeting = greeting;

    }

}
