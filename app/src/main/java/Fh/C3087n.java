package fh;

import id.AbstractC3557B;
import livekit.org.webrtc.WebrtcBuildVersion;

/* renamed from: fh.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3087n extends C3085l {

    /* renamed from: c  reason: collision with root package name */
    public final boolean f30886c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3087n(C3058A c3058a, boolean z10) {
        super(c3058a);
        AbstractC3557B.c0("writer", c3058a);
        this.f30886c = z10;
    }

    @Override // fh.C3085l
    public final void d(byte b10) {
        if (this.f30886c) {
            j(String.valueOf(b10 & 255));
        } else {
            h(String.valueOf(b10 & 255));
        }
    }

    @Override // fh.C3085l
    public final void f(int i10) {
        boolean z10 = this.f30886c;
        String l10 = Long.toString(4294967295L & i10, 10);
        if (z10) {
            j(l10);
        } else {
            h(l10);
        }
    }

    @Override // fh.C3085l
    public final void g(long j6) {
        boolean z10 = this.f30886c;
        int i10 = 63;
        String str = WebrtcBuildVersion.maint_version;
        if (z10) {
            int i11 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
            if (i11 != 0) {
                if (i11 > 0) {
                    str = Long.toString(j6, 10);
                } else {
                    char[] cArr = new char[64];
                    long j10 = (j6 >>> 1) / 5;
                    long j11 = 10;
                    cArr[63] = Character.forDigit((int) (j6 - (j10 * j11)), 10);
                    while (j10 > 0) {
                        i10--;
                        cArr[i10] = Character.forDigit((int) (j10 % j11), 10);
                        j10 /= j11;
                    }
                    str = new String(cArr, i10, 64 - i10);
                }
            }
            j(str);
            return;
        }
        int i12 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
        if (i12 != 0) {
            if (i12 > 0) {
                str = Long.toString(j6, 10);
            } else {
                char[] cArr2 = new char[64];
                long j12 = (j6 >>> 1) / 5;
                long j13 = 10;
                cArr2[63] = Character.forDigit((int) (j6 - (j12 * j13)), 10);
                while (j12 > 0) {
                    i10--;
                    cArr2[i10] = Character.forDigit((int) (j12 % j13), 10);
                    j12 /= j13;
                }
                str = new String(cArr2, i10, 64 - i10);
            }
        }
        h(str);
    }

    @Override // fh.C3085l
    public final void i(short s10) {
        if (this.f30886c) {
            j(String.valueOf(s10 & 65535));
        } else {
            h(String.valueOf(s10 & 65535));
        }
    }
}
