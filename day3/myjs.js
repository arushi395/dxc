function check(){
    var span1=document.getElementById("s1")
    var span2=document.getElementById("s2")
    var uname=document.getElementById("username").value;
    var password=document.getElementById("password").value;
    if(uname.length==0){
        span1.innerHTML="<font color=red>Please enter a valid user name </font>"
    }
    else{
        span1.innerText="";
    }
    if(password.length==0){
        span2.innerHTML="<font color=red>Password is Mandatory </font>"
        return false
    }
    else if(password.length<6 || password.length>12){ 
        span2.innerHTML="<font color=red>Password should be between 6 to 12 characters </font>"
        return false
    }
    else if(password.charAt(0)!='A'){
        span2.innerHTML="<font color=red>Password should start with 'A' </font>"
        return false
    }
    else{
        span2.innerText="";
    }
}
