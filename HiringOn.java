class Candidate{
private int id;
private String name;
private int age;
private String gender;
private String department;
private int yearOfJoining;
private double salary;
public Candidate(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
super();
this.id = id;
this.name = name;
this.age = age;
this.gender = gender;
this.department = department;
this.yearOfJoining = yearOfJoining;
this.salary = salary;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}
public String getGender() {
return gender;
}
public void setGender(String gender) {
this.gender = gender;
}
public String getDepartment() {
return department;
}
public void setDepartment(String department) {
this.department = department;
}
public int getYearOfJoining() {
return yearOfJoining;
}
public void setYearOfJoining(int yearOfJoining) {
this.yearOfJoining = yearOfJoining;
}
public double getSalary() {
return salary;
}
public void setSalary(double salary) {
this.salary = salary;
}
@Override
public String toString() {
return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
}
}
class Implementation{
//Write Your Code Here..
public static Map<String, Long> getCount(List<Candidate> list){
Map<String, Long> countOne = list.stream().collect(Collectors.groupingBy(Candidate::getGender,Collectors.cou
nting()));
return countOne;
}
public static Map<String, Double> getAverageAge(List<Candidate> list){
Map<String, Double> countTwo = list.stream().collect(Collectors.groupingBy(Candidate::getGender,Collectors.av
eragingDouble(Candidate::getAge)));
return countTwo;
}
public Optional<Candidate> getYoungestCandidateDetails(List<Candidate> list){
Optional<Candidate> youngestMaleCandidate= list.stream().filter(e -> e.getGender()=="Male" && e.getDepartme
nt()=="Product Development").min(Comparator.comparingInt(Candidate::getAge));
return youngestMaleCandidate;
}
}
public class HiringOn {
public static void main(String[] args) {
// TODO Auto-generated method stub
List<Candidate> list = new ArrayList<>();
list.add(new Candidate(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
list.add(new Candidate(144, "Scarlet Jhonson", 28, "Male", "Product Development", 2014, 32500.0));
Implementation i1 = new Implementation();
System.out.println(i1.getCount(list));
System.out.println(i1.getAverageAge(list));
System.out.println(i1.getYoungestCandidateDetails(list));
}
}