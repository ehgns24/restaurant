package validator;

import com.sparta.assignment.dto.RestaurantRequestDto;
import org.springframework.stereotype.Component;

@Component
public class RestaurantValidator {
    public static void validateRestaurantInput(RestaurantRequestDto requestDto){


        if (requestDto.getMinOrderPrice()<1000 || requestDto.getMinOrderPrice()>100000 || requestDto.getMinOrderPrice()%100 != 0) {
            throw new IllegalArgumentException("최소주문금액을 맞춰주세요");
        }

        if (requestDto.getDeliveryFee()<0 || requestDto.getDeliveryFee()>10000 || requestDto.getDeliveryFee()%500 != 0) {
            throw new IllegalArgumentException("배달비를 맞춰주세요");
        }

    }
}
