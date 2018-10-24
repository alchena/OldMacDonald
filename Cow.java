class Cow implements Animal {     
    private String mySpecies;
    private String mySound;
    public Cow(String species, String sound){
    	mySpecies = species;
    	mySound = sound;
    }
    public Cow() {         
        mySpecies = "unknown";         
        mySound = "unknown";     
     }   
    public String getType(){
    	return mySpecies;
    }
    public String getSound(){
    	return mySound;
    }
}
