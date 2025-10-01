# Praktikum Python
# Nama : Moza Keyla
# Kelas: XI RPL 2
# Tugas: Variabel, Struktur Data, Fungsi, Percabangan, Operator, Input/Output, dan Perulangan


# 1. Variabel dan Tipe Data
print("=== 1. Variabel dan Tipe Data ===")
n = 25          # int
i = 7.5         # float
s = "Pemrograman"   # string
a = [2, 4, 6, 8]    # list

print("Tipe data x:", type(n))
print("Tipe data y:", type(i))
print("Tipe data z:", type(s))
print("Tipe data w:", type(a))


# 2. List dan Manipulasi
print("\n=== 2. List dan Manipulasi ===")
belanja = ["beras", "minyak", "telur"]
belanja.append("gula")
belanja.append("kopi")

print("Daftar belanja:")
for item in belanja:
    print("-", item)


# 3. Dictionary
print("\n=== 3. Dictionary ===")
harga = {
    "beras": 12000,
    "minyak": 17000,
    "telur": 24000,
    "gula": 15000,
    "kopi": 20000
}
total = sum(harga.values())
print("Total harga belanjaan:", total)


# 4. Fungsi
print("\n=== 4. Fungsi ===")
def persegi_panjang(panjang, lebar):
    luas = panjang * lebar
    keliling = 2 * (panjang + lebar)
    return luas, keliling

luas, keliling = persegi_panjang(10, 4)
print("Luas persegi panjang:", luas)
print("Keliling persegi panjang:", keliling)


# 5. Percabangan
print("\n=== 5. Percabangan ===")
data_usia = [5, 18, 32, 70, -3]
for usia in data_usia:
    print("Usia:", usia, "=>", end=" ")
    if 0 <= usia <= 13:
        print("Anak")
    elif 14 <= usia <= 24:
        print("Remaja")
    elif 25 <= usia <= 49:
        print("Dewasa")
    elif usia >= 50:
        print("Lansia")
    else:
        print("Usia tidak valid")


# CASTING DATA TYPES
print("\n=== Casting Data Types ===")
angka_str = "456"
print("Sebelum casting:", angka_str, type(angka_str))
print("Sesudah casting:", int(angka_str), type(int(angka_str)))

angka_int = 12345
print("Sebelum casting:", angka_int, type(angka_int))
print("Sesudah casting:", str(angka_int), type(str(angka_int)))

print("Casting int 1 ke bool:", bool(1), type(bool(1)))
print("Casting int 0 ke bool:", bool(0), type(bool(0)))


# COMPARISON & LOGICAL OPERATORS
print("\n=== Comparison & Logical Operators ===")
print("8 == 8 :", 8 == 8)
print("8 != 9 :", 8 != 9)
print("8 > 9  :", 8 > 9)
print("8 < 9  :", 8 < 9)
print("8 <= 9 :", 8 <= 9)
print("9 >= 9 :", 9 >= 9)

a, b = True, True
print("a and b :", a and b)
print("a or b  :", a or b)
print("not b   :", not b)
print("5>6 and 6<7 :", 5 > 6 and 6 < 7)



# ARITHMETIC OPERATORS
print("\n=== Arithmetic Operators ===")
e, f = 8, 2
print("e + f =", e + f)
print("e - f =", e - f)
print("e * f =", e * f)
print("e / f =", e / f)
print("e % f =", e % f)
print("e ** f =", e ** f)



# INPUT & OUTPUT 
print("\n=== Input & Output ===")
nama = "Parman"
umur = 24
print("Hi all! I am", nama, "age", umur, "years old")
print(f"Hi all! I am {nama} age {umur} years old")
print("Hi all! I am %s age %d years old" % (nama, umur))



# CONDITIONALS & EXCEPTION HANDLING
print("\n=== Conditionals ===")
try:
    gpa = 3.65
    if 4.0 >= gpa >= 0.0:
        if gpa >= 3.80:
            print("Magna cumlaude")
        elif gpa >= 3.50:
            print("Cumlaude")
        elif gpa >= 3.00:
            print("Cukup")
        else:
            print("Perlu ditingkatkan")
    else:
        print("Nilai GPA tidak valid")
except:
    print("Input GPA salah")

kode = 404
match kode:
    case 200: print("Success")
    case 400: print("Bad Request")
    case 401: print("Unauthorized")
    case 403: print("Forbidden")
    case 404: print("Not Found")
    case 500: print("Server Error")

bil = 7
hasil = "Genap" if bil % 2 == 0 else "Ganjil"
print("Bilangan:", bil, "=>", hasil)


# LOOPS
print("\n=== Loops ===")
for i in range(5):
    print("Perulangan ke-", i)

print("Contoh perulangan string:")
kalimat = "Python"
for huruf in kalimat:
    print(huruf)

print("Perulangan dengan enumerate:")
for idx, huruf in enumerate(kalimat):
    print(idx, huruf)

print("Perulangan mundur:")
for i in range(5, 1, -1):
    print(i)
    
print("\n=== 6. Keyword Control ===")
for i in range(5):
    if i == 2:
        continue   
    if i == 4:
        break      
    print("i =", i)

print("Contoh while:")
count = 0
while count < 4:
    print("Belajar Python itu seru!")
    count += 1