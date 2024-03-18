package Bg;

import Mf.AbstractC1000i;
import id.AbstractC3557B;

/* renamed from: Bg.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0230x extends h0 {

    /* renamed from: b  reason: collision with root package name */
    public final Mf.b0[] f2162b;

    /* renamed from: c  reason: collision with root package name */
    public final d0[] f2163c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2164d;

    public C0230x(Mf.b0[] b0VarArr, d0[] d0VarArr, boolean z10) {
        AbstractC3557B.c0("parameters", b0VarArr);
        AbstractC3557B.c0("arguments", d0VarArr);
        this.f2162b = b0VarArr;
        this.f2163c = d0VarArr;
        this.f2164d = z10;
    }

    @Override // Bg.h0
    public final boolean b() {
        return this.f2164d;
    }

    @Override // Bg.h0
    public final d0 d(A a5) {
        Mf.b0 b0Var;
        AbstractC1000i k10 = a5.y0().k();
        if (k10 instanceof Mf.b0) {
            b0Var = (Mf.b0) k10;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            return null;
        }
        int index = b0Var.getIndex();
        Mf.b0[] b0VarArr = this.f2162b;
        if (index >= b0VarArr.length || !AbstractC3557B.K(b0VarArr[index].f(), b0Var.f())) {
            return null;
        }
        return this.f2163c[index];
    }

    @Override // Bg.h0
    public final boolean e() {
        if (this.f2163c.length == 0) {
            return true;
        }
        return false;
    }
}
