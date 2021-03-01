package chapter1;

public class Keywords {
    public static void main(String[] args) {
        printKeywords();
    }

    private static void printKeywords(){
        String[] keywords = new String[] {"abstract",
                "assert",
                "boolean",
                "break",
                "byte",
                "case",
                "catch",
                "char",
                "class",
                "const",
                "continue",
                "default",
                "do",
                "double",
                "else",
                "enum",
                "exports",
                "extends",
                "final",
                "finally",
                "float",
                "for",
                "goto",
                "if",
                "implements",
                "import",
                "instanceof",
                "int",
                "interface",
                "long",
                "module",
                "native",
                "new",
                "open",
                "opens",
                "package",
                "private",
                "protected",
                "provides",
                "public",
                "requires",
                "return",
                "short",
                "static",
                "strictfp",
                "super",
                "switch",
                "synchronized",
                "this",
                "throw",
                "throws",
                "to",
                "transient",
                "transitive",
                "try",
                "uses",
                "void",
                "volatile",
                "while",
                "which",
                "_"
        };

        int counter = 0;

        for (int a = 0; a < keywords.length; a++) {
            if(counter == 0) {
                System.out.print("|");
            }

            counter++;

            if(counter < 8) {
                System.out.printf("%14s |", keywords[a]);
            }
            else{
                counter = 0;
                System.out.printf("%14s |%n", keywords[a]);
            }
        }
    }
}



//Ключовите думи не могат да се използват като имена на променливи, класове или методи.
//Също така (от JDK 9) символът за подчертаване се счита за ключова дума.

//В Java са зарезервирани и булевите стойности true, false и null, те също не могат да се използват като имена на променливи и класове.
