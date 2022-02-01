package domain;
/**
 * Клас, який описує артиста
 * @author Марченко Даніїл
 */
public class Artist extends Employee {

    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    public Artist() {
        super();
        this.skiils = new String[10];
    }
    /**
     * Метод отримання навичок артиста
     * @return навички артиста
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }
    /**
     * Містить навички артиста
     */
    private String[] skiils;
    /**
     * Метод отримання навичок артиста
     * @return навички артиста
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }
    /**
     * Метод надання навичок артисту
     * @param skills навички артиста
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }
    /**
     * Метод отримання всіх навичок артиста
     * @return навички артиста
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
