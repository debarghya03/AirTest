package org.springframework.data.jpa.repository;

public @interface EntityGraph {

	String[] attributePaths();

}
