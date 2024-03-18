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
import jh.AbstractC4072s;
import jh.C4082u;

/* loaded from: classes.dex */
public final class LivekitAnalytics$AnalyticsEvents extends AbstractC2497d0 implements N0 {
    private static final LivekitAnalytics$AnalyticsEvents DEFAULT_INSTANCE;
    public static final int EVENTS_FIELD_NUMBER = 1;
    private static volatile AbstractC2489a1 PARSER;
    private AbstractC2535q0 events_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitAnalytics$AnalyticsEvents livekitAnalytics$AnalyticsEvents = new LivekitAnalytics$AnalyticsEvents();
        DEFAULT_INSTANCE = livekitAnalytics$AnalyticsEvents;
        AbstractC2497d0.registerDefaultInstance(LivekitAnalytics$AnalyticsEvents.class, livekitAnalytics$AnalyticsEvents);
    }

    private LivekitAnalytics$AnalyticsEvents() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEvents(Iterable<? extends LivekitAnalytics$AnalyticsEvent> iterable) {
        ensureEventsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.events_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvents(LivekitAnalytics$AnalyticsEvent livekitAnalytics$AnalyticsEvent) {
        livekitAnalytics$AnalyticsEvent.getClass();
        ensureEventsIsMutable();
        this.events_.add(livekitAnalytics$AnalyticsEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvents() {
        this.events_ = AbstractC2497d0.emptyProtobufList();
    }

    private void ensureEventsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.events_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.events_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitAnalytics$AnalyticsEvents getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4082u newBuilder() {
        return (C4082u) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAnalytics$AnalyticsEvents parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsEvents) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsEvents parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAnalytics$AnalyticsEvents) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEvents(int i10) {
        ensureEventsIsMutable();
        this.events_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvents(int i10, LivekitAnalytics$AnalyticsEvent livekitAnalytics$AnalyticsEvent) {
        livekitAnalytics$AnalyticsEvent.getClass();
        ensureEventsIsMutable();
        this.events_.set(i10, livekitAnalytics$AnalyticsEvent);
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"events_", LivekitAnalytics$AnalyticsEvent.class});
            case 3:
                return new LivekitAnalytics$AnalyticsEvents();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitAnalytics$AnalyticsEvents.class) {
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

    public LivekitAnalytics$AnalyticsEvent getEvents(int i10) {
        return (LivekitAnalytics$AnalyticsEvent) this.events_.get(i10);
    }

    public int getEventsCount() {
        return this.events_.size();
    }

    public List<LivekitAnalytics$AnalyticsEvent> getEventsList() {
        return this.events_;
    }

    public AbstractC4072s getEventsOrBuilder(int i10) {
        return (AbstractC4072s) this.events_.get(i10);
    }

    public List<? extends AbstractC4072s> getEventsOrBuilderList() {
        return this.events_;
    }

    public static C4082u newBuilder(LivekitAnalytics$AnalyticsEvents livekitAnalytics$AnalyticsEvents) {
        return (C4082u) DEFAULT_INSTANCE.createBuilder(livekitAnalytics$AnalyticsEvents);
    }

    public static LivekitAnalytics$AnalyticsEvents parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitAnalytics$AnalyticsEvents) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAnalytics$AnalyticsEvents parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitAnalytics$AnalyticsEvents) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitAnalytics$AnalyticsEvents parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitAnalytics$AnalyticsEvents) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvents(int i10, LivekitAnalytics$AnalyticsEvent livekitAnalytics$AnalyticsEvent) {
        livekitAnalytics$AnalyticsEvent.getClass();
        ensureEventsIsMutable();
        this.events_.add(i10, livekitAnalytics$AnalyticsEvent);
    }

    public static LivekitAnalytics$AnalyticsEvents parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitAnalytics$AnalyticsEvents) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitAnalytics$AnalyticsEvents parseFrom(byte[] bArr) {
        return (LivekitAnalytics$AnalyticsEvents) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAnalytics$AnalyticsEvents parseFrom(byte[] bArr, J j6) {
        return (LivekitAnalytics$AnalyticsEvents) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitAnalytics$AnalyticsEvents parseFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsEvents) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsEvents parseFrom(InputStream inputStream, J j6) {
        return (LivekitAnalytics$AnalyticsEvents) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAnalytics$AnalyticsEvents parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitAnalytics$AnalyticsEvents) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitAnalytics$AnalyticsEvents parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitAnalytics$AnalyticsEvents) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
