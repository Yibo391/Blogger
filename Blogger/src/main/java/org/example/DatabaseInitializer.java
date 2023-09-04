package org.example;

import org.example.model.User;
import org.example.model.Article;
import org.example.repository.UserRepository;
import org.example.repository.ArticleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    private final UserRepository userRepository;
    private final ArticleRepository articleRepository;

    public DatabaseInitializer(UserRepository userRepository, ArticleRepository articleRepository) {
        this.userRepository = userRepository;
        this.articleRepository = articleRepository;
    }

    @Override
    public void run(String... args) {
        // Initialize users
        User john = new User();
        john.setUsername("john");
        john.setPassword("john123");
        john.setEmail("john@email.com");
        userRepository.save(john);

        User jane = new User();
        jane.setUsername("jane");
        jane.setPassword("jane123");
        jane.setEmail("jane@email.com");
        userRepository.save(jane);

        // Initialize articles
        Article firstArticle = new Article();
        firstArticle.setTitle("First Article");
        firstArticle.setContent("This is the content of the first article.");
        articleRepository.save(firstArticle);

        Article secondArticle = new Article();
        secondArticle.setTitle("Second Article");
        secondArticle.setContent("This is the content of the second article.");
        articleRepository.save(secondArticle);
    }
}
