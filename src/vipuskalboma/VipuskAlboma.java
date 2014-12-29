package vipuskalboma;

public class VipuskAlboma {

    public static void main(String[] args) {
       
        Company cmp=new Company();        
       
        Albom album = cmp.nachat("O");
        System.out.println(album);
        album = cmp.nachat("S");
        System.out.println(album);
    }
    
}


