package guice.sample;

import javax.inject.Inject;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class MyApp {
  @Inject private MyClient myClient1;
  @Inject private MyClient myClient2;

  public void run() {
    log.info("myApp.client.id1: " + this.myClient1.getId());
    log.info("myApp.client.hash1: " + this.myClient1.hashCode());

    log.info("myApp.client.id2: " + this.myClient2.getId());
    log.info("myApp.client.hash2: " + this.myClient2.hashCode());

    log.info("------------------------------------------------------------------------");
  }
}
