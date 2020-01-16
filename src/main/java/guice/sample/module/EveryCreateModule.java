package guice.sample.module;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

import guice.sample.MyClient;

public class EveryCreateModule extends AbstractModule {

  @Override
  protected void configure() {
    try {
      bind(MyClient.class).toConstructor(MyClient.class.getConstructor(Integer.TYPE, String.class));
    } catch (NoSuchMethodException | SecurityException e) {
      throw new RuntimeException(e);
    }

    bind(Integer.class).annotatedWith(Names.named("id")).toInstance(Integer.valueOf(33));
    bind(String.class).annotatedWith(Names.named("name")).toInstance(String.valueOf("test"));
  }
}
