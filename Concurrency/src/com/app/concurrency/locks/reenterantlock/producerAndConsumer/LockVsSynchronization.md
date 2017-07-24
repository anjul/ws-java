Differences between Reentrant Lock and Synchronized block
----------------------------------------------------------

Reentrant lock:
	>> It has same basic behavior as Synchronized block but it has some extended features
	>> We can make a lock fair to prevent thread starvation
	>> We can check whether the given lock is held or not with reentrant locks
	>> We can get the list of thread waiting for the given lock with reentrant locks
	
Synchronized Block:
	>> Synchronized blocks are unfair by default
	>> Synchronized blocks are try catch block free