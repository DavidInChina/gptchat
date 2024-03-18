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
import jh.R3;

/* loaded from: classes2.dex */
public final class LivekitSip$CreateSIPTrunkRequest extends AbstractC2497d0 implements N0 {
    private static final LivekitSip$CreateSIPTrunkRequest DEFAULT_INSTANCE;
    public static final int INBOUND_ADDRESSES_FIELD_NUMBER = 1;
    public static final int INBOUND_NUMBERS_REGEX_FIELD_NUMBER = 4;
    public static final int INBOUND_PASSWORD_FIELD_NUMBER = 6;
    public static final int INBOUND_USERNAME_FIELD_NUMBER = 5;
    public static final int OUTBOUND_ADDRESS_FIELD_NUMBER = 2;
    public static final int OUTBOUND_NUMBER_FIELD_NUMBER = 3;
    public static final int OUTBOUND_PASSWORD_FIELD_NUMBER = 8;
    public static final int OUTBOUND_USERNAME_FIELD_NUMBER = 7;
    private static volatile AbstractC2489a1 PARSER;
    private AbstractC2535q0 inboundAddresses_ = AbstractC2497d0.emptyProtobufList();
    private String outboundAddress_ = "";
    private String outboundNumber_ = "";
    private AbstractC2535q0 inboundNumbersRegex_ = AbstractC2497d0.emptyProtobufList();
    private String inboundUsername_ = "";
    private String inboundPassword_ = "";
    private String outboundUsername_ = "";
    private String outboundPassword_ = "";

    static {
        LivekitSip$CreateSIPTrunkRequest livekitSip$CreateSIPTrunkRequest = new LivekitSip$CreateSIPTrunkRequest();
        DEFAULT_INSTANCE = livekitSip$CreateSIPTrunkRequest;
        AbstractC2497d0.registerDefaultInstance(LivekitSip$CreateSIPTrunkRequest.class, livekitSip$CreateSIPTrunkRequest);
    }

