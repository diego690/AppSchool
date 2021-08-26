package com.proyect.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyect.demo.interfaceService.IactividadService;
import com.proyect.demo.interfaceService.IadministradorService;
import com.proyect.demo.interfaceService.IasistenciaService;
import com.proyect.demo.interfaceService.IasistenciaestudianteService;
import com.proyect.demo.interfaceService.IcalificacionService;
import com.proyect.demo.interfaceService.IchatService;
import com.proyect.demo.interfaceService.IchatprofesorService;
import com.proyect.demo.interfaceService.IchatrepresentanteService;
import com.proyect.demo.interfaceService.IcursoService;
import com.proyect.demo.interfaceService.IestudianteService;
import com.proyect.demo.interfaceService.IforoService;
import com.proyect.demo.interfaceService.IforoestudianteService;
import com.proyect.demo.interfaceService.IforoprofesorService;
import com.proyect.demo.interfaceService.IhorasclaseService;
import com.proyect.demo.interfaceService.ImateriaService;
import com.proyect.demo.interfaceService.ImateriacursoService;
import com.proyect.demo.interfaceService.ImatriculaService;
import com.proyect.demo.interfaceService.InivelService;
import com.proyect.demo.interfaceService.IpagoService;
import com.proyect.demo.interfaceService.IparcialService;
import com.proyect.demo.interfaceService.IperiodoService;
import com.proyect.demo.interfaceService.IperiodomatriculacursoService;
import com.proyect.demo.interfaceService.IpersonaService;
import com.proyect.demo.interfaceService.IprofesorService;
import com.proyect.demo.interfaceService.IquimestreService;
import com.proyect.demo.interfaceService.IrecursosService;
import com.proyect.demo.interfaceService.IrepresentanteService;
import com.proyect.demo.interfaceService.ItareasService;
import com.proyect.demo.interfaceService.ItiponotasService;
import com.proyect.demo.interfaceService.ItiporecursoService;
import com.proyect.demo.interfaceService.ItipousuarioService;
import com.proyect.demo.interfaceService.ItitulosService;
import com.proyect.demo.interfaceService.IusuarioService;
import com.proyect.demo.modelo.Actividad;
import com.proyect.demo.modelo.Administrador;
import com.proyect.demo.modelo.Asistencia;
import com.proyect.demo.modelo.Asistenciaestudiante;
import com.proyect.demo.modelo.Calificacion;
import com.proyect.demo.modelo.Chat;
import com.proyect.demo.modelo.Chatprofesor;
import com.proyect.demo.modelo.Chatrepresentante;
import com.proyect.demo.modelo.Curso;
import com.proyect.demo.modelo.Estudiante;
import com.proyect.demo.modelo.Foro;
import com.proyect.demo.modelo.Foroestudiante;
import com.proyect.demo.modelo.Foroprofesor;
import com.proyect.demo.modelo.Horasclase;
import com.proyect.demo.modelo.Materia;
import com.proyect.demo.modelo.Materiacurso;
import com.proyect.demo.modelo.Matricula;
import com.proyect.demo.modelo.Nivel;
import com.proyect.demo.modelo.Pago;
import com.proyect.demo.modelo.Parcial;
import com.proyect.demo.modelo.Periodo;
import com.proyect.demo.modelo.Periodomatriculacurso;
import com.proyect.demo.modelo.Persona;
import com.proyect.demo.modelo.Profesor;
import com.proyect.demo.modelo.Quimestre;
import com.proyect.demo.modelo.Recursos;
import com.proyect.demo.modelo.Representante;
import com.proyect.demo.modelo.Tareas;
import com.proyect.demo.modelo.Tiponota;
import com.proyect.demo.modelo.Tiporecurso;
import com.proyect.demo.modelo.Tipousuario;
import com.proyect.demo.modelo.Titulos;
import com.proyect.demo.modelo.Usuario;

@Controller
@RequestMapping("/Admin")
public class AControlador {

	@Autowired
	private IactividadService actividadservice;

	@GetMapping("/listaractividad")
	public String actividadlistar(Model modelo) {
		List<Actividad> actividades = actividadservice.listar();
		modelo.addAttribute("actividades", actividades);
		return "actividadlistar";
	}

	@GetMapping("/newactividad")
	public String actividadagregar(Model model) {
		model.addAttribute("actividades", new Actividad());
		return "actividaddatos";
	}

	@PostMapping("/saveactividad")
	public String actividadsave(@Valid Actividad a, Model model) {
		int id=actividadservice.save(a);
		if(id==0) {
			return "actividaddatos";
		}
		return "redirect:/listaractividad";
	}

	@GetMapping("/editaractividad/{id}")
	public String actividadeditar(@PathVariable int id, Model model) {
		Optional<Actividad> actividades = actividadservice.listarId(id);
		model.addAttribute("actividades", actividades);
		return "actividaddatos";
	}

	@GetMapping("/eliminaractividad/{id}")
	public String actividaddelete(Model model, @PathVariable int id) {
		actividadservice.delete(id);
		return "redirect:/listaractividad";
	}

	@Autowired
	private IadministradorService administradorservice;

	@GetMapping("/listaradministrador")
	public String administradorlistar(Model modelo) {
		List<Administrador> administrador = administradorservice.listar();
		modelo.addAttribute("administrador", administrador);
		return "administradorlistar";
	}

	@GetMapping("/newadministrador")
	public String administradoragregar(Model model) {
		model.addAttribute("administrador", new Administrador());
		return "administradordatos";
	}

