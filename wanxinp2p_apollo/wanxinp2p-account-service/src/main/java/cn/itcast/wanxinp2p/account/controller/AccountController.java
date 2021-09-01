package cn.itcast.wanxinp2p.account.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "统一账户服务API" )
public class AccountController {

    @ApiOperation("测试")
    @GetMapping("hello")
    public String hello(){
        return "hello";
    }


}
