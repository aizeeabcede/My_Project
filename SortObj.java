abstract class SortObj {
	/**
	* 	This variable contain constant number
	*	that once you assign it a number
	* 	it will never be change, unless this
	* 	program take some error
	*/
	protected final int SIZE;

	protected int nElem; // index of array Object

	// This will contain poly Patient object
	protected Patient[] array;

	// Constructor
	public SortObj (int size) {
		SIZE 	   = size;
		this.array = new Patient[SIZE];

		nElem = 0;
	}

	/**
	* 	This method assign value(2nd param) in
	* 	the specific index(1st param)
	* 	@param  index - index of array 
	* 			value - value of array
	* 	@return none
	*/
	protected void insert(String fname, String lname, int age, String address) {
		 array[nElem] = new Patient(fname, lname, age, address); 

		 nElem++;
	}

	// swap the element from index n to n+1
	protected void swap(int n, int nPlus1) {
		Patient temp 		= this.array[n];
		this.array[n] 		= this.array[nPlus1];
		this.array[nPlus1]  = temp;
	}

	// Display the element of array
	protected void displayAllObj() {
		for ( int i = 0; i < SIZE; i++ ) {
			this.array[i].displayInfo();
			System.out.println();
		}
	}

	/**
	* 	The body of these two methods are
	* 	in the childclass of this class
	*/
	abstract void sort();
	abstract void rsort();
}