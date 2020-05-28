package org.ajaf.core.scanner;

import org.ajaf.common.annotation.Injectable;
import org.ajaf.core.reflection.Reflections;

import java.io.File;
import java.util.List;

/**
 * @author Andrey Franca
 */
public final class ClassPathAnnotationsScanner {

  public static List<Class> injectableClasses;

  /**
   * Scan the piece candidates, that pieces will be that beans in which the
   * CDI will be looking for.
   * See
   *
   * @param baseClazz bootstrap class
   * @see Injectable
   */
  public static void scanInjectablesCandidates (Class baseClazz) {
    String pckg = baseClazz.getPackage().getName();
    String path = baseClazz.getProtectionDomain().getCodeSource().getLocation()
        .getPath() + pckg.replace(".", "/");
    File classDir = new File(path);

    for (File f : classDir.listFiles()) {
      String className =
          String.format("%s.%s", pckg, Reflections.getClassName(f.getPath()));
      Class c = Reflections.getClass(className, baseClazz.getClassLoader());
      if (c.isAnnotationPresent(Injectable.class)) {
        injectableClasses.add(c);
      }
    }
  }

}
