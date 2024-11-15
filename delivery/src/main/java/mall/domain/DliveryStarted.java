package mall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import mall.domain.*;
import mall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DliveryStarted extends AbstractEvent {

    private Long id;
    private String userId;
    private Long productId;
    private Integer qty;
    private String status;

    public DliveryStarted(Delivery aggregate) {
        super(aggregate);
    }

    public DliveryStarted() {
        super();
    }
}
//>>> DDD / Domain Event
