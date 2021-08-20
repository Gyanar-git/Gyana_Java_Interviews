package com.misc;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        String str="{\"search_type\":\"query_then_fetch\",\"ignore_unavailable\":true,\"index\":\"active_jfrt_metrics_data_2021.07.29-1\"}\n" +
                "{\"size\":0,\"query\":{\"bool\":{\"filter\":[{\"range\":{\"@timestamp\":{\"gte\":1629353648669,\"lte\":1629357248669,\"format\":\"epoch_millis\"}}},{\"query_string\":{\"analyze_wildcard\":true,\"query\":\"metric_name:sys_memory_used_bytes\"}}]}},\"aggs\":{\"2\":{\"date_histogram\":{\"interval\":\"1m\",\"field\":\"@timestamp\",\"min_doc_count\":0,\"extended_bounds\":{\"min\":1629353648669,\"max\":1629357248669},\"format\":\"epoch_millis\"},\"aggs\":{\"3\":{\"sum\":{\"field\":\"metric_value\"}}}}}}\n" +
                "{\"search_type\":\"query_then_fetch\",\"ignore_unavailable\":true,\"index\":\"active_jfrt_metrics_data_2021.07.29-1\"}\n" +
                "{\"size\":0,\"query\":{\"bool\":{\"filter\":[{\"range\":{\"@timestamp\":{\"gte\":1629353648669,\"lte\":1629357248669,\"format\":\"epoch_millis\"}}},{\"query_string\":{\"analyze_wildcard\":true,\"query\":\"metric_name:sys_memory_free_bytes\"}}]}},\"aggs\":{\"2\":{\"date_histogram\":{\"interval\":\"1m\",\"field\":\"@timestamp\",\"min_doc_count\":0,\"extended_bounds\":{\"min\":1629353648669,\"max\":1629357248669},\"format\":\"epoch_millis\"},\"aggs\":{\"1\":{\"min\":{\"field\":\"metric_value\"}}}}}}";



    }
}
