package ru.systempla.talos_server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.systempla.talos_server.model.InfoData;
import ru.systempla.talos_server.model.Product;
import ru.systempla.talos_server.service.InfoDataService;
import ru.systempla.talos_server.service.ProductService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("api/v1/info_data")
@RestController
public class InfoDataController {

    private final InfoDataService infoDataService;

    @Autowired
    public InfoDataController(InfoDataService infoDataService) {
        this.infoDataService = infoDataService;
    }

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody InfoData infoData) {
        infoDataService.create(infoData);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<InfoData>> read() {
        final List<InfoData> infoDatas = infoDataService.readAll();

        return infoDatas != null &&  !infoDatas.isEmpty()
                ? new ResponseEntity<>(infoDatas, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Optional<InfoData>> read(@PathVariable(name = "id") Integer id) {
        final Optional<InfoData> infoData = infoDataService.read(id);

        return !infoData.isEmpty()
                ? new ResponseEntity<>(infoData, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") Integer id, @Valid @RequestBody InfoData infoData) {
        final int updated = infoDataService.update(infoData, id);

        return updated==1
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Integer id) {
        final int deleted = infoDataService.delete(id);

        return deleted==1
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}
