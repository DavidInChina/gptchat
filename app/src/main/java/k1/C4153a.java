package k1;

import android.util.AttributeSet;
import i1.C3456a;

/* renamed from: k1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4153a extends c {

    /* renamed from: n0  reason: collision with root package name */
    public int f36765n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f36766o0;

    /* renamed from: p0  reason: collision with root package name */
    public C3456a f36767p0;

    /* JADX WARN: Type inference failed for: r3v1, types: [i1.j, i1.a] */
    @Override // k1.c
    public final void e(AttributeSet attributeSet) {
        ?? jVar = new i1.j();
        jVar.f32437f0 = 0;
        jVar.f32438g0 = true;
        jVar.f32439h0 = 0;
        this.f36767p0 = jVar;
        this.f36777k0 = jVar;
        g();
    }

    @Override // k1.c
    public final void f(i1.d dVar, boolean z10) {
        int i10 = this.f36765n0;
        this.f36766o0 = i10;
        if (z10) {
            if (i10 == 5) {
                this.f36766o0 = 1;
            } else if (i10 == 6) {
                this.f36766o0 = 0;
            }
        } else if (i10 == 5) {
            this.f36766o0 = 0;
        } else if (i10 == 6) {
            this.f36766o0 = 1;
        }
        if (dVar instanceof C3456a) {
            ((C3456a) dVar).f32437f0 = this.f36766o0;
        }
    }

    public int getMargin() {
        return this.f36767p0.f32439h0;
    }

    public int getType() {
        return this.f36765n0;
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f36767p0.f32438g0 = z10;
    }

    public void setDpMargin(int i10) {
        this.f36767p0.f32439h0 = (int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i10) {
        this.f36767p0.f32439h0 = i10;
    }

    public void setType(int i10) {
        this.f36765n0 = i10;
    }
}
