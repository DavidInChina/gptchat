package livekit.org.webrtc;

/* loaded from: classes.dex */
public final class CryptoOptions {
    private final SFrame sframe;
    private final Srtp srtp;

    /* loaded from: classes.dex */
    public static class Builder {
        private boolean enableAes128Sha1_32CryptoCipher;
        private boolean enableEncryptedRtpHeaderExtensions;
        private boolean enableGcmCryptoSuites;
        private boolean requireFrameEncryption;

        private Builder() {
        }

        public /* synthetic */ Builder(int i10) {
            this();
        }

        public CryptoOptions createCryptoOptions() {
            return new CryptoOptions(this.enableGcmCryptoSuites, this.enableAes128Sha1_32CryptoCipher, this.enableEncryptedRtpHeaderExtensions, this.requireFrameEncryption, 0);
        }

        public Builder setEnableAes128Sha1_32CryptoCipher(boolean z10) {
            this.enableAes128Sha1_32CryptoCipher = z10;
            return this;
        }

        public Builder setEnableEncryptedRtpHeaderExtensions(boolean z10) {
            this.enableEncryptedRtpHeaderExtensions = z10;
            return this;
        }

        public Builder setEnableGcmCryptoSuites(boolean z10) {
            this.enableGcmCryptoSuites = z10;
            return this;
        }

        public Builder setRequireFrameEncryption(boolean z10) {
            this.requireFrameEncryption = z10;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public final class SFrame {
        private final boolean requireFrameEncryption;

        public /* synthetic */ SFrame(CryptoOptions cryptoOptions, boolean z10, int i10) {
            this(z10);
        }

        @CalledByNative("SFrame")
        public boolean getRequireFrameEncryption() {
            return this.requireFrameEncryption;
        }

        private SFrame(boolean z10) {
            this.requireFrameEncryption = z10;
        }
    }

    /* loaded from: classes2.dex */
    public final class Srtp {
        private final boolean enableAes128Sha1_32CryptoCipher;
        private final boolean enableEncryptedRtpHeaderExtensions;
        private final boolean enableGcmCryptoSuites;

        public /* synthetic */ Srtp(CryptoOptions cryptoOptions, boolean z10, boolean z11, boolean z12, int i10) {
            this(z10, z11, z12);
        }

        @CalledByNative("Srtp")
        public boolean getEnableAes128Sha1_32CryptoCipher() {
            return this.enableAes128Sha1_32CryptoCipher;
        }

        @CalledByNative("Srtp")
        public boolean getEnableEncryptedRtpHeaderExtensions() {
            return this.enableEncryptedRtpHeaderExtensions;
        }

        @CalledByNative("Srtp")
        public boolean getEnableGcmCryptoSuites() {
            return this.enableGcmCryptoSuites;
        }

        private Srtp(boolean z10, boolean z11, boolean z12) {
            this.enableGcmCryptoSuites = z10;
            this.enableAes128Sha1_32CryptoCipher = z11;
            this.enableEncryptedRtpHeaderExtensions = z12;
        }
    }

    public /* synthetic */ CryptoOptions(boolean z10, boolean z11, boolean z12, boolean z13, int i10) {
        this(z10, z11, z12, z13);
    }

    public static Builder builder() {
        return new Builder(0);
    }

    @CalledByNative
    public SFrame getSFrame() {
        return this.sframe;
    }

    @CalledByNative
    public Srtp getSrtp() {
        return this.srtp;
    }

    private CryptoOptions(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.srtp = new Srtp(this, z10, z11, z12, 0);
        this.sframe = new SFrame(this, z13, 0);
    }
}
