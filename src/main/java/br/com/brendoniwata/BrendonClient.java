package br.com.brendoniwata;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "${feign.name.site}", url = "${feign.url.site}")
public interface BrendonClient {

    @GetMapping
    String getPokemon();
}
