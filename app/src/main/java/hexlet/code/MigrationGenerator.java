package hexlet.code;

import io.ebean.annotation.Platform;
import io.ebean.dbmigration.DbMigration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class MigrationGenerator {

    private static final Logger MIGRATION_GENERATOR_LOGGER = LoggerFactory.getLogger(MigrationGenerator.class);

    public static void main(String[] args) throws IOException {
        MIGRATION_GENERATOR_LOGGER.debug("Запускается миграция БД");

        DbMigration dbMigration = DbMigration.create();
        dbMigration.addPlatform(Platform.H2, "h2");
        dbMigration.addPlatform(Platform.POSTGRES, "postgres");

        dbMigration.generateMigration();
    }
}
