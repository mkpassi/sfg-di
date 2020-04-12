package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 */
@Primary
@Service("cat")
public class CatPetService implements PetService, InitializingBean, DisposableBean, BeanPostProcessor {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void destroy() throws Exception {

    }
}
