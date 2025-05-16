package Proring.Proring_prototype.controller;

import Proring.Proring_prototype.apiPayload.ApiResponse;
import Proring.Proring_prototype.converter.TestConverter;
import Proring.Proring_prototype.dto.test.TestResponse;
import Proring.Proring_prototype.service.testService.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {
    private final TestService testService;

    @GetMapping("/exception")
    public ApiResponse<TestResponse.TempExceptionDTO> exceptionAPI(@RequestParam("flag") Integer flag){
        testService.CheckFlag(flag);
        return ApiResponse.onSuccess(TestConverter.toTempExceptionDTO(flag));
    }
}
