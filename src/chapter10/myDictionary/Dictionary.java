package chapter10.myDictionary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Dictionary {
    public static String[] words = {"business", "economy", "economics", "market", "marketing", "sale", "finance", "financial", "accounting", "account", "budget", "budgeting", "bank", "banking", "loan", "creditor", "borrower", "credit", "debit", "advertisement", "advertising", "advertise", "distributor", "tax", "value-added tax", "income tax", "corporation tax", "capital", "capital market", "capital equipment", "capital goods", "capital stock", "share", "stock", "ordinary share", "common stock", "share certificate", "stock certificate", "entrepreneur", "entrepreneurial", "entrepreneurship", "manufacturer", "shareholder", "stockholder", "lead", "leading", "leadership", "manage", "management", "enterprise", "factory", "logistics", "human resources", "import", "export", "importer", "exporter", "venture", "venture capital", "joint venture"};
    private String glossaryFile;

    public Dictionary(String glossaryFile) {
        this.glossaryFile = glossaryFile;
    }

    public boolean search(String word) throws IOException {
        int symbol;
        String vocable, expression;

        BufferedReader reader = new BufferedReader(new FileReader(glossaryFile));

        while ((symbol = reader.read()) != -1){
            if(symbol == '#'){
                vocable = reader.readLine();
                if(word.compareTo(vocable) == 0){
                    System.out.println(vocable.toUpperCase());
                    while((expression = reader.readLine()) != null && (expression.compareTo("") != 0)){
                        System.out.println(expression + "\n");
                    }

                    promptEnterKey();
                    return true;
                }
            }
        }

        reader.close();
        return false;
    }

    private void promptEnterKey(){
        System.out.print("Press \"ENTER\" to continue:");
        Scanner input = new Scanner(System.in);
        input.nextLine();
    }
}
