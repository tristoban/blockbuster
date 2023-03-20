const btnFormAddClt = document.getElementById('add-clt-btn');
const contFormAddClt = document.getElementById('form-add-clt-container');

btnFormAddClt.addEventListener('click', () => {
  if (contFormAddClt.style.display === 'none') {
    contFormAddClt.style.display = 'block';
  } else {
    contFormAddClt.style.display = 'none';
  }
});


 btnFormAddClt.addEventListener('submit', async (event) => {
        event.preventDefault(); // Prevenir el envío del formulario

        const formData = new FormData(form); // Obtener datos del formulario

        const data = {
          name: formData.get('name'),
          email: formData.get('email')
        }; // Crear objeto de datos

        const response = await fetch('http://localhost:8080/', {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json'
          },
          body: JSON.stringify(data) // Convertir objeto a JSON y enviar en el body
        });

        console.log(await response.json()); // Manejar la respuesta JSON
      });