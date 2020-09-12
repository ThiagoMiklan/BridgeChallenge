import React,{useState,useEffect} from 'react';
import {Button,Field,Columns,Column,Container,ButtonList,Table} from 'assemble-react-bulma';
import {fetchResource} from '../services/fetchResource';

const URL = process.env.REACT_APP_URL_SERVER;


const FatorialPanel = ()=>{
    const[state,setState] = useState({resultado: 0,historico:[]});
    const[stateInput,setStateInput] = useState({data:0});
    const[stateElement,setStateElement] = useState(<></>);

    function onClickCalc(){
        if(stateInput.data != undefined){
        fetchResource(URL+"/fatorial/"+stateInput.data).then(res => setState({...state,resultado: res}))
        }
    }

    function onClickHist(){
        fetchResource(URL+"/history").then(res=> setState({...state,historico: res}));
    }
    
    function onChangeInput(e){
        setStateInput({data:e.target.value});
    }
  
  return  <Container definition="is-fluid">
            <Columns>
                <Column definition="is-half is-centered">
                    <Field type="number" label="Fatorial" input_definition="is-info" onChange={onChangeInput}></Field>
                    <ButtonList>
                        <Button label="Calcular Fatorial" onClick={onClickCalc} definition="is-info"/>
                        <Button label="Revelar histórico" onClick={onClickHist} definition="is-info"/>
                    </ButtonList>
                    <p className="result">
                        <strong>Resultado Fatorial:&nbsp;{state.resultado}</strong>
                    </p>
                    <br></br>
                    <Table itens_body={state.historico} itens_header={[{value: "Resultados Calculados"}]} definition="is-bordered is-striped is-narrow"/>
                </Column>
            </Columns>
          </Container>
}


export default FatorialPanel