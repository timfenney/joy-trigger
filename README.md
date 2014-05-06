joy-trigger
===========

Aimbot-type utility for first person shooter games.

rationale
---------

Everything must be hacked; nothing is sacred. This is a little toy to fire your weapon for you in the arena of your favourite
first person shooter game. It is more of a proof of concept than anything else.

method
------

This utility is built around the AWT toolkit class java.awt.Robot. Robot is used to sample the pixel color at the center of
the screen repeatedly. When a matching color is found, Robot is used again to depress and release the mouse button 1 after a short
interval.

the code
--------

Well a package is used, but that is about the only Java convention followed here. No authors, licenses, nor comments litter the
code (you want _Javadoc_? Ewww!).

It is not the prettiest pear in the pie, but it has been reasonably refactored. Dependency injection is used throughout (sans a
framework).

game play
---------

Its pretty self-explanatory, but to use this you must ensure your enemies are all the same color (green, unless you want to
modify the sources yourself), and aim. This is pretty good, because aimbots don't generally aim as naturally as human players do.
