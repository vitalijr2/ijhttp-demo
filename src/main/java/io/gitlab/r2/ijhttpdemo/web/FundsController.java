package io.gitlab.r2.ijhttpdemo.web;

import io.gitlab.r2.ijhttpdemo.data.Funds;
import io.gitlab.r2.ijhttpdemo.service.WealthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FundsController {

  private final WealthService service;

  FundsController(WealthService service) {
    this.service = service;
  }

  @GetMapping("/funds")
  public Iterable<Funds> funds() {
    return service.funds();
  }

}
