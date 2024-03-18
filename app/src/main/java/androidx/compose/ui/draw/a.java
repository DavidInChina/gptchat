package androidx.compose.ui.draw;

import E0.AbstractC0454m;
import l0.AbstractC4313e;
import l0.AbstractC4326r;
import l0.C4310b;
import r0.C5347k;
import r0.L;
import u0.AbstractC5824b;
import wf.k;

/* loaded from: classes.dex */
public abstract class a {
    public static final AbstractC4326r a(AbstractC4326r abstractC4326r, float f6) {
        if (f6 != 1.0f) {
            return androidx.compose.ui.graphics.a.m(abstractC4326r, 0.0f, 0.0f, f6, 0.0f, 0.0f, 0L, null, true, 126971);
        }
        return abstractC4326r;
    }

    public static final AbstractC4326r b(AbstractC4326r abstractC4326r, L l10) {
        return androidx.compose.ui.graphics.a.m(abstractC4326r, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, l10, true, 124927);
    }

    public static final AbstractC4326r c(AbstractC4326r abstractC4326r) {
        return androidx.compose.ui.graphics.a.m(abstractC4326r, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, 126975);
    }

    public static final AbstractC4326r d(AbstractC4326r abstractC4326r, k kVar) {
        return abstractC4326r.g(new DrawBehindElement(kVar));
    }

    public static final AbstractC4326r e(AbstractC4326r abstractC4326r, k kVar) {
        return abstractC4326r.g(new DrawWithCacheElement(kVar));
    }

    public static final AbstractC4326r f(AbstractC4326r abstractC4326r, k kVar) {
        return abstractC4326r.g(new DrawWithContentElement(kVar));
    }

    public static AbstractC4326r g(AbstractC4326r abstractC4326r, AbstractC5824b abstractC5824b, AbstractC4313e abstractC4313e, AbstractC0454m abstractC0454m, float f6, C5347k c5347k, int i10) {
        if ((i10 & 4) != 0) {
            abstractC4313e = C4310b.f37697j0;
        }
        AbstractC4313e abstractC4313e2 = abstractC4313e;
        if ((i10 & 16) != 0) {
            f6 = 1.0f;
        }
        return abstractC4326r.g(new PainterElement(abstractC5824b, true, abstractC4313e2, abstractC0454m, f6, c5347k));
    }

    public static final AbstractC4326r h(AbstractC4326r abstractC4326r, float f6) {
        if (f6 != 0.0f) {
            return androidx.compose.ui.graphics.a.m(abstractC4326r, 0.0f, 0.0f, 0.0f, 0.0f, f6, 0L, null, false, 130815);
        }
        return abstractC4326r;
    }

    public static final AbstractC4326r i(AbstractC4326r abstractC4326r, float f6) {
        int i10 = (f6 > 1.0f ? 1 : (f6 == 1.0f ? 0 : -1));
        if (i10 != 0 || i10 != 0) {
            return androidx.compose.ui.graphics.a.m(abstractC4326r, f6, f6, 0.0f, 0.0f, 0.0f, 0L, null, false, 131068);
        }
        return abstractC4326r;
    }
}
