package com.bookingservice.booking.Enums;
/**
 *  __________________________________
 * | Тип номера                      |
 * |                                 |
 * |                                 |
 * |_________________________________|
 */

public enum Type{
 Classic (1),
 Luxe(2), 
 SuperLuxe(3),
 /**
 *
 */
Presidental(4);

 int x; 
    Type(int x){
        this.x = x;
    }

}