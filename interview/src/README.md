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

## Soal Ketiga

jabarkan algoritma dalam pattern berikut
```aidl
*            *
**          **
***        ***
****      ****
*****    *****
******  ******
******  ******
*****    *****
****      ****
***        ***
**          **
*            *
```

1. saya melihat pola tersebut hampir sama dengan soal yang pertama, namun dengan beberapa tambahan
2. saya membagi pola tersebut sebagai 4 bagian

bagian pertama
```aidl
*         
**         
***        
****     
*****    
******
```

bagian kedua
```aidl
     *
    **
   ***
  ****
 *****
******
```

bagian ketiga
```aidl
******  
*****    
****      
***        
**         
*          
```

bagian keempat
```aidl
 ******
  *****
   ****
    ***
     **
      *
```

3. cara saya mengerjakan soal seperti ini saya membayangkan bahwa ada spasi pada setiap baris, jika digambarkan seperti ini
4. agar penggambaran lebih jelas untuk spasi saya ganti dengan '#'
jadi kurang lebih untuk bagian 1 akan seperti ini
```aidl
*#####         
**####         
***###        
****##     
*****#    
******
```
5. untuk membuat hal tersebut saya membuat 3 perulangan
```aidl
 for(int i=0;i<6;i++) {
    for(int j=6-i;j<=6;j++){
        System.out.print("*");
    }
    for(int j=6-i;j>=1;j--){
        System.out.print(" ");
    }
}
```
6. untuk bagian 2, 3 dan 4 sama hanya saja mengganti variablenya, untuk keseluruhan codenya seperti berikut
```aidl
for(int i=0;i<6;i++) {
    for(int j=6-i;j<=6;j++){
        System.out.print("*");
    }
    for(int j=6-i;j>=1;j--){
        System.out.print(" ");
    }
    for(int j=6-i;j>=1;j--){
        System.out.print(" ");
    }
    for(int j=6-i;j<=6;j++){
        System.out.print("*");
    }
    System.out.println();
}
for(int i=0;i<6;i++) {
    for(int j=i;j<6;j++){
        System.out.print("*");
    }
    for(int j=6-i;j<=6;j++){
        System.out.print(" ");
    }
    for(int j=6-i;j<=6;j++){
        System.out.print(" ");
    }
    for(int j=i;j<6;j++){
        System.out.print("*");
    }
    System.out.println();
}
```

## Soal keempat

diberikan sebuah 3 table, dan kita disuruh untuk memberikan query dengan output tertentu

1. mungkin saya ingin menggambarkan tablenya satu persatu

```aidl
create table dosen(
    id int not null auto_increment,
    name varchar(255) not null,
    primary key(id)
)

create table kuliah(
    id int not null auto_increment,
    mk_name varchar(255) not null,
    sks int not null,
    primary key(id)
)

create table kelas(
    id int not null auto_increment,
    dosen_id int,
    mk_id int,
    kelas varchar(100) not null,
    foreign key (dosen_id) references dosen(id),
    foreign key (mk_id) references kuliah(id)
)
```
artinya table kelas di sini berelasi dengan table kuliah dan dosen.

pertanyaanya adalah bagaiamna kita bisa mengetahui tiap dosen mengambil berapa banyak SKS

1. dalam konteks demikian kita dapat menggunakan GROUP BY dan juga JOIN.

untuk query nya sebagai berikut

```aidl
SELECT d.nama AS nama, SUM(mk.sks) AS jumlah_sks
FROM kelas k
JOIN dosen d ON k.dosen_Id = d.id
JOIN kuliah mk ON k.mk_id = mk.id
GROUP BY d.id, d.nama;
```
jika datanya sesuai dengan yang dicontoh maka akan menghasilkan

| nama  | jumlah_sks |
|-------|------------|
| Encep | 14         |
| Doni  | 12         |
| Rudi  | 4          |


## Soal kelima

jelaskan RESTful API dengan kata-kata sendiri

sebelum mendalami mengenai RESTful API saya ingin menjelaskan mengenai API itu sendiri.
API merupakan sebuah Interface yang menghubungkan 2 atau lebih perangkat lunak/ Computer itu berkomunikasi.

setelah mengetahui API kita beranjak ke web service.
web service merupakan sebuah program yang berada di server yang dapat di akses melaui internet.

REST API merupakan salah satu arsitektur dalam mengembangkan sebuah web service. RESTful API itu sebutan bagi sebuah web service yang menerapkan REST arsitektur.

RESTful API terkenal dalam client-server arsitekturnya. si client melakukan request terhadap server dan server memberikan response untuk digunakan oleh client.

dan juga RESTful API ini menggunakan HTTP protokol.

contoh sederhananya pada soal keempat.

dalam RESTful API untuk mengakses data biasanya terdapat format seperti

`https://baseurl.com/api/v1/dosens`

dalam penamaanya biasanya seperti **api** menandakan bahwa url tersebut adalah untuk mengakses webservice.
untuk v1 itu versi dan dosens itu merupakan table dari databasenya. harus berupa noun dan jamak.

dalam satu url tersebut kita bisa melakukan CRUD (create, raed, update, delete) operations
dengan HTTP kita bisa mengetahui apa yang terjadi dengan membaca status code
- 200 - Success
- 300 - redirect
- 400 - client error
- 500 - server error

RESTful API terkenal dengan parsing data dengan JSON. JSON merupakan sebuah format
seperti javascript object jadi mudah di olah untuk client. berikut contoh JSON format

```aidl
{
    "message":"success",
    "error": false,
    "data": [
        {
            "nama": "Doni",
            "id": 1,
        },
        {
            "nama": "Rudi",
            "id": 2,
        }
    ]
}
```
