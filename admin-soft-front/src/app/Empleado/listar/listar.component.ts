import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../../Service/service.service'
import { Empleado } from 'src/app/Modelo/Empleado';

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.css']
})
export class ListarComponent {

  empleado: Empleado[];
  constructor(private service: ServiceService, private router: Router) { }


}
