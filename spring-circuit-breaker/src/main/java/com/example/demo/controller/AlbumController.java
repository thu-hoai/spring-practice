package com.example.demo.controller;

import com.example.demo.model.Album;
import com.example.demo.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlbumController {

    @Autowired
    private AlbumService service;

    @GetMapping("/v1/albums")
    public List<Album> albums() {
        return service.getAlbumList();
    }
}