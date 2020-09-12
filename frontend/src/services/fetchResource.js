import fetch from 'node-fetch'

export async function fetchResource(url,params){
    let usuarios =  await fetch(url,params).then(res => res.json());
    return usuarios;
}