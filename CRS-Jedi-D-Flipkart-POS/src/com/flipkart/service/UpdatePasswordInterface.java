package com.flipkart.service;

import com.flipkart.exception.OldPasswordNotValidException;

public interface UpdatePasswordInterface {
    void updatePassword() throws OldPasswordNotValidException;
}
