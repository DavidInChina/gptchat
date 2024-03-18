package yh;

import java.util.List;
import sh.AbstractC5641m;
import th.AbstractC5806n;
import th.C5805m;
import yh.l1;

/* renamed from: yh.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6606f extends AbstractC6603e {

    /* renamed from: Y  reason: collision with root package name */
    public final l1 f51000Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f51001Z;

    /* renamed from: h0  reason: collision with root package name */
    public final l1.a f51002h0;

    /* renamed from: i0  reason: collision with root package name */
    public final List f51003i0;

    public C6606f(l1 l1Var, C6609g c6609g) {
        String str = c6609g.f51008a;
        C5805m c5805m = new C5805m(0, c6609g.f51010c);
        this.f51000Y = l1Var;
        this.f51001Z = str;
        this.f51002h0 = c6609g.f51009b;
        this.f51003i0 = c5805m;
    }

    @Override // yh.AbstractC6603e, sh.AbstractC5633e, wh.AbstractC6242g
    /* renamed from: a  reason: collision with other method in class */
    public final AbstractC6632q mo118a() {
        return this.f51000Y;
    }

    @Override // sh.AbstractC5637i
    public final String f1() {
        return this.f51001Z;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return new C5805m(0, this.f51003i0);
    }

    @Override // yh.AbstractC6612h
    public final l1.a getType() {
        l1 l1Var = this.f51000Y;
        return (l1.a) this.f51002h0.k(new X0((AbstractC6632q) l1Var, (AbstractC5641m) l1Var.l0()));
    }

    @Override // yh.AbstractC6603e, sh.AbstractC5633e, wh.AbstractC6242g
    /* renamed from: a */
    public final l1 mo118a() {
        return this.f51000Y;
    }
}
