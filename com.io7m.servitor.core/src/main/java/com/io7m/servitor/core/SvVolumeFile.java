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

import java.nio.file.Path;
import java.util.Objects;
import java.util.Set;

/**
 * A regular file volume.
 *
 * @param hostPath  The path to the file on the host
 * @param mountedAt The path at which to mount the volume inside the container
 * @param flags     The volume flags
 */

public record SvVolumeFile(
  Path hostPath,
  Path mountedAt,
  Set<SvVolumeFlag> flags)
  implements SvVolumeType
{
  /**
   * A regular file volume.
   *
   * @param hostPath  The path to the file on the host
   * @param mountedAt The path at which to mount the volume inside the container
   * @param flags     The volume flags
   */

  public SvVolumeFile
  {
    Objects.requireNonNull(hostPath, "hostPath");
    Objects.requireNonNull(mountedAt, "mountedAt");
    Objects.requireNonNull(flags, "flags");
  }
}
