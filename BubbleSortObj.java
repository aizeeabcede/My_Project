class BubbleSortObj extends SortObj {
	// Constructor
	public BubbleSortObj(int size) {
		super(size);
	}

	/**
	* 	This method perform bubble sort algorithm
	* 	that arrange the element in ascending order.
	* 	@param none
	* 	@return none
	*/
	public void sort() {
		for (int i = 0; i < super.SIZE - 1; i++) {
			for (int j = 0; j < super.SIZE - (i+1); j++) {
				if ( super.array[j].getAge() > super.array[j+1].getAge() ) {
					swap(j, j+1);
				}
			}
		}
	}

	/**
	* 	This method perform bubble sort algorithm
	* 	that arrange the element in descending order.
	* 	@param none
	* 	@return none
	*/
	public void rsort() {
		for (int i = 0; i < super.SIZE - 1; i++) {
			for (int j = 0; j < super.SIZE - (i+1); j++) {
				if ( super.array[j].getAge() < super.array[j+1].getAge() ) {
					swap(j, j+1);
				}
			}
		}
	}
}