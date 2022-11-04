public enum Days {
    MONDAY("Duishombu jumushka baram"),
   TUESDAY("Sheishembi trenirovkaga baram"),
   WEDNESDAY("Sharshembi java uironom"),
    THURSDAY("Beishembi uido es alam"),
    FRIDAY("Juma mechitke baram"),
    SATURDAY("Ishembi futbol oinoim"),
    SUNDAY("Jekshembi dostor menen jolugam")
    ;
private String name;

    Days(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Days{" +'\''+
                 name + '\'' +
                '}';
    }
}
