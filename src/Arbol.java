
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo-PC
 */
public class Arbol extends SearchAlgorithm /*implements SearchProblem*/{
    ArrayList<Action> resultado = new ArrayList<Action>();
    /*
    @Override
    public State initialState() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //State estadoInicial = new State(0,0);
        return problem.initialState();
    }
    @Override
    public State goalState() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return problem.goalState();
        
    }
    @Override
    public State applyAction(State state, Action action) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public ArrayList<Action> getActions(State state) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public double cost(State state, Action action) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public boolean checkPath(ArrayList<Action> solution) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    */
    
    @Override
    public void searchPath() {
        int i = 0;
        //System.out.println("hola");
        
        Node inicio = new Node(problem.initialState());
        Node expandir;
        //State estado = new State(2,4);
        //System.out.println(estado.toString());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 
        //ArrayList<Action> abiertos = new ArrayList<Action>();
        //ArrayList<Node> abiertos = new ArrayList<Node>();
        //abiertos.add(inicio);
        //System.out.println("purazo: " + abiertos.get(0).getState().toString());
        
        //abierto.add();
        /*
        while(!abiertos.isEmpty()){
            
            expandir = abiertos.get(0);
            if(expandir.equals(problem.goalState())) return expandir;
        }
        */
        
        HashSet<State> cerrados = new HashSet<State>();
        Queue<Node> abiertos = new LinkedList<Node>();
        ArrayList<Node> sucesores = new ArrayList<Node>();
        ArrayList<Action> resultado = new ArrayList<Action>();
        int obj=0;
        
        while(obj==0){
        if(!abiertos.peek().getState().equals(problem.goalState())){
            if(cerrados.contains(abiertos.peek().getState())){
                abiertos.remove();
            }
            else{
                sucesores = getSuccessors(abiertos.peek());
                cerrados.add(abiertos.peek().getState());
                abiertos.remove();

                while(!sucesores.isEmpty()){
                    abiertos.add(sucesores.get(i));
                    sucesores.remove(i);
                    i++;
                }

            }
        }
        else{
           obj=1; 
           
           
           resultado.add(abiertos.peek().getAction());
           abiertos.peek().getParent().getAction();
        }
        }
    }
    

    @Override
    public ArrayList<Action> result() {
        
        System.out.println("hola2");
        
        //resultado.add(Action.DOWN);
        
        return resultado;
        //To change body of generated methods, choose Tools | Templates.
        
        
    }

    
    
}