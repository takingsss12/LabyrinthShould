package com.nespresso.sofa.recruitment.labyrinth.entities;

import com.nespresso.sofa.recruitment.labyrinth.DoorAlreadyClosedException;

public class Gate
{
  private boolean closed = false;
  
  public void close ()
  {
    if (isClosed())
    {
      throw new DoorAlreadyClosedException();
    }
    
    closed = true;
  }
  
  public boolean isClosed ()
  {
    return closed;
  }
}
