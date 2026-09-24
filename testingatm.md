## Testing

### Test Case 1

**Input:**
Saldo awal = 100000
Pilihan = 1 (Cek Saldo)

**Expected Output:**
"Saldo saat ini: 100000"

**Actual Output:**
"Saldo saat ini: 100000"

**Status:** PASS

---

### Test Case 2

**Input:**
Saldo awal = 100000
Pilihan = 2 (Setor Uang)
Jumlah setor = 50000

**Expected Output:**
"Setoran berhasil"
"Saldo saat ini: 150000"

**Actual Output:**
"Setoran berhasil"
"Saldo saat ini: 150000"

**Status:** PASS

---

### Test Case 3

**Input:**
Saldo awal = 100000
Pilihan = 3 (Tarik Uang)
Jumlah tarik = 50000

**Expected Output:**
"Penarikan berhasil"
"Saldo saat ini: 50000"

**Actual Output:**
"Penarikan berhasil"
"Saldo saat ini: 50000"

**Status:** PASS

---

### Test Case 4

**Input:**
Saldo awal = 100000
Pilihan = 3 (Tarik Uang)
Jumlah tarik = 150000

**Expected Output:**
"Saldo tidak mencukupi"
"Saldo saat ini: 100000"

**Actual Output:**
"Saldo tidak mencukupi"
"Saldo saat ini: 100000"

**Status:** PASS

---

### Test Case 5

**Input:**
Saldo awal = 100000
Pilihan = 4 (Keluar)

**Expected Output:**
"Terima kasih"
"Saldo akhir: 100000"

**Actual Output:**
"Terima kasih"
"Saldo akhir: 100000"

**Status:** PASS
