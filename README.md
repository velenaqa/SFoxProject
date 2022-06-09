# SFoxProject

Executable implementations with details comments to explain it - done.
Written Test Cases - done.
Bug Reports:

Bug report 1. Registration. Country «Ukraine» is not available in country’s list.

Steps to reproduce:
1. Open site with Ukrainian  IP address.
2. Click button «Open account».
3. Open the list of country for finding Ukraine.

Actual Results:
Ukraine is absent in list.
Phone code was wrote right but country not.
Users from Ukraine can not create an account.
Screenshot https://monosnap.com/file/2ROqOYRi7AXSgusIVPlvTT53rg9IKE

Expected Result:
Country Ukraine is in list.



Bug report 2. Registration. Phone number has not validation rules 

Steps to reproduce:
1. Open site 
2. Click button «Open account».
3. Fill all required fields valid data.
4. In field Phone number write max random value (as example 9091233435345678900696875)
5. Click button «Register».

Actual Results:
Screenshot https://monosnap.com/file/ULAGuw8esECqZ9EsCjfokqhHXPW1SJ
Account was created. User can fill random data. It is does not motivated him to write valid phone number and another fields.

Expected Result:
Phone number must have mask of code for each country.




Bug report 3. Authorized user. Cashbox. User has not open FAQ or write to Live Chat.

Steps to reproduce:
1. Login by any user without first deposit (login jdm24227@jiooq.com/ password RTJjjN!b7q$zTEw4) 
2. Click button «FAQ» and Live Chat.


Actual Results:
Page was opened but CashBox pop up blocked any information. It is important because user can have a question before pay deposit.
This implementation has blocked increase of trust to site.
Screenshot https://monosnap.com/file/BnHnSf77OocQt4xMUknWlwD8bSM1Kh 

Expected Result:
CashBox pop up should not block FAQ information and Live Chat.

Bug report 4. Authorized user. User can not logout.

Steps to reproduce:
1. Login by any user without first deposit(login jdm24227@jiooq.com/ password RTJjjN!b7q$zTEw4) 
2. Find Logout button.


Actual Results:
User can not logout. 

Expected Result:
User should can Logout.


Bug report 5. Authorized user. Cashbox. AdBlock is blocked part of payment methods.

Steps to reproduce:
1. Login by user (jdm24227@jiooq.com/) with active Adblock.
2. Click payment method «MiFinity».
3. Fill phone and amount.
4. Click «Deposit».


Actual Results:
I can not do any acts and clicks.
Only Restart page can help me.
Screenshot https://monosnap.com/file/4jicY85EppJBWxjw04a9NcvVm1UZEZ

Expected Result:
User should have information about problems with deposits when Adblock is activate.

Finally, not bug, it is recomendation - some text in letter can not be read.
Screenshot https://monosnap.com/file/DoXc58lCNbn4mcm0rZ6MVqSAMLrpOp
