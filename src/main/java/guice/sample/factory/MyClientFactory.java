package guice.sample.factory;

import com.google.inject.Inject;
import com.google.inject.Provider;

import guice.sample.MyClient;

public class MyClientFactory {

  @Inject static Provider<MyClient> myClientProvider;

  public static MyClient getInstance() {
    return myClientProvider.get();
  }
}
