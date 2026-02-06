class Solution {
public:
    string interpret(string command) {
        while(command.find("()")<command.length() || command.find("(al)")<command.length()){
            if(command.find("()")<command.length()){
                int idx1 = command.find("()");
                command.erase(idx1,2);
                command.insert(idx1,"o");
            }
            if(command.find("(al)")<command.length()){
                int idx2 = command.find("(al)");
                command.erase(idx2,4);
                command.insert(idx2,"al");
            }     
        }
        return command;
    }
};