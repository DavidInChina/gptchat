package livekit;

import com.google.protobuf.AbstractC2489a1;
import com.google.protobuf.AbstractC2493c;
import com.google.protobuf.AbstractC2496d;
import com.google.protobuf.AbstractC2497d0;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2535q0;
import com.google.protobuf.AbstractC2543v;
import com.google.protobuf.EnumC2494c0;
import com.google.protobuf.J;
import com.google.protobuf.N0;
import com.google.protobuf.X;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import jh.B3;
import jh.G3;

/* loaded from: classes2.dex */
public final class LivekitRtc$SubscriptionPermission extends AbstractC2497d0 implements N0 {
    public static final int ALL_PARTICIPANTS_FIELD_NUMBER = 1;
    private static final LivekitRtc$SubscriptionPermission DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int TRACK_PERMISSIONS_FIELD_NUMBER = 2;
    private boolean allParticipants_;
    private AbstractC2535q0 trackPermissions_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitRtc$SubscriptionPermission livekitRtc$SubscriptionPermission = new LivekitRtc$SubscriptionPermission();
        DEFAULT_INSTANCE = livekitRtc$SubscriptionPermission;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$SubscriptionPermission.class, livekitRtc$SubscriptionPermission);
    }

    private LivekitRtc$SubscriptionPermission() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTrackPermissions(Iterable<? extends LivekitRtc$TrackPermission> iterable) {
        ensureTrackPermissionsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.trackPermissions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrackPermissions(LivekitRtc$TrackPermission livekitRtc$TrackPermission) {
        livekitRtc$TrackPermission.getClass();
        ensureTrackPermissionsIsMutable();
        this.trackPermissions_.add(livekitRtc$TrackPermission);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllParticipants() {
        this.allParticipants_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackPermissions() {
        this.trackPermissions_ = AbstractC2497d0.emptyProtobufList();
    }

    private void ensureTrackPermissionsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.trackPermissions_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.trackPermissions_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitRtc$SubscriptionPermission getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static B3 newBuilder() {
        return (B3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$SubscriptionPermission parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$SubscriptionPermission) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SubscriptionPermission parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$SubscriptionPermission) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTrackPermissions(int i10) {
        ensureTrackPermissionsIsMutable();
        this.trackPermissions_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllParticipants(boolean z10) {
        this.allParticipants_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackPermissions(int i10, LivekitRtc$TrackPermission livekitRtc$TrackPermission) {
        livekitRtc$TrackPermission.getClass();
        ensureTrackPermissionsIsMutable();
        this.trackPermissions_.set(i10, livekitRtc$TrackPermission);
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0007\u0002\u001b", new Object[]{"allParticipants_", "trackPermissions_", LivekitRtc$TrackPermission.class});
            case 3:
                return new LivekitRtc$SubscriptionPermission();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$SubscriptionPermission.class) {
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

    public boolean getAllParticipants() {
        return this.allParticipants_;
    }

    public LivekitRtc$TrackPermission getTrackPermissions(int i10) {
        return (LivekitRtc$TrackPermission) this.trackPermissions_.get(i10);
    }

    public int getTrackPermissionsCount() {
        return this.trackPermissions_.size();
    }

    public List<LivekitRtc$TrackPermission> getTrackPermissionsList() {
        return this.trackPermissions_;
    }

    public G3 getTrackPermissionsOrBuilder(int i10) {
        return (G3) this.trackPermissions_.get(i10);
    }

    public List<? extends G3> getTrackPermissionsOrBuilderList() {
        return this.trackPermissions_;
    }

    public static B3 newBuilder(LivekitRtc$SubscriptionPermission livekitRtc$SubscriptionPermission) {
        return (B3) DEFAULT_INSTANCE.createBuilder(livekitRtc$SubscriptionPermission);
    }

    public static LivekitRtc$SubscriptionPermission parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$SubscriptionPermission) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$SubscriptionPermission parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$SubscriptionPermission) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$SubscriptionPermission parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$SubscriptionPermission) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrackPermissions(int i10, LivekitRtc$TrackPermission livekitRtc$TrackPermission) {
        livekitRtc$TrackPermission.getClass();
        ensureTrackPermissionsIsMutable();
        this.trackPermissions_.add(i10, livekitRtc$TrackPermission);
    }

    public static LivekitRtc$SubscriptionPermission parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$SubscriptionPermission) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$SubscriptionPermission parseFrom(byte[] bArr) {
        return (LivekitRtc$SubscriptionPermission) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$SubscriptionPermission parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$SubscriptionPermission) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$SubscriptionPermission parseFrom(InputStream inputStream) {
        return (LivekitRtc$SubscriptionPermission) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SubscriptionPermission parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$SubscriptionPermission) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$SubscriptionPermission parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$SubscriptionPermission) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$SubscriptionPermission parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$SubscriptionPermission) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
