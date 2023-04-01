package com.bookingservice.booking.Repositories;

import java.util.UUID;

import com.bookingservice.booking.Entities.HotelAbs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.bookingservice.booking.Entities.NumberAbs;
/**
 *  __________________________________
 * | Основной класс-репозиторий      |
 * | номера                          |
 * |                                 |
 * |_________________________________|
 */
@NoRepositoryBean
public interface BaseNumberRepo<T extends HotelAbs, UUID> extends JpaRepository<NumberAbs, UUID> {


    UUID save(T entity);
}
