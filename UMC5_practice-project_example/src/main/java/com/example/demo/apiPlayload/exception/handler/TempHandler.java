package com.example.demo.apiPlayload.exception.handler;

import com.example.demo.apiPlayload.code.BaseErrorCode;
import com.example.demo.apiPlayload.exception.GeneralException;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
