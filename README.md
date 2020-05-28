# ajaf
another java framework

###  Dependency Injection
Ajaf implements dependency injection with custom annotations.

```java
@Injectable
class FooServiceImpl implements FooService { 
}
```
```java
@Injectable
class BarServiceImpl implements BarService {
  @Autoinject
  private FooService foo;
}
```

Continue ...
