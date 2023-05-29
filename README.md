# Втора лабораториска вежба по Софтверско инженерство
# Муамет Зеќири со бр. на индекс 148005
### Control Flow Graph (CFG)


![graf](https://github.com/Zekiri05/SI_2023_lab2_148005/assets/90937110/f6209bdf-041d-484d-ae0e-a5bc64b6cf0f)


## ciklomska = E (rebra) - N (teminja) + 2
### E = 30 
### N = 27

### 30-27+2 = 5

### Tест случаи според Every Branch критериумот:

### Случаите што ги имаме се :

#### 1. Сите информации ако се валидни 

#### 2. Ако емаилот нема вредност е нулл

#### 3. Ако лозинката нема вредност е нул

#### 4. Ако немаме објект

#### 5. Ако сите се нулл

### Тест случаи според if (user==null || user.getPassword()==null || user.getEmail()==null) 


1.Тест случај: 

Сите вредности се нула

if (user==null || user.getPassword()==null || user.getEmail()==null)

    корисникот е нула
    user.getPassword() е нула
    user.getEmail() е нула
    Крајниот резултат: Т
    

2. Тест случај: 

корисникот не е нула, 

user.getPassword() е нула, user.getEmail() не е нула

if (user==null || user.getPassword()==null || user.getEmail()==null)

    корисникот не е нула
    user.getPassword() е нула
    user.getEmail() не е нула
    Крајниот резултат : Т

3. Teст Случај: 

корисникот не е нула, user.getPassword() не е нула, user.getEmail() е нула
if (user==null || user.getPassword()==null || user.getEmail()==null)
    корисникот не е нула
    user.getPassword() не е нула
    user.getEmail() е нула
    Крајниот резултат:  Т

4.Тест случај: 
  
   Ниту една од вредностите не е нула
if (user==null || user.getPassword()==null || user.getEmail()==null)
    корисникот не е нула
    user.getPassword() не е нула
    user.getEmail() не е нула

5. Тест случај: 
    корисникот е нула, user.getPassword() и user.getEmail() не се нула
if (user==null || user.getPassword()==null || user.getEmail()==null)
    корисникот е нула
    user.getPassword() не е нула
    user.getEmail() не е нула
    Крајниот резултат:  Т
