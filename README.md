# Command-Pattern

<Client>          <Invoker> -------------> <Command Interface>
|                setCommand()                 execute()
|
|
|
|---------------> <Receiver>  <---------- <Concrete Command>
|                  action()                   execute()
|                                               ^
|                                               | 
|                                               |
-------------------------------------------------


Client is responsible for creating a concrete command and setting its receiver.
Receiver knows how to execute a command.
Concrete command implements Command interface. It binds receiver with its action.


We can also pass arguments to command method and combine onCommand and offCommand.

Thread can be seen as command pattern, where thread interface provice abstract method execute.
