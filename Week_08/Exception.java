2 Exception
Read the following code and check whether there is anything wrong with it. Then write some similar code and
check your answer.

// Some code here
try {
	// more code here
	list.add(newElement);
	// more code here
} catch (Exception ex) {			// this is a generic catch all for any and all kinds of exceptions - it is not good practice to do so
	ex.printStackTrace();
} catch (NullPointerException ex) {	// this is a ver specific catch NullPointerExceptions 
	ex.printStackTrace();
}									// both the order of these exceptions is incorrect (generic to specific - which nullifies the second one entirely)
									// it would be more accurate and better practice to have a specific catch and avoid the 
									// generic catch all for any and all kinds of exceptions


// better written with just a specific catch 
try {
// more code here
list.add(newElement);
// more code here
} catch (NullPointerException ex) {
ex.printStackTrace();
}