/*
 * Copyright © 2023 Mark Raynsford <code@io7m.com> https://www.io7m.com
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY
 * SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR
 * IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */


package com.io7m.servitor.core;

import java.util.Objects;
import java.util.Optional;

/**
 * The outbound address of a container.
 *
 * @param ipv4Address The IPv4 host
 * @param ipv6Address The IPv6 host
 */

public record SvOutboundAddress(
  String ipv6Address,
  Optional<String> ipv4Address)
{
  /**
   * The outbound address of a container.
   *
   * @param ipv4Address The IPv4 host
   * @param ipv6Address The IPv6 host
   */

  public SvOutboundAddress
  {
    Objects.requireNonNull(ipv4Address, "ipv4Address");
    Objects.requireNonNull(ipv6Address, "ipv6Address");
  }
}
