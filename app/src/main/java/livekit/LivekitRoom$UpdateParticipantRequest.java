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
import jh.J2;
import jh.T1;

/* loaded from: classes2.dex */
public final class LivekitRoom$UpdateParticipantRequest extends AbstractC2497d0 implements N0 {
    private static final LivekitRoom$UpdateParticipantRequest DEFAULT_INSTANCE;
    public static final int IDENTITY_FIELD_NUMBER = 2;
    public static final int METADATA_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 5;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 4;
    public static final int ROOM_FIELD_NUMBER = 1;
    private LivekitModels$ParticipantPermission permission_;
    private String room_ = "";
    private String identity_ = "";
    private String metadata_ = "";
    private String name_ = "";

    static {
        LivekitRoom$UpdateParticipantRequest livekitRoom$UpdateParticipantRequest = new LivekitRoom$UpdateParticipantRequest();
        DEFAULT_INSTANCE = livekitRoom$UpdateParticipantRequest;
        AbstractC2497d0.registerDefaultInstance(LivekitRoom$UpdateParticipantRequest.class, livekitRoom$UpdateParticipantRequest);
    }

    private LivekitRoom$UpdateParticipantRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdentity() {
        this.identity_ = getDefaultInstance().getIdentity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = getDefaultInstance().getMetadata();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPermission() {
        this.permission_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoom() {
        this.room_ = getDefaultInstance().getRoom();
    }

    public static LivekitRoom$UpdateParticipantRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePermission(LivekitModels$ParticipantPermission livekitModels$ParticipantPermission) {
        livekitModels$ParticipantPermission.getClass();
        LivekitModels$ParticipantPermission livekitModels$ParticipantPermission2 = this.permission_;
        if (livekitModels$ParticipantPermission2 != null && livekitModels$ParticipantPermission2 != LivekitModels$ParticipantPermission.getDefaultInstance()) {
            T1 newBuilder = LivekitModels$ParticipantPermission.newBuilder(this.permission_);
            newBuilder.f(livekitModels$ParticipantPermission);
            this.permission_ = (LivekitModels$ParticipantPermission) newBuilder.c();
            return;
        }
        this.permission_ = livekitModels$ParticipantPermission;
    }

    public static J2 newBuilder() {
        return (J2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRoom$UpdateParticipantRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRoom$UpdateParticipantRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$UpdateParticipantRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRoom$UpdateParticipantRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentity(String str) {
        str.getClass();
        this.identity_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentityBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.identity_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(String str) {
        str.getClass();
        this.metadata_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadataBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.metadata_ = abstractC2534q.q0();
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
    public void setPermission(LivekitModels$ParticipantPermission livekitModels$ParticipantPermission) {
        livekitModels$ParticipantPermission.getClass();
        this.permission_ = livekitModels$ParticipantPermission;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoom(String str) {
        str.getClass();
        this.room_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.room_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\t\u0005\u0208", new Object[]{"room_", "identity_", "metadata_", "permission_", "name_"});
            case 3:
                return new LivekitRoom$UpdateParticipantRequest();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRoom$UpdateParticipantRequest.class) {
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

    public String getIdentity() {
        return this.identity_;
    }

    public AbstractC2534q getIdentityBytes() {
        return AbstractC2534q.y(this.identity_);
    }

    public String getMetadata() {
        return this.metadata_;
    }

    public AbstractC2534q getMetadataBytes() {
        return AbstractC2534q.y(this.metadata_);
    }

    public String getName() {
        return this.name_;
    }

    public AbstractC2534q getNameBytes() {
        return AbstractC2534q.y(this.name_);
    }

    public LivekitModels$ParticipantPermission getPermission() {
        LivekitModels$ParticipantPermission livekitModels$ParticipantPermission = this.permission_;
        if (livekitModels$ParticipantPermission == null) {
            return LivekitModels$ParticipantPermission.getDefaultInstance();
        }
        return livekitModels$ParticipantPermission;
    }

    public String getRoom() {
        return this.room_;
    }

    public AbstractC2534q getRoomBytes() {
        return AbstractC2534q.y(this.room_);
    }

    public boolean hasPermission() {
        if (this.permission_ != null) {
            return true;
        }
        return false;
    }

    public static J2 newBuilder(LivekitRoom$UpdateParticipantRequest livekitRoom$UpdateParticipantRequest) {
        return (J2) DEFAULT_INSTANCE.createBuilder(livekitRoom$UpdateParticipantRequest);
    }

    public static LivekitRoom$UpdateParticipantRequest parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRoom$UpdateParticipantRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRoom$UpdateParticipantRequest parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRoom$UpdateParticipantRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRoom$UpdateParticipantRequest parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRoom$UpdateParticipantRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRoom$UpdateParticipantRequest parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRoom$UpdateParticipantRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRoom$UpdateParticipantRequest parseFrom(byte[] bArr) {
        return (LivekitRoom$UpdateParticipantRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRoom$UpdateParticipantRequest parseFrom(byte[] bArr, J j6) {
        return (LivekitRoom$UpdateParticipantRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRoom$UpdateParticipantRequest parseFrom(InputStream inputStream) {
        return (LivekitRoom$UpdateParticipantRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$UpdateParticipantRequest parseFrom(InputStream inputStream, J j6) {
        return (LivekitRoom$UpdateParticipantRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRoom$UpdateParticipantRequest parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRoom$UpdateParticipantRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRoom$UpdateParticipantRequest parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRoom$UpdateParticipantRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
