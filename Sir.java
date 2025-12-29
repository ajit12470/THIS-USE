public class Sir {
    int sirid;
    String sirname;
    String sirteach;
    void insertData(int sirid,String sirname,String sirteach){
        this.sirid=sirid;
        this.sirname=sirname;
        this.sirteach=sirteach;
        this.display();//used display only automatically call this 
    }
    void display(){
        System.out.println("sirid is: "+sirid);
        System.out.println("sirname is: "+sirname);
        System.out.println("sirteach is: "+sirteach);
        System.out.println();
    }
    public static void main(String []args){
        Sir s1=new Sir();
        s1.insertData(102, "rajesh ", "math");
        s1.insertData(103, "rahul", "english");

    }
}
