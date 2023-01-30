input {
  beats {
    port => 5044
  }
}

filter {
  grok {
    match => { "message" => "%{TIMESTAMP_ISO8601:log_timestamp} %{LOGLEVEL:log_level} %{GREEDYDATA:log_message}" }
  }
}

output {
  elasticsearch {
    hosts => ["http://elasticsearch:9200"]
  }
}
