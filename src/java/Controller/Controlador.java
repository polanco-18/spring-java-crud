package Controller;

import Entidad.Persona;
import config.conexion;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controlador {

    conexion con = new conexion();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(con.Conectar());
    ModelAndView mav = new ModelAndView();
    int id;
    List datos;

    @RequestMapping("index.htm")
    public ModelAndView Listar() {
        String sql = "SELECT `id`, `nombres`, `correo`, `contraseña`, `nacionalidad`, `contraseña` FROM `persona`";
        datos = this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista", datos);
        mav.setViewName("index");
        return mav;
    }

    @RequestMapping(value = "Agregar.htm", method = RequestMethod.GET)
    public ModelAndView Agreagar() {
        mav.addObject(new Persona());
        mav.setViewName("Agregar");
        return mav;
    }

    @RequestMapping(value = "Agregar.htm", method = RequestMethod.POST)
    public ModelAndView Agreagar(Persona p) {
        String sql = "INSERT INTO `persona`(`nombres`, `correo`,`contraseña`, `nacionalidad`) VALUES (?,?,?,?)";
        this.jdbcTemplate.update(sql, p.getNom(), p.getCorreo(),p.getContra(), p.getNaci());
        return new ModelAndView("redirect:/index.htm");
    }

    @RequestMapping(value = "Editar.htm", method = RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request) {
        id = Integer.parseInt(request.getParameter("id"));
        String sql = "select * from persona where id=" + id;
        datos = this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista", datos);
        mav.setViewName("Editar");
        return mav;
    }

    @RequestMapping(value = "Editar.htm", method = RequestMethod.POST)
    public ModelAndView Editar(Persona p) {
        String sql = "UPDATE `persona` SET `nombres`=?,`correo`=?,`contraseña`=?,`nacionalidad`=? WHERE `id`=?";
        this.jdbcTemplate.update(sql, p.getNom(), p.getCorreo(),p.getContra(), p.getNaci(), id);
        return new ModelAndView("redirect:/index.htm");
    }

    @RequestMapping("Delete.htm")
    public ModelAndView Delete(HttpServletRequest request) {
        id = Integer.parseUnsignedInt(request.getParameter("id"));
        String sql = "delete from persona where id=" + id;
        this.jdbcTemplate.update(sql);
        return new ModelAndView("redirect:/index.htm");
    }
}
