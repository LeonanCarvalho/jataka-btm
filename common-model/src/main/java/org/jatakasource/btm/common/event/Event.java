package org.jatakasource.btm.common.event;

/**
 * Base implementation for
 * {@link org.jatakasource.btm.common.event.AbstractEvent AbstractEvent} wishing
 * to log a single event.
 * <p>
 * This base class represent a single atomic event and wraps all relevant data.
 *
 * @since 0.1.0
 */
public class Event extends AbstractEvent {
	private static final long serialVersionUID = 2681029214025230841L;

	private Long id;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

}
