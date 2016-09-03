import org.elasticsearch.index.query.QueryBuilder;

import java.util.ArrayList;
import java.util.List;

import static org.elasticsearch.index.query.QueryBuilders.rangeQuery;

public class JavaTest {

	static void addHandler(List<QueryBuilder> filters) {
		filters.add(rangeQuery("test"));
	}

	public static void main(String[] args) {
		List<QueryBuilder> list = new ArrayList<>();
		addHandler(list);
		list.forEach(System.out::println);
	}

}
