package com.example.demo.apiPlayload.exception.handler;

import com.example.demo.apiPlayload.code.BaseErrorCode;
import com.example.demo.apiPlayload.exception.GeneralException;

public class FoodCategoryHandler extends GeneralException {
    public FoodCategoryHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
