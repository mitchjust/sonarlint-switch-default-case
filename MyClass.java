package com.foo.bar;

import org.kohsuke.github.authorization.AuthorizationProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.time.Instant;

public abstract class MyClass implements AuthorizationProvider {
  public void hello() {
    System.out.println("Hello");
  }
}
