package org.ajaf.cdi;

public class DefaultContainer extends AbstractContainer {

  public void addInjectable (Class injectable) throws Exception {
    if (injectable.getInterfaces().length > 1) {
      throw new Exception("Service should not have multiples implementations");
    }
    Class interf = injectable.getInterfaces()[0];
    getInjectables().put(interf.getName(), injectable.getName());
  }

  public <T> T getInjectable (Class<T> clazz) {
    try {
      boolean isInterface = clazz.isInterface();
      Class impl;
      if (!isInterface) {
        String interf = clazz.getInterfaces()[0].getName();
        impl = Class.forName((String) getInjectables().get(interf));
      } else {
        impl = Class.forName((String) getInjectables().get(clazz.getName()));
      }
      return (T) impl.getDeclaredConstructor().newInstance();
    } catch (Exception e) {
      return null;
    }
  }


}
