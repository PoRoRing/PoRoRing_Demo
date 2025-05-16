package Proring.Proring_prototype.apiPayload.exception.handler;

import Proring.Proring_prototype.apiPayload.code.BaseErrorCode;
import Proring.Proring_prototype.apiPayload.exception.GeneralException;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
