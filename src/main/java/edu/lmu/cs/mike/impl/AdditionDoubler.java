package edu.lmu.cs.mike.impl;

import edu.lmu.cs.mike.iface.IntegerDoubler;

public class AdditionDoubler implements IntegerDoubler {
  
  int a=0;
  @Override
  public long doDouble(int i) {
    return i + i;
  }
}