	@PostMapping("/saveadministrador")
	public String administradorsave(@Valid Administrador a, Model model) {
		int id=administradorservice.save(a);
		if(id==0) {
			return "administradordatos";
		}
		return "redirect:/listaradministrador";
	}

	@GetMapping("/editaradministrador/{id}")
	public String administradoreditar(@PathVariable int id, Model model) {
		Optional<Administrador> administrador = administradorservice.listarId(id);
		model.addAttribute("administrador", administrador);
		return "administradordatos";
	}

	@GetMapping("/eliminaradministrador/{id}")
	public String administradordelete(Model model, @PathVariable int id) {
		administradorservice.delete(id);
		return "redirect:/listaradministrador";
	}

	@Autowired
	private IasistenciaService asistenciarservice;

	@GetMapping("/listarasistencia")
	public String asistencialistar(Model modelo) {
		List<Asistencia> asistencia = asistenciarservice.listar();
		modelo.addAttribute("asistencia", asistencia);
		return "asistencialistar";
	}

	@GetMapping("/newasistencia")
	public String asistenciaagregar(Model model) {
		model.addAttribute("asistencia", new Asistencia());
		return "asistenciadatos";
	}

	@PostMapping("/saveasistencia")
	public String asistenciasave(@Valid Asistencia a, Model model) {
		int id=asistenciarservice.save(a);
		if(id==0) {
			return "asistenciadatos";
		}
		return "redirect:/listarasistencia";
	}

	@GetMapping("/editarasistenciar/{id}")
	public String asistenciaeditar(@PathVariable int id, Model model) {
		Optional<Asistencia> asistencia = asistenciarservice.listarId(id);
		model.addAttribute("asistencia", asistencia);
		return "asistenciadatos";
	}

	@GetMapping("/eliminarasistencia/{id}")
	public String asistenciadelete(Model model, @PathVariable int id) {
		asistenciarservice.delete(id);
		return "redirect:/listarasistencia";
	}

	@Autowired
	private IasistenciaestudianteService asistenciaestudianterservice;

	@GetMapping("/listarasistenciaestudiante")
	public String asistenciaestudiantelistar(Model modelo) {
		List<Asistenciaestudiante> asistenciaestudiante = asistenciaestudianterservice.listar();
		modelo.addAttribute("asistenciaestudiante", asistenciaestudiante);
		return "asistenciaestudiantelistar";
	}

	@GetMapping("/newasistenciaestudiante")
	public String asistenciaestudianteagregar(Model model) {
		model.addAttribute("asistenciaestudiante", new Asistenciaestudiante());
		return "asistenciaestudiantedatos";
	}

	@PostMapping("/saveasistenciaestudiante")
	public String asistenciaestudiantesave(@Valid Asistenciaestudiante a, Model model) {
		int id=asistenciaestudianterservice.save(a);
		if(id==0) {
			return "asistenciaestudiantedatos";
		}
		return "redirect:/listarasistenciaestudiante";
	}

	@GetMapping("/editarasistenciaestudiante/{id}")
	public String asistenciaestudianteeditar(@PathVariable int id, Model model) {
		Optional<Asistenciaestudiante> asistenciaestudiante = asistenciaestudianterservice.listarId(id);
		model.addAttribute("asistenciaestudiante", asistenciaestudiante);
		return "asistenciaestudiantedatos";
	}

	@GetMapping("/eliminarasistenciaestudiante/{id}")
	public String asistenciaestudiantedelete(Model model, @PathVariable int id) {
		asistenciaestudianterservice.delete(id);
		return "redirect:/listarasistenciaestudiante";
	}

	@Autowired
	private IcalificacionService calificacionservice;

	@GetMapping("/listarcalificacion")
	public String calificacionlistar(Model modelo) {
		List<Calificacion> calificacion = calificacionservice.listar();
		modelo.addAttribute("calificacion", calificacion);
		return "calificacionlistar";
	}

	@GetMapping("/newacalificacion")
	public String calificacionagregar(Model model) {
		model.addAttribute("calificacion", new Calificacion());
		return "calificaciondatos";
	}

	@PostMapping("/savecalificacion")
	public String calificacionsave(@Valid Calificacion a, Model model) {
		int id=calificacionservice.save(a);
		if(id==0) {
			return "calificaciondatos";
		}
		return "redirect:/listarcalificacion";
	}

	@GetMapping("/editarcalificacion/{id}")
	public String calificacioneditar(@PathVariable int id, Model model) {
		Optional<Calificacion> calificacion = calificacionservice.listarId(id);
		model.addAttribute("calificacion", calificacion);
		return "calificaciondatos";
	}

	@GetMapping("/eliminarcalificacion/{id}")
	public String calificaciondelete(Model model, @PathVariable int id) {
		calificacionservice.delete(id);
		return "redirect:/listarcalificacion";
	}

	@Autowired
	private IchatService chatservice;

	@GetMapping("/listarchat")
	public String chatlistar(Model modelo) {
		List<Chat> chat = chatservice.listar();
		modelo.addAttribute("chat", chat);
		return "chatlistar";
	}

	@GetMapping("/newchat")
	public String chatagregar(Model model) {
		model.addAttribute("chat", new Calificacion());
		return "chatdatos";
	}

	@PostMapping("/savechat")
	public String chatsave(@Valid Chat a, Model model) {
		int id=chatservice.save(a);
		if(id==0) {
			return "chatdatos";
		}
		return "redirect:/listarchat";
	}

