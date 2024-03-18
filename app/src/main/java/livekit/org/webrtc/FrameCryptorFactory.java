package livekit.org.webrtc;

/* loaded from: classes.dex */
public class FrameCryptorFactory {
    public static FrameCryptor createFrameCryptorForRtpReceiver(PeerConnectionFactory peerConnectionFactory, RtpReceiver rtpReceiver, String str, FrameCryptorAlgorithm frameCryptorAlgorithm, FrameCryptorKeyProvider frameCryptorKeyProvider) {
        return nativeCreateFrameCryptorForRtpReceiver(peerConnectionFactory.getNativeOwnedFactoryAndThreads(), rtpReceiver.getNativeRtpReceiver(), str, frameCryptorAlgorithm.ordinal(), frameCryptorKeyProvider.getNativeKeyProvider());
    }

    public static FrameCryptor createFrameCryptorForRtpSender(PeerConnectionFactory peerConnectionFactory, RtpSender rtpSender, String str, FrameCryptorAlgorithm frameCryptorAlgorithm, FrameCryptorKeyProvider frameCryptorKeyProvider) {
        return nativeCreateFrameCryptorForRtpSender(peerConnectionFactory.getNativeOwnedFactoryAndThreads(), rtpSender.getNativeRtpSender(), str, frameCryptorAlgorithm.ordinal(), frameCryptorKeyProvider.getNativeKeyProvider());
    }

    public static FrameCryptorKeyProvider createFrameCryptorKeyProvider(boolean z10, byte[] bArr, int i10, byte[] bArr2, int i11) {
        return nativeCreateFrameCryptorKeyProvider(z10, bArr, i10, bArr2, i11);
    }

    private static native FrameCryptor nativeCreateFrameCryptorForRtpReceiver(long j6, long j10, String str, int i10, long j11);

    private static native FrameCryptor nativeCreateFrameCryptorForRtpSender(long j6, long j10, String str, int i10, long j11);

    private static native FrameCryptorKeyProvider nativeCreateFrameCryptorKeyProvider(boolean z10, byte[] bArr, int i10, byte[] bArr2, int i11);
}
