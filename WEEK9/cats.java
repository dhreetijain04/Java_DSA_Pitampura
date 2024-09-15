package WEEK9;

public class cats {
    String name;
    String colour;
    String breed;

    public cats(){     //default constructor
      this.name="unknown";
      this.colour="brown";
      this.breed="ok";
    }

    public cats(           //custom constructor
        String name,
        String colour,
        String breed
    ){
        this.name=name;
        this.colour=colour;
        this.breed=breed;
    }

    void callcat(){
        System.out.println("bhaago");
    }
    void display(){
        System.out.println(this.name+" "+this.colour+" "+this.breed);
    }
}
