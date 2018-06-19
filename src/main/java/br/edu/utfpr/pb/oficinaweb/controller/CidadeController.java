package br.edu.utfpr.pb.oficinaweb.controller;


import br.edu.utfpr.pb.oficinaweb.model.Cidade;
import br.edu.utfpr.pb.oficinaweb.model.Cliente;
import br.edu.utfpr.pb.oficinaweb.service.CidadeService;
import br.edu.utfpr.pb.oficinaweb.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cidade")
public class CidadeController extends CrudController<Cidade, Long>{
    @Autowired
    private CidadeService cidadeService;

    @Override
    protected CrudService<Cidade, Long> getService()
    {
        return cidadeService;
    }
}
