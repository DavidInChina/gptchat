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
import jh.b4;
import jh.c4;
import jh.d4;
import jh.e4;

/* loaded from: classes.dex */
public final class LivekitSip$SIPDispatchRule extends AbstractC2497d0 implements N0 {
    private static final LivekitSip$SIPDispatchRule DEFAULT_INSTANCE;
    public static final int DISPATCH_RULE_DIRECT_FIELD_NUMBER = 1;
    public static final int DISPATCH_RULE_INDIVIDUAL_FIELD_NUMBER = 2;
    private static volatile AbstractC2489a1 PARSER;
    private int ruleCase_ = 0;
    private Object rule_;

    static {
        LivekitSip$SIPDispatchRule livekitSip$SIPDispatchRule = new LivekitSip$SIPDispatchRule();
        DEFAULT_INSTANCE = livekitSip$SIPDispatchRule;
        AbstractC2497d0.registerDefaultInstance(LivekitSip$SIPDispatchRule.class, livekitSip$SIPDispatchRule);
    }

    private LivekitSip$SIPDispatchRule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDispatchRuleDirect() {
        if (this.ruleCase_ == 1) {
            this.ruleCase_ = 0;
            this.rule_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDispatchRuleIndividual() {
        if (this.ruleCase_ == 2) {
            this.ruleCase_ = 0;
            this.rule_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRule() {
        this.ruleCase_ = 0;
        this.rule_ = null;
    }

    public static LivekitSip$SIPDispatchRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDispatchRuleDirect(LivekitSip$SIPDispatchRuleDirect livekitSip$SIPDispatchRuleDirect) {
        livekitSip$SIPDispatchRuleDirect.getClass();
        if (this.ruleCase_ == 1 && this.rule_ != LivekitSip$SIPDispatchRuleDirect.getDefaultInstance()) {
            d4 newBuilder = LivekitSip$SIPDispatchRuleDirect.newBuilder((LivekitSip$SIPDispatchRuleDirect) this.rule_);
            newBuilder.f(livekitSip$SIPDispatchRuleDirect);
            this.rule_ = newBuilder.c();
        } else {
            this.rule_ = livekitSip$SIPDispatchRuleDirect;
        }
        this.ruleCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDispatchRuleIndividual(LivekitSip$SIPDispatchRuleIndividual livekitSip$SIPDispatchRuleIndividual) {
        livekitSip$SIPDispatchRuleIndividual.getClass();
        if (this.ruleCase_ == 2 && this.rule_ != LivekitSip$SIPDispatchRuleIndividual.getDefaultInstance()) {
            e4 newBuilder = LivekitSip$SIPDispatchRuleIndividual.newBuilder((LivekitSip$SIPDispatchRuleIndividual) this.rule_);
            newBuilder.f(livekitSip$SIPDispatchRuleIndividual);
            this.rule_ = newBuilder.c();
        } else {
            this.rule_ = livekitSip$SIPDispatchRuleIndividual;
        }
        this.ruleCase_ = 2;
    }

    public static b4 newBuilder() {
        return (b4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitSip$SIPDispatchRule parseDelimitedFrom(InputStream inputStream) {
        return (LivekitSip$SIPDispatchRule) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$SIPDispatchRule parseFrom(ByteBuffer byteBuffer) {
        return (LivekitSip$SIPDispatchRule) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDispatchRuleDirect(LivekitSip$SIPDispatchRuleDirect livekitSip$SIPDispatchRuleDirect) {
        livekitSip$SIPDispatchRuleDirect.getClass();
        this.rule_ = livekitSip$SIPDispatchRuleDirect;
        this.ruleCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDispatchRuleIndividual(LivekitSip$SIPDispatchRuleIndividual livekitSip$SIPDispatchRuleIndividual) {
        livekitSip$SIPDispatchRuleIndividual.getClass();
        this.rule_ = livekitSip$SIPDispatchRuleIndividual;
        this.ruleCase_ = 2;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"rule_", "ruleCase_", LivekitSip$SIPDispatchRuleDirect.class, LivekitSip$SIPDispatchRuleIndividual.class});
            case 3:
                return new LivekitSip$SIPDispatchRule();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitSip$SIPDispatchRule.class) {
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

    public LivekitSip$SIPDispatchRuleDirect getDispatchRuleDirect() {
        if (this.ruleCase_ == 1) {
            return (LivekitSip$SIPDispatchRuleDirect) this.rule_;
        }
        return LivekitSip$SIPDispatchRuleDirect.getDefaultInstance();
    }

    public LivekitSip$SIPDispatchRuleIndividual getDispatchRuleIndividual() {
        if (this.ruleCase_ == 2) {
            return (LivekitSip$SIPDispatchRuleIndividual) this.rule_;
        }
        return LivekitSip$SIPDispatchRuleIndividual.getDefaultInstance();
    }

    public c4 getRuleCase() {
        int i10 = this.ruleCase_;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return c4.f36415Z;
            }
            return c4.f36414Y;
        }
        return c4.f36416h0;
    }

    public boolean hasDispatchRuleDirect() {
        if (this.ruleCase_ == 1) {
            return true;
        }
        return false;
    }

    public boolean hasDispatchRuleIndividual() {
        if (this.ruleCase_ == 2) {
            return true;
        }
        return false;
    }

    public static b4 newBuilder(LivekitSip$SIPDispatchRule livekitSip$SIPDispatchRule) {
        return (b4) DEFAULT_INSTANCE.createBuilder(livekitSip$SIPDispatchRule);
    }

    public static LivekitSip$SIPDispatchRule parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitSip$SIPDispatchRule) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitSip$SIPDispatchRule parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitSip$SIPDispatchRule) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitSip$SIPDispatchRule parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitSip$SIPDispatchRule) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitSip$SIPDispatchRule parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitSip$SIPDispatchRule) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitSip$SIPDispatchRule parseFrom(byte[] bArr) {
        return (LivekitSip$SIPDispatchRule) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitSip$SIPDispatchRule parseFrom(byte[] bArr, J j6) {
        return (LivekitSip$SIPDispatchRule) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitSip$SIPDispatchRule parseFrom(InputStream inputStream) {
        return (LivekitSip$SIPDispatchRule) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$SIPDispatchRule parseFrom(InputStream inputStream, J j6) {
        return (LivekitSip$SIPDispatchRule) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitSip$SIPDispatchRule parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitSip$SIPDispatchRule) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitSip$SIPDispatchRule parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitSip$SIPDispatchRule) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
