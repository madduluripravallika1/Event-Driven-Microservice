//package com.example.serde;
//
//import com.example.dto.Order;
//import com.example.model.Customer;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.apache.kafka.common.serialization.Deserializer;
//import org.apache.kafka.common.serialization.Serdes;
//import org.apache.kafka.common.serialization.Serializer;
//
//public class CustomerSerde extends Serdes.WrapperSerde<Order> {
//    public CustomerSerde() {
//        super(new CustomerSerializer(), new CustomerDeserializer());
//    }
//
//    public static class CustomerSerializer implements Serializer<Customer> {
//        private ObjectMapper mapper = new ObjectMapper();
//
//        @Override
//        public byte[] serialize(String topic, Customer data) {
//            try {
//                return mapper.writeValueAsBytes(data);
//            } catch (Exception e) {
//                throw new RuntimeException("Error serializing Customer", e);
//            }
//        }
//    }
//
//    public static class CustomerDeserializer implements Deserializer<Customer> {
//        private ObjectMapper mapper = new ObjectMapper();
//
//        @Override
//        public Customer deserialize(String topic, byte[] data) {
//            try {
//                return mapper.readValue(data, Customer.class);
//            } catch (Exception e) {
//                throw new RuntimeException("Error deserializing Customer", e);
//            }
//        }
//    }
//}
