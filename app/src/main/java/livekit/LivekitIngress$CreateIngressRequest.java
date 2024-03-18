package livekit;

import com.google.protobuf.AbstractC2489a1;
import com.google.protobuf.AbstractC2493c;
import com.google.protobuf.AbstractC2497d0;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2543v;
import com.google.protobuf.EnumC2494c0;
import com.google.protobuf.J;
import com.google.protobuf.N0;
import com.google.protobuf.X;
import java.io.InputStream;
import java.nio.ByteBuffer;
import jh.C3990b1;
import jh.O0;
import jh.S0;
import jh.W0;

/* loaded from: classes2.dex */
public final class LivekitIngress$CreateIngressRequest extends AbstractC2497d0 implements N0 {
    public static final int AUDIO_FIELD_NUMBER = 6;
    public static final int BYPASS_TRANSCODING_FIELD_NUMBER = 8;
    private static final LivekitIngress$CreateIngressRequest DEFAULT_INSTANCE;
    public static final int INPUT_TYPE_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PARTICIPANT_IDENTITY_FIELD_NUMBER = 4;
    public static final int PARTICIPANT_NAME_FIELD_NUMBER = 5;
    public static final int ROOM_NAME_FIELD_NUMBER = 3;
    public static final int URL_FIELD_NUMBER = 9;
    public static final int VIDEO_FIELD_NUMBER = 7;
    private LivekitIngress$IngressAudioOptions audio_;
    private boolean bypassTranscoding_;
    private int inputType_;
    private LivekitIngress$IngressVideoOptions video_;
    private String url_ = "";
    private String name_ = "";
    private String roomName_ = "";
    private String participantIdentity_ = "";
    private String participantName_ = "";

    static {
        LivekitIngress$CreateIngressRequest livekitIngress$CreateIngressRequest = new LivekitIngress$CreateIngressRequest();
        DEFAULT_INSTANCE = livekitIngress$CreateIngressRequest;
        AbstractC2497d0.registerDefaultInstance(LivekitIngress$CreateIngressRequest.class, livekitIngress$CreateIngressRequest);
    }

