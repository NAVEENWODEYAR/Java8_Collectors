package com.collectors.optional;

import java.util.Optional;

/**
 * @author NaveenWodeyar
 *
 */

public class OptionalMethods {

 public String getNameOrElse(String name) {
     return Optional.ofNullable(name).orElse("Default Name");
 }

 public String getNameOrElseGet(String name) {
     return Optional.ofNullable(name).orElseGet(() -> "Generated Name");
 }

 public String getNameOrElseThrow(String name) {
     return Optional.ofNullable(name).orElseThrow(() -> new IllegalArgumentException("Name is missing"));
 }
}
