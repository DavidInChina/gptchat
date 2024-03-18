package livekit.org.webrtc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.RtpCapabilities;
import livekit.org.webrtc.RtpParameters;

/* loaded from: classes.dex */
public class RtpTransceiver {
    private RtpReceiver cachedReceiver;
    private RtpSender cachedSender;
    private long nativeRtpTransceiver;

    /* loaded from: classes.dex */
    public enum RtpTransceiverDirection {
        SEND_RECV(0),
        SEND_ONLY(1),
        RECV_ONLY(2),
        INACTIVE(3),
        STOPPED(4);
        
        private final int nativeIndex;

        RtpTransceiverDirection(int i10) {
            this.nativeIndex = i10;
        }

        @CalledByNative("RtpTransceiverDirection")
        public static RtpTransceiverDirection fromNativeIndex(int i10) {
            RtpTransceiverDirection[] values;
            for (RtpTransceiverDirection rtpTransceiverDirection : values()) {
                if (rtpTransceiverDirection.getNativeIndex() == i10) {
                    return rtpTransceiverDirection;
                }
            }
            throw new IllegalArgumentException(android.gov.nist.core.a.e("Uknown native RtpTransceiverDirection type", i10));
        }

        @CalledByNative("RtpTransceiverDirection")
        public int getNativeIndex() {
            return this.nativeIndex;
        }
    }

    /* loaded from: classes2.dex */
    public static final class RtpTransceiverInit {
        private final RtpTransceiverDirection direction;
        private final List<RtpParameters.Encoding> sendEncodings;
        private final List<String> streamIds;

        public RtpTransceiverInit() {
            this(RtpTransceiverDirection.SEND_RECV);
        }

        @CalledByNative("RtpTransceiverInit")
        public int getDirectionNativeIndex() {
            return this.direction.getNativeIndex();
        }

        @CalledByNative("RtpTransceiverInit")
        public List<RtpParameters.Encoding> getSendEncodings() {
            return new ArrayList(this.sendEncodings);
        }

        @CalledByNative("RtpTransceiverInit")
        public List<String> getStreamIds() {
            return new ArrayList(this.streamIds);
        }

        public RtpTransceiverInit(RtpTransceiverDirection rtpTransceiverDirection) {
            this(rtpTransceiverDirection, Collections.emptyList(), Collections.emptyList());
        }

        public RtpTransceiverInit(RtpTransceiverDirection rtpTransceiverDirection, List<String> list) {
            this(rtpTransceiverDirection, list, Collections.emptyList());
        }

        public RtpTransceiverInit(RtpTransceiverDirection rtpTransceiverDirection, List<String> list, List<RtpParameters.Encoding> list2) {
            this.direction = rtpTransceiverDirection;
            this.streamIds = new ArrayList(list);
            this.sendEncodings = new ArrayList(list2);
        }
    }

    @CalledByNative
    public RtpTransceiver(long j6) {
        this.nativeRtpTransceiver = j6;
        this.cachedSender = nativeGetSender(j6);
        this.cachedReceiver = nativeGetReceiver(j6);
    }

    private void checkRtpTransceiverExists() {
        if (this.nativeRtpTransceiver != 0) {
            return;
        }
        throw new IllegalStateException("RtpTransceiver has been disposed.");
    }

    private static native RtpTransceiverDirection nativeCurrentDirection(long j6);

    private static native RtpTransceiverDirection nativeDirection(long j6);

    private static native MediaStreamTrack.MediaType nativeGetMediaType(long j6);

    private static native String nativeGetMid(long j6);

    private static native RtpReceiver nativeGetReceiver(long j6);

    private static native RtpSender nativeGetSender(long j6);

    private static native void nativeSetCodecPreferences(long j6, List<RtpCapabilities.CodecCapability> list);

    private static native boolean nativeSetDirection(long j6, RtpTransceiverDirection rtpTransceiverDirection);

    private static native void nativeStopInternal(long j6);

    private static native void nativeStopStandard(long j6);

    private static native boolean nativeStopped(long j6);

    @CalledByNative
    public void dispose() {
        checkRtpTransceiverExists();
        this.cachedSender.dispose();
        this.cachedReceiver.dispose();
        JniCommon.nativeReleaseRef(this.nativeRtpTransceiver);
        this.nativeRtpTransceiver = 0L;
    }

    public RtpTransceiverDirection getCurrentDirection() {
        checkRtpTransceiverExists();
        return nativeCurrentDirection(this.nativeRtpTransceiver);
    }

    public RtpTransceiverDirection getDirection() {
        checkRtpTransceiverExists();
        return nativeDirection(this.nativeRtpTransceiver);
    }

    public MediaStreamTrack.MediaType getMediaType() {
        checkRtpTransceiverExists();
        return nativeGetMediaType(this.nativeRtpTransceiver);
    }

    public String getMid() {
        checkRtpTransceiverExists();
        return nativeGetMid(this.nativeRtpTransceiver);
    }

    public RtpReceiver getReceiver() {
        return this.cachedReceiver;
    }

    public RtpSender getSender() {
        return this.cachedSender;
    }

    public boolean isStopped() {
        checkRtpTransceiverExists();
        return nativeStopped(this.nativeRtpTransceiver);
    }

    public void setCodecPreferences(List<RtpCapabilities.CodecCapability> list) {
        checkRtpTransceiverExists();
        nativeSetCodecPreferences(this.nativeRtpTransceiver, list);
    }

    public boolean setDirection(RtpTransceiverDirection rtpTransceiverDirection) {
        checkRtpTransceiverExists();
        return nativeSetDirection(this.nativeRtpTransceiver, rtpTransceiverDirection);
    }

    public void stop() {
        checkRtpTransceiverExists();
        nativeStopInternal(this.nativeRtpTransceiver);
    }

    public void stopInternal() {
        checkRtpTransceiverExists();
        nativeStopInternal(this.nativeRtpTransceiver);
    }

    public void stopStandard() {
        checkRtpTransceiverExists();
        nativeStopStandard(this.nativeRtpTransceiver);
    }
}
