package io.gitlab.r2.ijhttpdemo.service;

import io.gitlab.r2.ijhttpdemo.data.Funds;
import io.gitlab.r2.ijhttpdemo.data.FundsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class WealthService {

  private final Logger logger = LoggerFactory.getLogger(getClass());
  private final FundsRepository fundsRepository;

  WealthService(FundsRepository fundsRepository) {
    this.fundsRepository = fundsRepository;

    if (logger.isInfoEnabled()) {
      var builder = new StringBuilder("Funds: ");
      fundsRepository.findAll().forEach(funds -> builder.append(funds.getCurrency()).append(", "));
      logger.info(builder.toString());
    }
  }

  public Iterable<Funds> funds() {
    return fundsRepository.findAll();
  }

}