    private LivekitIngress$CreateIngressRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudio() {
        this.audio_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBypassTranscoding() {
        this.bypassTranscoding_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInputType() {
        this.inputType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantIdentity() {
        this.participantIdentity_ = getDefaultInstance().getParticipantIdentity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantName() {
        this.participantName_ = getDefaultInstance().getParticipantName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomName() {
        this.roomName_ = getDefaultInstance().getRoomName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideo() {
        this.video_ = null;
    }

    public static LivekitIngress$CreateIngressRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAudio(LivekitIngress$IngressAudioOptions livekitIngress$IngressAudioOptions) {
        livekitIngress$IngressAudioOptions.getClass();
        LivekitIngress$IngressAudioOptions livekitIngress$IngressAudioOptions2 = this.audio_;
        if (livekitIngress$IngressAudioOptions2 != null && livekitIngress$IngressAudioOptions2 != LivekitIngress$IngressAudioOptions.getDefaultInstance()) {
            S0 newBuilder = LivekitIngress$IngressAudioOptions.newBuilder(this.audio_);
            newBuilder.f(livekitIngress$IngressAudioOptions);
            this.audio_ = (LivekitIngress$IngressAudioOptions) newBuilder.c();
            return;
        }
        this.audio_ = livekitIngress$IngressAudioOptions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVideo(LivekitIngress$IngressVideoOptions livekitIngress$IngressVideoOptions) {
        livekitIngress$IngressVideoOptions.getClass();
        LivekitIngress$IngressVideoOptions livekitIngress$IngressVideoOptions2 = this.video_;
        if (livekitIngress$IngressVideoOptions2 != null && livekitIngress$IngressVideoOptions2 != LivekitIngress$IngressVideoOptions.getDefaultInstance()) {
            C3990b1 newBuilder = LivekitIngress$IngressVideoOptions.newBuilder(this.video_);
            newBuilder.f(livekitIngress$IngressVideoOptions);
            this.video_ = (LivekitIngress$IngressVideoOptions) newBuilder.c();
            return;
        }
        this.video_ = livekitIngress$IngressVideoOptions;
    }

    public static O0 newBuilder() {
        return (O0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitIngress$CreateIngressRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitIngress$CreateIngressRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$CreateIngressRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitIngress$CreateIngressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudio(LivekitIngress$IngressAudioOptions livekitIngress$IngressAudioOptions) {
        livekitIngress$IngressAudioOptions.getClass();
        this.audio_ = livekitIngress$IngressAudioOptions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBypassTranscoding(boolean z10) {
        this.bypassTranscoding_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInputType(W0 w02) {
        this.inputType_ = w02.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInputTypeValue(int i10) {
        this.inputType_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.name_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantIdentity(String str) {
        str.getClass();
        this.participantIdentity_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantIdentityBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.participantIdentity_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantName(String str) {
        str.getClass();
        this.participantName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantNameBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.participantName_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomName(String str) {
        str.getClass();
        this.roomName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomNameBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.roomName_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.url_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideo(LivekitIngress$IngressVideoOptions livekitIngress$IngressVideoOptions) {
        livekitIngress$IngressVideoOptions.getClass();
        this.video_ = livekitIngress$IngressVideoOptions;
    }

    /* JADX WARN: Type inference failed for: r2v15, types: [com.google.protobuf.a1, java.lang.Object] */
    @Override // com.google.protobuf.AbstractC2497d0
    public final Object dynamicMethod(EnumC2494c0 enumC2494c0, Object obj, Object obj2) {
        switch (enumC2494c0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\f\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\t\u0007\t\b\u0007\t\u0208", new Object[]{"inputType_", "name_", "roomName_", "participantIdentity_", "participantName_", "audio_", "video_", "bypassTranscoding_", "url_"});
            case 3:
                return new LivekitIngress$CreateIngressRequest();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitIngress$CreateIngressRequest.class) {
                        try {
                            AbstractC2489a1 abstractC2489a13 = PARSER;
                            AbstractC2489a1 abstractC2489a14 = abstractC2489a13;
                            if (abstractC2489a13 == null) {
                                ?? obj3 = new Object();
                                PARSER = obj3;
                                abstractC2489a14 = obj3;
                            }
                        } finally {
                        }
                    }
                }
                return abstractC2489a12;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public LivekitIngress$IngressAudioOptions getAudio() {
        LivekitIngress$IngressAudioOptions livekitIngress$IngressAudioOptions = this.audio_;
        if (livekitIngress$IngressAudioOptions == null) {
            return LivekitIngress$IngressAudioOptions.getDefaultInstance();
        }
        return livekitIngress$IngressAudioOptions;
    }

    public boolean getBypassTranscoding() {
        return this.bypassTranscoding_;
    }

    public W0 getInputType() {
        W0 b10 = W0.b(this.inputType_);
        if (b10 == null) {
            return W0.UNRECOGNIZED;
        }
        return b10;
    }

    public int getInputTypeValue() {
        return this.inputType_;
    }

    public String getName() {
        return this.name_;
    }

    public AbstractC2534q getNameBytes() {
        return AbstractC2534q.y(this.name_);
    }

    public String getParticipantIdentity() {
        return this.participantIdentity_;
    }

    public AbstractC2534q getParticipantIdentityBytes() {
        return AbstractC2534q.y(this.participantIdentity_);
    }

    public String getParticipantName() {
        return this.participantName_;
    }

    public AbstractC2534q getParticipantNameBytes() {
        return AbstractC2534q.y(this.participantName_);
    }

    public String getRoomName() {
        return this.roomName_;
    }

    public AbstractC2534q getRoomNameBytes() {
        return AbstractC2534q.y(this.roomName_);
    }

    public String getUrl() {
        return this.url_;
    }

    public AbstractC2534q getUrlBytes() {
        return AbstractC2534q.y(this.url_);
    }

    public LivekitIngress$IngressVideoOptions getVideo() {
        LivekitIngress$IngressVideoOptions livekitIngress$IngressVideoOptions = this.video_;
        if (livekitIngress$IngressVideoOptions == null) {
            return LivekitIngress$IngressVideoOptions.getDefaultInstance();
        }
        return livekitIngress$IngressVideoOptions;
    }

    public boolean hasAudio() {
        if (this.audio_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasVideo() {
        if (this.video_ != null) {
            return true;
        }
        return false;
    }

    public static O0 newBuilder(LivekitIngress$CreateIngressRequest livekitIngress$CreateIngressRequest) {
        return (O0) DEFAULT_INSTANCE.createBuilder(livekitIngress$CreateIngressRequest);
    }

    public static LivekitIngress$CreateIngressRequest parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitIngress$CreateIngressRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitIngress$CreateIngressRequest parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitIngress$CreateIngressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitIngress$CreateIngressRequest parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitIngress$CreateIngressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitIngress$CreateIngressRequest parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitIngress$CreateIngressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitIngress$CreateIngressRequest parseFrom(byte[] bArr) {
        return (LivekitIngress$CreateIngressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitIngress$CreateIngressRequest parseFrom(byte[] bArr, J j6) {
        return (LivekitIngress$CreateIngressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitIngress$CreateIngressRequest parseFrom(InputStream inputStream) {
        return (LivekitIngress$CreateIngressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$CreateIngressRequest parseFrom(InputStream inputStream, J j6) {
        return (LivekitIngress$CreateIngressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitIngress$CreateIngressRequest parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitIngress$CreateIngressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitIngress$CreateIngressRequest parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitIngress$CreateIngressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
