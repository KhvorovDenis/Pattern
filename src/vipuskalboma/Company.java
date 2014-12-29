/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vipuskalboma;

/**
 *
 * @author Денис
 */
class Company {
    public Albom nachat (String type) {
        Albom album;        
        album = vipusk(type);        
       
        return album;
    }
    protected Albom vipusk (String type){
        if (type.equals("O")) { 
            return new Originalniy();
        } else if (type.equals("S")) {
            return new Specialnoe();
        } else return null;
}
}