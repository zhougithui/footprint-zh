package zh.footprint.zmy.optimisticlock.annotation;

import java.lang.annotation.*;


@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface OptimisticLock {
	
}
