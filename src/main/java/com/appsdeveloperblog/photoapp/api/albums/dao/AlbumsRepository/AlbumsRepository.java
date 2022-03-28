package com.appsdeveloperblog.photoapp.api.albums.dao.AlbumsRepository;

import com.appsdeveloperblog.photoapp.api.albums.data.AlbumEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumsRepository extends MongoRepository<AlbumEntity, String> {

    List<AlbumEntity> findAllByUserId(String userId);

//    @Autowired
//    private MongoTemplate mongoTemplate;

//    public List<AlbumEntity> findAlbumById(String userId) {
//        return mongoTemplate.findDistinct(userId, AlbumEntity.class, AlbumEntity.class);
//    }
    AlbumEntity insert(AlbumEntity albumEntity);

}
