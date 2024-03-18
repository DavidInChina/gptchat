package wh;

import java.util.List;
import th.AbstractC5806n;
import th.C5805m;
import yh.X0;
import yh.l1;

/* renamed from: wh.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6259x extends AbstractC6258w {

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC6242g f48576h0;

    /* renamed from: i0  reason: collision with root package name */
    public final l1.a f48577i0;

    /* renamed from: j0  reason: collision with root package name */
    public final List f48578j0;

    /* renamed from: k0  reason: collision with root package name */
    public final String f48579k0;

    /* renamed from: l0  reason: collision with root package name */
    public final Integer f48580l0;

    /* renamed from: m0  reason: collision with root package name */
    public final int f48581m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int f48582n0;

    public C6259x(AbstractC6242g abstractC6242g, l1.a aVar, List list, String str, Integer num, int i10, int i11) {
        this.f48576h0 = abstractC6242g;
        this.f48577i0 = aVar;
        this.f48578j0 = list;
        this.f48579k0 = str;
        this.f48580l0 = num;
        this.f48581m0 = i10;
        this.f48582n0 = i11;
    }

    @Override // wh.AbstractC6226B
    public final AbstractC6250o B0() {
        return this.f48576h0;
    }

    @Override // wh.AbstractC6226B
    public final boolean L0() {
        if (this.f48580l0 != null) {
            return true;
        }
        return false;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return new C5805m(0, this.f48578j0);
    }

    @Override // wh.AbstractC6226B
    public final int getIndex() {
        return this.f48581m0;
    }

    @Override // wh.AbstractC6257v, sh.AbstractC5637i.b
    public final String getName() {
        String str = this.f48579k0;
        if (str == null) {
            return super.getName();
        }
        return str;
    }

    @Override // wh.AbstractC6226B
    public final l1.a getType() {
        AbstractC6242g abstractC6242g = this.f48576h0;
        return (l1.a) this.f48577i0.k(new X0(abstractC6242g.mo118a(), abstractC6242g));
    }

    @Override // wh.AbstractC6257v, wh.AbstractC6226B
    public final int s() {
        return this.f48582n0;
    }

    @Override // wh.AbstractC6257v, sh.AbstractC5636h
    public final int u0() {
        Integer num = this.f48580l0;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // sh.AbstractC5638j
    public final boolean v0() {
        if (this.f48579k0 != null) {
            return true;
        }
        return false;
    }
}
