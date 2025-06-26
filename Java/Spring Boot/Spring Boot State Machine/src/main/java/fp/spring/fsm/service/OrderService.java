package fp.spring.fsm.service;

import fp.spring.fsm.event.OrderEvent;
import fp.spring.fsm.states.OrderState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.statemachine.StateMachine;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private StateMachine<OrderState, OrderEvent> stateMachine;

    public void processOrder() {
        stateMachine.start();

        System.out.println("Current state: " + stateMachine.getState().getId());
        stateMachine.sendEvent(OrderEvent.PAY);
        System.out.println("Current state: " + stateMachine.getState().getId());
        stateMachine.sendEvent(OrderEvent.SHIP);
        System.out.println("Current state: " + stateMachine.getState().getId());
        stateMachine.sendEvent(OrderEvent.DELIVER);
        System.out.println("Current state: " + stateMachine.getState().getId());
    }
}
