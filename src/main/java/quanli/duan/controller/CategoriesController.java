package quanli.duan.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import quanli.duan.service.CategoriesService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CategoriesController {
    final CategoriesService categoriesService;

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<Object> getAllCategories(@PathVariable("categoryId") String categoryId) {
        return ResponseEntity.ok(categoriesService.findAllByCategories(categoryId));
    }
}
