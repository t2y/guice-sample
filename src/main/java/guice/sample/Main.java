package guice.sample;

import com.google.inject.Guice;

import guice.sample.module.ConfigModule;
import guice.sample.module.EveryCreateModule;
import guice.sample.module.ProviderModule;
import guice.sample.module.SingletonModule;
import lombok.val;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

  private static void runSimple(Configuration config) {
    val injector1 = Guice.createInjector(new SingletonModule(), new ConfigModule(config));
    val myApp1 = injector1.getInstance(MyApp.class);
    log.info("myApp1.hash: " + myApp1.hashCode());
    myApp1.run();

    val injector2 = Guice.createInjector(new EveryCreateModule(), new ConfigModule(config));
    val myApp2 = injector2.getInstance(MyApp.class);
    log.info("myApp2.hash: " + myApp2.hashCode());
    myApp2.run();

    val injector3 = Guice.createInjector(new ProviderModule(), new ConfigModule(config));
    val myApp3 = injector3.getInstance(MyApp.class);
    log.info("myApp3.hash: " + myApp3.hashCode());
    myApp3.run();
  }

  public static void main(String[] args) {
    val config = new Configuration(args);
    runSimple(config);
  }
}
