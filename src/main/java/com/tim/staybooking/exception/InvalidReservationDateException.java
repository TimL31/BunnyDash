package com.tim.staybooking.exception;

public class InvalidReservationDateException extends RuntimeException{
    public InvalidReservationDateException(String message) {
        super(message);
    }
}
