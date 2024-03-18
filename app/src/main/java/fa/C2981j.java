package fa;

import ga.C3222a;
import id.AbstractC3557B;

/* renamed from: fa.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2981j implements yi.c {
    @Override // yi.c
    public final ti.c a(yi.d dVar, S4.o oVar) {
        CharSequence charSequence = ((ti.f) dVar).f46257a.f50076a;
        AbstractC3557B.b0("getContent(...)", charSequence);
        boolean K22 = Lg.n.K2(charSequence, "\\[");
        if (K22) {
            ti.c cVar = new ti.c(new C3222a());
            cVar.f46243b = 2;
            return cVar;
        } else if (!K22) {
            return null;
        } else {
            throw new RuntimeException();
        }
    }
}
