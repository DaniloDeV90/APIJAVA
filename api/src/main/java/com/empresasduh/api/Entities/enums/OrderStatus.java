package com.empresasduh.api.Entities.enums;

public enum OrderStatus {
    WAITTING_PAYMENT(1),
    PAID(2),
    SHIIPED(3),
    DELIVERED(4),
    CANCELED(5);

    private  int code;
    private  OrderStatus (int code) {
        this.code = code;
    }

     public   int getCode () {
        return code;
    }

    public  static  OrderStatus valueOf (int code) {
        for (OrderStatus s: OrderStatus.values()
             ) {
            if (s.getCode() == code) return s;
        }
        throw  new IllegalStateException("Ivalide OrderStatus code");

    }
}
