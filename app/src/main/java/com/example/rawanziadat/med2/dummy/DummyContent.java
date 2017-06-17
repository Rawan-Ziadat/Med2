package com.example.rawanziadat.med2.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {

        addItem(createDummyItem("id1","כאב ראש","הבדיקות שיש לבצע\n" +
                "בדיקה פיסיקאלית\n" +
                "דם: תפקודי קרישה, ספירה\n" +
                "הפנייה ל: נוירולוג\n\n שאלות הבהרה" +
                "\n" +
                "האם נחבל\\ה בראש לאחרונה?\n" +
                "האם ישנן מחלות רקע?\n" +
                "האם ישנו קושי בראייה?\n" +
                "האם יש שימוש בעזרי ראייה?\n" +
                "האם משתמש בתרופות?\n" +
                "האם חש בעייפות ו\\או ישנוניות?\n" +
                "האם חש בחילה ו\\או הקאה?\n\n" +
                "הסימפטום\n" +
                "כאבי ראש חזקים ", "head"));
        addItem(createDummyItem("id2","היפרגלקמיה","הבדיקות שיש לבצע\n" +
                "סימנים חיוניים (ל\"ד)\n" +
                "שתן: כללית ותרבית\n" +
                "דם: כימיה, ספירה, תפקודי כבד, תפקודי כליות, כולסטרול,פרופיל שומנים \n \n " +
                "שאלות לבירור\n" +
                "האם ישנו רקע של סכרת?\n" +
                "האם נוטל תרופות המעלות את רמת הסוכר בדם (חוסמי ביטא, תיאזידים, קורטיקוסטרואידים, תרופות אנטיפסיכוטיות אטיפיות, Pentamidine (טיפול ב-PCP – דלקת ריאות)?\n" +
                "האם חש\\ה בצימאון מוגבר ויובש בפה?\n" +
                "האם ישנה השתנה מרובה?\n" +
                "האם יש הופעה של פטריות וזיהומים אחרים באברי מין (בנשים)?\n" +
                "האם בהריון?\n" +
                "האם חלה ירידה גדולה במשקל לאחרונה?\n" +
                "האם הופיע טשטוש ראייה?\n" +
                "האם יש תחושה של ישנוניות ו\\או עייפות?\n\n" +
                "הגדרה\n" +
                "היפרגליקמיה", "dam"));
        addItem(createDummyItem("id3","היפוגלקמיה","הבדיקות שיש לבצע\n" +
                "דם: תרבית, שקיעה, תפקודי כבד, תפקודי כליה, רמת גלוקוז\n" +
                "סימנים חיוניים (ל\"ד, דופק)\n\nשאלות אנמנזה\t\n" +
                "האם ישנן מחלות רקע? (סכרת, אונקולוגיות, לב, אי תפקודי כליה?)\t\n" +
                "האם נוטל תרופות? (אינסולין, חוסמי בטא, ACEI, ARB, אנטיביוטיקה ממשפחת הקינולונים?)\t\n" +
                "מצב הכרתי? (בלבול, תשישות, עצבנות, חרדה, פרכוסים)\t\n" +
                "האם יש הופעה של רעד בידיים?\t\n" +
                "הופעה של פלפיטציות?\t\n" +
                "האם שותה אלכוהול?\t\n" +
                "האם יש הופעה של רעב עז?\t\n" +
                "האם ישנה הופעה של הזעה מוגברת?\t\n" +
                "האם יש תחושת נמלול בקצוות? (רגליים, ידיים, לשון)\t\n" +
                "האם ישנה הופעה של עייפות ו\\או ישנוניות?\n\n" +
                "סימפטום\n" +
                "היפוגליקמיה", "dam"));
        addItem(createDummyItem("id4","הרעלה","הבדיקות שיש לבצע\n" +
                "סימנים חיוניים\n" +
                "אומדן נשימתי\n" +
                "דם: כימיה, ספירה, תרבית, רמת תרופה בדם (במידה ונוטל תרופות), רמת אלכוהול בדם (במידה ושותה אלכוהול)\n" +
                "צואה: תרבית\n" +
                "שתן: תרבית, כללית\n" +
                "אק\"ג\n\nשאלות להבהרה\n" +
                "האם הייתה גישה לא מבוקרת לחומרי ניקוי?\n" +
                "האם נעשה ריסוס בסביבת המחייה לאחרונה?\n" +
                "האם ישנה הופעה של כוויות מסביב לפה?\n" +
                "הופעה מרובה של נזלת, הפרשת רוק, ודמעות?\n" +
                "הופעה של שלשולים?\n" +
                "האם ישנה הופעה של בחילות ו\\או הקאות?\n" +
                "האם שותה אלכוהול?\n" +
                "מה אכל\\ה לאחרונה?\n" +
                "האם נטל\\ה תרופות בצורה אקססיבית?\n\nהסימפטום\n" +
                "הרעלה", "bten"));
        addItem(createDummyItem("id5","חום גבוה","הבדיקות שיש לבצע\n" +
                "דם: ספירה, שקיעת דם, תפקודי כבד, תפקודי כליות, וירולוגיה\n" +
                "שתן: תרבית וכללית\n\n" +
                "הפנייה אפשרית ל: נוירולוג, פנימאי.\n\nשאלות לבירור\n" +
                "כמה ימים נמשך החום?\n" +
                "האם מתמתן בלקיחת תרופות להורדת חום?\n" +
                "האם גבוה באופן קבוע או עולה ויורד לסירוגין?\n" +
                "האם ישנם כאבים בחזה, קושי בנשימה, שיעול?\n" +
                "האם ישנה רגישות בבטן?\n" +
                "האם ישנה הופעה של פריחה\\אודם?\n" +
                "האם ישנם שינויים במצב ההכרה?\n" +
                "האם ישנם כאבי פרקים?\n\nהסימפטום\n" +
                "חום גבוה מעל כמה ימים" , "head"));
        addItem(createDummyItem("id6","קוצר נשימה","בדיקות לביצוע\n" +
                "1.סימנים חיוניים-ל\"ד, דופק,סטורציה,חום\n" +
                "2.הסתכלות על בית חזה- הפעלת שרירי הנשימה,\n" +
                "3. האזנה לבית חזה- חרחורים, צפצופים, קולות לב מופחתים\n" +
                "4. התרשמות מהמטופל- בצקתי\\ חיוור,מבולבל, באי שקט, שרירי הצוואר בולטים, נחירי האף מורחבים\n" +
                "5. אק\"ג\n\nשאלות לבירור\n" +
                "מתי החל- בוקר, לילה (בזמן ניסיון להירדם), עכשיו\n" +
                "כמה זמן ארך-  דקות, שעות, ימים\n" +
                "גורמים מקלים- ישיבה\n" +
                "גורמים מחמירים- שכיבה\n" +
                "תלונות נלוות- קושי להשלים משפט שלם,  כאבים בחזה (בעת שאיפת אויר), התנפחות בפנים , גרד, נפיחות של העור,  כחלון, בלבול.\n" +
                "האם את\\ה סובל\\ת מחרדה- כן, לא\n" +
                "האם שאפת גוף זר (מטבע, גרעין, אוכל)- כן, לא\n" +
                "היסטוריה רפואית רלוונטית- אסטמה, COPD, אלרגיות, חרדה, אין היסטורה רלוונטית.\n\nהגדרה\n" +
                "קוצר נשימה", "sder"));
        addItem(createDummyItem("id6","סחרחרת","", "do5a"));

    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(String str , String str2 , String str3 , String part ) {
        return new DummyItem(str, str2 , str3  ,part );
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;
        public final String _part ;

        public DummyItem(String id, String content, String details ,String  part ) {
            this.id = id;
            this.content = content;
            this.details = details;
            this._part= part ;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
