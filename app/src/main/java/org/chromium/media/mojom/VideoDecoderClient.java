
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/interfaces/video_decoder.mojom
//

package org.chromium.media.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface VideoDecoderClient extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends VideoDecoderClient, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<VideoDecoderClient, VideoDecoderClient.Proxy> MANAGER = VideoDecoderClient_Internal.MANAGER;


    void onVideoFrameDecoded(
VideoFrame frame, boolean canReadWithoutStalling, org.chromium.mojo.common.mojom.UnguessableToken releaseToken);



    void requestOverlayInfo(
boolean restartForTransitions);


}