	@GetMapping("/editarchat/{id}")
	public String chateditar(@PathVariable int id, Model model) {
		Optional<Chat> chat = chatservice.listarId(id);
		model.addAttribute("chat", chat);
		return "chatdatos";
	}

	@GetMapping("/eliminarchat/{id}")
	public String chatdelete(Model model, @PathVariable int id) {
		chatservice.delete(id);
		return "redirect:/listarchat";
	}

	@Autowired
	private IchatprofesorService chatprofesorservice;

	@GetMapping("/listarchatprofesor")
	public String chatprofesorlistar(Model modelo) {
		List<Chatprofesor> chatprofesor = chatprofesorservice.listar();
		modelo.addAttribute("chatprofesor", chatprofesor);
		return "chatprofesorlistar";
	}

	@GetMapping("/newchatprofesor")
	public String chatprofesoragregar(Model model) {
		model.addAttribute("chatprofesor", new Calificacion());
		return "chatprofesordatos";
	}

	@PostMapping("/savechatprofesor")
	public String chatprofesorsave(@Valid Chatprofesor a, Model model) {
		int id=chatprofesorservice.save(a);
		if(id==0) {
			return "chatprofesordatos";
		}
		return "redirect:/listarchatprofesor";
	}

	@GetMapping("/editarchatprofesor/{id}")
	public String chatprofesoreditar(@PathVariable int id, Model model) {
		Optional<Chatprofesor> chatprofesor = chatprofesorservice.listarId(id);
		model.addAttribute("chatprofesor", chatprofesor);
		return "chatprofesordatos";
	}

	@GetMapping("/eliminarchatprofesor/{id}")
	public String chatprofesordelete(Model model, @PathVariable int id) {
		chatprofesorservice.delete(id);
		return "redirect:/listarchatprofesor";
	}

	@Autowired
	private IchatrepresentanteService chatrepresentanteservice;

	@GetMapping("/listarchatrepresentante")
	public String chatrepresentantelistar(Model modelo) {
		List<Chatrepresentante> chatrepresentante = chatrepresentanteservice.listar();
		modelo.addAttribute("chatrepresentante", chatrepresentante);
		return "chatrepresentantelistar";
	}

	@GetMapping("/newchatrepresentante")
	public String chatrepresentanteagregar(Model model) {
		model.addAttribute("chat", new Chatrepresentante());
		return "chatrepresentantedatos";
	}

	@PostMapping("/savechatrepresentante")
	public String chatrepresentantesave(@Valid Chatrepresentante a, Model model) {
		int id=chatrepresentanteservice.save(a);
		if(id==0) {
			return "chatrepresentantedatos";
		}
		return "redirect:/listarchatrepresentante";
	}

	@GetMapping("/editarchatrepresentante/{id}")
	public String chatrepresentanteeditar(@PathVariable int id, Model model) {
		Optional<Chatrepresentante> chatrepresentante = chatrepresentanteservice.listarId(id);
		model.addAttribute("chatrepresentante", chatrepresentante);
		return "chatrepresentantedatos";
	}

	@GetMapping("/eliminarchatrepresentante/{id}")
	public String chatrepresentantedelete(Model model, @PathVariable int id) {
		chatrepresentanteservice.delete(id);
		return "redirect:/listarchatrepresentante";
	}

	@Autowired
	private IcursoService cursoservice;

	@GetMapping("/listarcurso")
	public String cursolistar(Model modelo) {
		List<Curso> curso = cursoservice.listar();
		modelo.addAttribute("curso", curso);
		return "cursolistar";
	}

	@GetMapping("/newcurso")
	public String cursoagregar(Model model) {
		model.addAttribute("curso", new Curso());
		return "cursodatos";
	}

	@PostMapping("/savecurso")
	public String cursosave(@Valid Curso a, Model model) {
		int id=cursoservice.save(a);
		if(id==0) {
			return "cursodatos";
		}
		return "redirect:/listarcurso";
	}

	@GetMapping("/editarcurso/{id}")
	public String cursoeditar(@PathVariable int id, Model model) {
		Optional<Curso> curso = cursoservice.listarId(id);
		model.addAttribute("curso", curso);
		return "chatrepresentantedatos";
	}

	@GetMapping("/eliminarcurso/{id}")
	public String cursodelete(Model model, @PathVariable int id) {
		cursoservice.delete(id);
		return "redirect:/listarcurso";
	}

	@Autowired
	private IestudianteService estudianteservice;

	@GetMapping("/listarestudiante")
	public String estudiantelistar(Model modelo) {
		List<Estudiante> estudiante = estudianteservice.listar();
		modelo.addAttribute("estudiante", estudiante);
		return "estudiantelistar";
	}

	@GetMapping("/newestudiante")
	public String estudianteagregar(Model model) {
		model.addAttribute("estudiante", new Estudiante());
		return "estudiantedatos";
	}

	@PostMapping("/saveestudiante")
	public String estudiantesave(@Valid Estudiante a, Model model) {
		int id=estudianteservice.save(a);
		if(id==0) {
			return "estudiantedatos";
		}
		return "redirect:/listarestudiante";
	}

	@GetMapping("/editarestudiante/{id}")
	public String estudianteeditar(@PathVariable int id, Model model) {
		Optional<Estudiante> estudiante = estudianteservice.listarId(id);
		model.addAttribute("estudiante", estudiante);
		return "estudiantedatos";
	}

	@GetMapping("/eliminarestudiante/{id}")
	public String estudiantedelete(Model model, @PathVariable int id) {
		estudianteservice.delete(id);
		return "redirect:/listarestudiante";
	}

	@Autowired
	private IforoService foroservice;

