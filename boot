local commands = {
 ["light"] = "programs/light",
 ["logout"] = "startup",
 ["worldedit"] = "programs/WE_Core",
 ["programs"] = "lib/programs",
 ["help"] = "lib/help",
 ["credits"] = "lib/credits",
 ["stargate"] = "programs/stargate",
 ["shell"] = "rom/programs/shell",
 
}

 term.clear()
 term.setCursorPos(1,1)
 print '                   ------------'
 print '                      Arc OS   '
 print '                   ------------'

 
 print("Type help for assitance using Arc OS")
 print("Credits to the available programs can be accessed by typing 'credits'")
 
 
while true do
 
 write("root@:")
 local input = read()

if commands[input] then
  shell.run( commands [input])

 else
  print("Command not found!")
  end

end
