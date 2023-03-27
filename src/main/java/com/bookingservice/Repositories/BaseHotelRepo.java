package com.bookingservice.Repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.bookingservice.booking.Entities.HotelAbs;
/**
 *  __________________________________
 * | Основной класс-репозиторий отеля|
 * |                                 |
 * |                                 |
 * |_________________________________|
 */
@NoRepositoryBean
public interface BaseHotelRepo<T extends HotelAbs> extends JpaRepository<T , UUID> {
    
}
