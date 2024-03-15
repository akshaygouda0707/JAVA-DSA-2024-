public class AdComplexNum {
    int real;
    int image;
    public AdComplexNum(int r,int i){
        this.real=r;
        this.image=i;

    }
public void show(){
    System.out.println(this.real+"+i"+this.image);

}
public static AdComplexNum add(AdComplexNum n1,AdComplexNum n2){
    AdComplexNum res=new AdComplexNum(0, 0);
    res.real=n1.real+n2.real;
    res.image=n1.image+n2.image;
    return res;
}

    public static void main(String[] args) {
        AdComplexNum c1=new AdComplexNum(4,5 );
        AdComplexNum c2=new AdComplexNum(10, 5);
        c1.show();
        c2.show();
        AdComplexNum res=add(c1, c2);
        res.show();
        
    }
}