	@GetMapping("/listarforo")
	public String forolistar(Model modelo) {
		List<Foro> foro = foroservice.listar();
		modelo.addAttribute("foro", foro);
		return "forolistar";
	}

	@GetMapping("/newforo")
	public String foroagregar(Model model) {
		model.addAttribute("foro", new Foro());
		return "forodatos";
	}

	@PostMapping("/saveforo")
	public String forosave(@Valid Foro a, Model model) {
		int id=foroservice.save(a);
		if(id==0) {
			return "forodatos";
		}
		return "redirect:/listarforo";
	}

	@GetMapping("/editarforo/{id}")
	public String foroeditar(@PathVariable int id, Model model) {
		Optional<Foro> foro = foroservice.listarId(id);
		model.addAttribute("foro", foro);
		return "forodatos";
	}

	@GetMapping("/eliminarforo/{id}")
	public String forodelete(Model model, @PathVariable int id) {
		foroservice.delete(id);
		return "redirect:/listarforo";
	}

	@Autowired
	private IforoestudianteService foroestudianteservice;

	@GetMapping("/listarforoestudiante")
	public String foroestudiantelistar(Model modelo) {
		List<Foroestudiante> foroestudiante = foroestudianteservice.listar();
		modelo.addAttribute("foroestudiante", foroestudiante);
		return "foroestudiantelistar";
	}

	@GetMapping("/newforoestudiante")
	public String foroestudianteagregar(Model model) {
		model.addAttribute("foroestudiante", new Foroestudiante());
		return "foroestudiantedatos";
	}

	@PostMapping("/saveforoestudiante")
	public String foroestudiantesave(@Valid Foroestudiante a, Model model) {
		int id=foroestudianteservice.save(a);
		if(id==0) {
			return "foroestudiantedatos";
		}
		return "redirect:/listarforoestudiante";
	}

	@GetMapping("/editarforoestudiante/{id}")
	public String foroestudianteeditar(@PathVariable int id, Model model) {
		Optional<Foroestudiante> foroestudiante = foroestudianteservice.listarId(id);
		model.addAttribute("foroestudiante", foroestudiante);
		return "foroestudiantedatos";
	}

	@GetMapping("/eliminarforoestudiante/{id}")
	public String foroestudiantedelete(Model model, @PathVariable int id) {
		foroestudianteservice.delete(id);
		return "redirect:/listarforoestudiante";
	}

	@Autowired
	private IforoprofesorService foroprofesorservice;

	@GetMapping("/listarforoprofesor")
	public String foroprofesorlistar(Model modelo) {
		List<Foroprofesor> foroprofesor = foroprofesorservice.listar();
		modelo.addAttribute("foro", foroprofesor);
		return "foroprofesorlistar";
	}

	@GetMapping("/newforoprofesor")
	public String foroprofesoragregar(Model model) {
		model.addAttribute("foroprofesor", new Foroprofesor());
		return "foroprofesordatos";
	}

	@PostMapping("/saveforoprofesor")
	public String foroprofesorsave(@Valid Foroprofesor a, Model model) {
		int id=foroprofesorservice.save(a);
		if(id==0) {
			return "foroprofesordatos";
		}
		return "redirect:/listarforoprofesor";
	}

	@GetMapping("/editarforoprofesor/{id}")
	public String foroprofesoreditar(@PathVariable int id, Model model) {
		Optional<Foroprofesor> foroprofesor = foroprofesorservice.listarId(id);
		model.addAttribute("foroprofesor", foroprofesor);
		return "foroprofesordatos";
	}

	@GetMapping("/eliminarforoprofesor/{id}")
	public String foroprofesordelete(Model model, @PathVariable int id) {
		foroprofesorservice.delete(id);
		return "redirect:/listarforoprofesor";
	}

	@Autowired
	private IhorasclaseService horaclaseservice;

	@GetMapping("/listarhoraclase")
	public String horaclaselistar(Model modelo) {
		List<Horasclase> horaclase = horaclaseservice.listar();
		modelo.addAttribute("horaclase", horaclase);
		return "horaclaselistar";
	}

	@GetMapping("/newhoraclase")
	public String horaclasegregar(Model model) {
		model.addAttribute("horaclase", new Horasclase());
		return "horaclasedatos";
	}

	@PostMapping("/savehoraclase")
	public String horaclasesave(@Valid Horasclase a, Model model) {
		int id=horaclaseservice.save(a);
		if(id==0) {
			return "horaclasedatos";
		}
		return "redirect:/listarhoraclaser";
	}

	@GetMapping("/editarhoraclase/{id}")
	public String horaclaseeditar(@PathVariable int id, Model model) {
		Optional<Horasclase> horaclase = horaclaseservice.listarId(id);
		model.addAttribute("horaclase", horaclase);
		return "horaclasedatos";
	}

	@GetMapping("/eliminarhoraclase/{id}")
	public String horaclasedelete(Model model, @PathVariable int id) {
		horaclaseservice.delete(id);
		return "redirect:/listarhoraclase";
	}

	@Autowired
	private ImateriaService materiaservice;

	@GetMapping("/listarmateria")
	public String materialistar(Model modelo) {
		List<Materia> materia = materiaservice.listar();
		modelo.addAttribute("materia", materia);
		return "materialistar";
	}

	@GetMapping("/newmateria")
	public String materiagregar(Model model) {
		model.addAttribute("materia", new Materia());
		return "materiadatos";
	}

