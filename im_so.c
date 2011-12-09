/**
 * Name: I'm so C, I point to myself!
 * Author: Ben Harcourt / javajawa <ben.harcourt@harcourtprogramming.co.uk>
 * Reason: The name coming up as a joke in a conversation
 * Original Implementation Date: 7th June 2011
 *
 * Piece of code that gets stuck in an infinite dereferencing loop
 */
#include "stdio.h"

void main(void)
{
	void* p = (void *)&p;
	while (p)
	{
		printf("%i\n", (int)p);
		p = (*(void **)p);
	}
}

