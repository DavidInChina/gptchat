package C2;

import p2.C5065s;

/* loaded from: classes2.dex */
public final class o extends Exception {

    /* renamed from: Y  reason: collision with root package name */
    public final String f2555Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f2556Z;

    /* renamed from: h0  reason: collision with root package name */
    public final m f2557h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f2558i0;

    public o(int i10, C5065s c5065s, v vVar, boolean z10) {
        this("Decoder init failed: [" + i10 + "], " + c5065s, vVar, c5065s.f42319q0, z10, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
    }

    public o(String str, Throwable th2, String str2, boolean z10, m mVar, String str3) {
        super(str, th2);
        this.f2555Y = str2;
        this.f2556Z = z10;
        this.f2557h0 = mVar;
        this.f2558i0 = str3;
    }
}
