package fr.icodem.lab.batch9;

import fr.icodem.lab.model.Person;
import org.springframework.batch.item.ItemProcessor;

public class PersonProcessor implements ItemProcessor<Person, Person> {
    @Override
    public Person process(Person p) throws Exception {
        p.setLastName(p.getLastName().toUpperCase());
        return p;
    }
}