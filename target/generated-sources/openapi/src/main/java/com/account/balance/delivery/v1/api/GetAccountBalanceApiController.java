package com.account.balance.delivery.v1.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-02T23:20:59.219454+08:00[Australia/Perth]")

@Controller
@RequestMapping("${openapi.accountBalanceCheck.base-path:}")
public class GetAccountBalanceApiController implements GetAccountBalanceApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public GetAccountBalanceApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
