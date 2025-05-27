public class GenericClassExample<T>//generic class are also knows as parameterized classes or parameterized types
{
 private T t;
 public void add(T t)
 {
 this.t = t;
 }
 public T get()
 {
 return t;
 }
 public static void main(String[] args)
{
 GenericClassExample<Integer> integerGc = new GenericClassExample<Integer>();
 GenericClassExample<String> stringGc = new GenericClassExample<String>();
 integerGc.add(new Integer(10));
 stringGc.add(new String("Hello World"));
 System.out.printf("Integer Value :%d\n\n", integerGc.get());
 System.out.printf("String Value :%s\n", stringGc.get());
 }
}