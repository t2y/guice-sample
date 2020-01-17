package guice.sample.module;

import com.google.inject.AbstractModule;

import guice.sample.MyClient;
import guice.sample.provider.MyClientProvider;

public class ProviderModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(MyClient.class).toProvider(MyClientProvider.class).asEagerSingleton();
  }
}
