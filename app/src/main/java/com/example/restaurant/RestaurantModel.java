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
                new RestaurantModel("Anrakutei- Nhà Hàng Thịt Nướng","59 Mạc Đỉnh Chi, Phường ĐaKao, Q1, HCM", BusinessType.NHA_HANG, Times.CA_NGAY, "13km","Giảm giá 50%",R.drawable.Hinh_Anrakutei),
                new RestaurantModel("Chang - Modern Thai Cuisine","11 Lê Thánh Tông, P Bến ngé,Quận 1, HCM", BusinessType.NHA_HANG, Times.AN_TOI, "10km","Giảm giá 10%",R.drawable.hinh_kangkangkun),
                new RestaurantModel("D'Maris - Buffet cao cấp - Pico Lotte","Tầng 5, Pico Plaza, Q5, HCM", BusinessType.NHA_HANG, Times.AN_TRUA, "9km","Giảm giá 5%",R.drawable.hinh_minhthu8),
                new RestaurantModel("Rin - Sushi - Nguyễn biểu","44 nguyễn Biểu, Phường Bình Tân, Quận 5, HCM", BusinessType.NHA_HANG, Times.CA_NGAY, "11km","Giảm giá 20%",R.drawable.hinh_kimbaphoangtu),
                new RestaurantModel("Anrakutei- Nhà Hàng Thịt Nướng","09 CMT8, Q3, HCM", BusinessType.NHA_HANG, Times.AN_TOI, "15km","Giảm giá 30%",R.drawable.hinh_phalaucomai),
                new RestaurantModel("Anrakutei- Nhà Hàng Thịt Nướng","33 Lý Thái TỔ, Phường 33, Quận Bình Tân, HCM", BusinessType.NHA_HANG, Times.AN_TRUA, "6km","Giảm giá 50%",R.drawable.hinh_pypofood),
                new RestaurantModel("Anrakutei- Nhà Hàng Thịt Nướng","69 Võ Văn Truyện, Phường 4, Quận Cái Răn, Tiền Giang", BusinessType.NHA_HANG, Times.CA_NGAY, "0.9km","Giảm giá 70%",R.drawable.hinh_royaltea),
                new RestaurantModel("Anrakutei- Nhà Hàng Thịt Nướng","223 Đường Hồ chí Minh, Phường Tân Định, Quận Phú Giáo, Bình Dương", BusinessType.NHA_HANG, Times.CA_NGAY, "0.5km","Giảm giá 90%",R.drawable.hinh_sucsongmoi),
                new RestaurantModel("Anrakutei- Nhà Hàng Thịt Nướng","332 Trần Phú, Phường 5,Quận Ninh Phú, Thái Nguyên", BusinessType.NHA_HANG, Times.AN_TRUA, "0.7km","Giảm giá 15%",R.drawable.hinh_tamky2),
                new RestaurantModel("Anrakutei- Nhà Hàng Thịt Nướng","1 Điện Biên Phủ, Phường 1, Quận Ninh An, Bạc Liên", BusinessType.NHA_HANG, Times.AN_TOI, "0.9km","Giảm giá 50%",R.drawable.hinh_tocotoco),
                new RestaurantModel("Anrakutei- Nhà Hàng Thịt Nướng","55 Lý Thánh Tông, P1, Q4, HCM", BusinessType.NHA_HANG, Times.AN_TRUA, "10km","Giảm giá 43%",R.drawable.hinh_xienquengon),
                new RestaurantModel("Anrakutei- Nhà Hàng Thịt Nướng","1114  Lý Thường Kiệt, P4, Q3, HCM", BusinessType.NHA_HANG, Times.AN_TOI, "1km","Giảm giá 22%",R.drawable.hinhhoc),
                new RestaurantModel("Anrakutei- Nhà Hàng Thịt Nướng","44 Trần hưng Đạo, P3, Q1, HCM", BusinessType.NHA_HANG, Times.CA_NGAY, "0.5km","Giảm giá 10%",R.drawable.hinh_tocotoco),
                new RestaurantModel("Anrakutei- Nhà Hàng Thịt Nướng","42 , Q1, HCM", BusinessType.NHA_HANG, Times.AN_TOI, "0.1km","Giảm giá 33%",R.drawable.hinh_sucsongmoi),
                new RestaurantModel("Anrakutei- Nhà Hàng Thịt Nướng","533 Mạc Đỉnh Chi, Phường ĐaKao, Q1, HCM", BusinessType.NHA_HANG, Times.AN_TRUA, "0.6km","Giảm giá 99%",R.drawable.hinh_phalaucomai),
                new RestaurantModel("Anrakutei- Nhà Hàng Thịt Nướng","59 Võ Thị Minh Khai, P 4, Q4, HCM", BusinessType.NHA_HANG, Times.CA_NGAY, "0.3km","Giảm giá 45%",R.drawable.hinh_kimbaphoangtu),


        );

    }
}
