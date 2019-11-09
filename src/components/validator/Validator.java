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
public interface Validator {
    void validate(Object value) throws Exception;
}
