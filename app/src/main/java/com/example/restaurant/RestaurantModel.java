package com.example.restaurant;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class RestaurantModel {
    private String name;
    private String address;
    private BusinessType businessType;
    private Times times ;
    private float distance;
    private  float Sales;

    private int image;

    public RestaurantModel(String s) {
    }


    public RestaurantModel(String name, String address, BusinessType businessType, Times times, float distance, float sales, int image) {
        this.name = name;
        this.address = address;
        this.businessType = businessType;
        this.times = times;
        this.distance = distance;
        Sales = sales;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BusinessType getBusinessType() {
        return businessType;
    }

    public void setBusinessType(BusinessType businessType) {
        this.businessType = businessType;
    }

    public Times getTimes() {
        return times;
    }

    public void setTimes(Times times) {
        this.times = times;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public float getSales() {
        return Sales;
    }

    public void setSales(float sales) {
        Sales = sales;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "RestaurantModel{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", businessType=" + businessType +
                ", times=" + times +
                ", distance=" + distance +
                ", Sales=" + Sales +
                ", image=" + image +
                '}';
    }

    public static List<RestaurantModel> getmock(){
        List<RestaurantModel> = Arrays.asList(
                new RestaurantModel("Anrakutei- Nh?? H??ng Th???t N?????ng","59 M???c ?????nh Chi, Ph?????ng ??aKao, Q1, HCM", BusinessType.NHA_HANG, Times.CA_NGAY, "13km","Gi???m gi?? 50%",R.drawable.Hinh_Anrakutei),
                new RestaurantModel("Chang - Modern Thai Cuisine","11 L?? Th??nh T??ng, P B???n ng??,Qu???n 1, HCM", BusinessType.NHA_HANG, Times.AN_TOI, "10km","Gi???m gi?? 10%",R.drawable.hinh_kangkangkun),
                new RestaurantModel("D'Maris - Buffet cao c???p - Pico Lotte","T???ng 5, Pico Plaza, Q5, HCM", BusinessType.NHA_HANG, Times.AN_TRUA, "9km","Gi???m gi?? 5%",R.drawable.hinh_minhthu8),
                new RestaurantModel("Rin - Sushi - Nguy???n bi???u","44 nguy???n Bi???u, Ph?????ng B??nh T??n, Qu???n 5, HCM", BusinessType.NHA_HANG, Times.CA_NGAY, "11km","Gi???m gi?? 20%",R.drawable.hinh_kimbaphoangtu),
                new RestaurantModel("Anrakutei- Nh?? H??ng Th???t N?????ng","09 CMT8, Q3, HCM", BusinessType.NHA_HANG, Times.AN_TOI, "15km","Gi???m gi?? 30%",R.drawable.hinh_phalaucomai),
                new RestaurantModel("Anrakutei- Nh?? H??ng Th???t N?????ng","33 L?? Th??i T???, Ph?????ng 33, Qu???n B??nh T??n, HCM", BusinessType.NHA_HANG, Times.AN_TRUA, "6km","Gi???m gi?? 50%",R.drawable.hinh_pypofood),
                new RestaurantModel("Anrakutei- Nh?? H??ng Th???t N?????ng","69 V?? V??n Truy???n, Ph?????ng 4, Qu???n C??i R??n, Ti???n Giang", BusinessType.NHA_HANG, Times.CA_NGAY, "0.9km","Gi???m gi?? 70%",R.drawable.hinh_royaltea),
                new RestaurantModel("Anrakutei- Nh?? H??ng Th???t N?????ng","223 ???????ng H??? ch?? Minh, Ph?????ng T??n ?????nh, Qu???n Ph?? Gi??o, B??nh D????ng", BusinessType.NHA_HANG, Times.CA_NGAY, "0.5km","Gi???m gi?? 90%",R.drawable.hinh_sucsongmoi),
                new RestaurantModel("Anrakutei- Nh?? H??ng Th???t N?????ng","332 Tr???n Ph??, Ph?????ng 5,Qu???n Ninh Ph??, Th??i Nguy??n", BusinessType.NHA_HANG, Times.AN_TRUA, "0.7km","Gi???m gi?? 15%",R.drawable.hinh_tamky2),
                new RestaurantModel("Anrakutei- Nh?? H??ng Th???t N?????ng","1 ??i???n Bi??n Ph???, Ph?????ng 1, Qu???n Ninh An, B???c Li??n", BusinessType.NHA_HANG, Times.AN_TOI, "0.9km","Gi???m gi?? 50%",R.drawable.hinh_tocotoco),
                new RestaurantModel("Anrakutei- Nh?? H??ng Th???t N?????ng","55 L?? Th??nh T??ng, P1, Q4, HCM", BusinessType.NHA_HANG, Times.AN_TRUA, "10km","Gi???m gi?? 43%",R.drawable.hinh_xienquengon),
                new RestaurantModel("Anrakutei- Nh?? H??ng Th???t N?????ng","1114  L?? Th?????ng Ki???t, P4, Q3, HCM", BusinessType.NHA_HANG, Times.AN_TOI, "1km","Gi???m gi?? 22%",R.drawable.hinhhoc),
                new RestaurantModel("Anrakutei- Nh?? H??ng Th???t N?????ng","44 Tr???n h??ng ?????o, P3, Q1, HCM", BusinessType.NHA_HANG, Times.CA_NGAY, "0.5km","Gi???m gi?? 10%",R.drawable.hinh_tocotoco),
                new RestaurantModel("Anrakutei- Nh?? H??ng Th???t N?????ng","42 , Q1, HCM", BusinessType.NHA_HANG, Times.AN_TOI, "0.1km","Gi???m gi?? 33%",R.drawable.hinh_sucsongmoi),
                new RestaurantModel("Anrakutei- Nh?? H??ng Th???t N?????ng","533 M???c ?????nh Chi, Ph?????ng ??aKao, Q1, HCM", BusinessType.NHA_HANG, Times.AN_TRUA, "0.6km","Gi???m gi?? 99%",R.drawable.hinh_phalaucomai),
                new RestaurantModel("Anrakutei- Nh?? H??ng Th???t N?????ng","59 V?? Th??? Minh Khai, P 4, Q4, HCM", BusinessType.NHA_HANG, Times.CA_NGAY, "0.3km","Gi???m gi?? 45%",R.drawable.hinh_kimbaphoangtu),


        );

    }
}
