# Java Thread Nedir?
-
Aynı anda birden fazla iş yapabilmek için kullanılır. Bu sayede işlemler birbirini beklemeden işlemlerine devam ederler.
Formlara giriş yapan kişileri bekletmeden işlemlerin devam etmesini sağlar.
--
Bunu aynı zamanda şu şekilde açıklayabiliiz. İki tane metodumuz olsun birisi uzun işlemler içeren diğeri de basit bir işlem olsun eğer Thread olmasaydı kısa işlemimiz daha geç sürede çalışırdı.

## Thread Nasıl Yapılır?
--
İki şekilde yapılır bunlardan birincisi Runnable arayüzünü kullanmak diğeri ise Thread sınıfından kalıtım almak.

## Avantajları ve Dezavantajları
--
Asenkron yaklaşım diye nitelendirdiğimiz uygulama içerisinde görevlerin paralel bir şekilde, beklemeksizin gerçekleştirilebiliyor olmasıdır. 
Tek olumsuz yanı tek mikro işlemciye sahip sistemlerde performans kaybıdır.  Aynı anda çalışan thread sayısı ile her bir threadın çalıştırılma miktarı arasında ters bir ortantı vardır.