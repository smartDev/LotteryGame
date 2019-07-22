package com.lottery.game;

/**
 * Created by Tauheed yar khan.
 */
public class InvalidRequestException extends RuntimeException {

    public InvalidRequestException(String message) {
        super(message);
    }
}
