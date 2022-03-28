/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appsdeveloperblog.photoapp.api.albums.service;

import com.appsdeveloperblog.photoapp.api.albums.dao.AlbumsRepository.AlbumsRepository;
import com.appsdeveloperblog.photoapp.api.albums.data.AlbumEntity;
import java.util.ArrayList;
import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AlbumsServiceImpl implements AlbumsService {

    private final AlbumsRepository albumsRepository;

    @Override
    public List<AlbumEntity> getAlbums(String userId) {
//        List<AlbumEntity> returnValue = new ArrayList<>();
//
//        AlbumEntity albumEntity = new AlbumEntity();
//        albumEntity.setUserId(userId);
//        albumEntity.setAlbumId("album1Id");
//        albumEntity.setDescription("album 1 description");
//        albumEntity.setId(1L);
//        albumEntity.setName("album 1 name");
//
//        AlbumEntity albumEntity2 = new AlbumEntity();
//        albumEntity2.setUserId(userId);
//        albumEntity2.setAlbumId("album2Id");
//        albumEntity2.setDescription("album 2 description");
//        albumEntity2.setId(2L);
//        albumEntity2.setName("album 2 name");
//
//        returnValue.add(albumEntity);
//        returnValue.add(albumEntity2);
        
        return albumsRepository.findAllByUserId(userId);
    }

    @Override
    public AlbumEntity addAlbumToUser(AlbumEntity albumEntity, String userId) {
        albumEntity.setUserId(userId);
        return albumsRepository.save(albumEntity);
    }

}
