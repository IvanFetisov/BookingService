package com.bookingservice.booking.Services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.bookingservice.booking.Entities.HotelAbs;
import com.bookingservice.booking.Exceptions.NotFoundExeption;

public interface BaseHotelService<T extends HotelAbs, UUID> {
    public abstract T save(T entity);
    public abstract List<T> findAll(); 

    public abstract Optional<T> findById(UUID entityId);
    public abstract T update(T entity);
    public abstract T updateById(T entity, UUID entityId) throws NotFoundExeption;
    public abstract void delete(T entity);
    public abstract void deleteById(UUID entityId);
    // other methods u might need to be generic
    
}
