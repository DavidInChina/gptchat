package livekit;

import com.google.protobuf.AbstractC2489a1;
import com.google.protobuf.AbstractC2493c;
import com.google.protobuf.AbstractC2497d0;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2543v;
import com.google.protobuf.EnumC2494c0;
import com.google.protobuf.J;
import com.google.protobuf.X;
import java.io.InputStream;
import java.nio.ByteBuffer;
import jh.A0;
import jh.C4098x0;
import jh.EnumC4103y0;

/* loaded from: classes2.dex */
public final class LivekitEgress$StreamInfo extends AbstractC2497d0 implements A0 {
    private static final LivekitEgress$StreamInfo DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 4;
    public static final int ENDED_AT_FIELD_NUMBER = 3;
    public static final int ERROR_FIELD_NUMBER = 6;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int STARTED_AT_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 5;
    public static final int URL_FIELD_NUMBER = 1;
    private long duration_;
    private long endedAt_;
    private long startedAt_;
    private int status_;
    private String url_ = "";
    private String error_ = "";

    static {
        LivekitEgress$StreamInfo livekitEgress$StreamInfo = new LivekitEgress$StreamInfo();
        DEFAULT_INSTANCE = livekitEgress$StreamInfo;
        AbstractC2497d0.registerDefaultInstance(LivekitEgress$StreamInfo.class, livekitEgress$StreamInfo);
    }

    private LivekitEgress$StreamInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndedAt() {
        this.endedAt_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearError() {
        this.error_ = getDefaultInstance().getError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartedAt() {
        this.startedAt_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static LivekitEgress$StreamInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4098x0 newBuilder() {
        return (C4098x0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$StreamInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$StreamInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$StreamInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$StreamInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(long j6) {
        this.duration_ = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndedAt(long j6) {
        this.endedAt_ = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setError(String str) {
        str.getClass();
        this.error_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.error_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartedAt(long j6) {
        this.startedAt_ = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(EnumC4103y0 enumC4103y0) {
        this.status_ = enumC4103y0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusValue(int i10) {
        this.status_ = i10;
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

    /* JADX WARN: Type inference failed for: r2v15, types: [com.google.protobuf.a1, java.lang.Object] */
    @Override // com.google.protobuf.AbstractC2497d0
    public final Object dynamicMethod(EnumC2494c0 enumC2494c0, Object obj, Object obj2) {
        switch (enumC2494c0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0002\u0003\u0002\u0004\u0002\u0005\f\u0006\u0208", new Object[]{"url_", "startedAt_", "endedAt_", "duration_", "status_", "error_"});
            case 3:
                return new LivekitEgress$StreamInfo();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitEgress$StreamInfo.class) {
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

    public long getDuration() {
        return this.duration_;
    }

    public long getEndedAt() {
        return this.endedAt_;
    }

    public String getError() {
        return this.error_;
    }

    public AbstractC2534q getErrorBytes() {
        return AbstractC2534q.y(this.error_);
    }

    public long getStartedAt() {
        return this.startedAt_;
    }

    public EnumC4103y0 getStatus() {
        EnumC4103y0 enumC4103y0;
        int i10 = this.status_;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    enumC4103y0 = null;
                } else {
                    enumC4103y0 = EnumC4103y0.FAILED;
                }
            } else {
                enumC4103y0 = EnumC4103y0.FINISHED;
            }
        } else {
            enumC4103y0 = EnumC4103y0.ACTIVE;
        }
        if (enumC4103y0 == null) {
            return EnumC4103y0.UNRECOGNIZED;
        }
        return enumC4103y0;
    }

    public int getStatusValue() {
        return this.status_;
    }

    public String getUrl() {
        return this.url_;
    }

    public AbstractC2534q getUrlBytes() {
        return AbstractC2534q.y(this.url_);
    }

    public static C4098x0 newBuilder(LivekitEgress$StreamInfo livekitEgress$StreamInfo) {
        return (C4098x0) DEFAULT_INSTANCE.createBuilder(livekitEgress$StreamInfo);
    }

    public static LivekitEgress$StreamInfo parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$StreamInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$StreamInfo parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitEgress$StreamInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitEgress$StreamInfo parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitEgress$StreamInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitEgress$StreamInfo parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitEgress$StreamInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitEgress$StreamInfo parseFrom(byte[] bArr) {
        return (LivekitEgress$StreamInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$StreamInfo parseFrom(byte[] bArr, J j6) {
        return (LivekitEgress$StreamInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitEgress$StreamInfo parseFrom(InputStream inputStream) {
        return (LivekitEgress$StreamInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$StreamInfo parseFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$StreamInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$StreamInfo parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitEgress$StreamInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitEgress$StreamInfo parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitEgress$StreamInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
