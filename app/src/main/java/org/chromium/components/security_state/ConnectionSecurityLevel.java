
// Copyright 2018 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/security_state/core/security_state.h

package org.chromium.components.security_state;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    ConnectionSecurityLevel.NONE, ConnectionSecurityLevel.HTTP_SHOW_WARNING,
    ConnectionSecurityLevel.EV_SECURE, ConnectionSecurityLevel.SECURE,
    ConnectionSecurityLevel.SECURE_WITH_POLICY_INSTALLED_CERT, ConnectionSecurityLevel.DANGEROUS
})
@Retention(RetentionPolicy.SOURCE)
public @interface ConnectionSecurityLevel {
  /**
   * HTTP/no URL/HTTPS but with insecure passive content on the page.
   */
  int NONE = 0;
  /**
   * HTTP, in a case where we want to show a visible warning about the page's lack of security. The
   * criteria used to classify pages as NONE vs. HTTP_SHOW_WARNING will change over time.
   * Eventually, NONE will be eliminated. See https://crbug.com/647754.
   */
  int HTTP_SHOW_WARNING = 1;
  /**
   * HTTPS with valid EV cert.
   */
  int EV_SECURE = 2;
  /**
   * HTTPS (non-EV) with valid cert.
   */
  int SECURE = 3;
  /**
   * HTTPS, but a certificate chain anchored to a root certificate installed by the system
   * administrator has been observed in this profile, suggesting a MITM was present. Used only on
   * ChromeOS, this status is unreached on other platforms.
   */
  int SECURE_WITH_POLICY_INSTALLED_CERT = 4;
  /**
   * Attempted HTTPS and failed, page not authenticated, HTTPS with insecure active content on the
   * page, malware, phishing, or any other serious security issue that could be dangerous.
   */
  int DANGEROUS = 5;
}
