package com.yyaccp.search;

import com.yyaccp.search.beans.ItripHotelVO;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.impl.XMLResponseParser;
import org.apache.solr.client.solrj.response.QueryResponse;

import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
        String url = "http://localhost:9080/solr/hotel";
        HttpSolrClient client = new HttpSolrClient(url);
        client.setParser(new XMLResponseParser());
        client.setConnectionTimeout(500);
        SolrQuery query = new SolrQuery();
        query.setQuery("keyword:度假酒店");
        QueryResponse response = client.query(query);
        List<ItripHotelVO> list = response.getBeans(ItripHotelVO.class);
        for(ItripHotelVO bean : list) {
            System.out.println(bean.getHotelName()+"," + bean.getFeatureNames());
        }
    }
}
