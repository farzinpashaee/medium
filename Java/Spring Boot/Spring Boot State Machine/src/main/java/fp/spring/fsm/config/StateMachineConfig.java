package fp.spring.fsm.config;

import fp.spring.fsm.event.OrderEvent;
import fp.spring.fsm.states.OrderState;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.action.Action;
import org.springframework.statemachine.config.EnableStateMachine;
import org.springframework.statemachine.config.StateMachineConfigurerAdapter;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;

import java.io.Serializable;

@Configuration
@EnableStateMachine
public class StateMachineConfig extends StateMachineConfigurerAdapter<OrderState, OrderEvent> {

    @Override
    public void configure(StateMachineStateConfigurer<OrderState, OrderEvent> states) throws Exception {
        states
                .withStates()
                .initial(OrderState.NEW,stateAction())
                .state(OrderState.PAID,stateAction())
                .state(OrderState.SHIPPED,stateAction())
                .end(OrderState.DELIVERED);
    }

    @Override
    public void configure(StateMachineTransitionConfigurer<OrderState, OrderEvent> transitions) throws Exception {
        transitions
                .withExternal().source(OrderState.NEW).target(OrderState.PAID).event(OrderEvent.PAY).action(eventAction())
                .and()
                .withExternal().source(OrderState.PAID).target(OrderState.SHIPPED).event(OrderEvent.SHIP).action(eventAction())
                .and()
                .withExternal().source(OrderState.SHIPPED).target(OrderState.DELIVERED).event(OrderEvent.DELIVER).action(eventAction());
    }

    @Bean
    public Action<OrderState, OrderEvent> stateAction() {
        return ctx -> System.out.println("STATE_ACTION_"+ctx.getTarget().getId() +"_"+ ctx.getStateMachine().getUuid()+ctx.getMessageHeaders());
    }

    @Bean
    public Action<OrderState, OrderEvent> eventAction() {
        return ctx -> System.out.println("EVENT_ACTION_"+ctx.getEvent().name()+"_" + ctx.getStateMachine().getUuid());
    }
}
