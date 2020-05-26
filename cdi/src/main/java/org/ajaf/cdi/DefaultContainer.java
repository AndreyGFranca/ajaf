package org.ajaf.cdi;

public class DefaultContainer extends AbstractContainer {

  public void addInjectable (Object injectable) {
    getInjectables().add(injectable);
  }

  public <T> T getInjectable (Object injectable, Class<T> implementation) {
    for (Object o : getInjectables()) {
      if (o == injectable) {
        try {
          return implementation.newInstance();
        } catch (Exception e) {
          return null;
        }
      }
    }
    return null;
  }

}
