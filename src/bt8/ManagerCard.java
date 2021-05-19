package bt8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ManagerCard {
    private List<Card> cards = new ArrayList<>();

    public ManagerCard() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public boolean delete(String id) {
        for (int i = 0; i < cards.size(); i++) {
            if (id.equals(cards.get(i).getId())) {
                cards.remove(cards.get(i));
                return true;
            }
        }
        return false;
    }
    public void print(){
        Iterator<Card> iterator = cards.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}


