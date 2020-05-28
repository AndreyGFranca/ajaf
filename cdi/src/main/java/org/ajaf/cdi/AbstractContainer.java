package org.ajaf.cdi;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractContainer implements Container {
  private Map injectables = new HashMap<String, String>();

  public Map getInjectables () {
    return injectables;
  }

  public void setInjectables (Map injectables) {
    this.injectables = injectables;
  }
}
