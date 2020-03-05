package Function.Five;

public class people {

     String name;
     int age;

     people(String name, int age){
         this.name=name;
         this.age=age;
     }

     @Override
     public boolean equals(Object obj){
         if(this==obj){
             return true;
         }
         if(obj instanceof people){
             people p = (people)obj;
             if(p.age==age && p.name.equals(name)){
                 return true;
             }
         }
         return false;
     }
}
