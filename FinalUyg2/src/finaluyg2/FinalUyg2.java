/*
Metotların Aşırı Yüklenmesi İf-Else ile Mantıksal Operatörlerle Çıkarma ve Bölme Uygulaması
verilen iki sayının if-else  koşullarına göre  ekrana yazdıran
dört metotdan oluşan  bir overloading uygulamasıdır.
*/

package finaluyg2;

/**
 *
 * @author Bora
 */
public class FinalUyg2 {

    public static int cikarmaIslemi(int x, int y)//cikarmIslemi adında 2 parametreli metot oluşturdum. 
    {
      int cikarmaIslemi;//int veri tipinde çıkarma işlemi değişkeni oluşturdum.
      if(x>y)//if değimi ile x y'den büyük ise 
      {
          cikarmaIslemi=x-y;//x'i y'den çıkartıp değeri cikarmaIslemi değişkenine atıyorum.
      }
      else//Şart sağlanmıyor ise(y büyükse)
      {
          cikarmaIslemi=y-x;//y'i x'den çıkartıp değeri cikarmaIslemi değişkenine atıyorum.
      }
      return cikarmaIslemi;//Değer döndürülür ve Metot sonlandırılır.
    }
    
    public static double cikarmaIslemi(double x, double y)//cikarmIslemi adında 2 parametreli metot oluşturdum. 
    {
      double cikarmaIslemi;//double veri tipinde çıkarma işlemi değişkeni oluşturdum.
      if(x>y)//if değimi ile x y'den büyük ise 
      {
          cikarmaIslemi=x-y;//x'i y'den çıkartıp değeri cikarmaIslemi değişkenine atıyorum.
      }
      else//Şart sağlanmıyor ise(y büyükse)
      {
          cikarmaIslemi=y-x;//y'i x'den çıkartıp değeri cikarmaIslemi değişkenine atıyorum.
      }
      return cikarmaIslemi;//Değer döndürülür ve Metot sonlandırılır.
    }
    
    public static int bolmeIslemi(int x, int y)//bolmeIslemi adında 2 parametreli metot oluşturdum. 
    {
      int bolmeIslemi;//int veri tipinde bölme işlemi değişkeni oluşturdum.
      if(x>y)//if değimi ile x y'den büyük ise 
      {
          bolmeIslemi=x/y;//x'i y'den bölüp değeri cikarmaIslemi değişkenine atıyorum.
      }
      else//Şart sağlanmıyor ise(y büyükse)
      {
          bolmeIslemi=y/x;//y'i x'den bölüp değeri cikarmaIslemi değişkenine atıyorum.
      }
      return bolmeIslemi;//Değer döndürülür ve Metot sonlandırılır.
    }
    
    public static double bolmeIslemi(double x, double y)//bolmeIslemi adında 2 parametreli metot oluşturdum. 
    {
      double bolmeIslemi;//double veri tipinde bölme işlemi değişkeni oluşturdum.
      if(x>y)//if değimi ile x y'den büyük ise 
      {
          bolmeIslemi=x/y;//x'i y'den bölüp değeri cikarmaIslemi değişkenine atıyorum.
      }
      else//Şart sağlanmıyor ise(y büyükse)
      {
          bolmeIslemi=y/x;//y'i x'den bölüp değeri cikarmaIslemi değişkenine atıyorum.
      }
      return bolmeIslemi;//Değer döndürülür ve Metot sonlandırılır.
    }
    
    public static void main(String[] args) {
        // Metot Çağırma 
        System.out.println(cikarmaIslemi(7 ,21));
        System.out.println(cikarmaIslemi(21.5 ,7));
        System.out.println(bolmeIslemi(7 ,21));
        System.out.println(bolmeIslemi(21 ,7.5));
    }
    
}
