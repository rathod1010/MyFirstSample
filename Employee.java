class Employee {

    String name;
    int salary;
    public Employee(String name , int salary)
    {
        this.name=name;
        this.salary=salary;
    }

public String getName()
{
    return name;
}
public void setName()
{
    this.salary=salary;
}
public int getSalary()
{
    return salary;
}
public void setSalary()
{
    this.salary=salary;

}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append("name: ");
        sb.append(name);
        sb.append(" salary: ");
        sb.append("" + salary+">");
        return sb.toString();

    }
}
class EmployeeInfo
{
    enum SortMethod {
        BYNAME , BYSALARY
    };
    
    public List<Employee> sort(List<Employee> emps , final SortMethod method)
 {
    
    if(method.equals(method.BYNAME))
    {
         Collections.sort(emps,(e1,e2)->{return e1.name.compareTo(e2.name);
         });
    }
    else
    {
        if(method.equals(method.BYSALARY))
        {
            Collections.sort(emps,(e1,e2)->{int i=e1.salary-e2.salary;
            if(i==0)
            {
                return e1.name.compareTo(e2.name);
            }
            else
            {
                return i;
            }
            });
        }
       
    }
     return emps;
   
  }

    public boolean isCharacterPresentInAllNames(Collection<Employee> entities, String character)
    {
          Predicate<Employee> p1 = s->s.name.contains(character);
          boolean b1 = entities.stream().allMatch(p1);
          return b1;
    }
}