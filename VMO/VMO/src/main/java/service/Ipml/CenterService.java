package service.Ipml;

import entity.Center;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CenterRepository;
import service.ICenterService;

import java.util.List;
@Service
public class CenterService implements ICenterService {
    @Autowired
    public CenterRepository centerRepository;

    @Override
    public List<Center> getCenters() {
        return  centerRepository.getCenter();
    }

    public Center addCenter(Center center){
        if (center != null) {
            return centerRepository.save(center);
        }
        return null;
    }

    @Override
    public boolean deleteCenter(long centerid) {
        Center center = centerRepository.getById(centerid);
        if(center != null){
            centerRepository.delete(center);
            return true;
        }
        return false;
    }

    @Override
    public Center updateCenter(long centerid, Center center) {
        if(center != null){
            Center center1 = centerRepository.getById(centerid);
            if(center1 != null){
                center1.setCenterName(center.getCenterName());
                center1.setCenterid(center.getCenterid());
                return centerRepository.save(center1);
            }
        }
        return null;
    }

}
