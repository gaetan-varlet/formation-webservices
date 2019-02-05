package fr.insee.formationapirest.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.querydsl.core.types.Predicate;

import fr.insee.formationapirest.model.Vin;
import fr.insee.formationapirest.repository.VinRepository;
import fr.insee.formationapirest.service.VinService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/vin")
@Api(tags =  {"vin"} )
public class VinController {

	@Autowired
	VinService vinService;

	@GetMapping
	public Iterable<Vin> get(@QuerydslPredicate(root = Vin.class, bindings = VinRepository.class) Predicate predicate){
		return vinService.get(predicate);
	}

	@ApiOperation(value = "Obtenir tous les vins, ou éventuellement uniquement les vins d'une appellation avec le paramètre appellation")
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public List<Vin> getAll(@RequestParam(required=false) String appellation){
		return vinService.getAll(appellation);
	}

	@RequestMapping(value="/pageable", method = RequestMethod.GET)
	public Page<Vin> getAllPageable(Pageable p){
		return vinService.pageable(p);
	}

	@RequestMapping(value= "/{id}", method = RequestMethod.GET)
	public Vin getById(@PathVariable Integer id){
		return vinService.getById(id);
	}

	@RequestMapping(value= "/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable Integer id){
		vinService.deleteById(id);
	}

	@RequestMapping (method = RequestMethod.POST)
	public ResponseEntity<Void> add(@RequestBody Vin vin){
		Vin vinAjoute =  vinService.add(vin);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(vinAjoute.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}

	@RequestMapping (method = RequestMethod.PUT)
	public Vin update(@RequestBody Vin vin){
		return vinService.update(vin);
	}

}