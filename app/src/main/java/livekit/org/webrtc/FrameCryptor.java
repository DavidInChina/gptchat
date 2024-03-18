package livekit.org.webrtc;

/* loaded from: classes2.dex */
public class FrameCryptor {
    private long nativeFrameCryptor;
    private long observerPtr = 0;

    /* loaded from: classes2.dex */
    public enum FrameCryptionState {
        NEW,
        OK,
        ENCRYPTIONFAILED,
        DECRYPTIONFAILED,
        MISSINGKEY,
        KEYRATCHETED,
        INTERNALERROR;

        @CalledByNative("FrameCryptionState")
        public static FrameCryptionState fromNativeIndex(int i10) {
            return values()[i10];
        }
    }

    /* loaded from: classes.dex */
    public interface Observer {
        @CalledByNative("Observer")
        void onFrameCryptionStateChanged(String str, FrameCryptionState frameCryptionState);
    }

    @CalledByNative
    public FrameCryptor(long j6) {
        this.nativeFrameCryptor = j6;
    }

    private void checkFrameCryptorExists() {
        if (this.nativeFrameCryptor != 0) {
            return;
        }
        throw new IllegalStateException("FrameCryptor has been disposed.");
    }

    private static native int nativeGetKeyIndex(long j6);

    private static native boolean nativeIsEnabled(long j6);

    private static native void nativeSetEnabled(long j6, boolean z10);

    private static native void nativeSetKeyIndex(long j6, int i10);

    private static native long nativeSetObserver(long j6, Observer observer);

    private static native void nativeUnSetObserver(long j6);

    public void dispose() {
        checkFrameCryptorExists();
        nativeUnSetObserver(this.nativeFrameCryptor);
        JniCommon.nativeReleaseRef(this.nativeFrameCryptor);
        this.nativeFrameCryptor = 0L;
        long j6 = this.observerPtr;
        if (j6 != 0) {
            JniCommon.nativeReleaseRef(j6);
            this.observerPtr = 0L;
        }
    }

    public int getKeyIndex() {
        checkFrameCryptorExists();
        return nativeGetKeyIndex(this.nativeFrameCryptor);
    }

    public long getNativeFrameCryptor() {
        return this.nativeFrameCryptor;
    }

    public boolean isEnabled() {
        checkFrameCryptorExists();
        return nativeIsEnabled(this.nativeFrameCryptor);
    }

    public void setEnabled(boolean z10) {
        checkFrameCryptorExists();
        nativeSetEnabled(this.nativeFrameCryptor, z10);
    }

    public void setKeyIndex(int i10) {
        checkFrameCryptorExists();
        nativeSetKeyIndex(this.nativeFrameCryptor, i10);
    }

    public void setObserver(Observer observer) {
        checkFrameCryptorExists();
        nativeSetObserver(this.nativeFrameCryptor, observer);
        long j6 = this.observerPtr;
        if (j6 != 0) {
            JniCommon.nativeReleaseRef(j6);
            this.observerPtr = 0L;
        }
    }
}
