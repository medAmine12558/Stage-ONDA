SELECT 
    OBJECT_NAME(fk.object_id) AS ForeignKeyName,
    OBJECT_NAME(fk.parent_object_id) AS TableName,
    COL_NAME(fc.parent_object_id, fc.parent_column_id) AS ColumnName,
    OBJECT_NAME(fk.referenced_object_id) AS ReferencedTableName,
    COL_NAME(fc.referenced_object_id, fc.referenced_column_id) AS ReferencedColumnName
FROM 
    sys.foreign_keys AS fk
INNER JOIN 
    sys.foreign_key_columns AS fc 
        ON fk.object_id = fc.constraint_object_id
WHERE 
    fk.referenced_object_id = OBJECT_ID('role');

	truncate table role

	-- Disable the foreign key constraint
ALTER TABLE role_utilisateurs
DROP CONSTRAINT FK5l629hr1n8aj87qmajf8rfdev;

ALTER TABLE ao
DROP CONSTRAINT FK2ca2a7lbewnwixs9i0byrj184;

ALTER TABLE utilisateur_roles
DROP CONSTRAINT FKirehnt4bumoo8qvpb6rvtom54;

ALTER TABLE role_utilisateurs
DROP CONSTRAINT FK5l629hr1n8aj87qmajf8rfdev;

-- Truncate the role table
TRUNCATE TABLE utilisateur;

-- Re-enable the foreign key constraint

select * from utilisateur

truncate table role;