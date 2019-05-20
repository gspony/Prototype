/**
 * @Classname Resume
 * @Description TODO
 * @Author 马维俊
 * @Version V1.0.0
 * @Date 2019/3/10 15:13
 */
public class Resume implements Cloneable{
    private String  name;
    private String  sex;
    private String  age;
    private String  timeArea;
    private String  company;

    public Resume(String name)
    {
        this.name = name;
    }

    public void setPersonalInfo(String sex, String age)
    {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timeArea, String company)
    {
        this.timeArea = timeArea;
        this.company = company;
    }

    public void display()
    {
        System.out.println(name + "     " + sex + "     " + age);
        System.out.println("工作经历：" + timeArea + "   " + company);
    }
    @Override
    public Resume clone()
    {
        try
        {
            return (Resume) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
