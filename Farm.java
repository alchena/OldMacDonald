class Farm  {     
   private Animal[] aBunchOfAnimals;    
   public Farm()     {       
      aBunchOfAnimals = new Animal[3];
      aBunchOfAnimals[0] = new NamedCow("Elise","cow","moo");           
      aBunchOfAnimals[1] = new Chick("chick","cluck","cheep");       
      aBunchOfAnimals[2] = new Pig("pig","oink");    
   }         
   public void animalSounds()    {       
     for (int nI=0; nI < aBunchOfAnimals.length; nI++)       {          
       System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound());       
     }
    System.out.println("The cow goes by the name of " + ( (NamedCow)aBunchOfAnimals[0] ).getName());       
   } 
} 