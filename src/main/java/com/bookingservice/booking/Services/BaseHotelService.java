package com.bookingservice.booking.Services;

import java.util.Optional;

import com.bookingservice.Repositories.BaseHotelRepo;
import com.bookingservice.booking.Entities.HotelAbs;

public interface BaseHotelService<T extends HotelAbs>{
    BaseHotelRepo<T> getRepository();

    default T create(T t){
        return getRepository().saveAndFlush(t);
    }
}