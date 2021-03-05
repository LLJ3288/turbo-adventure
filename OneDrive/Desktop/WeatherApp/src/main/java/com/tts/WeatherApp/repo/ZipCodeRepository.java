package com.tts.WeatherApp.repo;

//import com.tts.WeatherApp.model.ZipCode;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//
//
//@Repository             //added
//public interface ZipCodeRepository extends CrudRepository<ZipCode, Long> {
//
//    List<ZipCode> findAll();
//    ZipCode deleteById(long id);
//    ZipCode findById(long id);
// //   List<ZipCode> save(long id);           //added
//
//}


import com.tts.WeatherApp.model.ZipCode;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZipCodeRepository extends PagingAndSortingRepository<ZipCode, Long> {
}