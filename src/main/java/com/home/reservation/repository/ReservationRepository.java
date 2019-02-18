package com.home.reservation.repository;

import org.springframework.data.repository.CrudRepository;

import com.home.reservation.entity.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation,String> {

}
