
var request = new XMLHttpRequest();
request.open('GET','http://localhost:8080/JSServer/webresources/myresource');

request.onreadystatechange= function(){
	if((request.status==200)&&(request.readyState==4)){
		
		console.log(request.responseText);
	}
}

request.send();