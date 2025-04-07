package com.davi.course.entities.enums;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELLED(5);

    private int code;
    private OrderStatus(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }

    public static OrderStatus getByCode(int code) {
        for (OrderStatus orderStatus : OrderStatus.values()) {
            if (orderStatus.getCode() == code) {
                return orderStatus;
            }
        }
        throw new IllegalArgumentException("OrderStatus with code " + code + " not found");
    }
}
