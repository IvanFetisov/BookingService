package com.bookingservice.booking.Repositories;

import com.bookingservice.booking.Entities.HotelAbs;
import com.bookingservice.booking.Entities.NumberAbs;
import com.bookingservice.booking.Exceptions.NotFoundExeption;
import com.bookingservice.booking.Services.BaseNumberService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public abstract class BaseNumberRepoImpl<T extends NumberAbs, UUID> implements BaseNumberService<T,UUID> {

    private BaseNumberRepo<T, UUID> baseNumberRepo;

    public BaseNumberRepoImpl(BaseNumberRepo<T,UUID> baseHotelRepo){
        this.baseNumberRepo=baseHotelRepo;
    }
    @Override
    public T save(T entity){
        return (T) baseNumberRepo.save(entity);
    }
    @Override
    public List<T> findAll(){
        return baseNumberRepo.findAll();
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

