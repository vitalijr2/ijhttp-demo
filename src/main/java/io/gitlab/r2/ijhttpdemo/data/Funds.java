package io.gitlab.r2.ijhttpdemo.data;

import java.math.BigDecimal;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.lang.NonNull;

@Table("FUNDS")
public class Funds {

  private BigDecimal credit;
  private String currency;

  public BigDecimal getCredit() {
    return credit;
  }

  @NonNull
  public void setCredit(BigDecimal credit) {
    this.credit = credit;
  }

  public String getCurrency() {
    return currency;
  }

  @Id
  public void setCurrency(String currency) {
    this.currency = currency;
  }

}
