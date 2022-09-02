import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../../Service/service.service'
import { Empleado } from 'src/app/Modelo/Empleado';

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.css']
})
export class ListarComponent implements OnInit {

  empleado: Empleado[];
  constructor(private service: ServiceService, private router: Router) { }

  ngOnInit() {
    this.service.getEmpleado()
      .subscribe(data => {
        this.empleados = data;
      });
  }
  Editar(empleado:Empleado):void{
    localStorage.setItem("id",empleado.id.toString());
    this.router.navigate(["edit"]);
  }

  Delete(empleado:Empleado){
    this.service.deleteEmpleado(empleado)
    .subscribe(data=>{
      this.empleado=this.empleado.filter(p=>p!==empleado);
      alert("Empleado eliminado...");
    })
  }

}
