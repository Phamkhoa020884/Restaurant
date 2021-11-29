package com.example.restaurant;

public enum Times {
    CA_NGAY("Cả ngày"), AN_TOI("Ăn Tối"), AN_TRUA("Ăn Trưa");
    private final String Thoi_gian;
    Times (String text){
        Thoi_gian = text;

    }
    public String toString() {
        return Thoi_gian;
    }

}
