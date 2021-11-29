package com.example.restaurant;

public enum BusinessType {
    NHA_HANG("Nhà Hàng"), GIA_DINH("Nhà hàng/Gia đình/Nhóm Hội"), BUFFET("Buffer/Buffet"), QUAN_AN(" Quán ăn/Gia đình/Nhóm Hội")

    private final String name;

    BusinessType(String text) {
        name = text;
    }

    public String toString() {
        return name;
    }
}
