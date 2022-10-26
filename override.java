public class TestDog{
 public static void main(String[] args) {
 Labrador lr=new Labrador();
 lr.dogcolor();
 lr.dogBark(); 
Dog d1=new Dog(); 
d1.dogBark(); 
d1.dogcolor(); }}
class Dog{
 public void dogBark() {
 System.out.println("Barking"); } 
public void dogcolor() {
 System.out.println("color"); }}
class Labrador extends Dog{ 
public void dogBark() {
 System.out.println("Labrador Barking in the road"); } 
public void dogcolor() {
 System.out.println("Labrador color is white"); }}
