package livekit.org.webrtc;

import livekit.org.webrtc.Logging;

/* loaded from: classes.dex */
public class CallSessionFileRotatingLogSink {
    private long nativeSink;

    public CallSessionFileRotatingLogSink(String str, int i10, Logging.Severity severity) {
        if (str != null) {
            this.nativeSink = nativeAddSink(str, i10, severity.ordinal());
            return;
        }
        throw new IllegalArgumentException("dirPath may not be null.");
    }

    public static byte[] getLogData(String str) {
        if (str != null) {
            return nativeGetLogData(str);
        }
        throw new IllegalArgumentException("dirPath may not be null.");
    }

    private static native long nativeAddSink(String str, int i10, int i11);

    private static native void nativeDeleteSink(long j6);

    private static native byte[] nativeGetLogData(String str);

    public void dispose() {
        long j6 = this.nativeSink;
        if (j6 != 0) {
            nativeDeleteSink(j6);
            this.nativeSink = 0L;
        }
    }
}
