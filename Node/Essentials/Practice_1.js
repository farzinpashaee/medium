
const path = require("path")

let x = "Some Text"
console.log(x);
console.log(__dirname)
console.log(`File name: ${path.basename(__filename)}`)

for ( let key in global){
    console.log(key);
}