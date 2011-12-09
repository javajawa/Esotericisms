/**
 * Name: class Throws
 * Reason: Following a discussion of the Exceptional Programming Pattern, and the
 * reserved keywords in Java
 * Original Implementation Date: Winter '10 ish
 *
 * Doing things with keywords for teh lulz
 * @author Benedict Harcourt (javajawa)
 * @author Mark Rutland (nullmodem)
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
