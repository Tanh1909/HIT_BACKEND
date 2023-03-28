package com.example.buoi3;

import java.util.ArrayList;
import java.util.List;

public class UserImplement implements UserDAO{
    private List<User> list;
    public UserImplement(){
        list=new ArrayList<>();
        list.add(new User("admin","admin123","tien anh"));
        list.add(new User("admin1","admin1234","quang dao"));
        list.add(new User("admin2","admin1235","viet anh"));
        list.add(new User("admin3","admin1236","dat"));
    }
    @Override
    public boolean themUser(User user) {
        if(timUser(user.getUser())){
            return false;
        }
        else{
            list.add(user);
            return true;
        }

    }

    @Override
    public boolean suaUser() {
        return false;
    }

    @Override
    public boolean xoaUser() {
        return false;
    }

    @Override
    public boolean timUser(String user) {
        for(int i=0;i<list.size();i++){
            if(user.equalsIgnoreCase(list.get(i).getUser())){
                return true;
            }
        }
        return false;
    }
    public boolean login(User user){
        for(int i=0;i<list.size();i++){
            if(user.getUser().equalsIgnoreCase(list.get(i).getUser())&&user.getPassword().equalsIgnoreCase(list.get(i).getPassword())){
                return true;
            }
        }
        return false;
    }
    public void ds(){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).getUser());
        }
    }
    public List getList(){

        return list;
    }
}
