# Mini Programming Project Kelompok 2 Kelas D

## 1. Group Information

**Class:** D  
**Group:** 2

### Group Members

| No. | Name | Student ID | Role |
|---|---|---|---|
| 1 | Joearta L.G.P Sihaloho | 2610312131 | Project Coordinator |
| 2 | Nizar Ali Shibli | 2610312115 | Algorithm |
| 3 | Clara Lafly Andika | 2610312124 | Flowchart |
| 4 | Khairan Althafby Hermawan | 2610312120 | JavaScript |
| 5 | Kemal Irfan Riadi | 2610312133 | JavaScript |
| 6 | Aura Cahaya Khamilah | 2610312126 | Testing & Documentation |



---

## 2. Project Title

Simple ATM Simulator

---

## 3. Project Description

This program is a simple game in which the player must guess a number determined by the computer.

---

## 4. Objectives

This project is designed to apply the following programming concepts:

- Variables
- Data types
- Operators
- Conditional statements
- Loops
- Algorithms
- JavaScript

---

## 5. Input

The program receives:

- The player's guess
- The number of attempts

---

## 6. Process

The program compares the player's guess with the target number.

If the guess is:

- Too high → the program provides a "too high" message
- Too low → the program provides a "too low" message
- Correct → the player wins

---

## 7. Output

The program displays:

- The result of each guess
- Hints or feedback
- The number of remaining attempts
- The final game status (win/loss)

---

## 8. Algorithm

The algorithm used in the program is described in:

`pseudocode.txt`

---

## 9. Flowchart

The flowchart is created using Flowgorithm.

File:

`<?xml version="1.0"?>
<flowgorithm fileversion="4.2">
    <attributes>
        <attribute name="name" value="flowgorithm"/>
        <attribute name="authors" value="Clara Lafly Andika"/>
        <attribute name="about" value=""/>
        <attribute name="saved" value="2026-09-22 08:12:34 PM"/>
        <attribute name="created" value="Q2xhcmEgTGFmbHkgQW5kaWthO0RFU0tUT1AtT0pLNkxNODsyMDI2LTA5LTE4OzA0OjU5OjM4IFBNOzQwMTA="/>
        <attribute name="edited" value="Q2xhcmEgTGFmbHkgQW5kaWthO0RFU0tUT1AtT0pLNkxNODsyMDI2LTA5LTIyOzA4OjEyOjM0IFBNOzI7NDEwMw=="/>
    </attributes>
    <function name="Main" type="None" variable="">
        <parameters/>
        <body>
            <declare name="saldo" type="Integer" array="False" size=""/>
            <declare name="jumlah" type="Integer" array="False" size=""/>
            <declare name="pilihan" type="Integer" array="False" size=""/>
            <assign variable="Saldo" expression="0"/>
            <assign variable="pilihan" expression="0"/>
            <while expression="pilihan &lt;&gt; 4">
                <output expression="&quot;===== MENU ATM =====&quot;" newline="True"/>
                <output expression="&quot;1. Cek Saldo&quot;" newline="True"/>
                <output expression="&quot;2. Setor Uang&quot;" newline="True"/>
                <output expression="&quot;3. Tarik Uang&quot;" newline="True"/>
                <output expression="&quot;4. Keluar&quot;" newline="True"/>
                <output expression="&quot;Pilih menu: &quot;" newline="True"/>
                <input variable="pilihan"/>
                <if expression="pilihan = 1">
                    <then>
                        <output expression="&quot;Saldo saat ini: &quot;" newline="True"/>
                        <output expression="Saldo" newline="True"/>
                    </then>
                    <else>
                        <if expression="pilihan = 2">
                            <then>
                                <output expression="&quot;Masukkan Jumlah setor: &quot;" newline="True"/>
                                <input variable="Jumlah"/>
                                <if expression="Jumlah &gt; 0">
                                    <then>
                                        <assign variable="Saldo" expression="Saldo + jumlah"/>
                                        <output expression="&quot;setor uang berhasil&quot;" newline="True"/>
                                        <output expression="&quot;Saldo sekarang: &quot;" newline="True"/>
                                        <output expression="Saldo" newline="True"/>
                                    </then>
                                    <else>
                                        <output expression="&quot;Jumlah setor harus lebih dari 0&quot;" newline="True"/>
                                    </else>
                                </if>
                            </then>
                            <else>
                                <if expression="pilihan = 3">
                                    <then>
                                        <output expression="&quot;Masukkan jumlah tarik: &quot;" newline="True"/>
                                        <input variable="Jumlah"/>
                                        <if expression="Jumlah &gt; 0">
                                            <then>
                                                <if expression="Jumlah &lt;= saldo">
                                                    <then>
                                                        <assign variable="Saldo" expression="Saldo - jumlah"/>
                                                        <output expression="&quot;Penarikan berhasil&quot;" newline="True"/>
                                                        <output expression="&quot;Saldo sekarang: &quot;" newline="True"/>
                                                        <output expression="Saldo" newline="True"/>
                                                    </then>
                                                    <else>
                                                        <output expression="&quot;Saldo tidak mencukupi&quot;" newline="True"/>
                                                    </else>
                                                </if>
                                            </then>
                                            <else>
                                                <output expression="&quot;Jumlah penarikan harus lebih dari 0&quot;" newline="True"/>
                                            </else>
                                        </if>
                                    </then>
                                    <else>
                                        <if expression="pilihan = 4">
                                            <then>
                                                <output expression="&quot;Terima kasih telah menggunakan ATM&quot;" newline="True"/>
                                            </then>
                                            <else>
                                                <output expression="&quot;Pilihan tidak valid.&quot;" newline="True"/>
                                            </else>
                                        </if>
                                    </else>
                                </if>
                            </else>
                        </if>
                    </else>
                </if>
            </while>
            <output expression="&quot;Saldo akhir: &quot;" newline="True"/>
            <output expression="Saldo" newline="True"/>
        </body>
    </function>
</flowgorithm>`


---

## 10. JavaScript Implementation

The JavaScript implementation of the program is available in:

`program.js`

---

## 11. Testing

The program is tested using several test scenarios.

Testing documentation:

`test-cases.md`
