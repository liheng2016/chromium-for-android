
// Copyright 2018 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../content/public/common/speech_recognition_error.h

package org.chromium.content_public.common;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    SpeechRecognitionErrorCode.NONE, SpeechRecognitionErrorCode.NO_SPEECH,
    SpeechRecognitionErrorCode.ABORTED, SpeechRecognitionErrorCode.AUDIO_CAPTURE,
    SpeechRecognitionErrorCode.NETWORK, SpeechRecognitionErrorCode.NOT_ALLOWED,
    SpeechRecognitionErrorCode.SERVICE_NOT_ALLOWED, SpeechRecognitionErrorCode.BAD_GRAMMAR,
    SpeechRecognitionErrorCode.LANGUAGE_NOT_SUPPORTED, SpeechRecognitionErrorCode.NO_MATCH,
    SpeechRecognitionErrorCode.LAST
})
@Retention(RetentionPolicy.SOURCE)
public @interface SpeechRecognitionErrorCode {
  /**
   * There was no error.
   */
  int NONE = 0;
  /**
   * No speech heard before timeout.
   */
  int NO_SPEECH = 1;
  /**
   * The user or a script aborted speech input.
   */
  int ABORTED = 2;
  /**
   * There was an error with recording audio.
   */
  int AUDIO_CAPTURE = 3;
  /**
   * There was a network error.
   */
  int NETWORK = 4;
  /**
   * Not allowed for privacy or security reasons.
   */
  int NOT_ALLOWED = 5;
  /**
   * Speech service is not allowed for privacy or security reasons.
   */
  int SERVICE_NOT_ALLOWED = 6;
  /**
   * There was an error in the speech recognition grammar.
   */
  int BAD_GRAMMAR = 7;
  /**
   * The language was not supported.
   */
  int LANGUAGE_NOT_SUPPORTED = 8;
  /**
   * Speech was heard, but could not be interpreted.
   */
  int NO_MATCH = 9;
  int LAST = 9;
}
