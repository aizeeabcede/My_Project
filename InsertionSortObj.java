class InsertionSortObj extends SortObj {
	// Constructor
	public InsertionSortObj (int size) {
		super(size);
	}

	/**
	* 	This method perform insertion sort algorithm
	* 	that arrange the element in ascending order.
	* 	@param none
	* 	@return none
	*/
	public void sort() {
		/**
		* 	This variable represent as pointer that store the index
		* 	of array everytime the value of 'n' is greater than to 'n+1'
		*/
		int pointer;

		int temp; // it is just a temporary variable	

		for (int i = 1; i < super.SIZE; i++) {
			temp    = super.array[i].getAge();
			pointer = i;

			while ( pointer > 0 && super.array[pointer-1].getAge() > temp ) {
				super.array[pointer] = super.array[pointer-1];
				pointer--;
			}

			super.array[pointer] = temp;
		}
	}

	/**
	* 	This method perform insertion sort algorithm
	* 	that arrange the element in descending order.
	* 	@param none
	* 	@return none
	*/
	public void rsort() {
		int min;
		for ( int i = 0; i < super.SIZE - 1; i++ ) {
			min = i;
			for ( int j = i; j < super.SIZE - 1; j++ ) {
				if ( super.array[min].getAge() < super.array[j+1].getAge() ) {
					min = j+1;
				}
			}
			swap(i, min);
		}
	}
}