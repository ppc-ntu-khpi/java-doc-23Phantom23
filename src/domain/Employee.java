package domain;
/**
 * Базовий клас, який описує співробітників компанії
 * @author Марченко Даніїл
 */
public class Employee {
    /**
     * Метод для виводу інформації про співробітника
     * @return рядок з детальною інформацією
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }
    /**
     * Ім'я співробітника
     */
    private String name;
    /**
     * Посада співробітника
     */
    private String jobTitle;
    /**
     * Номер співробітника
     */
    private int ID;
    /**
     * Розряд чи категорія
     */
    private int level;
    /**
     * Ввіділ, в якому він працює
     */
    private String dept;

   // private static int employeesCount = 0;
    /**
     * Найфункціональніший конструктор класу
     * @param name ім'я співробітника
     * @param jobTitle посада, яку він займає
     * @param level розряд чи категорія
     * @param dept ввіділ, в якому він працює
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }
    /**
     * Конструктор за замовчуванням
     * @deprecated
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }
    /**
     * Метод для призначення посади
     * @param job посада співробітника
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }
    /**
     * Метод для отримання посади
     * @return посаду співробітника
     */
    public String getJobTitle() {
        return jobTitle;
    }
    /**
     * Метод отримання імені співробітника
     * @return ім'я співробітника
     */
    public String getName() {
        return name;
    }
    /**
     * Метод для зазначення розряду чи категорії
     * @param level розряд чи категорія співробітника
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }
    /**
     * Метод для отримання розряду чи категорії
     * @return розряд чи категорію співробітника
     */
    public int getLevel() {
        return level;
    }
    /**
     * Метод для отримання ввіділа
     * @return ввіділ, в якому працює співробітник
     */
    public String getDept() {
        return dept;
    }
    /**
     * Метод назначення ввіділа
     * @param dept ввіділ, в якому працює співробітник
     */
    public void setDept(String dept) {
        this.dept = dept;
    }
    /**
     * Метод назначення імені
     * @param name ім'я співробітника
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
