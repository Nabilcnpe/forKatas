import org.approvaltests.combinations.CombinationApprovals;
import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void updateQuality() {

        CombinationApprovals.verifyAllCombinations(
                this::doUpdateQuality,
                new String[]{"foo", "Aged Brie", "Backstage passes to a TAFKAL80ETC concert", "Sulfuras, Hand of Ragnaros"},
                new Integer[]{0, 12, 5, -1},
                new Integer[]{0, 1, 50, 49}
        );
    }

    private String doUpdateQuality(String name, int sellIn, int quality) {
        Item[] items = new Item[] {Item.createItem(name, sellIn, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return app.items[0].toString();
    }

}