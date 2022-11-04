public enum Oblast {
    JALALABAD("mineralnaya voda"),
    OSH("Sulaiman too"),
    BATKEN("Orukzar"),
    CHUI("Borbor"),
    TALAS("Fasol'"),
    NARYN("et"),
    YSSYKKOL("ashlyam fu");

    String name;

    Oblast(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Oblast{" +
                "name='" + name + '\'' +
                '}';
    }
}
