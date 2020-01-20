package guice.sample.module;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

import guice.sample.Configuration;
import guice.sample.MySingleton;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ConfigModule extends AbstractModule {

  private final Configuration config;

  @Override
  public void configure() {
    bind(Configuration.class).toInstance(config);
    bind(MySingleton.class).in(Singleton.class);
  }
}
