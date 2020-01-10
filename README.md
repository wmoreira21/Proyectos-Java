# API TIEMPO LIBRERÍA DE PREDICCIONES METEOROLÓGICAS

## introducción

- se puede seleccionar la ciudad pasandola como parámetro 

## endpoints

http://{ip}:{puerto}/information/forecast

##parámetros de URL

code=18578 

##ejemplo de response

http://localhost:8080/information/forecast?code=18578

```
{
	"location": {
		"city": "Santiago de Chile [Región Metropolitana de Santiago;Chile]",
		"var": [{
			"name": "Temperatura Mínima",
			"icon": "4",
			"data": {
				"forecast": [{
					"value": "10",
					"dataSequence": "1",
					"id": null,
					"idB": null,
					"valueB": null,
					"id2": null,
					"value2": null
				}, {
					"value": "15",
					"dataSequence": "2",
					"id": null,
					"idB": null,
					"valueB": null,
					"id2": null,
					"value2": null
				}, {
					"value": "16",
					"dataSequence": "3",
					"id": null,
					"idB": null,
					"valueB": null,
					"id2": null,
					"value2": null
				}, {
					"value": "19",
					"dataSequence": "4",
					"id": null,
					"idB": null,
					"valueB": null,
					"id2": null,
					"value2": null
				}, {
					"value": "16",
					"dataSequence": "5",
					"id": null,
					"idB": null,
					"valueB": null,
					"id2": null,
					"value2": null
				}, {
					"value": "17",
					"dataSequence": "6",
					"id": null,
					"idB": null,
					"valueB": null,
					"id2": null,
					"value2": null
				}, {
					"value": "16",
					"dataSequence": "7",
					"id": null,
					"idB": null,
					"valueB": null,
					"id2": null,
					"value2": null
				}]
			}
		}, {
			"name": "Temperatura Máxima",
			"icon": "5",
			"data": {
				"forecast": [{
					"value": "29",
					"dataSequence": "1",
					"id": null,
					"idB": null,
					"valueB": null,
					"id2": null,
					"value2": null
				}, {
					"value": "33",
					"dataSequence": "2",
					"id": null,
					"idB": null,
					"valueB": null,
					"id2": null,
					"value2": null
				}, {
					"value": "34",
					"dataSequence": "3",
					"id": null,
					"idB": null,
					"valueB": null,
					"id2": null,
					"value2": null
				}, {
					"value": "34",
					"dataSequence": "4",
					"id": null,
					"idB": null,
					"valueB": null,
					"id2": null,
					"value2": null
				}, {
					"value": "33",
					"dataSequence": "5",
					"id": null,
					"idB": null,
					"valueB": null,
					"id2": null,
					"value2": null
				}, {
					"value": "33",
					"dataSequence": "6",
					"id": null,
					"idB": null,
					"valueB": null,
					"id2": null,
					"value2": null
				}, {
					"value": "33",
					"dataSequence": "7",
					"id": null,
					"idB": null,
					"valueB": null,
					"id2": null,
					"value2": null
				}]
			}
		}, {
			"name": "Viento",
			"icon": "9",
			"data": {
				"forecast": [{
					"value": "Viento moderado de suroeste",
					"dataSequence": "1",
					"id": "14",
					"idB": "54",
					"valueB": "Viento moderado de suroeste",
					"id2": null,
					"value2": null
				}, {
					"value": "Viento moderado de suroeste",
					"dataSequence": "2",
					"id": "14",
					"idB": "54",
					"valueB": "Viento moderado de suroeste",
					"id2": null,
					"value2": null
				}, {
					"value": "Viento moderado de suroeste",
					"dataSequence": "3",
					"id": "14",
					"idB": "54",
					"valueB": "Viento moderado de suroeste",
					"id2": null,
					"value2": null
				}, {
					"value": "Viento moderado de suroeste",
					"dataSequence": "4",
					"id": "14",
					"idB": "54",
					"valueB": "Viento moderado de suroeste",
					"id2": null,
					"value2": null
				}, {
					"value": "Viento moderado de suroeste",
					"dataSequence": "5",
					"id": "14",
					"idB": "54",
					"valueB": "Viento moderado de suroeste",
					"id2": null,
					"value2": null
				}, {
					"value": "Viento moderado de suroeste",
					"dataSequence": "6",
					"id": "14",
					"idB": "54",
					"valueB": "Viento moderado de suroeste",
					"id2": null,
					"value2": null
				}, {
					"value": "Viento moderado de suroeste",
					"dataSequence": "7",
					"id": "14",
					"idB": "54",
					"valueB": "Viento moderado de suroeste",
					"id2": null,
					"value2": null
				}]
			}
		}, {
			"name": "Símbolo del tiempo",
			"icon": "10",
			"data": {
				"forecast": [{
					"value": "Cielos despejados",
					"dataSequence": "1",
					"id": "1",
					"idB": null,
					"valueB": null,
					"id2": "1",
					"value2": "Cielos despejados"
				}, {
					"value": "Cielos despejados",
					"dataSequence": "2",
					"id": "1",
					"idB": null,
					"valueB": null,
					"id2": "1",
					"value2": "Cielos despejados"
				}, {
					"value": "Cielos despejados",
					"dataSequence": "3",
					"id": "1",
					"idB": null,
					"valueB": null,
					"id2": "1",
					"value2": "Cielos despejados"
				}, {
					"value": "Cielos despejados",
					"dataSequence": "4",
					"id": "1",
					"idB": null,
					"valueB": null,
					"id2": "1",
					"value2": "Cielos despejados"
				}, {
					"value": "Cielos despejados",
					"dataSequence": "5",
					"id": "1",
					"idB": null,
					"valueB": null,
					"id2": "1",
					"value2": "Cielos despejados"
				}, {
					"value": "Cielos despejados",
					"dataSequence": "6",
					"id": "1",
					"idB": null,
					"valueB": null,
					"id2": "1",
					"value2": "Cielos despejados"
				}, {
					"value": "Cielos despejados",
					"dataSequence": "7",
					"id": "1",
					"idB": null,
					"valueB": null,
					"id2": "1",
					"value2": "Cielos despejados"
				}]
			}
		}, {
			"name": "Día",
			"icon": "15",
			"data": {
				"forecast": [{
					"value": "Jueves",
					"dataSequence": "1",
					"id": null,
					"idB": null,
					"valueB": null,
					"id2": null,
					"value2": null
				}, {
					"value": "Viernes",
					"dataSequence": "2",
					"id": null,
					"idB": null,
					"valueB": null,
					"id2": null,
					"value2": null
				}, {
					"value": "Sábado",
					"dataSequence": "3",
					"id": null,
					"idB": null,
					"valueB": null,
					"id2": null,
					"value2": null
				}, {
					"value": "Domingo",
					"dataSequence": "4",
					"id": null,
					"idB": null,
					"valueB": null,
					"id2": null,
					"value2": null
				}, {
					"value": "Lunes",
					"dataSequence": "5",
					"id": null,
					"idB": null,
					"valueB": null,
					"id2": null,
					"value2": null
				}, {
					"value": "Martes",
					"dataSequence": "6",
					"id": null,
					"idB": null,
					"valueB": null,
					"id2": null,
					"value2": null
				}, {
					"value": "Miércoles",
					"dataSequence": "7",
					"id": null,
					"idB": null,
					"valueB": null,
					"id2": null,
					"value2": null
				}]
			}
		}, {
			"name": "Definición de Atmosfera",
			"icon": "19",
			"data": {
				"forecast": [{
					"value": "Durante todo el dia Cielos despejados",
					"dataSequence": "1",
					"id": null,
					"idB": null,
					"valueB": null,
					"id2": null,
					"value2": null
				}, {
					"value": "Durante todo el dia Cielos despejados",
					"dataSequence": "2",
					"id": null,
					"idB": null,
					"valueB": null,
					"id2": null,
					"value2": null
				}, {
					"value": "Durante todo el dia Cielos despejados",
					"dataSequence": "3",
					"id": null,
					"idB": null,
					"valueB": null,
					"id2": null,
					"value2": null
				}, {
					"value": "Durante todo el dia Cielos despejados",
					"dataSequence": "4",
					"id": null,
					"idB": null,
					"valueB": null,
					"id2": null,
					"value2": null
				}, {
					"value": "Durante todo el dia Cielos despejados",
					"dataSequence": "5",
					"id": null,
					"idB": null,
					"valueB": null,
					"id2": null,
					"value2": null
				}, {
					"value": "Durante todo el dia Cielos despejados",
					"dataSequence": "6",
					"id": null,
					"idB": null,
					"valueB": null,
					"id2": null,
					"value2": null
				}, {
					"value": "Durante todo el dia Cielos despejados",
					"dataSequence": "7",
					"id": null,
					"idB": null,
					"valueB": null,
					"id2": null,
					"value2": null
				}]
			}
		}]
	}
}

```