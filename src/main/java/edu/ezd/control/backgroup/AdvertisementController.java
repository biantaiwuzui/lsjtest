package edu.ezd.control.backgroup;

import edu.ezd.model.Advertisement;
import edu.ezd.service.AdvertisementService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.validation.Valid;

@Controller
@RequestMapping("/advertisement")
public class AdvertisementController {
    private static final Logger log = Logger.getLogger(AdvertisementController.class);
    @Resource
    private AdvertisementService advertisementService;

    @GetMapping
    public String AdvertisementAddIndex(Advertisement advertisement){
        return "Advertisement/AdvertisementAdd";
    }
    @PostMapping("/add")
    public String addAdvertisement( Advertisement advertisement){
        advertisement.setAdvertisementImg("1.jpg");
        advertisement.setAdvertisingStatue(0);
        log.info("advertisement从表单中获取的内容:"+advertisement.toString());
        advertisementService.save(advertisement);
        return "Advertisement/index";
    }

}
