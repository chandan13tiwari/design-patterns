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


NOW LET'S CREATE A SIMPLE REMOTE USING COMMAND PATTERN TO PERFORM LIGHTS OFF COMMAND