	@PostMapping("/savemateria")
	public String materiasave(@Valid Materia a, Model model) {
		int id=materiaservice.save(a);
		if(id==0) {
			return "materiadatos";
		}
		return "redirect:/listarmateriar";
	}

	@GetMapping("/editarmateria/{id}")
	public String materiaeditar(@PathVariable int id, Model model) {
		Optional<Materia> materia = materiaservice.listarId(id);
		model.addAttribute("materia", materia);
		return "materiadatos";
	}

	@GetMapping("/eliminarmateria/{id}")
	public String materiadelete(Model model, @PathVariable int id) {
		materiaservice.delete(id);
		return "redirect:/listarmateria";
	}

	@Autowired
	private ImateriacursoService materiacursoservice;

	@GetMapping("/listarmateriacurso")
	public String materiacursolistar(Model modelo) {
		List<Materiacurso> materiacurso = materiacursoservice.listar();
		modelo.addAttribute("materiacurso", materiacurso);
		return "materialistar";
	}

	@GetMapping("/newmateriacurso")
	public String materiacursoagregar(Model model) {
		model.addAttribute("materiacurso", new Materiacurso());
		return "materiacursodatos";
	}

	@PostMapping("/savemateriacurso")
	public String materiacursosave(@Valid Materiacurso a, Model model) {
		int id=materiacursoservice.save(a);
		if(id==0) {
			return "materiacursodatos";
		}
		return "redirect:/listarmateriacurso";
	}

	@GetMapping("/editarmateriacurso/{id}")
	public String materiacursoeditar(@PathVariable int id, Model model) {
		Optional<Materiacurso> materiacurso = materiacursoservice.listarId(id);
		model.addAttribute("materiacurso", materiacurso);
		return "materiacursodatos";
	}

	@GetMapping("/eliminarmateriacurso/{id}")
	public String materiacursodelete(Model model, @PathVariable int id) {
		materiacursoservice.delete(id);
		return "redirect:/listarmateriacurso";
	}

	@Autowired
	private ImatriculaService matriculaservice;

	@GetMapping("/listarmatricula")
	public String matriculalistar(Model modelo) {
		List<Matricula> matricula = matriculaservice.listar();
		modelo.addAttribute("matricula", matricula);
		return "matriculalistar";
	}

	@GetMapping("/newmatricula")
	public String matriculaagregar(Model model) {
		model.addAttribute("matricula", new Matricula());
		return "matriculadatos";
	}

	@PostMapping("/savematricula")
	public String matriculasave(@Valid Matricula a, Model model) {
		int id=matriculaservice.save(a);
		if(id==0) {
			return "matriculadatos";
		}
		return "redirect:/listarmatricula";
	}

	@GetMapping("/editarmatricula/{id}")
	public String matriculaeditar(@PathVariable int id, Model model) {
		Optional<Matricula> matricula = matriculaservice.listarId(id);
		model.addAttribute("matricula", matricula);
		return "matriculadatos";
	}

	@GetMapping("/eliminarmatricula/{id}")
	public String matriculadelete(Model model, @PathVariable int id) {
		matriculaservice.delete(id);
		return "redirect:/listarmatricula";
	}

	@Autowired
	private InivelService nivelservice;

	@GetMapping("/listarnivel")
	public String nivellistar(Model modelo) {
		List<Nivel> nivel = nivelservice.listar();
		modelo.addAttribute("nivel", nivel);
		return "nivellistar";
	}

	@GetMapping("/newnivel")
	public String nivelagregar(Model model) {
		model.addAttribute("nivel", new Nivel());
		return "niveldatos";
	}

	@PostMapping("/savenivel")
	public String nivelsave(@Valid Nivel a, Model model) {
		int id=nivelservice.save(a);
		if(id==0) {
			return "niveldatos";
		}
		return "redirect:/listarnivel";
	}

	@GetMapping("/editarnivel/{id}")
	public String niveleditar(@PathVariable int id, Model model) {
		model.addAttribute("nivel", nivelservice.listarId(id));
		return "niveldatos";
	}

	@GetMapping("/eliminarnivel/{id}")
	public String niveldelete(Model model, @PathVariable int id) {
		nivelservice.delete(id);
		return "redirect:/listarnivel";
	}

	@Autowired
	private IpagoService pagoservice;

	@GetMapping("/listarpago")
	public String pagolistar(Model modelo) {
		List<Pago> pago = pagoservice.listar();
		modelo.addAttribute("pago", pago);
		return "pagolistar";
	}

	@GetMapping("/newpago")
	public String pagoagregar(Model model) {
		model.addAttribute("pago", new Pago());
		return "pagodatos";
	}

	@PostMapping("/savepago")
	public String pagosave(@Valid Pago a, Model model) {
		int id=pagoservice.save(a);
		if(id==0) {
			return "pagodatos";
		}
		return "redirect:/listarpago";
	}

	@GetMapping("/editarpago/{id}")
	public String pagoeditar(@PathVariable int id, Model model) {
		Optional<Pago> pago = pagoservice.listarId(id);
		model.addAttribute("pago", pago);
		return "pagodatos";
	}

	@GetMapping("/eliminarpago/{id}")
	public String pagodelete(Model model, @PathVariable int id) {
		pagoservice.delete(id);
		return "redirect:/listarpago";
	}

	@Autowired
	private IparcialService parcialservice;

	@GetMapping("/listarparcial")
	public String parciallistar(Model modelo) {
		List<Parcial> parcial = parcialservice.listar();
		modelo.addAttribute("parcial", parcial);
		return "parciallistar";
	}

