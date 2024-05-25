package br.com.alchacos.demo.apiexterna.controller;

import br.com.alchacos.demo.apiexterna.service.HttpClientService;
import br.com.alchacos.demo.apiexterna.service.OkHttpService;
import br.com.alchacos.demo.apiexterna.service.OpenFeignService;
import br.com.alchacos.demo.apiexterna.service.RestTemplateService;
import br.com.alchacos.demo.apiexterna.service.WebClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class ApiExternaController {

    private final HttpClientService httpClientService;
    private final OkHttpService okHttpService;
    private final OpenFeignService openFeignService;
    private final RestTemplateService restTemplateService;
    private final WebClientService webClientService;

    @GetMapping("/httpclient/{username}")
    public String getUserWithHttpClient(@PathVariable String username) throws IOException {
        return this.httpClientService.getGitHubUser(username);
    }

    @GetMapping("/okhttp/{username}")
    public String getUserWithOkHttp(@PathVariable String username) throws IOException {
        return this.okHttpService.getGitHubUser(username);
    }

    @GetMapping("/openfeign/{username}")
    public String getUserWithOpenFeign(@PathVariable String username) {
        return this.openFeignService.getGitHubUser(username);
    }

    @GetMapping("/resttemplate/{username}")
    public String getUserWithRestTemplate(@PathVariable String username) {
        return this.restTemplateService.getGitHubUser(username);
    }

    @GetMapping("/webclient/{username}")
    public String getUserWithWebClient(@PathVariable String username) {
        return this.webClientService.getGitHubUser(username).block();
    }
}