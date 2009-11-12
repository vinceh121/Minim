/*
*  Copyright (c) 2007 - 2008 by Damien Di Fede <ddf@compartmental.net>
*
*   This program is free software; you can redistribute it and/or modify
*   it under the terms of the GNU Library General Public License as published
*   by the Free Software Foundation; either version 2 of the License, or
*   (at your option) any later version.
*
*   This program is distributed in the hope that it will be useful,
*   but WITHOUT ANY WARRANTY; without even the implied warranty of
*   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*   GNU Library General Public License for more details.
*
*   You should have received a copy of the GNU Library General Public
*   License along with this program; if not, write to the Free Software
*   Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
*/

package ddf.minim.analysis; 

/**
* A Hann window function.
*
* @see   <a href="http://en.wikipedia.org/wiki/Window_function#Hann_window">The Hann Window</a>
*/
public class HannWindow extends WindowFunction
{
  /** Constructs a Hann window. */
  public HannWindow()
  {
  }

  /**
  * Windows the data in samples.
  *
  * @param samples sample buffer to be windowed
  */
  public void apply(float[] samples)
  {
    for (int n = 0; n < samples.length; n++)
    {
      samples[n] *= 0.5f * (1 - Math.cos(TWO_PI * n / (samples.length - 1)));
    }
  }
}

