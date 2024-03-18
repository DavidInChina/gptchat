package Se;

import livekit.org.webrtc.FrameCryptor;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f16579a;

    static {
        int[] iArr = new int[FrameCryptor.FrameCryptionState.values().length];
        try {
            iArr[FrameCryptor.FrameCryptionState.NEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FrameCryptor.FrameCryptionState.OK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FrameCryptor.FrameCryptionState.KEYRATCHETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FrameCryptor.FrameCryptionState.MISSINGKEY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[FrameCryptor.FrameCryptionState.ENCRYPTIONFAILED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[FrameCryptor.FrameCryptionState.DECRYPTIONFAILED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[FrameCryptor.FrameCryptionState.INTERNALERROR.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f16579a = iArr;
    }
}
