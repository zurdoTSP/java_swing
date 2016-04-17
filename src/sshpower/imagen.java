/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sshpower;

import javax.swing.ImageIcon;

/**
 *
 * @author zurdotsg
 */
public class imagen {

    public imagen() {
        this.a = new javax.swing.ImageIcon(getClass().getResource("/imagen/Devices-computer-laptop-icon.png"));
        this.b = new javax.swing.ImageIcon(getClass().getResource("/imagen/Icon_pc.png"));
        this.c = new javax.swing.ImageIcon(getClass().getResource("/imagen/220px-Raspberrypi_pcb_overview_v04.svg.png"));
        this.estado=1;
    }

    public int getEstado() {
        return estado;
    }

    public ImageIcon getA() {
        return a;
    }

    public ImageIcon getB() {
        return b;
    }

    public ImageIcon getC() {
        return c;
    }

    public void setA(ImageIcon a) {
        this.a = a;
    }

    public void setB(ImageIcon b) {
        this.b = b;
    }

    public void setC(ImageIcon c) {
        this.c = c;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    public void incremento()
    {
        if(estado<2)
        {
            estado++;
        }
        else
        {
            estado=0;
        }
    }
    public ImageIcon imag()
    {
        if(estado==0)
        {
            return a;
        }
        if(estado==1)
        {
            return b;
        }
        if(estado==2)
        {
            return c;
        }
        return null;
    }

    private ImageIcon a;
    private ImageIcon b;
    private ImageIcon c;
    private int estado;
}
