SecretSanta
===========
1. Can be run from command line
	-Controller class has main function
	-Comma separated values as first argument ("" required if spaces used)
2. ArrayListWrapper
	-Written generically so that it can be used for any class with a good .equals function
	-Warnings suppressed on generic casts because they will always be valid
	-Assumes elements entered are unique specifically for final pairing of final two elements.
		For the sake of this program it is disallowed in the controller.
		The derange function could check its attempts after creating them and
		retry if a match was found but this could also cause an infinite loop
		if additional safeguards were not put in place.