const nom       = "victor lasheras sanchez";
const nomObject = {};

// .replace(/\s+/g, '') elimina tots els espais en blanc
for (let char of nom.replace(/\s+/g, '')) {
  let vegades;
  if (nomObject[char] == null) {
    vegades = 0;
  } else {
    vegades = nomObject[char];
  }

  nomObject[char] = vegades + 1;
}

console.log(nomObject);
