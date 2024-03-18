package livekit;

import com.google.protobuf.AbstractC2489a1;
import com.google.protobuf.AbstractC2497d0;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2543v;
import com.google.protobuf.EnumC2494c0;
import com.google.protobuf.J;
import com.google.protobuf.N0;
import com.google.protobuf.X;
import java.io.InputStream;
import java.nio.ByteBuffer;
import jh.C4041l2;
import jh.D2;

/* loaded from: classes.dex */
public final class LivekitRoom$MuteRoomTrackResponse extends AbstractC2497d0 implements N0 {
    private static final LivekitRoom$MuteRoomTrackResponse DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int TRACK_FIELD_NUMBER = 1;
    private LivekitModels$TrackInfo track_;

    static {
        LivekitRoom$MuteRoomTrackResponse livekitRoom$MuteRoomTrackResponse = new LivekitRoom$MuteRoomTrackResponse();
        DEFAULT_INSTANCE = livekitRoom$MuteRoomTrackResponse;
        AbstractC2497d0.registerDefaultInstance(LivekitRoom$MuteRoomTrackResponse.class, livekitRoom$MuteRoomTrackResponse);
    }

    private LivekitRoom$MuteRoomTrackResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrack() {
        this.track_ = null;
    }

    public static LivekitRoom$MuteRoomTrackResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrack(LivekitModels$TrackInfo livekitModels$TrackInfo) {
        livekitModels$TrackInfo.getClass();
        LivekitModels$TrackInfo livekitModels$TrackInfo2 = this.track_;
        if (livekitModels$TrackInfo2 != null && livekitModels$TrackInfo2 != LivekitModels$TrackInfo.getDefaultInstance()) {
            C4041l2 newBuilder = LivekitModels$TrackInfo.newBuilder(this.track_);
            newBuilder.f(livekitModels$TrackInfo);
            this.track_ = (LivekitModels$TrackInfo) newBuilder.c();
            return;
        }
        this.track_ = livekitModels$TrackInfo;
    }

    public static D2 newBuilder() {
        return (D2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRoom$MuteRoomTrackResponse parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRoom$MuteRoomTrackResponse) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$MuteRoomTrackResponse parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRoom$MuteRoomTrackResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrack(LivekitModels$TrackInfo livekitModels$TrackInfo) {
        livekitModels$TrackInfo.getClass();
        this.track_ = livekitModels$TrackInfo;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [com.google.protobuf.a1, java.lang.Object] */
    @Override // com.google.protobuf.AbstractC2497d0
    public final Object dynamicMethod(EnumC2494c0 enumC2494c0, Object obj, Object obj2) {
        switch (enumC2494c0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"track_"});
            case 3:
                return new LivekitRoom$MuteRoomTrackResponse();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRoom$MuteRoomTrackResponse.class) {
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

    public LivekitModels$TrackInfo getTrack() {
        LivekitModels$TrackInfo livekitModels$TrackInfo = this.track_;
        if (livekitModels$TrackInfo == null) {
            return LivekitModels$TrackInfo.getDefaultInstance();
        }
        return livekitModels$TrackInfo;
    }

    public boolean hasTrack() {
        if (this.track_ != null) {
            return true;
        }
        return false;
    }

    public static D2 newBuilder(LivekitRoom$MuteRoomTrackResponse livekitRoom$MuteRoomTrackResponse) {
        return (D2) DEFAULT_INSTANCE.createBuilder(livekitRoom$MuteRoomTrackResponse);
    }

    public static LivekitRoom$MuteRoomTrackResponse parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRoom$MuteRoomTrackResponse) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRoom$MuteRoomTrackResponse parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRoom$MuteRoomTrackResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRoom$MuteRoomTrackResponse parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRoom$MuteRoomTrackResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRoom$MuteRoomTrackResponse parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRoom$MuteRoomTrackResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRoom$MuteRoomTrackResponse parseFrom(byte[] bArr) {
        return (LivekitRoom$MuteRoomTrackResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRoom$MuteRoomTrackResponse parseFrom(byte[] bArr, J j6) {
        return (LivekitRoom$MuteRoomTrackResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRoom$MuteRoomTrackResponse parseFrom(InputStream inputStream) {
        return (LivekitRoom$MuteRoomTrackResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$MuteRoomTrackResponse parseFrom(InputStream inputStream, J j6) {
        return (LivekitRoom$MuteRoomTrackResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRoom$MuteRoomTrackResponse parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRoom$MuteRoomTrackResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRoom$MuteRoomTrackResponse parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRoom$MuteRoomTrackResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
