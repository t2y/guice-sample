package guice.sample;

import com.google.inject.Inject;
import com.google.inject.Provider;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyClientProvider implements Provider<MyClient> {

  private final Configuration config;

  @Inject
  public MyClientProvider(Configuration config) {
    this.config = config;
  }

  public MyClient get() {
    log.info("MyClientProvider.get: " + this.config.hashCode());
    return new MyClient(55, "provider");
  }
}
