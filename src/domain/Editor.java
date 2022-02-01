package domain;
/**
 * Клас, який описує редактора
 * @author Марченко Даніїл
 */
public class Editor extends Artist {

    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    public Editor() {
        super();
        this.electronicEditing = true;
    }
    /**
     * Метод додавання інформації про редактора
     * @return інформацію про редактора
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }
    
    /**
     * <code>true</code> - якщо редактор надає перевагу роботі з папером 
     */
    private boolean electronicEditing;
    /**
     * Метод отримання переваги паперу чи електроніки
     * @return переваги редактора в роботі
     */
    public boolean getPreferences() {
        return electronicEditing;
    }
    /**
     * Метод призначення переваги паперу чи електроніки
     * @param electronic перевага паперу чи електроніки
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
