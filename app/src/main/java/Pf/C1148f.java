package Pf;

import Mf.AbstractC1000i;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.List;
import rg.AbstractC5493d;

/* renamed from: Pf.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1148f implements Bg.Y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractC1149g f14090a;

    public C1148f(AbstractC1149g abstractC1149g) {
        this.f14090a = abstractC1149g;
    }

    @Override // Bg.Y
    public final List getParameters() {
        List list = ((zg.t) this.f14090a).f52099u0;
        if (list != null) {
            return list;
        }
        AbstractC3557B.C2("typeConstructorParameters");
        throw null;
    }

    @Override // Bg.Y
    public final Jf.l j() {
        return AbstractC5493d.e(this.f14090a);
    }

    @Override // Bg.Y
    public final AbstractC1000i k() {
        return this.f14090a;
    }

    @Override // Bg.Y
    public final Collection l() {
        Collection l10 = ((zg.t) this.f14090a).y0().y0().l();
        AbstractC3557B.b0("getSupertypes(...)", l10);
        return l10;
    }

    @Override // Bg.Y
    public final boolean m() {
        return true;
    }

    public final String toString() {
        return "[typealias " + this.f14090a.getName().b() + ']';
    }
}
