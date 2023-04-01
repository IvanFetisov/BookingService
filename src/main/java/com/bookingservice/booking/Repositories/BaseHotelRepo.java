package com.bookingservice.booking.Repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.bookingservice.booking.Entities.HotelAbs;
/**
 *  __________________________________
 * | Основной класс-репозиторий отеля|
 * |                                 |
 * |                                 |
 * |_________________________________|
 */
@Repository
public interface BaseHotelRepo<T extends HotelAbs, UUID> extends JpaRepository<T , UUID> {


    UUID save(T entity);

    Optional<T> findById();

    Optional<T> findById(UUID entityID);

    void delete(T entity);

    void deleteByID(UUID entityId);
}
