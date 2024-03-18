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
import jh.C3982J;
import jh.H0;
import jh.I0;

/* loaded from: classes2.dex */
public final class LivekitEgress$TrackEgressRequest extends AbstractC2497d0 implements N0 {
    private static final LivekitEgress$TrackEgressRequest DEFAULT_INSTANCE;
    public static final int FILE_FIELD_NUMBER = 3;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int ROOM_NAME_FIELD_NUMBER = 1;
    public static final int TRACK_ID_FIELD_NUMBER = 2;
    public static final int WEBSOCKET_URL_FIELD_NUMBER = 4;
    private Object output_;
    private int outputCase_ = 0;
    private String roomName_ = "";
    private String trackId_ = "";

    static {
        LivekitEgress$TrackEgressRequest livekitEgress$TrackEgressRequest = new LivekitEgress$TrackEgressRequest();
        DEFAULT_INSTANCE = livekitEgress$TrackEgressRequest;
        AbstractC2497d0.registerDefaultInstance(LivekitEgress$TrackEgressRequest.class, livekitEgress$TrackEgressRequest);
    }

    private LivekitEgress$TrackEgressRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFile() {
        if (this.outputCase_ == 3) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOutput() {
        this.outputCase_ = 0;
        this.output_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomName() {
        this.roomName_ = getDefaultInstance().getRoomName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackId() {
        this.trackId_ = getDefaultInstance().getTrackId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWebsocketUrl() {
        if (this.outputCase_ == 4) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    public static LivekitEgress$TrackEgressRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFile(LivekitEgress$DirectFileOutput livekitEgress$DirectFileOutput) {
        livekitEgress$DirectFileOutput.getClass();
        if (this.outputCase_ == 3 && this.output_ != LivekitEgress$DirectFileOutput.getDefaultInstance()) {
            C3982J newBuilder = LivekitEgress$DirectFileOutput.newBuilder((LivekitEgress$DirectFileOutput) this.output_);
            newBuilder.f(livekitEgress$DirectFileOutput);
            this.output_ = newBuilder.c();
        } else {
            this.output_ = livekitEgress$DirectFileOutput;
        }
        this.outputCase_ = 3;
    }

    public static H0 newBuilder() {
        return (H0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$TrackEgressRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$TrackEgressRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$TrackEgressRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$TrackEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFile(LivekitEgress$DirectFileOutput livekitEgress$DirectFileOutput) {
        livekitEgress$DirectFileOutput.getClass();
        this.output_ = livekitEgress$DirectFileOutput;
        this.outputCase_ = 3;
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
    public void setTrackId(String str) {
        str.getClass();
        this.trackId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackIdBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.trackId_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebsocketUrl(String str) {
        str.getClass();
        this.outputCase_ = 4;
        this.output_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebsocketUrlBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.output_ = abstractC2534q.q0();
        this.outputCase_ = 4;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003<\u0000\u0004\u023b\u0000", new Object[]{"output_", "outputCase_", "roomName_", "trackId_", LivekitEgress$DirectFileOutput.class});
            case 3:
                return new LivekitEgress$TrackEgressRequest();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitEgress$TrackEgressRequest.class) {
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

    public LivekitEgress$DirectFileOutput getFile() {
        if (this.outputCase_ == 3) {
            return (LivekitEgress$DirectFileOutput) this.output_;
        }
        return LivekitEgress$DirectFileOutput.getDefaultInstance();
    }

    public I0 getOutputCase() {
        int i10 = this.outputCase_;
        if (i10 != 0) {
            if (i10 != 3) {
                if (i10 != 4) {
                    return null;
                }
                return I0.f36246Z;
            }
            return I0.f36245Y;
        }
        return I0.f36247h0;
    }

    public String getRoomName() {
        return this.roomName_;
    }

    public AbstractC2534q getRoomNameBytes() {
        return AbstractC2534q.y(this.roomName_);
    }

    public String getTrackId() {
        return this.trackId_;
    }

    public AbstractC2534q getTrackIdBytes() {
        return AbstractC2534q.y(this.trackId_);
    }

    public String getWebsocketUrl() {
        if (this.outputCase_ == 4) {
            return (String) this.output_;
        }
        return "";
    }

    public AbstractC2534q getWebsocketUrlBytes() {
        String str;
        if (this.outputCase_ == 4) {
            str = (String) this.output_;
        } else {
            str = "";
        }
        return AbstractC2534q.y(str);
    }

    public boolean hasFile() {
        if (this.outputCase_ == 3) {
            return true;
        }
        return false;
    }

    public boolean hasWebsocketUrl() {
        if (this.outputCase_ == 4) {
            return true;
        }
        return false;
    }

    public static H0 newBuilder(LivekitEgress$TrackEgressRequest livekitEgress$TrackEgressRequest) {
        return (H0) DEFAULT_INSTANCE.createBuilder(livekitEgress$TrackEgressRequest);
    }

    public static LivekitEgress$TrackEgressRequest parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$TrackEgressRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$TrackEgressRequest parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitEgress$TrackEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitEgress$TrackEgressRequest parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitEgress$TrackEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitEgress$TrackEgressRequest parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitEgress$TrackEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitEgress$TrackEgressRequest parseFrom(byte[] bArr) {
        return (LivekitEgress$TrackEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$TrackEgressRequest parseFrom(byte[] bArr, J j6) {
        return (LivekitEgress$TrackEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitEgress$TrackEgressRequest parseFrom(InputStream inputStream) {
        return (LivekitEgress$TrackEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$TrackEgressRequest parseFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$TrackEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$TrackEgressRequest parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitEgress$TrackEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitEgress$TrackEgressRequest parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitEgress$TrackEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
