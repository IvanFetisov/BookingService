    package com.bookingservice.booking.Entities;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 *  __________________________________
 * | Основная абстрактная сущность   |
 * | отеля                           |
 * |                                 |
 * |_________________________________|
 */
@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public abstract class HotelAbs {
    private UUID id;
    private String hotelName;
    private String hotelAddress; 
    private Integer rating; 
    private String city;
    private String Country; 
    private List<NumberAbs> numberAbs;
}