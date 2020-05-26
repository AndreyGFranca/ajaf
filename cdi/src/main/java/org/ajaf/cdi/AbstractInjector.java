package org.ajaf.cdi;

public abstract class AbstractInjector implements Injector {

  private Container container;

  public AbstractInjector (Container container) {
    this.container = container;
  }

  public Container getContainer () {
    return container;
  }

  public void setContainer (Container container) {
    this.container = container;
  }
}
