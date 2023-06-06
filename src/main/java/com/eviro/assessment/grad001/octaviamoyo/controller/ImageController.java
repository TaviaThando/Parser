package com.eviro.assessment.grad001.octaviamoyo.controller;

import org.springframework.core.io.FileSystemResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
@RequestMapping("/v1/api/image")
public class ImageController {

    @GetMapping(value = "/{name}/{surname}/{\\w\\.\\w")
    public FileSystemResource gethttpImageLink(@PathVariable String name, @PathVariable String surname){
        /**TODO
         * Return specified result
         */
        File file = new File("");
        return new FileSystemResource(file);
    }

}
