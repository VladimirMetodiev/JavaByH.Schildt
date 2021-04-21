package chapter10.infoSystem;

public class FileHelp {
    public static void main(String args[]) {
        Help helpObj = new Help("text\\HelpFile.txt");
        String topic;

        System.out.println("Try the help system. " + "Enter 'stop' to end.");

        do {
            topic = helpObj.getSelection();

            if(!helpObj.helpOn(topic)) {
                System.out.println("Topic not found.\n");
            }
        } while(topic.compareTo("stop") != 0);
    }
}
