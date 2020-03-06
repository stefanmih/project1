package domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2020-03-05T11:22:44.849+0100")
@StaticMetamodel(Department.class)
public class Department_ {
	public static volatile SingularAttribute<Department, String> nameId;
	public static volatile ListAttribute<Department, Professor> list;
}
