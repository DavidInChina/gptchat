package i1;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import h1.C3296c;
import h1.C3298e;
import h1.C3302i;
import java.util.ArrayList;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class h extends d {

    /* renamed from: d0  reason: collision with root package name */
    public float f32584d0 = -1.0f;

    /* renamed from: e0  reason: collision with root package name */
    public int f32585e0 = -1;

    /* renamed from: f0  reason: collision with root package name */
    public int f32586f0 = -1;

    /* renamed from: g0  reason: collision with root package name */
    public C3458c f32587g0 = this.f32513y;

    /* renamed from: h0  reason: collision with root package name */
    public int f32588h0 = 0;

    public h() {
        this.f32470G.clear();
        this.f32470G.add(this.f32587g0);
        int length = this.f32469F.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f32469F[i10] = this.f32587g0;
        }
    }

    @Override // i1.d
    public final void B(C3298e c3298e) {
        if (this.f32472I == null) {
            return;
        }
        C3458c c3458c = this.f32587g0;
        c3298e.getClass();
        int m10 = C3298e.m(c3458c);
        if (this.f32588h0 == 1) {
            this.f32477N = m10;
            this.f32478O = 0;
            w(this.f32472I.j());
            z(0);
            return;
        }
        this.f32477N = 0;
        this.f32478O = m10;
        z(this.f32472I.m());
        w(0);
    }

    public final void C(int i10) {
        if (this.f32588h0 == i10) {
            return;
        }
        this.f32588h0 = i10;
        ArrayList arrayList = this.f32470G;
        arrayList.clear();
        if (this.f32588h0 == 1) {
            this.f32587g0 = this.f32512x;
        } else {
            this.f32587g0 = this.f32513y;
        }
        arrayList.add(this.f32587g0);
        C3458c[] c3458cArr = this.f32469F;
        int length = c3458cArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            c3458cArr[i11] = this.f32587g0;
        }
    }

    @Override // i1.d
    public final void b(C3298e c3298e) {
        boolean z10;
        e eVar = (e) this.f32472I;
        if (eVar == null) {
            return;
        }
        C3458c h10 = eVar.h(2);
        C3458c h11 = eVar.h(4);
        d dVar = this.f32472I;
        boolean z11 = true;
        if (dVar != null && dVar.f32491c0[0] == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f32588h0 == 0) {
            h10 = eVar.h(3);
            h11 = eVar.h(5);
            d dVar2 = this.f32472I;
            if (dVar2 == null || dVar2.f32491c0[1] != 2) {
                z11 = false;
            }
            z10 = z11;
        }
        if (this.f32585e0 != -1) {
            C3302i j6 = c3298e.j(this.f32587g0);
            c3298e.e(j6, c3298e.j(h10), this.f32585e0, 8);
            if (z10) {
                c3298e.f(c3298e.j(h11), j6, 0, 5);
            }
        } else if (this.f32586f0 != -1) {
            C3302i j10 = c3298e.j(this.f32587g0);
            C3302i j11 = c3298e.j(h11);
            c3298e.e(j10, j11, -this.f32586f0, 8);
            if (z10) {
                c3298e.f(j10, c3298e.j(h10), 0, 5);
                c3298e.f(j11, j10, 0, 5);
            }
        } else if (this.f32584d0 != -1.0f) {
            C3302i j12 = c3298e.j(this.f32587g0);
            C3302i j13 = c3298e.j(h11);
            float f6 = this.f32584d0;
            C3296c k10 = c3298e.k();
            k10.f31702d.a(j12, -1.0f);
            k10.f31702d.a(j13, f6);
            c3298e.c(k10);
        }
    }

    @Override // i1.d
    public final boolean c() {
        return true;
    }

    @Override // i1.d
    public final C3458c h(int i10) {
        switch (AbstractC6708l.f(i10)) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.f32588h0 == 1) {
                    return this.f32587g0;
                }
                break;
            case 2:
            case 4:
                if (this.f32588h0 == 0) {
                    return this.f32587g0;
                }
                break;
        }
        throw new AssertionError(AbstractC2469q0.v(i10));
    }
}
