class MobilePhone{
    String companyname;
    int price;

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getCompanyname() {
        return companyname;
    }
    public void setCompanyname(String companyname){
        this.companyname=companyname;
    }
}

public class Hp_GetterSetter1 {
    public static void main(String[] args) {
     MobilePhone mp = new MobilePhone();
     mp.setPrice(13000);
     mp.setCompanyname("redmi");
        System.out.println(mp.getPrice());
        System.out.println(mp.getCompanyname());
    }
}
