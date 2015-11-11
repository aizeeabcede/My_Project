class SelectionSortObj extends SortObj {
	// Constructor
	public SelectionSortObj (int size) {
		super(size);
	}

	/**
	* 	This method perform selection sort algorithm
	* 	that arrange the element in ascending order.
	* 	@param none
	* 	@return none
	*/
	public void sort() {
		int min;
		for ( int i = 0; i < super.SIZE - 1; i++ ) {
			min = i;
			for ( int j = i; j < super.SIZE - 1; j++ ) {
				if ( super.array[min].getAge() > super.array[j+1].getAge() ) {
					min = j+1;
				}
			}
			swap(i, min);
		}
	}

	/**
	* 	This method perform selection sort algorithm
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