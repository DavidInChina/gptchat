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
import jh.AbstractC4007e3;
import jh.C4012f3;

/* loaded from: classes2.dex */
public final class LivekitRtc$RegionSettings extends AbstractC2497d0 implements N0 {
    private static final LivekitRtc$RegionSettings DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int REGIONS_FIELD_NUMBER = 1;
    private AbstractC2535q0 regions_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitRtc$RegionSettings livekitRtc$RegionSettings = new LivekitRtc$RegionSettings();
        DEFAULT_INSTANCE = livekitRtc$RegionSettings;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$RegionSettings.class, livekitRtc$RegionSettings);
    }

    private LivekitRtc$RegionSettings() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRegions(Iterable<? extends LivekitRtc$RegionInfo> iterable) {
        ensureRegionsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.regions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRegions(LivekitRtc$RegionInfo livekitRtc$RegionInfo) {
        livekitRtc$RegionInfo.getClass();
        ensureRegionsIsMutable();
        this.regions_.add(livekitRtc$RegionInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegions() {
        this.regions_ = AbstractC2497d0.emptyProtobufList();
    }

    private void ensureRegionsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.regions_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.regions_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitRtc$RegionSettings getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4012f3 newBuilder() {
        return (C4012f3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$RegionSettings parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$RegionSettings) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$RegionSettings parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$RegionSettings) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRegions(int i10) {
        ensureRegionsIsMutable();
        this.regions_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegions(int i10, LivekitRtc$RegionInfo livekitRtc$RegionInfo) {
        livekitRtc$RegionInfo.getClass();
        ensureRegionsIsMutable();
        this.regions_.set(i10, livekitRtc$RegionInfo);
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"regions_", LivekitRtc$RegionInfo.class});
            case 3:
                return new LivekitRtc$RegionSettings();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$RegionSettings.class) {
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

    public LivekitRtc$RegionInfo getRegions(int i10) {
        return (LivekitRtc$RegionInfo) this.regions_.get(i10);
    }

    public int getRegionsCount() {
        return this.regions_.size();
    }

    public List<LivekitRtc$RegionInfo> getRegionsList() {
        return this.regions_;
    }

    public AbstractC4007e3 getRegionsOrBuilder(int i10) {
        return (AbstractC4007e3) this.regions_.get(i10);
    }

    public List<? extends AbstractC4007e3> getRegionsOrBuilderList() {
        return this.regions_;
    }

    public static C4012f3 newBuilder(LivekitRtc$RegionSettings livekitRtc$RegionSettings) {
        return (C4012f3) DEFAULT_INSTANCE.createBuilder(livekitRtc$RegionSettings);
    }

    public static LivekitRtc$RegionSettings parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$RegionSettings) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$RegionSettings parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$RegionSettings) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$RegionSettings parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$RegionSettings) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRegions(int i10, LivekitRtc$RegionInfo livekitRtc$RegionInfo) {
        livekitRtc$RegionInfo.getClass();
        ensureRegionsIsMutable();
        this.regions_.add(i10, livekitRtc$RegionInfo);
    }

    public static LivekitRtc$RegionSettings parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$RegionSettings) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$RegionSettings parseFrom(byte[] bArr) {
        return (LivekitRtc$RegionSettings) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$RegionSettings parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$RegionSettings) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$RegionSettings parseFrom(InputStream inputStream) {
        return (LivekitRtc$RegionSettings) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$RegionSettings parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$RegionSettings) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$RegionSettings parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$RegionSettings) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$RegionSettings parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$RegionSettings) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
