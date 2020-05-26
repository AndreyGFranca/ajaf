package org.ajaf.cdi;

public class MemberInjector extends AbstractInjector {

  public MemberInjector (Container container) {
    super(container);
  }

  public void inject (Object injectable) {
    getContainer().addInjectable(injectable);
  }
}
