package org.ajaf.cdi;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DefaultContainerTest {

  private Container container;

  @BeforeAll
  void before () {
    container = new DefaultContainer();
  }

  @Test
  void shouldReturnInstanceWhenGetByInterface () throws Exception {
    container.addInjectable(A.class);

    B foo = container.getInjectable(B.class);

    assertThat(foo)
        .isNotNull()
        .isExactlyInstanceOf(A.class);
  }

  @Test
  void shouldReturnInstanceWhenGetByImplementation () throws Exception {
    container.addInjectable(A.class);

    A foo = container.getInjectable(A.class);

    assertThat(foo)
        .isNotNull()
        .isExactlyInstanceOf(A.class);
  }

  @Test
  void shouldReturnInstanceWhenInjectToContainer () throws Exception {

  }

  interface B {
  }

  static class A implements B {
  }

}