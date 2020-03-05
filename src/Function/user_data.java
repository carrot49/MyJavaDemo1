package Function;

public class user_data {
    private int year;

    private int month;

    private int day;

    private String name;

    private String phoneNumber;

    private int Age;

    public void setYear(int year){
        this.year=year;
    }

    public void setMonth(int month){
        this.month=month;
    }

    public void setDay(int day){
        this.day=day;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public void setAge(int Age){
        this.Age=Age;
    }

    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public String  getName(){
        return name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public int getAge(){
        return Age;
    }
}