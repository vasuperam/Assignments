<body>
</br>
FirstName:
<input type="text" id="firstName" name="firstName">
LastName:<input type="text" id="lastName" name="lastName">
<button onclick="getFullName()">GetFullName</button>
<p id="name"></p>
<script>
  function getFullName() {
 
    var fstName = document.getElementById("firstName").value;
    var lstName = document.getElementById("lastName").value;
    //alert(fstName);
    //alert(lstName);
    getName(fstName, lstName, print);
      
  }
  
  function getName(fstName, lstName, print){
   if(fstName!='' && fstName!=''){
      fullName=fstName+' '+lstName;
      print(fullName);
     
     } else{
    	 print('Please provide first and last name')
     	}
     }
  function print(fullName){
       document.getElementById("name").innerHTML = fullName;
     }
  
</script>
<html>
<body>
