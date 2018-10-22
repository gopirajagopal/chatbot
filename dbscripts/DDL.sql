--Create keypace for chatbot app.
CREATE KEYSPACE chatbot WITH REPLICATION = 
{ 'class' : 'org.apache.cassandra.locator.SimpleStrategy', 'replication_factor': '1' } 
AND DURABLE_WRITES = true;


--create table for knowledgebase
CREATE TABLE chatbot.Knowledge (
    QId uuid,
    orgId bigint,
    Question text,
    Repetition bigint,
    PRIMARY KEY (QId)
)WITH read_repair_chance = 0.0
   AND dclocal_read_repair_chance = 0.1
   AND gc_grace_seconds = 864000
   AND bloom_filter_fp_chance = 0.01
   AND caching = { 'keys' : 'ALL', 'rows_per_partition' : 'NONE' }
   AND comment = ''
   AND compaction = { 'class' : 'org.apache.cassandra.db.compaction.SizeTieredCompactionStrategy', 'max_threshold' : 32, 'min_threshold' : 4 }
   AND compression = { 'chunk_length_in_kb' : 64, 'class' : 'org.apache.cassandra.io.compress.LZ4Compressor' }
   AND default_time_to_live = 0
   AND speculative_retry = '99PERCENTILE'
   AND min_index_interval = 128
   AND max_index_interval = 2048
   AND crc_check_chance = 1.0
   AND cdc = false;
