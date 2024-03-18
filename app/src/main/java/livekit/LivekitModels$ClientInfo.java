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
import jh.B1;
import jh.C1;

/* loaded from: classes2.dex */
public final class LivekitModels$ClientInfo extends AbstractC2497d0 implements N0 {
    public static final int ADDRESS_FIELD_NUMBER = 9;
    public static final int BROWSER_FIELD_NUMBER = 7;
    public static final int BROWSER_VERSION_FIELD_NUMBER = 8;
    private static final LivekitModels$ClientInfo DEFAULT_INSTANCE;
    public static final int DEVICE_MODEL_FIELD_NUMBER = 6;
    public static final int NETWORK_FIELD_NUMBER = 10;
    public static final int OS_FIELD_NUMBER = 4;
    public static final int OS_VERSION_FIELD_NUMBER = 5;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 3;
    public static final int SDK_FIELD_NUMBER = 1;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int protocol_;
    private int sdk_;
    private String version_ = "";
    private String os_ = "";
    private String osVersion_ = "";
    private String deviceModel_ = "";
    private String browser_ = "";
    private String browserVersion_ = "";
    private String address_ = "";
    private String network_ = "";

    static {
        LivekitModels$ClientInfo livekitModels$ClientInfo = new LivekitModels$ClientInfo();
        DEFAULT_INSTANCE = livekitModels$ClientInfo;
        AbstractC2497d0.registerDefaultInstance(LivekitModels$ClientInfo.class, livekitModels$ClientInfo);
    }

    private LivekitModels$ClientInfo() {
    }

    public static /* synthetic */ void access$27300(LivekitModels$ClientInfo livekitModels$ClientInfo, C1 c12) {
        livekitModels$ClientInfo.setSdk(c12);
    }

    public static /* synthetic */ void access$27500(LivekitModels$ClientInfo livekitModels$ClientInfo, String str) {
        livekitModels$ClientInfo.setVersion(str);
    }

    public static /* synthetic */ void access$28000(LivekitModels$ClientInfo livekitModels$ClientInfo, String str) {
        livekitModels$ClientInfo.setOs(str);
    }

    public static /* synthetic */ void access$28300(LivekitModels$ClientInfo livekitModels$ClientInfo, String str) {
        livekitModels$ClientInfo.setOsVersion(str);
    }

    public static /* synthetic */ void access$28600(LivekitModels$ClientInfo livekitModels$ClientInfo, String str) {
        livekitModels$ClientInfo.setDeviceModel(str);
    }

    public void clearAddress() {
        this.address_ = getDefaultInstance().getAddress();
    }

    public void clearBrowser() {
        this.browser_ = getDefaultInstance().getBrowser();
    }

    public void clearBrowserVersion() {
        this.browserVersion_ = getDefaultInstance().getBrowserVersion();
    }

    public void clearDeviceModel() {
        this.deviceModel_ = getDefaultInstance().getDeviceModel();
    }

    public void clearNetwork() {
        this.network_ = getDefaultInstance().getNetwork();
    }

    public void clearOs() {
        this.os_ = getDefaultInstance().getOs();
    }

    public void clearOsVersion() {
        this.osVersion_ = getDefaultInstance().getOsVersion();
    }

    public void clearProtocol() {
        this.protocol_ = 0;
    }

    public void clearSdk() {
        this.sdk_ = 0;
    }

    public void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    public static LivekitModels$ClientInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static B1 newBuilder() {
        return (B1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$ClientInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$ClientInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$ClientInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$ClientInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setAddress(String str) {
        str.getClass();
        this.address_ = str;
    }

    public void setAddressBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.address_ = abstractC2534q.q0();
    }

    public void setBrowser(String str) {
        str.getClass();
        this.browser_ = str;
    }

    public void setBrowserBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.browser_ = abstractC2534q.q0();
    }

    public void setBrowserVersion(String str) {
        str.getClass();
        this.browserVersion_ = str;
    }

