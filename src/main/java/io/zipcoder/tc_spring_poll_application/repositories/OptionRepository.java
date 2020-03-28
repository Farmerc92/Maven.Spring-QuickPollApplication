package io.zipcoder.tc_spring_poll_application.repositories;

import io.zipcoder.tc_spring_poll_application.domain.Options;
import org.springframework.data.repository.CrudRepository;

public interface OptionRepository extends CrudRepository<Options, Long> {
}
