# Java Heroes Game

סימולציה של קרב בין גיבורים ב-Java, כתרגיל בקורס "תכנות מונחה עצמים" במכללת כנרת. התרגיל מתרגל מחלקות אבסטרקטיות, ירושה, פולימורפיזם ומיון עם Comparable ו-Comparator.

A heroes battle simulation in Java, written as an OOP course exercise: abstract classes, inheritance, polymorphism, and sorting with Comparable and Comparator.

## מבנה המחלקות

| מחלקה | תפקיד |
|-------|-------|
| Hero | מחלקה אבסטרקטית לגיבור: נקודות חיים, ניצחונות והפסדים. מממשת Comparable (מיון לפי נקודות חיים בסדר יורד) |
| Warrior | לוחם: תוקף לפי נקודות התקפה קבועות |
| Sorcerer | קוסם: תוקף לפי יחס קסם מנקודות החיים שלו |
| DamageComparator | Comparator חיצוני: מיון גיבורים לפי פוטנציאל הנזק |
| Game | תוכנית ההרצה: יוצרת גיבורים, מריצה קרבות בין כל הזוגות, מונה את הגיבורים מכל סוג ומדגימה שתי דרכי מיון |

## מה קורה בהרצה

1. נוצרים שלושה גיבורים (שני לוחמים וקוסם).
2. כל זוג גיבורים נלחם זה בזה; קרב יכול ליצור גיבור חדש שמצטרף לרשימה.
3. הגיבורים ממוינים פעמיים: לפי נקודות חיים (הסדר הטבעי, Collections.sort) ולפי פוטנציאל הנזק (DamageComparator).

## הרצה

פותחים את התיקייה ב-IntelliJ IDEA ומריצים את Game.java.

## Author

Avishag Yonatan
