public class Main {

  public static void main(String[] args) {

    Person me = new Person("Sijing", "Zhang",1997);

    String first_name = me.getFirstName();
    System.out.println(first_name);
    String full_res = me.toString();
    System.out.println(full_res);
  }
}