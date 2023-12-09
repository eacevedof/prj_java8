package Infrastructure.Views;

import java.util.List;

public abstract class PrintView {

    protected void pr(String message) {
        System.out.println(message);
    }

    protected void prList(List<String> stringList){
        int index = 1;
        StringBuilder messageBuilder = new StringBuilder();

        for (String textLine : stringList) {
            String message = String.format("(%d) %s", index++, textLine);
            messageBuilder.append(message).append("\n");
        }

        String result = messageBuilder.toString();
        this.pr(result);
    }
}
