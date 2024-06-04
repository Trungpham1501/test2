package controller;

import entity.Center;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ICenterService;

import java.util.List;

@RestController
@RequestMapping("/center")
public class CenterController {
    @Autowired
    private ICenterService iCenterService;

    @PostMapping("/add")
    public Center addCenter(@RequestBody Center center)
    {
        return iCenterService.addCenter(center);
    }

    @PutMapping("/update")
    public Center updateCenter(@RequestParam("id") long centerid , @RequestBody Center center){
        return iCenterService.updateCenter(centerid, center);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteCenter(@PathVariable("centerid") long centerid){
        return iCenterService.deleteCenter(centerid);
    }

    public List<Center> getCenters() {
        return iCenterService.getCenters();
    }
}
