package com.bookingservice.Repositories;

import java.util.UUID;

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
public interface BaseNumberRepo<T extends NumberAbs> extends JpaRepository<T, UUID> {

    
}
