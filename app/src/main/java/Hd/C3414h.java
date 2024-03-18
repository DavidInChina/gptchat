package hd;

import Ad.l;
import Ng.Q;
import jf.y;
import ld.C4431d;
import nf.AbstractC4825e;
import od.AbstractC4991b;
import od.EnumC4990a;

/* renamed from: hd.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3414h implements AbstractC4991b {

    /* renamed from: a  reason: collision with root package name */
    public final C4431d f32254a;

    /* renamed from: b  reason: collision with root package name */
    public final Pc.a f32255b;

    /* renamed from: c  reason: collision with root package name */
    public final Lc.e f32256c;

    /* renamed from: d  reason: collision with root package name */
    public final EnumC4990a f32257d = EnumC4990a.f41297Y;

    public C3414h(C4431d c4431d, Pc.a aVar, Lc.e eVar) {
        this.f32254a = c4431d;
        this.f32255b = aVar;
        this.f32256c = eVar;
    }

    @Override // od.AbstractC4991b
    public final EnumC4990a a() {
        return this.f32257d;
    }

    @Override // od.AbstractC4991b
    public final Object b(AbstractC4825e abstractC4825e) {
        return y.f36177a;
    }

    @Override // od.AbstractC4991b
    public final Tg.e c() {
        return Q.f12904a;
    }

    @Override // od.AbstractC4991b
    public final Object d(AbstractC4825e abstractC4825e) {
        return y.f36177a;
    }

    @Override // od.AbstractC4991b
    public final void e() {
        C3412f c3412f = C3412f.f32250Y;
        j9.e eVar = (j9.e) this.f32255b;
        eVar.getClass();
        eVar.f36087a.add(c3412f);
        l.O0(this.f32254a, null, null, new C3413g(this, null), 3);
    }
}
