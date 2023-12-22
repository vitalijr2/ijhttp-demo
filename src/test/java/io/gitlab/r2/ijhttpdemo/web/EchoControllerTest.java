package io.gitlab.r2.ijhttpdemo.web;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import org.apache.commons.exec.Executor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.server.LocalServerPort;
import uk.bot_by.ijhttp_tools.command_line.HttpClientCommandLine;
import uk.bot_by.ijhttp_tools.spring_boot_test.AutoConfigureHttpClientCommandLine;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureHttpClientCommandLine
class EchoControllerTest {

  @Autowired
  private Executor executor;

  @Autowired
  private HttpClientCommandLine httpClientCommandLine;

  @LocalServerPort
  private int port;

  @Test
  void httpClientCommandLine() throws IOException {
    // given
    httpClientCommandLine.environmentVariable("localport=" + port);

    // when && then
    assertEquals(0, executor.execute(httpClientCommandLine.getCommandLine()));
  }

}