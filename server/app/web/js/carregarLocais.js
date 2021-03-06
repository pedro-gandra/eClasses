function carregarUf() {
  let url = "http://localhost:8080/app/listar/uf";
  fetch(url, { method: "POST",
    credentials: 'include'})
    .then(resposta => resposta.arrayBuffer())
    .then(buffer => {
      let decoder = new TextDecoder("iso-8859-1");
      let text = decoder.decode(buffer);
      parser = new DOMParser();
      xmlDoc = parser.parseFromString(text, "text/xml");
      preencherSelectUf(xmlDoc);
    });
}

function carregarMunicipio() {
  let uf = selUf.options[selUf.selectedIndex].text;
  let url = "http://localhost:8080/app/listar/municipio?uf="+uf;
  fetch(url, { encoding: 'iso-8859-1', method: "POST", credentials: 'include' })
    .then(resposta => resposta.arrayBuffer())
    .then(buffer => {
      let decoder = new TextDecoder("iso-8859-1");
      let text = decoder.decode(buffer);
      parser = new DOMParser();
      xmlDoc = parser.parseFromString(text, "text/xml");
      preencherSelectMunicipio(xmlDoc);
    });
}

function carregarMaterias() {
  let url = "http://localhost:8080/app/listar/materia";
  fetch(url, { method: "POST",
    credentials: 'include'})
    .then(resposta => resposta.arrayBuffer())
    .then(buffer => {
      let decoder = new TextDecoder("iso-8859-1");
      let text = decoder.decode(buffer);
      parser = new DOMParser();
      xmlDoc = parser.parseFromString(text, "text/xml");
      preencherSelectMateria(xmlDoc);
    });
}

function carregarPreferenciaLocal() {
  let url = "http://localhost:8080/app/listar/preferencialocal";
  fetch(url, { method: "POST",
    credentials: 'include'})
    .then(resposta => resposta.arrayBuffer())
    .then(buffer => {
      let decoder = new TextDecoder("iso-8859-1");
      let text = decoder.decode(buffer);
      parser = new DOMParser();
      xmlDoc = parser.parseFromString(text, "text/xml");
      preencherPreferenciaLocal(xmlDoc);
    });
}