	@GetMapping("/newparcial")
	public String parcialagregar(Model model) {
		model.addAttribute("parcial", new Parcial());
		return "parcialdatos";
	}

	@PostMapping("/saveparcial")
	public String parcialsave(@Valid Parcial a, Model model) {
		int id=parcialservice.save(a);
		if(id==0) {
			return "parcialdatos";
		}
		return "redirect:/listarparcial";
	}

	@GetMapping("/editarparcial/{id}")
	public String parcialeditar(@PathVariable int id, Model model) {
		Optional<Parcial> parcial = parcialservice.listarId(id);
		model.addAttribute("parcial", parcial);
		return "parcialdatos";
	}

	@GetMapping("/eliminarparcial/{id}")
	public String parcialdelete(Model model, @PathVariable int id) {
		parcialservice.delete(id);
		return "redirect:/listarparcial";
	}

	@Autowired
	private IperiodoService periodoservice;

	@GetMapping("/listarperiodo")
	public String periodolistar(Model modelo) {
		List<Periodo> periodo = periodoservice.listar();
		modelo.addAttribute("periodo", periodo);
		return "periodolistar";
	}

	@GetMapping("/newperiodo")
	public String periodoagregar(Model model) {
		model.addAttribute("periodo", new Periodo());
		return "periododatos";
	}

	@PostMapping("/saveperiodo")
	public String periodosave(@Valid Periodo a, Model model) {
		int id=periodoservice.save(a);
		if(id==0) {
			return "periododatos";
		}
		return "redirect:/listarperiodo";
	}

	@GetMapping("/editarperiodo/{id}")
	public String periodoeditar(@PathVariable int id, Model model) {
		Optional<Periodo> periodo = periodoservice.listarId(id);
		model.addAttribute("periodo", periodo);
		return "periododatos";
	}

	@GetMapping("/eliminarperiodo/{id}")
	public String periododelete(Model model, @PathVariable int id) {
		periodoservice.delete(id);
		return "redirect:/listarperiodo";
	}

	@Autowired
	private IperiodomatriculacursoService periodomatriculacursoservice;

	@GetMapping("/listarperiodomatriculacurso")
	public String periodomatriculacursolistar(Model modelo) {
		List<Periodomatriculacurso> periodomatriculacurso = periodomatriculacursoservice.listar();
		modelo.addAttribute("periodomatriculacurso", periodomatriculacurso);
		return "periodomatriculacursolistar";
	}

	@GetMapping("/newperiodomatriculacurso")
	public String periodomatriculacursoagregar(Model model) {
		model.addAttribute("periodomatriculacurso", new Periodomatriculacurso());
		return "periodomatriculacursodatos";
	}

	@PostMapping("/saveperiodomatriculacurso")
	public String periodomatriculacursosave(@Valid Periodomatriculacurso a, Model model) {
		int id=periodomatriculacursoservice.save(a);
		if(id==0) {
			return "periodomatriculacursodatos";
		}
		return "redirect:/listarperiodomatriculacurso";
	}

	@GetMapping("/editarperiodomatriculacurso/{id}")
	public String periodomatriculacursoeditar(@PathVariable int id, Model model) {
		Optional<Periodomatriculacurso> periodomatriculacurso = periodomatriculacursoservice.listarId(id);
		model.addAttribute("periodomatriculacurso", periodomatriculacurso);
		return "periodomatriculacursodatos";
	}

	@GetMapping("/eliminarperiodomatriculacurso/{id}")
	public String periodomatriculacursodelete(Model model, @PathVariable int id) {
		periodomatriculacursoservice.delete(id);
		return "redirect:/listarperiodomatriculacurso";
	}

	@Autowired
	private IpersonaService personaservice;

	@GetMapping("/listarpersona")
	public String personalistar(Model modelo) {
		List<Persona> persona = personaservice.listar();
		modelo.addAttribute("persona", persona);
		return "personalistar";
	}

	@GetMapping("/newpersona")
	public String personaagregar(Model model) {
		model.addAttribute("persona", new Persona());
		return "personadatos";
	}

	@PostMapping("/savepersona")
	public String personasave(@Valid Persona a, Model model) {
		int id=personaservice.save(a);
		if(id==0) {
			return "personadatos";
		}
		return "redirect:/listarpersona";
	}

	@GetMapping("/editarpersona/{id}")
	public String personaeditar(@PathVariable int id, Model model) {
		Optional<Persona> persona = personaservice.listarId(id);
		model.addAttribute("persona", persona);
		return "personadatos";
	}

	@GetMapping("/eliminarpersona/{id}")
	public String personadelete(Model model, @PathVariable int id) {
		personaservice.delete(id);
		return "redirect:/listarpersona";
	}

	@Autowired
	private IprofesorService profesorservice;

	@GetMapping("/listarprofesor")
	public String profesorlistar(Model modelo) {
		List<Profesor> profesor = profesorservice.listar();
		modelo.addAttribute("profesor", profesor);
		return "profesorlistar";
	}

	@GetMapping("/newprofesor")
	public String profesoragregar(Model model) {
		model.addAttribute("profesor", new Profesor());
		return "profesordatos";
	}

	@PostMapping("/saveprofesor")
	public String profesorsave(@Valid Profesor a, Model model) {
		int id=profesorservice.save(a);
		if(id==0) {
			return "profesordatos";
		}
		return "redirect:/listarprofesor";
	}

	@GetMapping("/editarprofesor/{id}")
	public String profesoreditar(@PathVariable int id, Model model) {
		Optional<Profesor> profesor = profesorservice.listarId(id);
		model.addAttribute("profesor", profesor);
		return "profesordatos";
	}

