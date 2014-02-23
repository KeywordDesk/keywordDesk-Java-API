keywordDeskApiExample
=====================

This is a java API-Example for the keyworddesk.com client API.

German:
Einfache API Dokumentation:

1) Authentifizierung
	- REST Call http://api.keyworddesk.com/api/login mit JSON im http-Request Body:
	{"username": "derUsername", "password": "dasPasswort"}

	- Beispiel JSON Response bei http Status Code 200 (es hat geklappt):
	{"username":"derUsername","token":"bq70c0pel4gdd9prave5efhvluiu84ps","roles":["API_SEARCHVOLUME","API_USER"]}
	Der Token muss in der eigenen Anwendung gespeichert werden und wird für weitere Authentifizierung genutzt.

2) API Calls
	- API Base (Version 1): http://api.keyworddesk.com/v1/
	- Jeder API Call muss im HTTP-Request Header den vorher gespeicherten Token als X-Auth-Token übermitteln.
	
	- HTTP POST auf http://api.keyworddesk.com/v1/getKeywordData
	mit JSON im Body:
	{"keyword": "angefordertes keyword", "searchVolume": true}
	Für das Keyword wird das Suchvolumen angefordert.

	Weitere Beispiele:
	{"keyword": "angefordertes keyword", "searchVolume": true, "suggestedBid": true}
	Für das Keyword wird das Suchvolumen UND der CPC angefordert.

	{"keyword": "angefordertes keyword", "googleResultCount": true, "googleInTitleCount": true}
	Für das Keyword wird die Anzahl der Google Suchergebnisse UND die Anzahl der Ergebnisse mit "intitle"-Abfrage angefordert.

	INFO: Die jeweiligen Keyworddaten werden immer nur dann zurück gegeben, wenn der API User die entsprechenden Rechte für die Felder hat.

	WICHTIG: In den kommenden Tagen könnte es sein, dass die API Methoden nochmals überarbeitet werden. Angedacht ist eine BULK Funktion, mit der sich mehrere Keywords in einem Request anfordern lassen. Das oben genannte JSON wird dann einfach in ein JSON-Array gepackt.


	HTTP POST auf http://api.keyworddesk.com/v1/orderKeywordData
	mit JSON im Body:
	{"keyword": "keyword das abgeholt werden soll", "suggestedBid":true}
	Erstellt für das genannte Keyword einen Job, der das Suchvolumen abholen soll. Weitere mögliche Felder wie bei "getKeywordData".

	Wenn ein Job erfolgreich abgeschlossen ist, wird die im Backend hinterlegte notify-URL gecalled.

	


