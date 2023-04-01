package com.bookingservice.booking.Repositories;

import com.bookingservice.booking.Exceptions.NotFoundExeption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.bookingservice.booking.Services.BaseHotelService;
import com.bookingservice.booking.Entities.HotelAbs;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;
/**
 *  __________________________________
 * | Базовый класс имплементации репо|
 * |зитория                          |
 * |                                 |
 * |_________________________________|
 */
@Repository
@Transactional
public abstract class BaseHotelRepoImpl<T extends HotelAbs, UUID> implements BaseHotelService<T,UUID>{

    private BaseHotelRepo<T, UUID> baseHotelRepo;

    @Autowired
    public BaseHotelRepoImpl(BaseHotelRepo<T,UUID> baseHotelRepo){
        this.baseHotelRepo=baseHotelRepo;
    }
    @Override
    public T save(T entity){
        return (T) baseHotelRepo.save(entity);
    }
    @Override
    public List<T> findAll(){
        return baseHotelRepo.findAll();
    }
    @Override
    public Optional<T> findById(UUID hotelUUID){
        return baseHotelRepo.findById();
    }
    @Override
    public T update(T entity){
        return (T) baseHotelRepo.save(entity);
    }
    @Override
    public T updateById(T entity, UUID entityID) throws NotFoundExeption {
        Optional<T> optional = baseHotelRepo.findById(entityID);
        if(optional.isPresent()){
            return (T) baseHotelRepo.save(entity);
        } else {
            throw  new NotFoundExeption("Cannot find entity by this id");
        }
    }
    @Override
    public void delete(T entity){
        baseHotelRepo.delete(entity);
    }
    @Override
    public void deleteById(UUID entityId){
        baseHotelRepo.deleteByID(entityId);
    }
}