	@GetMapping("/eliminarprofesor/{id}")
	public String profesordelete(Model model, @PathVariable int id) {
		profesorservice.delete(id);
		return "redirect:/listarprofesor";
	}

	@Autowired
	private IquimestreService quimestreservice;

	@GetMapping("/listarquimestre")
	public String quimestrelistar(Model modelo) {
		List<Quimestre> quimestre = quimestreservice.listar();
		modelo.addAttribute("quimestre", quimestre);
		return "quimestrelistar";
	}

	@GetMapping("/newquimestre")
	public String quimestreagregar(Model model) {
		model.addAttribute("quimestre", new Quimestre());
		return "quimestredatos";
	}

	@PostMapping("/savequimestre")
	public String quimestresave(@Valid Quimestre a, Model model) {
		int id=quimestreservice.save(a);
		if(id==0) {
			return "quimestredatos";
		}
		return "redirect:/listarquimestre";
	}

	@GetMapping("/editarquimestre/{id}")
	public String quimestreeditar(@PathVariable int id, Model model) {
		Optional<Quimestre> quimestre = quimestreservice.listarId(id);
		model.addAttribute("quimestre", quimestre);
		return "quimestredatos";
	}

	@GetMapping("/eliminarquimestre/{id}")
	public String quimestredelete(Model model, @PathVariable int id) {
		quimestreservice.delete(id);
		return "redirect:/listarquimestre";
	}

	@Autowired
	private IrecursosService recursosservice;

	@GetMapping("/listarrecursos")
	public String recursoslistar(Model modelo) {
		List<Recursos> recursos = recursosservice.listar();
		modelo.addAttribute("recursos", recursos);
		return "recursoslistar";
	}

	@GetMapping("/newrecursos")
	public String recursosagregar(Model model) {
		model.addAttribute("recursos", new Recursos());
		return "recursosdatos";
	}

	@PostMapping("/saverecursos")
	public String recursossave(@Valid Recursos a, Model model) {
		int id=recursosservice.save(a);
		if(id==0) {
			return "recursosdatos";
		}
		return "redirect:/listarrecursos";
	}

	@GetMapping("/editarrecursos/{id}")
	public String recursoseditar(@PathVariable int id, Model model) {
		Optional<Recursos> recursos = recursosservice.listarId(id);
		model.addAttribute("recursos", recursos);
		return "recursosdatos";
	}

	@GetMapping("/eliminarrecursos/{id}")
	public String recursosdelete(Model model, @PathVariable int id) {
		recursosservice.delete(id);
		return "redirect:/listarrecursos";
	}

	@Autowired
	private IrepresentanteService representanteservice;

	@GetMapping("/listarrepresentante")
	public String representantelistar(Model modelo) {
		List<Representante> representante = representanteservice.listar();
		modelo.addAttribute("representante", representante);
		return "representantelistar";
	}

	@GetMapping("/newrepresentante")
	public String representanteagregar(Model model) {
		model.addAttribute("representante", new Representante());
		return "representantedatos";
	}

	@PostMapping("/saverepresentante")
	public String representantesave(@Valid Representante a, Model model) {
		int id=representanteservice.save(a);
		if(id==0) {
			return "representantedatos";
		}
		return "redirect:/listarrepresentante";
	}

	@GetMapping("/editarepresentante/{id}")
	public String representanteeditar(@PathVariable int id, Model model) {
		Optional<Representante> representante = representanteservice.listarId(id);
		model.addAttribute("representante", representante);
		return "representantedatos";
	}

	@GetMapping("/eliminarrepresentante/{id}")
	public String representantedelete(Model model, @PathVariable int id) {
		representanteservice.delete(id);
		return "redirect:/listarrepresentante";
	}

	@Autowired
	private ItareasService tareasservice;

	@GetMapping("/listartareas")
	public String tareaslistar(Model modelo) {
		List<Tareas> tareas = tareasservice.listar();
		modelo.addAttribute("tareas", tareas);
		return "tareaslistar";
	}

	@GetMapping("/newtareas")
	public String tareasagregar(Model model) {
		model.addAttribute("tareas", new Tareas());
		return "tareasdatos";
	}

	@PostMapping("/savetareas")
	public String tareassave(@Valid Tareas a, Model model) {
		int id=tareasservice.save(a);
		if(id==0) {
			return "tareasdatos";
		}
		return "redirect:/listartareas";
	}

	@GetMapping("/editartareas/{id}")
	public String tareaseditar(@PathVariable int id, Model model) {
		Optional<Tareas> tareas = tareasservice.listarId(id);
		model.addAttribute("tareas", tareas);
		return "tareasdatos";
	}

	@GetMapping("/eliminartareas/{id}")
	public String tareasdelete(Model model, @PathVariable int id) {
		tareasservice.delete(id);
		return "redirect:/listartareas";
	}

	@Autowired
	private ItiponotasService tiponotaservice;

	@GetMapping("/listartiponota")
	public String tiponotalistar(Model modelo) {
		List<Tiponota> tiponota = tiponotaservice.listar();
		modelo.addAttribute("tiponota", tiponota);
		return "tiponotalistar";
	}

	@GetMapping("/newtiponota")
	public String tiponotaagregar(Model model) {
		model.addAttribute("tareas", new Tiponota());
		return "tiponotadatos";
	}

	@PostMapping("/savetiponota")
	public String tiponotasave(@Valid Tiponota a, Model model) {
		int id=tiponotaservice.save(a);
		if(id==0) {
			return "tiponotadatos";
		}
		return "redirect:/listartiponota";
	}

