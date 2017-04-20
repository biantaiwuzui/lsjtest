package edu.ezd.control.types;

import edu.ezd.model.SchoolType;
import edu.ezd.service.SchoolTypeService;
import edu.ezd.util.GsonUtil;
import edu.ezd.util.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by JayJay on 2017/4/20.
 */
@Controller
@RequestMapping("/schoolType")
public class SchoolTypeControler {
    @Resource
    private SchoolTypeService schoolTypeService;

    @GetMapping
    public String index(){
        return "schooltype";
    }
    @GetMapping(value = "/findAll",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String findAll(){
        List<SchoolType> schoolTypes = schoolTypeService.findAll();
        String json = GsonUtil.toJson(schoolTypes);
        return json;
    }

    @PostMapping("/{name}")
    public String save(@PathVariable String name){
        SchoolType schoolType = new SchoolType();
        schoolType.setSchoolTypeName(name);
        schoolTypeService.save(schoolType);
        return "redirect:/schoolType";
    }

    @PutMapping("/edit")
    public String update(SchoolType schoolType){
        schoolTypeService.update(schoolType);
        return "redirect:/schoolType";
    }


}
