package ga;

import Lg.n;
import id.AbstractC3557B;
import wi.h;
import wi.s;
import xi.d;

/* renamed from: ga.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3222a extends yi.a {

    /* renamed from: a  reason: collision with root package name */
    public final h f31346a = new s();

    /* renamed from: b  reason: collision with root package name */
    public final StringBuilder f31347b = new StringBuilder();

    /* renamed from: c  reason: collision with root package name */
    public boolean f31348c;

    @Override // yi.a
    public final void a(d dVar) {
        CharSequence charSequence;
        CharSequence charSequence2 = dVar.f50076a;
        AbstractC3557B.b0("getContent(...)", charSequence2);
        boolean e22 = n.e2(charSequence2, "\\]");
        StringBuilder sb2 = this.f31347b;
        if (e22) {
            if (n.e2(charSequence2, "\\]")) {
                charSequence = charSequence2.subSequence(0, charSequence2.length() - "\\]".length());
            } else {
                charSequence = charSequence2.subSequence(0, charSequence2.length());
            }
            sb2.append(charSequence);
            this.f31348c = true;
            return;
        }
        sb2.append(charSequence2);
        sb2.append('\n');
    }

    @Override // yi.a
    public final void e() {
        h hVar = this.f31346a;
        hVar.f48595j = "latex";
        hVar.f48596k = this.f31347b.toString();
    }

    @Override // yi.a
    public final wi.a f() {
        return this.f31346a;
    }

    @Override // yi.a
    public final ti.a i(yi.d dVar) {
        AbstractC3557B.c0("state", dVar);
        if (this.f31348c) {
            return new ti.a(-1, -1, true);
        }
        return ti.a.a(0);
    }
}
