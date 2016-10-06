function charger(){

	// 1 : Créer un XHR
	var XHR;
	
	document.getElementById("p1").innerHTML="Wait please...";
	
	if (window.XMLHttpRequest){
		XHR= new XMLHttpRequest();
	}
	else{
		XHR=new ActiveXObject("Microsoft.XMLHttp");
	}

	// 2 : Ouvrir une connexion

	XHR.open("GET",	// La méthode HTTP utilisée
			"ser", // Le composant du serveur qui va traiter la requête
			// "ser?id=1&name=toto",
			true);	// True : en mode asynchrone

	// 3 : Envoyer la requête

	XHR.send();

	//4 : exploiter l'état de la réponse

	XHR.onreadystatechange=function(){
		if (XHR.readyState==4 && XHR.status==200){
			document.getElementById("div1").innerHTML=XHR.responseText;
			document.getElementById("p1").innerHTML="";
		}
	}
	
	
	

	/* Les etats de XHR sont 4 :
	0 : requête non initialisée
	1 : connexion avec le serveur est ouvertre
	2 : Requête reçue par le serveur
	3 : Traitement en cours
	4 : réponse prête




	 */
}