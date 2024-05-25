package br.com.alchacos.demo.apiexterna.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Service
public class RestTemplateService {

    private final RestTemplate restTemplate;

    public String getGitHubUser(String username) {
        String url = "https://api.github.com/users/" + username;
        return restTemplate.getForObject(url, String.class);
    }
}