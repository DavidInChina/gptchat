package livekit.org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
class MediaCodecWrapperFactoryImpl implements MediaCodecWrapperFactory {

    /* loaded from: classes2.dex */
    public static class MediaCodecWrapperImpl implements MediaCodecWrapper {
        private final MediaCodec mediaCodec;

        public MediaCodecWrapperImpl(MediaCodec mediaCodec) {
            this.mediaCodec = mediaCodec;
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
            this.mediaCodec.configure(mediaFormat, surface, mediaCrypto, i10);
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public Surface createInputSurface() {
            return this.mediaCodec.createInputSurface();
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public int dequeueInputBuffer(long j6) {
            return this.mediaCodec.dequeueInputBuffer(j6);
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j6) {
            return this.mediaCodec.dequeueOutputBuffer(bufferInfo, j6);
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public void flush() {
            this.mediaCodec.flush();
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public MediaCodecInfo getCodecInfo() {
            return this.mediaCodec.getCodecInfo();
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public ByteBuffer getInputBuffer(int i10) {
            return this.mediaCodec.getInputBuffer(i10);
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public MediaFormat getInputFormat() {
            return this.mediaCodec.getInputFormat();
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public ByteBuffer getOutputBuffer(int i10) {
            return this.mediaCodec.getOutputBuffer(i10);
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public MediaFormat getOutputFormat() {
            return this.mediaCodec.getOutputFormat();
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public void queueInputBuffer(int i10, int i11, int i12, long j6, int i13) {
            this.mediaCodec.queueInputBuffer(i10, i11, i12, j6, i13);
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public void release() {
            this.mediaCodec.release();
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public void releaseOutputBuffer(int i10, boolean z10) {
            this.mediaCodec.releaseOutputBuffer(i10, z10);
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public void setParameters(Bundle bundle) {
            this.mediaCodec.setParameters(bundle);
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public void start() {
            this.mediaCodec.start();
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public void stop() {
            this.mediaCodec.stop();
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public MediaFormat getOutputFormat(int i10) {
            return this.mediaCodec.getOutputFormat(i10);
        }
    }

    @Override // livekit.org.webrtc.MediaCodecWrapperFactory
    public MediaCodecWrapper createByCodecName(String str) {
        return new MediaCodecWrapperImpl(MediaCodec.createByCodecName(str));
    }
}
