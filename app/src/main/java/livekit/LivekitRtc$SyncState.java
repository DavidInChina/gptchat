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
import jh.C4022h3;
import jh.E3;
import jh.I3;
import jh.M3;
import jh.T2;

/* loaded from: classes2.dex */
public final class LivekitRtc$SyncState extends AbstractC2497d0 implements N0 {
    public static final int ANSWER_FIELD_NUMBER = 1;
    public static final int DATA_CHANNELS_FIELD_NUMBER = 4;
    private static final LivekitRtc$SyncState DEFAULT_INSTANCE;
    public static final int OFFER_FIELD_NUMBER = 5;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PUBLISH_TRACKS_FIELD_NUMBER = 3;
    public static final int SUBSCRIPTION_FIELD_NUMBER = 2;
    private LivekitRtc$SessionDescription answer_;
    private LivekitRtc$SessionDescription offer_;
    private LivekitRtc$UpdateSubscription subscription_;
    private AbstractC2535q0 publishTracks_ = AbstractC2497d0.emptyProtobufList();
    private AbstractC2535q0 dataChannels_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitRtc$SyncState livekitRtc$SyncState = new LivekitRtc$SyncState();
        DEFAULT_INSTANCE = livekitRtc$SyncState;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$SyncState.class, livekitRtc$SyncState);
    }

    private LivekitRtc$SyncState() {
    }

    public static /* synthetic */ void access$45700(LivekitRtc$SyncState livekitRtc$SyncState, LivekitRtc$SessionDescription livekitRtc$SessionDescription) {
        livekitRtc$SyncState.setAnswer(livekitRtc$SessionDescription);
    }

    public static /* synthetic */ void access$46000(LivekitRtc$SyncState livekitRtc$SyncState, LivekitRtc$UpdateSubscription livekitRtc$UpdateSubscription) {
        livekitRtc$SyncState.setSubscription(livekitRtc$UpdateSubscription);
    }

    public static /* synthetic */ void access$46600(LivekitRtc$SyncState livekitRtc$SyncState, Iterable iterable) {
        livekitRtc$SyncState.addAllPublishTracks(iterable);
    }

    public static /* synthetic */ void access$47200(LivekitRtc$SyncState livekitRtc$SyncState, Iterable iterable) {
        livekitRtc$SyncState.addAllDataChannels(iterable);
    }

    public void addAllDataChannels(Iterable<? extends LivekitRtc$DataChannelInfo> iterable) {
        ensureDataChannelsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.dataChannels_);
    }

    public void addAllPublishTracks(Iterable<? extends LivekitRtc$TrackPublishedResponse> iterable) {
        ensurePublishTracksIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.publishTracks_);
    }

    public void addDataChannels(LivekitRtc$DataChannelInfo livekitRtc$DataChannelInfo) {
        livekitRtc$DataChannelInfo.getClass();
        ensureDataChannelsIsMutable();
        this.dataChannels_.add(livekitRtc$DataChannelInfo);
    }

    public void addPublishTracks(LivekitRtc$TrackPublishedResponse livekitRtc$TrackPublishedResponse) {
        livekitRtc$TrackPublishedResponse.getClass();
        ensurePublishTracksIsMutable();
        this.publishTracks_.add(livekitRtc$TrackPublishedResponse);
    }

    public void clearAnswer() {
        this.answer_ = null;
    }

    public void clearDataChannels() {
        this.dataChannels_ = AbstractC2497d0.emptyProtobufList();
    }

    public void clearOffer() {
        this.offer_ = null;
    }

    public void clearPublishTracks() {
        this.publishTracks_ = AbstractC2497d0.emptyProtobufList();
    }

    public void clearSubscription() {
        this.subscription_ = null;
    }

    private void ensureDataChannelsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.dataChannels_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.dataChannels_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    private void ensurePublishTracksIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.publishTracks_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.publishTracks_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitRtc$SyncState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeAnswer(LivekitRtc$SessionDescription livekitRtc$SessionDescription) {
        livekitRtc$SessionDescription.getClass();
        LivekitRtc$SessionDescription livekitRtc$SessionDescription2 = this.answer_;
        if (livekitRtc$SessionDescription2 != null && livekitRtc$SessionDescription2 != LivekitRtc$SessionDescription.getDefaultInstance()) {
            C4022h3 newBuilder = LivekitRtc$SessionDescription.newBuilder(this.answer_);
            newBuilder.f(livekitRtc$SessionDescription);
            this.answer_ = (LivekitRtc$SessionDescription) newBuilder.c();
            return;
        }
        this.answer_ = livekitRtc$SessionDescription;
    }

    public void mergeOffer(LivekitRtc$SessionDescription livekitRtc$SessionDescription) {
        livekitRtc$SessionDescription.getClass();
        LivekitRtc$SessionDescription livekitRtc$SessionDescription2 = this.offer_;
        if (livekitRtc$SessionDescription2 != null && livekitRtc$SessionDescription2 != LivekitRtc$SessionDescription.getDefaultInstance()) {
            C4022h3 newBuilder = LivekitRtc$SessionDescription.newBuilder(this.offer_);
            newBuilder.f(livekitRtc$SessionDescription);
            this.offer_ = (LivekitRtc$SessionDescription) newBuilder.c();
            return;
        }
        this.offer_ = livekitRtc$SessionDescription;
    }

    public void mergeSubscription(LivekitRtc$UpdateSubscription livekitRtc$UpdateSubscription) {
        livekitRtc$UpdateSubscription.getClass();
        LivekitRtc$UpdateSubscription livekitRtc$UpdateSubscription2 = this.subscription_;
        if (livekitRtc$UpdateSubscription2 != null && livekitRtc$UpdateSubscription2 != LivekitRtc$UpdateSubscription.getDefaultInstance()) {
            M3 newBuilder = LivekitRtc$UpdateSubscription.newBuilder(this.subscription_);
            newBuilder.f(livekitRtc$UpdateSubscription);
            this.subscription_ = (LivekitRtc$UpdateSubscription) newBuilder.c();
            return;
        }
        this.subscription_ = livekitRtc$UpdateSubscription;
    }

    public static E3 newBuilder() {
        return (E3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$SyncState parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$SyncState) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SyncState parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$SyncState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeDataChannels(int i10) {
        ensureDataChannelsIsMutable();
        this.dataChannels_.remove(i10);
    }

    public void removePublishTracks(int i10) {
        ensurePublishTracksIsMutable();
        this.publishTracks_.remove(i10);
    }

    public void setAnswer(LivekitRtc$SessionDescription livekitRtc$SessionDescription) {
        livekitRtc$SessionDescription.getClass();
        this.answer_ = livekitRtc$SessionDescription;
    }

    public void setDataChannels(int i10, LivekitRtc$DataChannelInfo livekitRtc$DataChannelInfo) {
        livekitRtc$DataChannelInfo.getClass();
        ensureDataChannelsIsMutable();
        this.dataChannels_.set(i10, livekitRtc$DataChannelInfo);
    }

    public void setOffer(LivekitRtc$SessionDescription livekitRtc$SessionDescription) {
        livekitRtc$SessionDescription.getClass();
        this.offer_ = livekitRtc$SessionDescription;
    }

    public void setPublishTracks(int i10, LivekitRtc$TrackPublishedResponse livekitRtc$TrackPublishedResponse) {
        livekitRtc$TrackPublishedResponse.getClass();
        ensurePublishTracksIsMutable();
        this.publishTracks_.set(i10, livekitRtc$TrackPublishedResponse);
    }

    public void setSubscription(LivekitRtc$UpdateSubscription livekitRtc$UpdateSubscription) {
        livekitRtc$UpdateSubscription.getClass();
        this.subscription_ = livekitRtc$UpdateSubscription;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001\t\u0002\t\u0003\u001b\u0004\u001b\u0005\t", new Object[]{"answer_", "subscription_", "publishTracks_", LivekitRtc$TrackPublishedResponse.class, "dataChannels_", LivekitRtc$DataChannelInfo.class, "offer_"});
            case 3:
                return new LivekitRtc$SyncState();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$SyncState.class) {
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

    public LivekitRtc$SessionDescription getAnswer() {
        LivekitRtc$SessionDescription livekitRtc$SessionDescription = this.answer_;
        if (livekitRtc$SessionDescription == null) {
            return LivekitRtc$SessionDescription.getDefaultInstance();
        }
        return livekitRtc$SessionDescription;
    }

    public LivekitRtc$DataChannelInfo getDataChannels(int i10) {
        return (LivekitRtc$DataChannelInfo) this.dataChannels_.get(i10);
    }

    public int getDataChannelsCount() {
        return this.dataChannels_.size();
    }

    public List<LivekitRtc$DataChannelInfo> getDataChannelsList() {
        return this.dataChannels_;
    }

    public T2 getDataChannelsOrBuilder(int i10) {
        return (T2) this.dataChannels_.get(i10);
    }

    public List<? extends T2> getDataChannelsOrBuilderList() {
        return this.dataChannels_;
    }

    public LivekitRtc$SessionDescription getOffer() {
        LivekitRtc$SessionDescription livekitRtc$SessionDescription = this.offer_;
        if (livekitRtc$SessionDescription == null) {
            return LivekitRtc$SessionDescription.getDefaultInstance();
        }
        return livekitRtc$SessionDescription;
    }

    public LivekitRtc$TrackPublishedResponse getPublishTracks(int i10) {
        return (LivekitRtc$TrackPublishedResponse) this.publishTracks_.get(i10);
    }

    public int getPublishTracksCount() {
        return this.publishTracks_.size();
    }

    public List<LivekitRtc$TrackPublishedResponse> getPublishTracksList() {
        return this.publishTracks_;
    }

    public I3 getPublishTracksOrBuilder(int i10) {
        return (I3) this.publishTracks_.get(i10);
    }

    public List<? extends I3> getPublishTracksOrBuilderList() {
        return this.publishTracks_;
    }

    public LivekitRtc$UpdateSubscription getSubscription() {
        LivekitRtc$UpdateSubscription livekitRtc$UpdateSubscription = this.subscription_;
        if (livekitRtc$UpdateSubscription == null) {
            return LivekitRtc$UpdateSubscription.getDefaultInstance();
        }
        return livekitRtc$UpdateSubscription;
    }

    public boolean hasAnswer() {
        if (this.answer_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasOffer() {
        if (this.offer_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasSubscription() {
        if (this.subscription_ != null) {
            return true;
        }
        return false;
    }

    public static E3 newBuilder(LivekitRtc$SyncState livekitRtc$SyncState) {
        return (E3) DEFAULT_INSTANCE.createBuilder(livekitRtc$SyncState);
    }

    public static LivekitRtc$SyncState parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$SyncState) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$SyncState parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$SyncState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$SyncState parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$SyncState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public void addDataChannels(int i10, LivekitRtc$DataChannelInfo livekitRtc$DataChannelInfo) {
        livekitRtc$DataChannelInfo.getClass();
        ensureDataChannelsIsMutable();
        this.dataChannels_.add(i10, livekitRtc$DataChannelInfo);
    }

    public void addPublishTracks(int i10, LivekitRtc$TrackPublishedResponse livekitRtc$TrackPublishedResponse) {
        livekitRtc$TrackPublishedResponse.getClass();
        ensurePublishTracksIsMutable();
        this.publishTracks_.add(i10, livekitRtc$TrackPublishedResponse);
    }

    public static LivekitRtc$SyncState parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$SyncState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$SyncState parseFrom(byte[] bArr) {
        return (LivekitRtc$SyncState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$SyncState parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$SyncState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$SyncState parseFrom(InputStream inputStream) {
        return (LivekitRtc$SyncState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SyncState parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$SyncState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$SyncState parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$SyncState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$SyncState parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$SyncState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
