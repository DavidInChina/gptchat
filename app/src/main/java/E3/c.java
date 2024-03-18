package e3;

import nf.AbstractC4828h;
import s2.u;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f28802a;

    /* renamed from: b  reason: collision with root package name */
    public int f28803b;

    /* renamed from: c  reason: collision with root package name */
    public int f28804c;

    /* renamed from: d  reason: collision with root package name */
    public long f28805d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f28806e;

    /* renamed from: f  reason: collision with root package name */
    public final u f28807f;

    /* renamed from: g  reason: collision with root package name */
    public final u f28808g;

    /* renamed from: h  reason: collision with root package name */
    public int f28809h;

    /* renamed from: i  reason: collision with root package name */
    public int f28810i;

    public c(u uVar, u uVar2, boolean z10) {
        this.f28808g = uVar;
        this.f28807f = uVar2;
        this.f28806e = z10;
        uVar2.F(12);
        this.f28802a = uVar2.x();
        uVar.F(12);
        this.f28810i = uVar.x();
        AbstractC4828h.u("first_chunk must be 1", uVar.g() != 1 ? false : true);
        this.f28803b = -1;
    }

    public final boolean a() {
        long j6;
        int i10;
        int i11 = this.f28803b + 1;
        this.f28803b = i11;
        if (i11 == this.f28802a) {
            return false;
        }
        boolean z10 = this.f28806e;
        u uVar = this.f28807f;
        if (z10) {
            j6 = uVar.y();
        } else {
            j6 = uVar.v();
        }
        this.f28805d = j6;
        if (this.f28803b == this.f28809h) {
            u uVar2 = this.f28808g;
            this.f28804c = uVar2.x();
            uVar2.G(4);
            int i12 = this.f28810i - 1;
            this.f28810i = i12;
            if (i12 > 0) {
                i10 = uVar2.x() - 1;
            } else {
                i10 = -1;
            }
            this.f28809h = i10;
        }
        return true;
    }
}
