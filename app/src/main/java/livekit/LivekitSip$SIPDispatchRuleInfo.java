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
import com.google.protobuf.X;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import jh.b4;
import jh.f4;
import jh.g4;

/* loaded from: classes.dex */
public final class LivekitSip$SIPDispatchRuleInfo extends AbstractC2497d0 implements g4 {
    private static final LivekitSip$SIPDispatchRuleInfo DEFAULT_INSTANCE;
    public static final int HIDE_PHONE_NUMBER_FIELD_NUMBER = 4;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int RULE_FIELD_NUMBER = 2;
    public static final int SIP_DISPATCH_RULE_ID_FIELD_NUMBER = 1;
    public static final int TRUNK_IDS_FIELD_NUMBER = 3;
    private boolean hidePhoneNumber_;
    private LivekitSip$SIPDispatchRule rule_;
    private String sipDispatchRuleId_ = "";
    private AbstractC2535q0 trunkIds_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitSip$SIPDispatchRuleInfo livekitSip$SIPDispatchRuleInfo = new LivekitSip$SIPDispatchRuleInfo();
        DEFAULT_INSTANCE = livekitSip$SIPDispatchRuleInfo;
        AbstractC2497d0.registerDefaultInstance(LivekitSip$SIPDispatchRuleInfo.class, livekitSip$SIPDispatchRuleInfo);
    }

    private LivekitSip$SIPDispatchRuleInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTrunkIds(Iterable<String> iterable) {
        ensureTrunkIdsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.trunkIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrunkIds(String str) {
        str.getClass();
        ensureTrunkIdsIsMutable();
        this.trunkIds_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrunkIdsBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        ensureTrunkIdsIsMutable();
        this.trunkIds_.add(abstractC2534q.q0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHidePhoneNumber() {
        this.hidePhoneNumber_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRule() {
        this.rule_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSipDispatchRuleId() {
        this.sipDispatchRuleId_ = getDefaultInstance().getSipDispatchRuleId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrunkIds() {
        this.trunkIds_ = AbstractC2497d0.emptyProtobufList();
    }

    private void ensureTrunkIdsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.trunkIds_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.trunkIds_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitSip$SIPDispatchRuleInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRule(LivekitSip$SIPDispatchRule livekitSip$SIPDispatchRule) {
        livekitSip$SIPDispatchRule.getClass();
        LivekitSip$SIPDispatchRule livekitSip$SIPDispatchRule2 = this.rule_;
        if (livekitSip$SIPDispatchRule2 != null && livekitSip$SIPDispatchRule2 != LivekitSip$SIPDispatchRule.getDefaultInstance()) {
            b4 newBuilder = LivekitSip$SIPDispatchRule.newBuilder(this.rule_);
            newBuilder.f(livekitSip$SIPDispatchRule);
            this.rule_ = (LivekitSip$SIPDispatchRule) newBuilder.c();
            return;
        }
        this.rule_ = livekitSip$SIPDispatchRule;
    }

    public static f4 newBuilder() {
        return (f4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitSip$SIPDispatchRuleInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitSip$SIPDispatchRuleInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$SIPDispatchRuleInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitSip$SIPDispatchRuleInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHidePhoneNumber(boolean z10) {
        this.hidePhoneNumber_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRule(LivekitSip$SIPDispatchRule livekitSip$SIPDispatchRule) {
        livekitSip$SIPDispatchRule.getClass();
        this.rule_ = livekitSip$SIPDispatchRule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSipDispatchRuleId(String str) {
        str.getClass();
        this.sipDispatchRuleId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSipDispatchRuleIdBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.sipDispatchRuleId_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrunkIds(int i10, String str) {
        str.getClass();
        ensureTrunkIdsIsMutable();
        this.trunkIds_.set(i10, str);
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0208\u0002\t\u0003\u021a\u0004\u0007", new Object[]{"sipDispatchRuleId_", "rule_", "trunkIds_", "hidePhoneNumber_"});
            case 3:
                return new LivekitSip$SIPDispatchRuleInfo();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitSip$SIPDispatchRuleInfo.class) {
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

    public boolean getHidePhoneNumber() {
        return this.hidePhoneNumber_;
    }

    public LivekitSip$SIPDispatchRule getRule() {
        LivekitSip$SIPDispatchRule livekitSip$SIPDispatchRule = this.rule_;
        if (livekitSip$SIPDispatchRule == null) {
            return LivekitSip$SIPDispatchRule.getDefaultInstance();
        }
        return livekitSip$SIPDispatchRule;
    }

    public String getSipDispatchRuleId() {
        return this.sipDispatchRuleId_;
    }

    public AbstractC2534q getSipDispatchRuleIdBytes() {
        return AbstractC2534q.y(this.sipDispatchRuleId_);
    }

    public String getTrunkIds(int i10) {
        return (String) this.trunkIds_.get(i10);
    }

    public AbstractC2534q getTrunkIdsBytes(int i10) {
        return AbstractC2534q.y((String) this.trunkIds_.get(i10));
    }

    public int getTrunkIdsCount() {
        return this.trunkIds_.size();
    }

    public List<String> getTrunkIdsList() {
        return this.trunkIds_;
    }

    public boolean hasRule() {
        if (this.rule_ != null) {
            return true;
        }
        return false;
    }

    public static f4 newBuilder(LivekitSip$SIPDispatchRuleInfo livekitSip$SIPDispatchRuleInfo) {
        return (f4) DEFAULT_INSTANCE.createBuilder(livekitSip$SIPDispatchRuleInfo);
    }

    public static LivekitSip$SIPDispatchRuleInfo parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitSip$SIPDispatchRuleInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitSip$SIPDispatchRuleInfo parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitSip$SIPDispatchRuleInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitSip$SIPDispatchRuleInfo parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitSip$SIPDispatchRuleInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitSip$SIPDispatchRuleInfo parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitSip$SIPDispatchRuleInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitSip$SIPDispatchRuleInfo parseFrom(byte[] bArr) {
        return (LivekitSip$SIPDispatchRuleInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitSip$SIPDispatchRuleInfo parseFrom(byte[] bArr, J j6) {
        return (LivekitSip$SIPDispatchRuleInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitSip$SIPDispatchRuleInfo parseFrom(InputStream inputStream) {
        return (LivekitSip$SIPDispatchRuleInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$SIPDispatchRuleInfo parseFrom(InputStream inputStream, J j6) {
        return (LivekitSip$SIPDispatchRuleInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitSip$SIPDispatchRuleInfo parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitSip$SIPDispatchRuleInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitSip$SIPDispatchRuleInfo parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitSip$SIPDispatchRuleInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
