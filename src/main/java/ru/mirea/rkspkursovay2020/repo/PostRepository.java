package ru.mirea.rkspkursovay2020.repo;

import org.springframework.data.repository.CrudRepository;
import ru.mirea.rkspkursovay2020.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
