/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wca_app.controller;

import java.util.List;
import wca_app.util.CustomException;

/**
 *
 * @author Mata
 */
public interface ControllerInterface<E> {
    public List<E> getEntities();
    public E add(E entity) throws CustomException;
    public E update(E entity) throws CustomException;
}
