# APMapping

## Descrizione
*APMapping* è un prototipo del WebService che fornisce ad un nodo eIDAS informazioni sugli AP di un sistema di identità digitale.  La descrizione dell'interfaccia REST del servizio è stata sviluppata grazie al framework [Swagger](https://github.com/swagger-api), mentre l'implementazione si basa sulla piattaforma Java Spring.  Il WebServer è stato sviluppato per accettare solo connessioni HTTPS con autenticazione client, in modo da rilasciare le informazioni solo ai nodi autorizzati.  Nella classe *Swagger2SpringBoot*, che contiene il metodo main ed eredita da *WebSecurityConfigurerAdapter*, è stato effettuato l'override dei metodi che consentono di estrarre l'identità del client dal certificato ricevuto.  L'implementazione dei metodi eseguiti alla ricezione di una richiesta da parte di un nodo si trova nella classe *AttributeProvidersApiController*.  Prima di compilare il WebService, assicurarsi di aver modificato correttamente la configurazione nel file `application.properties`: in particolare è necessario specificare i due keystore che saranno usati per conservare la chiave con il certificato usati dal server per la connessione TLS e i certificati fidati dei nodi eIDAS.  I percorsi dei keystore andranno inseriti rispettivamente nelle proprietà `server.ssl.key-store` e `server.ssl.trust-store`, specificando anche le password necessarie ad accedervi.

## Compilazione
Il software viene fornito come progetto Java gestito tramite [Maven](https://maven.apache.org/): per ottenere il pacchetto JAR è sufficiente portarsi nella cartella del progetto ed eseguire da riga di comando

    mvn package

## Installazione
Inserire nella cartella dove è stato prodotto il package JAR il file "ap.json" contenente la lista degli AP disponibili, insieme con un file JSON per ogni AP contenente le informazioni su di esso; tali file devono avere come nome "{id.ap}.json", dove {id.ap} è l’identificativo assegnato all’interno della lista all’AP.  I file JSON devono rispettare gli schemi forniti.  Per attivare il WebService eseguire da riga di comando, all'interno della cartella contenente il package:

    java -jar .\swagger-spring-1.0.0.jar
