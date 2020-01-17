package guice.sample.module;

import com.google.inject.AbstractModule;

import guice.sample.factory.MyClientFactory;

public class StaticInjectionModule extends AbstractModule {

  @Override
  public void configure() {
    requestStaticInjection(MyClientFactory.class);
  }
}
