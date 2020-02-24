package com.company.diamonds.diamonds.diamonds.hibernate_sequence.generated;

import com.company.diamonds.diamonds.diamonds.hibernate_sequence.HibernateSequence;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.company.diamonds.diamonds.diamonds.hibernate_sequence.HibernateSequence}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedHibernateSequenceManager extends Manager<HibernateSequence> {
    
    TableIdentifier<HibernateSequence> IDENTIFIER = TableIdentifier.of("diamonds", "diamonds", "hibernate_sequence");
    List<Field<HibernateSequence>> FIELDS = unmodifiableList(asList(
        HibernateSequence.NEXT_VAL
    ));
    
    @Override
    default Class<HibernateSequence> getEntityClass() {
        return HibernateSequence.class;
    }
}