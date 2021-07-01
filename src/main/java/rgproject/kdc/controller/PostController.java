package rgproject.kdc.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class PostController {

    @GetMapping
    public void savePost() {

    }

    @GetMapping
    public String postView() {
        return "";
    }

    @GetMapping
    public void deletePost(){

    }

    @GetMapping
    public void updatePost(){

    }
}