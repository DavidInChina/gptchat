package W0;

import B1.g;
import U0.c;
import U0.d;
import U0.e;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f20671a = new Object();

    public final Object a(d dVar) {
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(dVar, 10));
        for (c cVar : dVar.f17383Y) {
            e eVar = cVar.f17382a;
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale", eVar);
            arrayList.add(((U0.a) eVar).f17378a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return g.h(g.f((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(V0.d dVar, d dVar2) {
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(dVar2, 10));
        for (c cVar : dVar2.f17383Y) {
            e eVar = cVar.f17382a;
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale", eVar);
            arrayList.add(((U0.a) eVar).f17378a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        dVar.setTextLocales(g.f((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