    public void setBrowserVersionBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.browserVersion_ = abstractC2534q.q0();
    }

    public void setDeviceModel(String str) {
        str.getClass();
        this.deviceModel_ = str;
    }

    public void setDeviceModelBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.deviceModel_ = abstractC2534q.q0();
    }

    public void setNetwork(String str) {
        str.getClass();
        this.network_ = str;
    }

    public void setNetworkBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.network_ = abstractC2534q.q0();
    }

    public void setOs(String str) {
        str.getClass();
        this.os_ = str;
    }

    public void setOsBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.os_ = abstractC2534q.q0();
    }

    public void setOsVersion(String str) {
        str.getClass();
        this.osVersion_ = str;
    }

    public void setOsVersionBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.osVersion_ = abstractC2534q.q0();
    }

    public void setProtocol(int i10) {
        this.protocol_ = i10;
    }

    public void setSdk(C1 c12) {
        this.sdk_ = c12.a();
    }

    public void setSdkValue(int i10) {
        this.sdk_ = i10;
    }

    public void setVersion(String str) {
        str.getClass();
        this.version_ = str;
    }

    public void setVersionBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.version_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\f\u0002\u0208\u0003\u0004\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\b\u0208\t\u0208\n\u0208", new Object[]{"sdk_", "version_", "protocol_", "os_", "osVersion_", "deviceModel_", "browser_", "browserVersion_", "address_", "network_"});
            case 3:
                return new LivekitModels$ClientInfo();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitModels$ClientInfo.class) {
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

    public String getAddress() {
        return this.address_;
    }

    public AbstractC2534q getAddressBytes() {
        return AbstractC2534q.y(this.address_);
    }

    public String getBrowser() {
        return this.browser_;
    }

    public AbstractC2534q getBrowserBytes() {
        return AbstractC2534q.y(this.browser_);
    }

    public String getBrowserVersion() {
        return this.browserVersion_;
    }

    public AbstractC2534q getBrowserVersionBytes() {
        return AbstractC2534q.y(this.browserVersion_);
    }

    public String getDeviceModel() {
        return this.deviceModel_;
    }

    public AbstractC2534q getDeviceModelBytes() {
        return AbstractC2534q.y(this.deviceModel_);
    }

    public String getNetwork() {
        return this.network_;
    }

    public AbstractC2534q getNetworkBytes() {
        return AbstractC2534q.y(this.network_);
    }

    public String getOs() {
        return this.os_;
    }

    public AbstractC2534q getOsBytes() {
        return AbstractC2534q.y(this.os_);
    }

    public String getOsVersion() {
        return this.osVersion_;
    }

    public AbstractC2534q getOsVersionBytes() {
        return AbstractC2534q.y(this.osVersion_);
    }

    public int getProtocol() {
        return this.protocol_;
    }

    public C1 getSdk() {
        C1 b10 = C1.b(this.sdk_);
        if (b10 == null) {
            return C1.UNRECOGNIZED;
        }
        return b10;
    }

    public int getSdkValue() {
        return this.sdk_;
    }

    public String getVersion() {
        return this.version_;
    }

    public AbstractC2534q getVersionBytes() {
        return AbstractC2534q.y(this.version_);
    }

    public static B1 newBuilder(LivekitModels$ClientInfo livekitModels$ClientInfo) {
        return (B1) DEFAULT_INSTANCE.createBuilder(livekitModels$ClientInfo);
    }

    public static LivekitModels$ClientInfo parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitModels$ClientInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$ClientInfo parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitModels$ClientInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitModels$ClientInfo parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitModels$ClientInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitModels$ClientInfo parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitModels$ClientInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitModels$ClientInfo parseFrom(byte[] bArr) {
        return (LivekitModels$ClientInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$ClientInfo parseFrom(byte[] bArr, J j6) {
        return (LivekitModels$ClientInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitModels$ClientInfo parseFrom(InputStream inputStream) {
        return (LivekitModels$ClientInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$ClientInfo parseFrom(InputStream inputStream, J j6) {
        return (LivekitModels$ClientInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$ClientInfo parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitModels$ClientInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitModels$ClientInfo parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitModels$ClientInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
