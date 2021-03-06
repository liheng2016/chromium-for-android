// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser;

class ChromeVersionConstants {
    static final String PRODUCT_NAME = "Chromium";
    static final String PRODUCT_VERSION = "64.0.3282.116";
    @SuppressWarnings({"ComplexBooleanConstant", "IdentityBinaryExpression"})
    static final boolean IS_OFFICIAL_BUILD = 1 == 1;

    static final int PRODUCT_MAJOR_VERSION = 64;

    static final int CHANNEL_DEFAULT = 0;
    static final int CHANNEL_CANARY = 1;
    static final int CHANNEL_DEV = 2;
    static final int CHANNEL_BETA = 3;
    static final int CHANNEL_STABLE = 4;
    static final int CHANNEL_WORK = 5;
    static final int CHANNEL = CHANNEL_DEFAULT;
}
