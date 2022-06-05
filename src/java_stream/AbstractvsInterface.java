package java_stream;

public class AbstractvsInterface {
	/**
	 * Consider using abstract classes if any of these statements apply to your situation:

You want to share code among several closely related classes.
You expect that classes that extend your abstract class have many common methods or fields or require access modifiers other than public (such as protected and private).
You want to declare non-static or non-final fields. This enables you to define methods that can access and modify the state of the object to which they belong.

Consider using interfaces if any of these statements apply to your situation:

You expect that unrelated classes would implement your interface. For example, the interfaces Comparable and Cloneable are implemented by many unrelated classes.
You want to specify the behavior of a particular data type, but not concerned about who implements its behavior.
You want to take advantage of multiple inheritances.


--------------------------------------------------------------------------------

Classes in OO generaly refers to implementation. I use abstract classes when I want to force some implementation details to the childs else I go with interfaces.

Of course, abstract classes are useful not only in forcing implementation but also in sharing some specific details among many related classes.

============================================================================================================================
	 */

}
