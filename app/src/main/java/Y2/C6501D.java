package y2;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* renamed from: y2.D  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6501D implements e0 {

    /* renamed from: Y  reason: collision with root package name */
    public C6501D f50335Y;

    /* renamed from: Z  reason: collision with root package name */
    public C6501D f50336Z;

    public final void a(long j6, float[] fArr) {
        C6501D c6501d = this.f50336Z;
        if (c6501d != null) {
            c6501d.a(j6, fArr);
        }
    }

    @Override // y2.e0
    public final void b(int i10, Object obj) {
        if (i10 != 7) {
            if (i10 != 8) {
                if (i10 == 10000) {
                    AbstractC2469q0.p(obj);
                    return;
                }
                return;
            }
            this.f50336Z = (C6501D) obj;
            return;
        }
        this.f50335Y = (C6501D) obj;
    }

    public final void c() {
        C6501D c6501d = this.f50336Z;
        if (c6501d != null) {
            c6501d.c();
        }
    }

    public final void d(long j6, long j10) {
        C6501D c6501d = this.f50335Y;
        if (c6501d != null) {
            c6501d.d(j6, j10);
        }
    }
}
