public class Phone1 {
    int phoneid;
    String phonename;
    String phonemodel;
    Phone1 insertData(int phoneid,String phonename,String phonemodel){
        this.phoneid=phoneid;
        this.phonename=phonename;
        this.phonemodel=phonemodel;
        return this;

    }
    Phone1 display(){
        System.out.println("Phone Id is: "+phoneid);
        System.out.println("Phone Name is: "+phonename);
        System.out.println("Phone Model is: "+phonemodel);
        return this;
    }
    Phone1 show(){
        System.out.println("this is called argument:");
        return this;
    }
    void get(){
         System.out.println("hello get method :");
    }
    public static void main(String []args){
        new Phone1().insertData(10210210, "Realme", "realme123").display().show().get();
        
        

    }
}
