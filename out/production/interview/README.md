## Soal pertama

ditunjukkan sebuah pola bintang sebagai berikut
```aidl
*
**
***
****
*****
```

untuk pola demikian bintang semakin bertambah sesuai dengan n baris
misal baris pertama bintang sebanyak 1 baris kedua bintang sebanyak 2 dst.

untuk stepnya kita bisa jabarkan demikian

1. tentukan berapa banyak baris (misail n) yang diinginkan.
2. masukan perulangan pertama untuk baris i => n.
3. masukan perulangan untuk print value bintangnya j => i

jika diimplementasikan dalam sebuah code maka akan seperti ini

```aidl
// memasukan berapa banyak baris
// karena dicontoh statik 5 baris jadi kita tidak perlu menggunakan Scanner
int n = 5;

// perulangan untuk baris
for(int i=1;i<=5;i++) {
    // perulangan untuk print value bintang
    for(int j=1; j<=i; j++){
        System.out.print("*");
    }
    // membuat baris baru jika perulangan j selesai. 
    System.out.println();
}
```

## Soal kedua

ditunjukkan sebuah algoritma sebagai berikut

```aidl
a = [4,2,3,3,5,1,5,4]
for i = 0; i < size(a); i++ {
    for j = i+1; j < size(a); j++ {
        if(a[i] == a[j]) print(a[i])
    }
}
```
perlu kita identifikasi bahwasanya

1. terdapat sebuah array of integer
2. terdapat perulangan pertama yang mengiterasi array a dari awal sampai akhir
3. terdapat perulangan kedua mulai dari perulangan pertama + 1 (dalam konteks index)
4. lalu terdapat kondisi dimana ketika value dari a[i] == a[j] sama maka sistem akan print value dari a[i]
5. hasil akhirnya adalah algoritma tersebut ingin mengurangi satu buah angka pada array tersebut. misal terdapat 3 buah angka 4 dalam array tersebut jika kita menggukan algoritma tersebut maka yang dihasilkan itu hanya 2 buah angka 4 saja. dan jika hanya terdapat 1 angka maka angka tersebut menghilang.
6. atau alternative tujuan lainnya bisa jadi. karena output dari algoritma tersebut bukan sebuah array. maka bisa jadi tujuannya yaitu hanya untuk mengecek apakah ada angka yang berulang sebanyak (n - 1) kali.