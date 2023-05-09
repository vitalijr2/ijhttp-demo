package io.gitlab.r2.ijhttpdemo;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class TreasureApplication {

  public static void main(String[] args) {
    new SpringApplicationBuilder(TreasureApplication.class)
        .bannerMode(Banner.Mode.OFF)
        .run(args);
  }

}
