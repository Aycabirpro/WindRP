package org.jinghouyu.windRP.exception;

/**
 *
 * @author Simsir.L
 * modified by <person></person> on <data></date>
 *
 * |  created date  | modified date  |  modified person |
 * |         |           |        |
 * @description
 *
 * @since 1.0.0
 */
public class ResourceReleaseException extends Exception {

	private static final long serialVersionUID = 875274640666312069L;

	public ResourceReleaseException() {
		super();
	}

	public ResourceReleaseException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ResourceReleaseException(String message, Throwable cause) {
		super(message, cause);
	}

	public ResourceReleaseException(String message) {
		super(message);
	}

	public ResourceReleaseException(Throwable cause) {
		super(cause);
	}
}