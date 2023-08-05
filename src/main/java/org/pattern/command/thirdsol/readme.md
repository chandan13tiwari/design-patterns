INITIAL REQUIREMENT -

Client is happy with our design approaches. So, now he came up with a new requirments for a new Device.

He wants a REMOTE CONTROL API for Home automation. We need to program the application accordingly.


![Initial requirement](https://github.com/chandan13tiwari/design-patterns/blob/master/src/main/resources/command-pattern-diagrams/1.jpg)


![Vendor Classes](https://github.com/chandan13tiwari/design-patterns/blob/master/src/main/resources/command-pattern-diagrams/2.jpg)


![Flow Diagram](https://github.com/chandan13tiwari/design-patterns/blob/master/src/main/resources/command-pattern-diagrams/4.jpg)

Let's Start with the Simple example - 

We need to design a application which can able to open Bedroom Light when the button was pressed from the Remote Control.


COMMAND DESIGN PATTERN - Command Pattern encapsulates a request as an object, thereby letting you parameterized other objects with different requests, queue or log requests and support undoable operations.

In simple language - 

The Command Pattern allow you to deouple the requester of an action from the object that actually performs the action.


NOW WE ARE ALL SET TO CREATE OUR REMOTE CONTROL....



![Requirement Diagram](https://github.com/chandan13tiwari/design-patterns/blob/master/src/main/resources/command-pattern-diagrams/3.jpg)


WHAT IS *NoCommand* ?? WHY IT IS NEEDED ??
<br /> Answer: To avoid checking everytime, whether the slot is filled or not, we can use a Dummy Command to avoid Null Checks. Like this, 
<br />
```
public void onButtonWasPressed(int slot) {
    if(onCommands[slot] != null) {
        onCommands[slot].execute();
    }
}
```
OR
```
 remoteControl.setCommand(2, stereoOnCommand, new NoCommand()); // NoCommand is a placeholder for StereoOffCommand
```

<br /> Also, it can be used as a placeholder for the empty commands.


The *NoCommand* object is an example of a null object. A null object is useful
when you don't have a meaningful object to return, and yet you want to remove the 
responsibility for handling _null_ from the client.

You'll find uses for the NULL Objects in conjunction with many design patterns, 
and sometimes you'll even see "Null Objects" listed as a Design Pattern.


WHAT ABOUT **UNDO** BUTTON....?!!