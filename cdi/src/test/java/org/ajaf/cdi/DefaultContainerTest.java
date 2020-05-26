package org.ajaf.cdi;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class DefaultContainerTest {

  @Test
  void shouldReturnInjectableWhenAddToComponent () {
    Container container = new DefaultContainer();
    container.addInjectable(Map.class);

    HashMap foo = container.getInjectable(Map.class, HashMap.class);

    assertThat(foo).isExactlyInstanceOf(HashMap.class);
  }

  @Test
  void shouldNotReturnInjectableWhenDoNotAddToComponent() {
    Container container = new DefaultContainer();

    HashMap foo = container.getInjectable(Map.class, HashMap.class);

    assertThat(foo).isNull();
  }

}