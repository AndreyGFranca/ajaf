package org.ajaf.cdi;

public interface Container {

  void addInjectable (Object injectable);

  <T> T getInjectable (Object injectable, Class<T> implementation);

}
