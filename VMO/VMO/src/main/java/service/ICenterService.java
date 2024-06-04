package service;


import entity.Center;

import java.util.List;

public interface ICenterService {
    // lay ra danh sach center
     List<Center> getCenters();

    // add center
     Center addCenter(Center center);

    //delete center
     boolean deleteCenter(long centerid);


    //update center

     Center updateCenter(long centerid,Center center);



}
