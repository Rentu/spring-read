package org.springframework.mytest;

import org.springframework.context.ApplicationEvent;

@SuppressWarnings("serial")
public class E1  extends ApplicationEvent {

	/**
	 * Create a new ApplicationEvent.
	 *
	 * @param source the object on which the event initially occurred (never {@code null})
	 */
	public E1(Object source) {
		super(source);
	}
}
