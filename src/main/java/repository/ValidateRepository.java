/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataacess.ValidateDAO;
/**
 *
 * @author Administrator
 */
public class ValidateRepository implements IValidateRepository{

    @Override
    public void Validate() {
        ValidateDAO.Instance().Validate();
    }
    
}
