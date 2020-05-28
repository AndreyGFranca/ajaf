package org.ajaf.core.reflection;

/**
 * @author Andrey Franca
 */
public class Reflections {

  /**
   * Given a classPath name return the name of the class
   *
   * @param classPath
   * @return
   */
  public static String getClassName (String classPath) {
    int index = classPath.indexOf(".class");
    boolean slashFound = false;
    StringBuilder className = new StringBuilder();
    while (!slashFound) {
      if (classPath.charAt(--index) == '/') {
        slashFound = true;
        continue;
      }
      className.append(classPath.charAt(index));
    }
    return className.reverse().toString();
  }

  /**
   * Return a concrete class
   *
   * @param clazz       class name
   * @param classLoader class loader
   * @return concrete class
   */
  public static Class getClass (String clazz, ClassLoader classLoader) {
    try {
      return Class.forName(clazz, false, classLoader);
    } catch (ClassNotFoundException ignored) {
      return Void.class;
    }
  }
}
