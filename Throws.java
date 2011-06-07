/**
 * Name: class Throws
 * Reason: FOllowing a discussion of the Exception Programming Pattern, and the
 * reserved keyowrds in Java
 * Original Implementation Date: Winter '10 ish
 *
 * Doing things with keywords for teh lulz
 */
class Throws extends Exception
{
  static Throws exception;
  Throws exception(Throws exception) throws Exception
  {
    throw exception;
  }

  Throws() throws Throws
  {
    throw (exception != null ? exception : this);
  }
}