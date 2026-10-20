import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> cartasNovas = new HashSet<>();

        for(String carta : cards){
            cartasNovas.add(carta);
        }

        return cartasNovas;
    }

    static boolean addCard(String card, Set<String> collection) {
        if(collection.add(card)){
            return true;
        }

        return false;
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean yes = false;

        for(String carta : myCollection){
            if(!theirCollection.contains(carta)){
                yes = true;
            }
        }

        boolean heYes = false;

        for (String cartas : theirCollection){
            if (!myCollection.contains(cartas)){
                heYes = true;
            }
        }

        if(yes && heYes){
            return true;
        }

        return false;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> allCards = new HashSet<>(collections.get(0));
        for (Set<String> colecao : collections){
            allCards.retainAll(colecao);
        }

        return allCards;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCards = new HashSet<>();
        for(Set<String> colecao : collections){
            allCards.addAll(colecao);
        }

        return allCards;

    }
}
