# Praisd SDK

## What is Praisd?


Praisd is a soon to be released API client which integrates with the Android account management.
It handles OAuth and allows the user to manage certain aspects of his Flattr account. Praisd exports
a service for other apps to make flattring things and subscribing to things as easy as possible.

## Currently implemented features
*	Synchronous API interface which allows to retrieve registered Flattr accounts, flattr things, subscribe to things
	and to retrieve information about a user such as his email address, firstname, lastname and other information.
	
## Upcoming features
*	Asynchronous API which can be safely called from the UI thread
*	Helper methods to determine if the user has Praisd and if not request him to install it
*	Probably some convenience for the service binding