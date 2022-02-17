class SinoTibetan extends Language {
    public SinoTibetan(String name, int speakers){
        super(name, speakers, "Asia", "subject-object-verb");
        if(name.contains("Chinese")){
            this.wordOrder = "subject-verb-object";
        }
    }
}
