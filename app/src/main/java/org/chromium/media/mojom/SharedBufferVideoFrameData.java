
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/interfaces/media_types.mojom
//

package org.chromium.media.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public final class SharedBufferVideoFrameData extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 56;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(56, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public org.chromium.mojo.system.SharedBufferHandle frameData;
    public long frameDataSize;
    public int yStride;
    public int uStride;
    public int vStride;
    public long yOffset;
    public long uOffset;
    public long vOffset;

    private SharedBufferVideoFrameData(int version) {
        super(STRUCT_SIZE, version);
        this.frameData = org.chromium.mojo.system.InvalidHandle.INSTANCE;
    }

    public SharedBufferVideoFrameData() {
        this(0);
    }

    public static SharedBufferVideoFrameData deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static SharedBufferVideoFrameData deserialize(java.nio.ByteBuffer data) {
        if (data == null)
            return null;

        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static SharedBufferVideoFrameData decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        SharedBufferVideoFrameData result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            result = new SharedBufferVideoFrameData(mainDataHeader.elementsOrVersion);
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.frameData = decoder0.readSharedBufferHandle(8, false);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.yStride = decoder0.readInt(12);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.frameDataSize = decoder0.readLong(16);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.uStride = decoder0.readInt(24);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.vStride = decoder0.readInt(28);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.yOffset = decoder0.readLong(32);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.uOffset = decoder0.readLong(40);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.vOffset = decoder0.readLong(48);
            }
        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.frameData, 8, false);
        
        encoder0.encode(this.yStride, 12);
        
        encoder0.encode(this.frameDataSize, 16);
        
        encoder0.encode(this.uStride, 24);
        
        encoder0.encode(this.vStride, 28);
        
        encoder0.encode(this.yOffset, 32);
        
        encoder0.encode(this.uOffset, 40);
        
        encoder0.encode(this.vOffset, 48);
    }

    /**
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(Object object) {
        if (object == this)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        SharedBufferVideoFrameData other = (SharedBufferVideoFrameData) object;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.frameData, other.frameData))
            return false;
        if (this.frameDataSize!= other.frameDataSize)
            return false;
        if (this.yStride!= other.yStride)
            return false;
        if (this.uStride!= other.uStride)
            return false;
        if (this.vStride!= other.vStride)
            return false;
        if (this.yOffset!= other.yOffset)
            return false;
        if (this.uOffset!= other.uOffset)
            return false;
        if (this.vOffset!= other.vOffset)
            return false;
        return true;
    }

    /**
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = prime + getClass().hashCode();
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.frameData);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.frameDataSize);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.yStride);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.uStride);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.vStride);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.yOffset);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.uOffset);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.vOffset);
        return result;
    }
}