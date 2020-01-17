package guice.sample.provider;

import com.google.inject.Inject;
import com.google.inject.Provider;

import guice.sample.Configuration;
import guice.sample.MyClient;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyClientProvider implements Provider<MyClient> {

  private final Configuration config;

  @Inject
  public MyClientProvider(Configuration config) {
    this.config = config;
  }

  public MyClient get() {
    log.info("called MyClientProvider.get");
    log.info("- config is not null: " + String.valueOf(config != null));
    return new MyClient(55, "provider");
  }
}
