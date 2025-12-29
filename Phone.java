public class Phone {
    int phoneid;
    String phonename;
    String phonemodel;
    void insertData(int phoneid,String phonename,String phonemodel){
        this.phoneid=phoneid;
        this.phonename=phonename;
        this.phonemodel=phonemodel;
        

    }
    void display(){
        System.out.println("Phone Id is: "+phoneid);
        System.out.println("Phone Name is: "+phonename);
        System.out.println("Phone Model is: "+phonemodel);
        show(this);
    }
    void show(Phone p){
        System.out.println("this is called argument:");
    }
    public static void main(String []args){
        Phone p=new Phone();
        p.insertData(10210210, "Realme", "realme123");
        p.display();

    }
}
