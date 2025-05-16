package Proring.Proring_prototype.converter;

import Proring.Proring_prototype.dto.test.TestResponse;

public class TestConverter {

    public static TestResponse.TempTestDTO toTempTestDTO(){
        return TestResponse.TempTestDTO.builder()
                .testString("테스트입니다.")
                .build();
    }

    public static TestResponse.TempExceptionDTO toTempExceptionDTO(Integer flag){
        return TestResponse.TempExceptionDTO.builder()
                .flag(flag)
                .build();
    }
}

