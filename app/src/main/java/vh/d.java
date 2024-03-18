package vh;

import java.util.List;
import sh.AbstractC5641m;
import th.AbstractC5806n;
import th.C5805m;
import yh.AbstractC6632q;
import yh.X0;
import yh.l1;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: Z  reason: collision with root package name */
    public final l1 f47536Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f47537h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f47538i0;

    /* renamed from: j0  reason: collision with root package name */
    public final l1.a f47539j0;

    /* renamed from: k0  reason: collision with root package name */
    public final List f47540k0;

    public d(l1 l1Var, f fVar) {
        String str = fVar.f47544a;
        C5805m c5805m = new C5805m(0, fVar.f47547d);
        this.f47536Z = l1Var;
        this.f47537h0 = str;
        this.f47538i0 = fVar.f47545b;
        this.f47539j0 = fVar.f47546c;
        this.f47540k0 = c5805m;
    }

    @Override // vh.c, vh.g, sh.AbstractC5633e, wh.AbstractC6242g
    /* renamed from: a  reason: collision with other method in class */
    public final AbstractC6632q mo118a() {
        return this.f47536Z;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return new C5805m(0, this.f47540k0);
    }

    @Override // sh.AbstractC5637i.b
    public final String getName() {
        return this.f47537h0;
    }

    @Override // vh.g
    public final l1.a getType() {
        l1 l1Var = this.f47536Z;
        return (l1.a) this.f47539j0.k(new X0((AbstractC6632q) l1Var, (AbstractC5641m) l1Var.l0()));
    }

    @Override // sh.AbstractC5636h
    public final int u0() {
        return this.f47538i0;
    }

    @Override // vh.c, vh.g, sh.AbstractC5633e, wh.AbstractC6242g
    /* renamed from: a */
    public final l1 mo118a() {
        return this.f47536Z;
    }
}
