html>
<body>
</br>
Enter numbers to perform addition(11,22,33):
<input type="text" id="input" name="input">
<button onclick="universalAddition()">ADD</button>
<p id="add"></p>
<script>
  function universalAddition() {
    // var xx=document.getElementById("input");
    //alert(xx);
    var input = document.getElementById("input").value;
    // alert(input);
    var results=0;
    
    
    var numbers = input .split([',']);
    //alert(numbers);
    //console.log(numbers);

    for(var i=0; i<numbers.length; i++){
    results=results + Number(numbers[i]);
   }
    // alert(results);
    document.getElementById("add").innerHTML = results;
  }
</script>
<html>
<body>