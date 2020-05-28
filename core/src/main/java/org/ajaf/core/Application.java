package org.ajaf.core;

import org.ajaf.core.scanner.ClassPathAnnotationsScanner;

/**
 * @author Andrey Franca
 */
public final class Application {

  public static void start (Class clazz) {
    bootstrap(clazz);
  }

  public static void bootstrap (Class clazz) {
    ClassPathAnnotationsScanner.scanInjectablesCandidates(clazz);
    for (Class c : ClassPathAnnotationsScanner.injectableClasses) {


    }
  }

}
