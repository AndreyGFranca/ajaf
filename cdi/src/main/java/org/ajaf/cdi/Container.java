package org.ajaf.cdi;

public interface Container {

  void addInjectable (Class injectable) throws Exception;

  <T> T getInjectable (Class<T> clazz);

}
