package guice.sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.google.inject.Guice;

import org.junit.jupiter.api.Test;

import guice.sample.module.SingletonModule;
import lombok.val;

class MainTest {
  @Test
  void testApp() {
    val injector = Guice.createInjector(new SingletonModule());
    val myApp = injector.getInstance(MyApp.class);
    assertEquals(myApp.getMyClient1().hashCode(), myApp.getMyClient2().hashCode());
  }
}
