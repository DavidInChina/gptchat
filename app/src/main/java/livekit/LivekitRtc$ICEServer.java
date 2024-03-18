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
import jh.U2;
import jh.V2;

/* loaded from: classes.dex */
public final class LivekitRtc$ICEServer extends AbstractC2497d0 implements V2 {
    public static final int CREDENTIAL_FIELD_NUMBER = 3;
    private static final LivekitRtc$ICEServer DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int URLS_FIELD_NUMBER = 1;
    public static final int USERNAME_FIELD_NUMBER = 2;
    private AbstractC2535q0 urls_ = AbstractC2497d0.emptyProtobufList();
    private String username_ = "";
    private String credential_ = "";

    static {
        LivekitRtc$ICEServer livekitRtc$ICEServer = new LivekitRtc$ICEServer();
        DEFAULT_INSTANCE = livekitRtc$ICEServer;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$ICEServer.class, livekitRtc$ICEServer);
    }

    private LivekitRtc$ICEServer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUrls(Iterable<String> iterable) {
        ensureUrlsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.urls_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUrls(String str) {
        str.getClass();
        ensureUrlsIsMutable();
        this.urls_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUrlsBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        ensureUrlsIsMutable();
        this.urls_.add(abstractC2534q.q0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCredential() {
        this.credential_ = getDefaultInstance().getCredential();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrls() {
        this.urls_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsername() {
        this.username_ = getDefaultInstance().getUsername();
    }

    private void ensureUrlsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.urls_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.urls_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitRtc$ICEServer getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static U2 newBuilder() {
        return (U2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$ICEServer parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$ICEServer) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$ICEServer parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$ICEServer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCredential(String str) {
        str.getClass();
        this.credential_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCredentialBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.credential_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrls(int i10, String str) {
        str.getClass();
        ensureUrlsIsMutable();
        this.urls_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsername(String str) {
        str.getClass();
        this.username_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsernameBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.username_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u021a\u0002\u0208\u0003\u0208", new Object[]{"urls_", "username_", "credential_"});
            case 3:
                return new LivekitRtc$ICEServer();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$ICEServer.class) {
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

    public String getCredential() {
        return this.credential_;
    }

    public AbstractC2534q getCredentialBytes() {
        return AbstractC2534q.y(this.credential_);
    }

    public String getUrls(int i10) {
        return (String) this.urls_.get(i10);
    }

    public AbstractC2534q getUrlsBytes(int i10) {
        return AbstractC2534q.y((String) this.urls_.get(i10));
    }

    public int getUrlsCount() {
        return this.urls_.size();
    }

    public List<String> getUrlsList() {
        return this.urls_;
    }

    public String getUsername() {
        return this.username_;
    }

    public AbstractC2534q getUsernameBytes() {
        return AbstractC2534q.y(this.username_);
    }

    public static U2 newBuilder(LivekitRtc$ICEServer livekitRtc$ICEServer) {
        return (U2) DEFAULT_INSTANCE.createBuilder(livekitRtc$ICEServer);
    }

    public static LivekitRtc$ICEServer parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$ICEServer) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$ICEServer parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$ICEServer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$ICEServer parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$ICEServer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRtc$ICEServer parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$ICEServer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$ICEServer parseFrom(byte[] bArr) {
        return (LivekitRtc$ICEServer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$ICEServer parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$ICEServer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$ICEServer parseFrom(InputStream inputStream) {
        return (LivekitRtc$ICEServer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$ICEServer parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$ICEServer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$ICEServer parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$ICEServer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$ICEServer parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$ICEServer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
