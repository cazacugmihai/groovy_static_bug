import groovy.transform.CompileStatic
import org.elasticsearch.index.query.QueryBuilder

import static org.elasticsearch.index.query.QueryBuilders.rangeQuery

@CompileStatic
class GroovyTest {

	static void addHandler(List<QueryBuilder> filters) {
		filters << rangeQuery('test')
		// but this one works:
		// filters << (QueryBuilder) rangeQuery('test')
	}

	static void main(String[] args) {
		List<QueryBuilder> list = []
		addHandler(list)
		list.each { println(it) }
	}

}