    private LivekitSip$CreateSIPTrunkRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInboundAddresses(Iterable<String> iterable) {
        ensureInboundAddressesIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.inboundAddresses_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInboundNumbersRegex(Iterable<String> iterable) {
        ensureInboundNumbersRegexIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.inboundNumbersRegex_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInboundAddresses(String str) {
        str.getClass();
        ensureInboundAddressesIsMutable();
        this.inboundAddresses_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInboundAddressesBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        ensureInboundAddressesIsMutable();
        this.inboundAddresses_.add(abstractC2534q.q0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInboundNumbersRegex(String str) {
        str.getClass();
        ensureInboundNumbersRegexIsMutable();
        this.inboundNumbersRegex_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInboundNumbersRegexBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        ensureInboundNumbersRegexIsMutable();
        this.inboundNumbersRegex_.add(abstractC2534q.q0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInboundAddresses() {
        this.inboundAddresses_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInboundNumbersRegex() {
        this.inboundNumbersRegex_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInboundPassword() {
        this.inboundPassword_ = getDefaultInstance().getInboundPassword();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInboundUsername() {
        this.inboundUsername_ = getDefaultInstance().getInboundUsername();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOutboundAddress() {
        this.outboundAddress_ = getDefaultInstance().getOutboundAddress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOutboundNumber() {
        this.outboundNumber_ = getDefaultInstance().getOutboundNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOutboundPassword() {
        this.outboundPassword_ = getDefaultInstance().getOutboundPassword();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOutboundUsername() {
        this.outboundUsername_ = getDefaultInstance().getOutboundUsername();
    }

    private void ensureInboundAddressesIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.inboundAddresses_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.inboundAddresses_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    private void ensureInboundNumbersRegexIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.inboundNumbersRegex_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.inboundNumbersRegex_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitSip$CreateSIPTrunkRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static R3 newBuilder() {
        return (R3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitSip$CreateSIPTrunkRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitSip$CreateSIPTrunkRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$CreateSIPTrunkRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitSip$CreateSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInboundAddresses(int i10, String str) {
        str.getClass();
        ensureInboundAddressesIsMutable();
        this.inboundAddresses_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInboundNumbersRegex(int i10, String str) {
        str.getClass();
        ensureInboundNumbersRegexIsMutable();
        this.inboundNumbersRegex_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInboundPassword(String str) {
        str.getClass();
        this.inboundPassword_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInboundPasswordBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.inboundPassword_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInboundUsername(String str) {
        str.getClass();
        this.inboundUsername_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInboundUsernameBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.inboundUsername_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutboundAddress(String str) {
        str.getClass();
        this.outboundAddress_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutboundAddressBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.outboundAddress_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutboundNumber(String str) {
        str.getClass();
        this.outboundNumber_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutboundNumberBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.outboundNumber_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutboundPassword(String str) {
        str.getClass();
        this.outboundPassword_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutboundPasswordBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.outboundPassword_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutboundUsername(String str) {
        str.getClass();
        this.outboundUsername_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutboundUsernameBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.outboundUsername_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0002\u0000\u0001\u021a\u0002\u0208\u0003\u0208\u0004\u021a\u0005\u0208\u0006\u0208\u0007\u0208\b\u0208", new Object[]{"inboundAddresses_", "outboundAddress_", "outboundNumber_", "inboundNumbersRegex_", "inboundUsername_", "inboundPassword_", "outboundUsername_", "outboundPassword_"});
            case 3:
                return new LivekitSip$CreateSIPTrunkRequest();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitSip$CreateSIPTrunkRequest.class) {
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

    public String getInboundAddresses(int i10) {
        return (String) this.inboundAddresses_.get(i10);
    }

    public AbstractC2534q getInboundAddressesBytes(int i10) {
        return AbstractC2534q.y((String) this.inboundAddresses_.get(i10));
    }

    public int getInboundAddressesCount() {
        return this.inboundAddresses_.size();
    }

    public List<String> getInboundAddressesList() {
        return this.inboundAddresses_;
    }

    public String getInboundNumbersRegex(int i10) {
        return (String) this.inboundNumbersRegex_.get(i10);
    }

    public AbstractC2534q getInboundNumbersRegexBytes(int i10) {
        return AbstractC2534q.y((String) this.inboundNumbersRegex_.get(i10));
    }

    public int getInboundNumbersRegexCount() {
        return this.inboundNumbersRegex_.size();
    }

    public List<String> getInboundNumbersRegexList() {
        return this.inboundNumbersRegex_;
    }

    public String getInboundPassword() {
        return this.inboundPassword_;
    }

    public AbstractC2534q getInboundPasswordBytes() {
        return AbstractC2534q.y(this.inboundPassword_);
    }

    public String getInboundUsername() {
        return this.inboundUsername_;
    }

    public AbstractC2534q getInboundUsernameBytes() {
        return AbstractC2534q.y(this.inboundUsername_);
    }

    public String getOutboundAddress() {
        return this.outboundAddress_;
    }

    public AbstractC2534q getOutboundAddressBytes() {
        return AbstractC2534q.y(this.outboundAddress_);
    }

    public String getOutboundNumber() {
        return this.outboundNumber_;
    }

    public AbstractC2534q getOutboundNumberBytes() {
        return AbstractC2534q.y(this.outboundNumber_);
    }

    public String getOutboundPassword() {
        return this.outboundPassword_;
    }

    public AbstractC2534q getOutboundPasswordBytes() {
        return AbstractC2534q.y(this.outboundPassword_);
    }

    public String getOutboundUsername() {
        return this.outboundUsername_;
    }

    public AbstractC2534q getOutboundUsernameBytes() {
        return AbstractC2534q.y(this.outboundUsername_);
    }

    public static R3 newBuilder(LivekitSip$CreateSIPTrunkRequest livekitSip$CreateSIPTrunkRequest) {
        return (R3) DEFAULT_INSTANCE.createBuilder(livekitSip$CreateSIPTrunkRequest);
    }

    public static LivekitSip$CreateSIPTrunkRequest parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitSip$CreateSIPTrunkRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitSip$CreateSIPTrunkRequest parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitSip$CreateSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitSip$CreateSIPTrunkRequest parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitSip$CreateSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitSip$CreateSIPTrunkRequest parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitSip$CreateSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitSip$CreateSIPTrunkRequest parseFrom(byte[] bArr) {
        return (LivekitSip$CreateSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitSip$CreateSIPTrunkRequest parseFrom(byte[] bArr, J j6) {
        return (LivekitSip$CreateSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitSip$CreateSIPTrunkRequest parseFrom(InputStream inputStream) {
        return (LivekitSip$CreateSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$CreateSIPTrunkRequest parseFrom(InputStream inputStream, J j6) {
        return (LivekitSip$CreateSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitSip$CreateSIPTrunkRequest parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitSip$CreateSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitSip$CreateSIPTrunkRequest parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitSip$CreateSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
