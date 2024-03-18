package fh;

import eh.C2918r;
import id.AbstractC3557B;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l8.AbstractC4344b;
import livekit.org.webrtc.WebrtcBuildVersion;

/* renamed from: fh.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3076c extends AbstractC4344b {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f30861l = 1;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ AbstractC3077d f30862m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ String f30863n;

    /* renamed from: o  reason: collision with root package name */
    public final Object f30864o;

    public C3076c(AbstractC3077d abstractC3077d, String str) {
        this.f30862m = abstractC3077d;
        this.f30863n = str;
        this.f30864o = abstractC3077d.f30865b.f29417b;
    }

    @Override // l8.AbstractC4344b, kotlinx.serialization.encoding.Encoder
    public final void D(String str) {
        switch (this.f30861l) {
            case 0:
                AbstractC3557B.c0("value", str);
                this.f30862m.K(this.f30863n, new C2918r(str, false, (SerialDescriptor) this.f30864o));
                return;
            default:
                AbstractC3557B.c0("value", str);
                e0(str);
                throw null;
        }
    }

    public final void H1(String str) {
        AbstractC3557B.c0("s", str);
        this.f30862m.K(this.f30863n, new C2918r(str, false, null));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final gh.d a() {
        switch (this.f30861l) {
            case 0:
                return this.f30862m.f30865b.f29417b;
            default:
                return (gh.d) this.f30864o;
        }
    }

    @Override // l8.AbstractC4344b, kotlinx.serialization.encoding.Encoder
    public final void h(short s10) {
        switch (this.f30861l) {
            case 1:
                H1(String.valueOf(s10 & 65535));
                return;
            default:
                e0(Short.valueOf(s10));
                throw null;
        }
    }

    @Override // l8.AbstractC4344b, kotlinx.serialization.encoding.Encoder
    public final void j(byte b10) {
        switch (this.f30861l) {
            case 1:
                H1(String.valueOf(b10 & 255));
                return;
            default:
                e0(Byte.valueOf(b10));
                throw null;
        }
    }

    @Override // l8.AbstractC4344b, kotlinx.serialization.encoding.Encoder
    public final void u(int i10) {
        switch (this.f30861l) {
            case 1:
                H1(Long.toString(i10 & 4294967295L, 10));
                return;
            default:
                e0(Integer.valueOf(i10));
                throw null;
        }
    }

    @Override // l8.AbstractC4344b, kotlinx.serialization.encoding.Encoder
    public final void y(long j6) {
        String str;
        switch (this.f30861l) {
            case 1:
                int i10 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
                if (i10 == 0) {
                    str = WebrtcBuildVersion.maint_version;
                } else if (i10 > 0) {
                    str = Long.toString(j6, 10);
                } else {
                    char[] cArr = new char[64];
                    long j10 = (j6 >>> 1) / 5;
                    long j11 = 10;
                    int i11 = 63;
                    cArr[63] = Character.forDigit((int) (j6 - (j10 * j11)), 10);
                    while (j10 > 0) {
                        i11--;
                        cArr[i11] = Character.forDigit((int) (j10 % j11), 10);
                        j10 /= j11;
                    }
                    str = new String(cArr, i11, 64 - i11);
                }
                H1(str);
                return;
            default:
                e0(Long.valueOf(j6));
                throw null;
        }
    }

    public C3076c(AbstractC3077d abstractC3077d, String str, SerialDescriptor serialDescriptor) {
        this.f30862m = abstractC3077d;
        this.f30863n = str;
        this.f30864o = serialDescriptor;
    }
}
