package org.ajaf.cdi;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractContainer implements Container {
  List<Object> injectables = new ArrayList<Object>();

  public List<Object> getInjectables () {
    return injectables;
  }

  public void setInjectables (List<Object> injectables) {
    this.injectables = injectables;
  }
}
