package local;

import com.sun.deploy.security.CertStore;
import local.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PolicyHandler{

    @Autowired
    DeliveryRepository deliveryRepository;

    @StreamListener(KafkaProcessor.INPUT)

    public void wheneverOrdered_Ship(@Payload Ordered ordered){

          if(ordered.isMe()){
             // System.out.println("##### listener Ship : " + ordered.toJson());
              Delivery delivery = new Delivery();
              delivery.setOrderId(ordered.getId());
              delivery.setStatus("SHIPPED");

              deliveryRepository.save(delivery);
          }
    }
}
