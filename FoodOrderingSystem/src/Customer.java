/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MUHAMMAD FASEEH
 */
public class Customer {
    private String name,email,p_no,address;
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getP_no(){
        return p_no;  
    }
    public String getAddress(){
        return address;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setP_no(String p_no){
        this.p_no=p_no;
    }
    public void setAddress(String address){
        this.address=address;
    }
}
