CREATE TABLE note_tags (
                           note_id INT NOT NULL,
                           tag_id INT NOT NULL,
                           PRIMARY KEY (note_id, tag_id),
                           FOREIGN KEY (note_id) REFERENCES note (id),
                           FOREIGN KEY (tag_id) REFERENCES tag(id)
);
