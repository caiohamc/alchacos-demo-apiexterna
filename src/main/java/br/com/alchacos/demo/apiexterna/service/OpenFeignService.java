package br.com.alchacos.demo.apiexterna.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "githubClient", url = "https://api.github.com")
public interface OpenFeignService {

    @GetMapping("/users/{username}")
    String getGitHubUser(@PathVariable("username") String username);
}