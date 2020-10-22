const nom    = ['V', 'i', 'c', '4', 't', 'o', 'r'];
const vocals = ['a', 'e' , 'i', 'o', 'u'];

nom.forEach(char => {
    char = char.toLowerCase();
    if (vocals.includes(char)) {
        console.log('VOCAL')
    } else if (isNaN(char)) {
        console.log('CONSONANT');
    }

    if (!isNaN(char)) {
        console.log(`${char}: Els noms de persones no contenen números!`)
    }
});
