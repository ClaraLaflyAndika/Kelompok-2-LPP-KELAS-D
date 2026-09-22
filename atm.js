
let saldo = 0; 
let pilihan;          
let jumlah;            
let inputPilihan;      
let inputJumlah;       

console.log("=== SELAMAT DATANG DI ATM ===");

do {
  console.log("");
  console.log("------ MENU ATM ------");
  console.log("1. Cek Saldo");
  console.log("2. Setor Uang");
  console.log("3. Tarik Uang");
  console.log("4. Keluar");
  console.log("----------------------");

  inputPilihan = prompt("Pilih menu (1-4): ");
  pilihan = Number(inputPilihan);

  if (isNaN(pilihan)) {
    console.log("Input tidak valid. Masukkan angka saja.");
  } else {
    switch (pilihan) {
      case 1:
        // Cek saldo
        console.log("Saldo Anda saat ini: Rp " + saldo.toLocaleString("id-ID"));
        break;

      case 2:
        // Setor uang
        inputJumlah = prompt("Jumlah setor: Rp ");
        jumlah = Number(inputJumlah);
        if (isNaN(jumlah)) {
          console.log("Input tidak valid. Masukkan angka saja.");
        } else if (jumlah > 0) {
          saldo = saldo + jumlah;
          console.log("Setor berhasil. Saldo sekarang: Rp " + saldo.toLocaleString("id-ID"));
        } else {
          console.log("Jumlah setor harus lebih dari 0.");
        }
        break;

      case 3:
        // Tarik uang
        inputJumlah = prompt("Jumlah tarik: Rp ");
        jumlah = Number(inputJumlah);
        if (isNaN(jumlah)) {
          console.log("Input tidak valid. Masukkan angka saja.");
        } else if (jumlah <= 0) {
          console.log("Jumlah tarik harus lebih dari 0.");
        } else if (jumlah > saldo) {
          console.log("Saldo tidak mencukupi. Saldo Anda: Rp " + saldo.toLocaleString("id-ID"));
        } else {
          saldo = saldo - jumlah;
          console.log("Tarik berhasil. Saldo sekarang: Rp " + saldo.toLocaleString("id-ID"));
        }
        break;

      case 4:
        console.log("Terima kasih telah menggunakan ATM.");
        break;

      default:
        console.log("Menu tidak tersedia. Pilih angka 1 sampai 4.");
    }
  }
} while (pilihan !== 4);

console.log("");
console.log("Saldo akhir Anda: Rp " + saldo.toLocaleString("id-ID"));