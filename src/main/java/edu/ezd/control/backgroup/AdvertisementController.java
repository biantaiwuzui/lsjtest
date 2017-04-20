package edu.ezd.control.backgroup;

import edu.ezd.model.Advertisement;
import edu.ezd.service.AdvertisementService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/advertisement")
public class AdvertisementController {
    private static final Logger log = Logger.getLogger(AdvertisementController.class);
    @Resource
    private AdvertisementService advertisementService;

    @GetMapping
    public String AdvertisementIndex(Model model){
        List<Advertisement> advertisements = advertisementService.findAll();
        model.addAttribute("advertisements",advertisements);
        return "Advertisement/index";
    }

    @GetMapping("/add")
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

    @PostMapping(value = "/del/{id}",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String delAdvertisement(@PathVariable int id){
        log.info("要删除的id"+id);

        boolean bl = advertisementService.delAdvertisement(id);
        if (bl){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }

}
