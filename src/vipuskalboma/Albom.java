/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vipuskalboma;

/**
 *
 * @author Ростислав
 */
abstract class Albom {  
 /*5.	Производство альбомов музыкальной группы. 
    Группа издает альбомы в двух версиях: оригинальное издание
    (CD, карточки участников группы, тексты песен) и 
    специальное издание(CD, DVD c музыкальным видео и видео со съемок(making), 
    тексты песен, фотобук, общий плакат группы с автографами участников).
    В проекте присутствует класс, который генерирует дату релиза альбома.
*/
    String name;
    
    public String getCDName() {
        return name;
    }
    
}
class Originalniy extends Albom {
    int den;
    int mesyac;
    int god;
    public Originalniy() {
        this.name="Молодость";
        this.den=(int) (Math.random()*30+1);
        this.mesyac=(int) (Math.random()*12+1);
        this.god=(int) (Math.random()*6+2015);
    }
    public String toString(){
        System.out.println("Создание диска, двд с видео, текстов песен, фотографий и плаката");
        return "Диск с названием " + this.name + ". Произведен: " + this.den + "." + this.mesyac + "." +this.god;
    }
    
} 

class Specialnoe extends Albom {
    int den;
    int mesyac;
    int god;
    public Specialnoe() {
        this.name="Самое главное";
        this.den=(int) (Math.random()*30+1);
        this.mesyac=(int) (Math.random()*12+1);
        this.god=(int) (Math.random()*6+2015);
    } 
    public String toString(){
        System.out.println("Создание CD диска, карточек и текстов песен");
        return "Диск с названием " + this.name + ". Произведен: " + this.den + "." + this.mesyac + "." +this.god;
    }
} 




