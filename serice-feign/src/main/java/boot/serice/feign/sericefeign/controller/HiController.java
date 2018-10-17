package boot.serice.feign.sericefeign.controller;

import boot.serice.feign.sericefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    private SchedualServiceHi serviceHi;
    @GetMapping(value = "/hi")
    public String say(@RequestParam String name) {
        return serviceHi.sayHiFormFeignClint(name);
    }

}
