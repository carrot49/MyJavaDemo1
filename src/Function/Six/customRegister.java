package Function.Six;

import Function.allAPI.CustomServiceAPI;

public class customRegister implements CustomServiceAPI{

    @Override
    public void register(String name) throws IllegalNameException {
           if(name.length()<5){
               throw new IllegalNameException("用户名长度需大于4位");
           }else {
               System.out.println("Input done!");
           }
    }

}