	@GetMapping("/editartiponota/{id}")
	public String tiponotaeditar(@PathVariable int id, Model model) {
		Optional<Tiponota> tiponota = tiponotaservice.listarId(id);
		model.addAttribute("tiponota", tiponota);
		return "tiponotadatos";
	}

	@GetMapping("/eliminartiponota/{id}")
	public String tiponotadelete(Model model, @PathVariable int id) {
		tiponotaservice.delete(id);
		return "redirect:/listartiponota";
	}

	@Autowired
	private ItiporecursoService tiporecursoservice;

	@GetMapping("/listartiporecurso")
	public String tiporecursolistar(Model modelo) {
		List<Tiporecurso> tiporecurso = tiporecursoservice.listar();
		modelo.addAttribute("tiporecurso", tiporecurso);
		return "tiporecursolistar";
	}

	@GetMapping("/newtiporecurso")
	public String tiporecursoagregar(Model model) {
		model.addAttribute("tiporecurso", new Tiporecurso());
		return "tiporecursodatos";
	}

	@PostMapping("/savetiporecurso")
	public String tiporecursosave(@Valid Tiporecurso a, Model model) {
		int id=tiporecursoservice.save(a);
		if(id==0) {
			return "tiporecursodatos";
		}
		return "redirect:/listartiporecurso";
	}

	@GetMapping("/editartiporecurso/{id}")
	public String tiporecursoeditar(@PathVariable int id, Model model) {
		Optional<Tiporecurso> tiporecurso = tiporecursoservice.listarId(id);
		model.addAttribute("tiporecurso", tiporecurso);
		return "tiporecursodatos";
	}

	@GetMapping("/eliminartiporecurso/{id}")
	public String tiporecursodelete(Model model, @PathVariable int id) {
		tiporecursoservice.delete(id);
		return "redirect:/listartiporecurso";
	}

	@Autowired
	private ItipousuarioService tipousuarioservice;

	@GetMapping("/listartiporeusuario")
	public String tipousuariolistar(Model modelo) {
		List<Tipousuario> tiporeusuario = tipousuarioservice.listar();
		modelo.addAttribute("tiporeusuario", tiporeusuario);
		return "tipousuariolistar";
	}

	@GetMapping("/newtiporeusuario")
	public String tiporeusuarioagregar(Model model) {
		model.addAttribute("tiporeusuario", new Tipousuario());
		return "tipousuariodatos";
	}

	@PostMapping("/savetiporeusuario")
	public String tiporeusuariosave(@Valid Tipousuario a, Model model) {
		int id=tipousuarioservice.save(a);
		if(id==0) {
			return "tipousuariodatos";
		}
		return "redirect:/listartipousuario";
	}

	@GetMapping("/editartipousuario/{id}")
	public String tipousuarioeditar(@PathVariable int id, Model model) {
		Optional<Tipousuario> tipousuario = tipousuarioservice.listarId(id);
		model.addAttribute("tipousuario", tipousuario);
		return "tipousuariodatos";
	}

	@GetMapping("/eliminartipousuario/{id}")
	public String tipousuariodelete(Model model, @PathVariable int id) {
		tipousuarioservice.delete(id);
		return "redirect:/listartipousuario";
	}

	@Autowired
	private ItitulosService titulosservice;

	@GetMapping("/listartitulos")
	public String tituloslistar(Model modelo) {
		List<Titulos> titulos = titulosservice.listar();
		modelo.addAttribute("titulos", titulos);
		return "tituloslistar";
	}

	@GetMapping("/newtitulos")
	public String titulosagregar(Model model) {
		model.addAttribute("titulos", new Titulos());
		return "titulosdatos";
	}

	@PostMapping("/savetitulos")
	public String titulossave(@Valid Titulos a, Model model) {
		int id=titulosservice.save(a);
		if(id==0) {
			return "titulosdatos";
		}
		return "redirect:/listartitulos";
	}

	@GetMapping("/editartitulos/{id}")
	public String tituloseditar(@PathVariable int id, Model model) {
		Optional<Titulos> titulos = titulosservice.listarId(id);
		model.addAttribute("titulos", titulos);
		return "titulosdatos";
	}

	@GetMapping("/eliminartituloso/{id}")
	public String titulosdelete(Model model, @PathVariable int id) {
		titulosservice.delete(id);
		return "redirect:/listartituloso";
	}

	@Autowired
	private IusuarioService usuarioservice;

	@GetMapping("/listarusuario")
	public String usuariolistar(Model modelo) {
		List<Usuario> usuario = usuarioservice.listar();
		modelo.addAttribute("usuario", usuario);
		return "usuariolistar";
	}

	@GetMapping("/newusuario")
	public String usuarioagregar(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "usuariodatos";
	}

	@PostMapping("/saveusuario")
	public String usuariosave(@Valid Usuario a, Model model) {
		int id=usuarioservice.save(a);
		if(id==0) {
			return "usuariodatos";
		}
		return "redirect:/listarusuario";
	}

	@GetMapping("/editarusuario/{id}")
	public String usuarioeditar(@PathVariable int id, Model model) {
		Optional<Usuario> usuario = usuarioservice.listarId(id);
		model.addAttribute("usuario", usuario);
		return "usuariodatos";
	}

	@GetMapping("/eliminarusuario/{id}")
	public String usuariodelete(Model model, @PathVariable int id) {
		usuarioservice.delete(id);
		return "redirect:/listarusuario";
	}
}
