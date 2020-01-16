package guice.sample.module;

import com.google.inject.AbstractModule;

import guice.sample.Configuration;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ConfigModule extends AbstractModule {

  private final Configuration config;

  @Override
  public void configure() {
    bind(Configuration.class).toInstance(config);
  }
}
