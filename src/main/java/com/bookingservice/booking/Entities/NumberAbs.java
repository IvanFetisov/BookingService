package com.bookingservice.booking.Entities;

import java.util.List;
import java.util.UUID;

import com.bookingservice.booking.Enums.Type;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *  __________________________________
 * | Основная абстрактная сущность   |
 * | номера                          |
 * |                                 |
 * |_________________________________|
 */ 
@MappedSuperclass        
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public abstract class NumberAbs{
    private UUID id;
    private String name;
    private HotelAbs hotelAbs;
    private Type type;
    private float rating;
    private List<UUID> photos;
}