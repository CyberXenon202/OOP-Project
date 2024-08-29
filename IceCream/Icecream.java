
public class Icecream {
    private String icecreamType;
    private String icecreamCompany;
    private double icecreamPrice;
    
    //Contructor
    public Icecream(){

    }
    public Icecream(String icecreamType, String icecreamCompany, double icecreamPrice){
        this.icecreamType = icecreamType;
        this.icecreamCompany = icecreamCompany;
        this.icecreamPrice = icecreamPrice;
        
    }


    // get method
    public String getIcecreamType(){
        return this.icecreamType;
    }
    public String getIcecreamCompany(){
        return this.icecreamCompany;
    }
    public double getIcecreamPrice(){
        return this.icecreamPrice;
    }


    //set method
    public void setIcecreamType(String icecreamType){
        this.icecreamType = icecreamType;
    }
    public void setIcecreamCompany(String icecreamCompany){
        this.icecreamCompany = icecreamCompany;
    }
    public void setIcecreamPrice(double icecreamPrice){
        this.icecreamPrice = icecreamPrice;
    }


    //Equals check everything
    public boolean equals(Icecream I){
        if(this.icecreamType.equals(I.icecreamType)
        && this.icecreamCompany.equals(I.icecreamCompany)
        && this.icecreamPrice == I.icecreamPrice){
            return true;
        }
        else{
            return false;
        }
    }

    //Price basis compare
    public int compareTo(Icecream I){
        if(this.icecreamPrice > I.icecreamPrice){
            return 1;
        }
        else if(this.icecreamPrice == I.icecreamPrice){
            return 0;
        }
        else{
            return -1;
        }
    }


    //Display method
    public String toString(){
        return this.icecreamType + " " + this.icecreamCompany + " " + this.icecreamPrice;
    }
}
