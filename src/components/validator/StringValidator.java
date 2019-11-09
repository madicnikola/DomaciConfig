/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components.validator;

/**
 *
 * @author Nikola
 */
public class StringValidator implements Validator{

    @Override
    public void validate(Object value) throws Exception {
        try{
            String s = (String)value;
            if(s.isEmpty()){
                throw new Exception("");
            };
        
        }catch(Exception e){
            
            
        }
    }
    
}
