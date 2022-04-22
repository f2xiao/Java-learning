package Queue;
import java.util.Iterator;

public class OHQueue implements Iterable<OHQueue.OHRequest> {

    public static class OHRequest {
        public String description;
        public String name;
        public OHRequest next;

        public OHRequest(String description, String name, OHRequest next){
            this.description = description;
            this.name = name;
            this.next = next;
        }
    }

    public class OHIterator implements Iterator<OHRequest>{
        OHRequest curr;

        public OHIterator(OHRequest queue){
            curr = queue;
        }

        public boolean isGood(String description){
            return description != null && description.length() > 5;
        }

        @Override
        public boolean hasNext() {
            while(curr != null && !isGood(curr.description)){
                curr = curr.next;
            }
            return curr != null;
        }

        @Override
        public OHRequest next() {
            OHRequest rqt = curr;
            curr = curr.next;
            return rqt;
        }
    }

    OHRequest cur;

    public OHQueue(OHRequest queue){
        this.cur = queue;
    }

    @Override
    public Iterator<OHRequest> iterator() {
        return new OHIterator(cur);
    }

    public static void main(String[] args) {
        OHRequest s5 = new OHRequest("I deleted all of my files", "Allyson", null);
        OHRequest s4 = new OHRequest("conceptual: what is Java", "Omar", s5);
        OHRequest s3 = new OHRequest("git: I never did lab 1", "Connor", s4);
        OHRequest s2 = new OHRequest("help", "Hug", s3);
        OHRequest s1 = new OHRequest("no I haven't tried stepping through", "Itai", s2);

        OHQueue q = new OHQueue(s1);

        for (OHRequest r: q){
            System.out.println(r.name);
        }
    }
}
