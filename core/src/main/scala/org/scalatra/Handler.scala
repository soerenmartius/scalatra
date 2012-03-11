package org.scalatra

/**
 * A `Handler` is the Scalatra abstraction for an object that operates on
 * a request/response pair.  The request and response types themselves are
 * abstract in order to support multiple server adapters.
 */
trait Handler {
  /**
   * The type of request handled by this handler.  Made abstract for
   * compatibility with the Servlet implementation.
   */
  type RequestT <: Request

  /**
   * The type of request generated by this handler.  Made abstract for
   * compatibility with the Servlet implementation.
   */
  type ResponseT <: Response

  /**
   * Handles a request and writes to the response.
   */
  def handle(request: RequestT, res: ResponseT): Unit
}
