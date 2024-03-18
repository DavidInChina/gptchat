package livekit.org.webrtc;

import java.util.List;
import java.util.Map;
import livekit.org.webrtc.MediaStreamTrack;

/* loaded from: classes.dex */
public class RtpCapabilities {
    public List<CodecCapability> codecs;
    public List<HeaderExtensionCapability> headerExtensions;

    /* loaded from: classes2.dex */
    public static class CodecCapability {
        public Integer clockRate;
        public MediaStreamTrack.MediaType kind;
        public String mimeType;
        public String name;
        public Integer numChannels;
        public Map<String, String> parameters;
        public int preferredPayloadType;

        public CodecCapability() {
        }

        @CalledByNative("CodecCapability")
        public CodecCapability(int i10, String str, MediaStreamTrack.MediaType mediaType, Integer num, Integer num2, String str2, Map<String, String> map) {
            this.preferredPayloadType = i10;
            this.name = str;
            this.kind = mediaType;
            this.clockRate = num;
            this.numChannels = num2;
            this.parameters = map;
            this.mimeType = str2;
        }

        @CalledByNative("CodecCapability")
        public Integer getClockRate() {
            return this.clockRate;
        }

        @CalledByNative("CodecCapability")
        public MediaStreamTrack.MediaType getKind() {
            return this.kind;
        }

        @CalledByNative("CodecCapability")
        public String getName() {
            return this.name;
        }

        @CalledByNative("CodecCapability")
        public Integer getNumChannels() {
            return this.numChannels;
        }

        @CalledByNative("CodecCapability")
        public Map getParameters() {
            return this.parameters;
        }

        @CalledByNative("CodecCapability")
        public int getPreferredPayloadType() {
            return this.preferredPayloadType;
        }
    }

    /* loaded from: classes.dex */
    public static class HeaderExtensionCapability {
        private final boolean preferredEncrypted;
        private final int preferredId;
        private final String uri;

        @CalledByNative("HeaderExtensionCapability")
        public HeaderExtensionCapability(String str, int i10, boolean z10) {
            this.uri = str;
            this.preferredId = i10;
            this.preferredEncrypted = z10;
        }

        @CalledByNative("HeaderExtensionCapability")
        public boolean getPreferredEncrypted() {
            return this.preferredEncrypted;
        }

        @CalledByNative("HeaderExtensionCapability")
        public int getPreferredId() {
            return this.preferredId;
        }

        @CalledByNative("HeaderExtensionCapability")
        public String getUri() {
            return this.uri;
        }
    }

    @CalledByNative
    public RtpCapabilities(List<CodecCapability> list, List<HeaderExtensionCapability> list2) {
        this.headerExtensions = list2;
        this.codecs = list;
    }

    @CalledByNative
    public List<CodecCapability> getCodecs() {
        return this.codecs;
    }

    @CalledByNative
    public List<HeaderExtensionCapability> getHeaderExtensions() {
        return this.headerExtensions;
    }
}
