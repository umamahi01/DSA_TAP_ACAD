LinkedList:-
============ 
 
        => first we need to understand why we need to use linkedlist the advantages will come from the dis-advantages
            of arrays
        
        Data => data is main  part which we can manipulate
                -> the most important thing is to store the data
                -> so to store data into RAM we use varaibles/nothing but data-types
        
        when we create varaibles there will be some memory allocated and some memory is deallocated while deleting
                -> so lot of memory is allocated and some of deallocated memory will be available inside ram.

      
        so the dis-advantages of Arrays:-

                    -> 1.Arrays needs contigious memory allocation to store the data

                    -> 2.size should be specified while creating an arrays

                    -> 3. insertion an element at any given postion will take (n+1) shifting 
                            (for ex:- if we want to add an element at index 0 we cannot add without replacing it or worst case
                            without shifting the other elements).

                    -> 4. if we delete a element at an index the memory become unused 

        All these will be overcome with the help of LinkedList.


so Advantages - of - LinkedList
===============================
    -> if they are no memory present in contigious manner
    -> use any memory that is available in RAM to store the data

operations:-
===========
    * 1.creating a LinkedList 
            -> to create a linkedlist first we need to create a node.
            -> Node has two things/parts 1.data
                                         2.next node address(that is only called next(so basically it is a pointer that will point to next node))
    * 2.Add element at first.
    * 3.Add element at last.
    *4.traverse an linkedlist.


