package guice.sample;

import com.google.inject.name.Named;

import javax.inject.Inject;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class MyClient {

  private final int id;
  private final String name;

  @Inject
  public MyClient(@Named("id") int id, @Named("name") String name) {
    this.id = id;
    this.name = name;
  }
}
