public enum Season {
    AUTUMN("Kuz", "salkyn"){
        @Override
        public void met() {
            System.out.println("September");
        }

        @Override
        public void method() {
            System.out.println("It is autumn");
        }
    },
    WINTER("Kysh","suuk") {
        @Override
        public void method() {
            System.out.println("it is winter");
        }

        @Override
        public void met() {
            System.out.println("December");
        }
    },
    SUMMER("Jay", "yssyk"){
        @Override
        public void method() {
            System.out.println("June");
        }

        @Override
        public void met() {
            System.out.println("it is summer");
        }
    },
    SPRING("Jaz","jyluu"){
        @Override
        public void method() {
            System.out.println("March");
        }

        @Override
        public void met() {
            System.out.println("it is spring");
        }
    };

    private String name;
    private String description;

    Season(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public void method(){
        System.out.println("It is season");
    }
    public abstract void met();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                '}';
    }
}
