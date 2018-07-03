
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/interfaces/demuxer_stream.mojom
//

package org.chromium.media.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface DemuxerStream extends org.chromium.mojo.bindings.Interface {



    public static final class Type {
    
    
    
        private static final boolean IS_EXTENSIBLE = false;
    
        public static boolean isKnownValue(int value) {
            return false;
        }
    
        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value))
                return;
    
            throw new DeserializationException("Invalid enum value.");
        }
    
        private Type() {}
    
    }


    public static final class Status {
    
    
    
        private static final boolean IS_EXTENSIBLE = false;
    
        public static boolean isKnownValue(int value) {
            return false;
        }
    
        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value))
                return;
    
            throw new DeserializationException("Invalid enum value.");
        }
    
        private Status() {}
    
    }


    public interface Proxy extends DemuxerStream, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<DemuxerStream, DemuxerStream.Proxy> MANAGER = DemuxerStream_Internal.MANAGER;


    void initialize(

InitializeResponse callback);

    interface InitializeResponse extends org.chromium.mojo.bindings.Callbacks.Callback4<Integer, org.chromium.mojo.system.DataPipe.ConsumerHandle, AudioDecoderConfig, VideoDecoderConfig> { }



    void read(

ReadResponse callback);

    interface ReadResponse extends org.chromium.mojo.bindings.Callbacks.Callback4<Integer, DecoderBuffer, AudioDecoderConfig, VideoDecoderConfig> { }



    void enableBitstreamConverter(
);


}