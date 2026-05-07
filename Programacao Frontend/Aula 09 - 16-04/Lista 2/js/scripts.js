const url = 'https://api.open-meteo.com/v1/forecast?latitude=-22.21&longitude=-45.91&current_weather=true';

fetch(url)
    .then(response => response.json())
    .then(data => {
        const clima = data.current_weather;
        console.log('Temperatura:', clima.temperature, '°C');
        console.log('Vento:', clima.windspeed, 'km/h');
    });

const url2 = 'https://api.open-meteo.com/v1/forecast?latitude=-22.21&longitude=-45.91&hourly=temperature_2m';

fetch(url2)
    .then(response => response.json())
    .then(data => {
        data.hourly.time.forEach((hora, index) => {
            const temp = data.hourly.temperature_2m[index];
            console.log(hora, '->', temp, '°C');
        });
    });

fetch(url2)
    .then(response => response.json())
    .then(data => {
        const times = data.hourly.time.slice(0, 24);
        const temps = data.hourly.temperature_2m.slice(0, 24);
        times.forEach((hora, index) => {
            const temp = temps[index];
            console.log(hora, '->', temp, '°C');
        });
    });

const url3 = 'https://api.open-meteo.com/v1/forecast?latitude=-22.21&longitude=-45.91&daily=precipitation_sum&timezone=America%2FSao_Paulo'

fetch(url3)
    .then(response => response.json())
    .then(data => {
        const dias = data.daily.time;
        const precipitacao = data.daily.precipitation_sum;
        dias.forEach((dia, index) => {
            console.log('Dia: ' + dia + ' com: ' + precipitacao[index] + ' mm');
        });
    });

const url4 = 'https://api.open-meteo.com/v1/forecast?latitude=-22.21&longitude=-45.91&hourly=temperature_2m,relativehumidity_2m,windspeed_10m'

fetch(url4)
    .then(response => response.json())
    .then(data => {
        const horas = data.hourly.time;
        const temperatura =  data.hourly.temperature_2m;
        const umidade = data.hourly.relativehumidity_2m; 
        const vento = data.hourly.windspeed_10m; 

        for(let i = 0; i < 6; i++){
            console.log(horas[i] + " -> Temp: " + temperatura[i] + '°C | Umidade: ' + umidade[i] + "% | Vento: " + vento[i] + " km/h")
        }
    });