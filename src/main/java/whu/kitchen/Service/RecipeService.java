//Author:刘行
package whu.kitchen.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import whu.kitchen.Repository.RecipeRepository;
import whu.kitchen.Vo.ResultVo;

@Service
public class RecipeService {
    @Autowired
    private RecipeRepository recipeRepository;


}
