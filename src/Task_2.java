import java.util.Deque;
import java.util.LinkedList;

public class Task_2 {
    public static void main(String[] args) {

        BrowserHistory.visitSite("youtube.com");
        BrowserHistory.visitSite("pinterest.com");
        BrowserHistory.visitSite("youtube.com");
        BrowserHistory.visitSite("tickets.com");
        System.out.println(BrowserHistory.getHistory());

        System.out.println(BrowserHistory.back(9));
        System.out.println(BrowserHistory.back(2));


    }

    class BrowserHistory {
        private static Deque<String> history = new LinkedList<>();

        public static void visitSite(String site){
            history.addFirst(site);
        }

        public static String back(int steps) {
            return history.stream().skip(steps).findFirst().orElse(null);

        }

        public static Deque<String> getHistory() {
            return history;
        }
    }
}
