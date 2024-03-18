package Q2;

import B1.m;
import E2.j0;
import L2.AbstractC0881b;
import L2.C0880a;
import L2.G;
import java.util.Collections;
import p2.C5065s;
import p2.r;
import s2.t;
import s2.u;

/* loaded from: classes.dex */
public final class a extends m {

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f14373e = {5512, 11025, 22050, 44100};

    /* renamed from: b  reason: collision with root package name */
    public boolean f14374b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f14375c;

    /* renamed from: d  reason: collision with root package name */
    public int f14376d;

    public final boolean c(u uVar) {
        String str;
        if (!this.f14374b) {
            int u10 = uVar.u();
            int i10 = (u10 >> 4) & 15;
            this.f14376d = i10;
            Object obj = this.f1725a;
            if (i10 == 2) {
                int i11 = f14373e[(u10 >> 2) & 3];
                r rVar = new r();
                rVar.f42237k = "audio/mpeg";
                rVar.f42250x = 1;
                rVar.f42251y = i11;
                ((G) obj).b(rVar.a());
                this.f14375c = true;
            } else if (i10 != 7 && i10 != 8) {
                if (i10 != 10) {
                    throw new j0("Audio format not supported: " + this.f14376d);
                }
            } else {
                if (i10 == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                r rVar2 = new r();
                rVar2.f42237k = str;
                rVar2.f42250x = 1;
                rVar2.f42251y = 8000;
                ((G) obj).b(rVar2.a());
                this.f14375c = true;
            }
            this.f14374b = true;
        } else {
            uVar.G(1);
        }
        return true;
    }

    public final boolean d(long j6, u uVar) {
        int i10 = this.f14376d;
        Object obj = this.f1725a;
        if (i10 == 2) {
            int a5 = uVar.a();
            G g10 = (G) obj;
            g10.a(a5, uVar);
            g10.e(j6, 1, a5, 0, null);
            return true;
        }
        int u10 = uVar.u();
        if (u10 == 0 && !this.f14375c) {
            int a10 = uVar.a();
            byte[] bArr = new byte[a10];
            uVar.e(bArr, 0, a10);
            C0880a f6 = AbstractC0881b.f(new t(bArr, 0), false);
            r rVar = new r();
            rVar.f42237k = "audio/mp4a-latm";
            rVar.f42234h = f6.f10549c;
            rVar.f42250x = f6.f10548b;
            rVar.f42251y = f6.f10547a;
            rVar.f42239m = Collections.singletonList(bArr);
            ((G) obj).b(new C5065s(rVar));
            this.f14375c = true;
            return false;
        } else if (this.f14376d == 10 && u10 != 1) {
            return false;
        } else {
            int a11 = uVar.a();
            G g11 = (G) obj;
            g11.a(a11, uVar);
            g11.e(j6, 1, a11, 0, null);
            return true;
        }
    }
}
