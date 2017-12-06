# ATM_Simulation using Chain of Responsibility Design Pattern

An application that simulates the Backend logic of a cash dispensing Automatic Teller Machine (ATM). 

The application simulates and reports the outcome of people requesting money. 

This simulation does not require any authentication or PIN to access the ATM. 

It is focused on keeping track of the current cash of the ATM, and dispensing only the notes available.

It should be possible to tell it that it has so many of each type of note during initialisation. After initialisation, it is only possible to remove notes.

It must know how many of each type of bank note it has and it should be able to report back how much of each note it has.

It must support $20 and $50 notes.

It should be able to dispense only legal combinations of notes. For example, a request for $100 can be satisfied by either five $20 notes or two $50 notes. It is not required to present a list of options.

If a request cannot be satisfied due to failure to find a suitable combination of notes, it should report an error condition in some fashion. For example, in an ATM with only $20 and $50 notes, it is not possible to dispense $30. 

Dispensing money should reduce the amount of available cash in the machine. 

Failure to dispense money due to an error should not reduce the amount of available cash in the machine.
