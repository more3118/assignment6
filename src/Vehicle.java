public class Vehicle {
    public String name;
    public String model;
    public int year;
    public int speed;

    public Vehicle(){
    }
    public Vehicle(String name,String model,int year,int speed){
        this.name = name;
        this.model = model;
        this.year = year;
        this.speed = speed;
    }
    public void foward(){
        this.speed+=1;
    }
    public void reverse(){
        this.speed-=1;
    }
    public String getSpeed(){
        return "Current Speed:"+this.speed;
    }
    @Override
    public String toString(){
        return "name"+this.name+this.model+this.year+this.speed;
    }
}
