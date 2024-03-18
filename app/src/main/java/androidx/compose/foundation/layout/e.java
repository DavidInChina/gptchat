package androidx.compose.foundation.layout;

import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4316h;
import l0.C4317i;
import l0.C4318j;
import y.C6473k;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final FillElement f24737a = new FillElement(2, 1.0f);

    /* renamed from: b  reason: collision with root package name */
    public static final FillElement f24738b = new FillElement(1, 1.0f);

    /* renamed from: c  reason: collision with root package name */
    public static final FillElement f24739c = new FillElement(3, 1.0f);

    /* renamed from: d  reason: collision with root package name */
    public static final WrapContentElement f24740d;

    /* renamed from: e  reason: collision with root package name */
    public static final WrapContentElement f24741e;

    /* renamed from: f  reason: collision with root package name */
    public static final WrapContentElement f24742f;

    /* renamed from: g  reason: collision with root package name */
    public static final WrapContentElement f24743g;

    /* renamed from: h  reason: collision with root package name */
    public static final WrapContentElement f24744h;

    /* renamed from: i  reason: collision with root package name */
    public static final WrapContentElement f24745i;

    static {
        C4316h c4316h = C4310b.f37706s0;
        f24740d = new WrapContentElement(2, false, new C6473k(3, c4316h), c4316h);
        C4316h c4316h2 = C4310b.f37705r0;
        f24741e = new WrapContentElement(2, false, new C6473k(3, c4316h2), c4316h2);
        C4317i c4317i = C4310b.f37703p0;
        f24742f = new WrapContentElement(1, false, new C6473k(1, c4317i), c4317i);
        C4317i c4317i2 = C4310b.f37702o0;
        f24743g = new WrapContentElement(1, false, new C6473k(1, c4317i2), c4317i2);
        C4318j c4318j = C4310b.f37697j0;
        f24744h = new WrapContentElement(3, false, new C6473k(2, c4318j), c4318j);
        C4318j c4318j2 = C4310b.f37693Y;
        f24745i = new WrapContentElement(3, false, new C6473k(2, c4318j2), c4318j2);
    }

    public static final AbstractC4326r a(AbstractC4326r abstractC4326r, float f6, float f10) {
        return abstractC4326r.g(new UnspecifiedConstraintsElement(f6, f10));
    }

    public static /* synthetic */ AbstractC4326r b(AbstractC4326r abstractC4326r, float f6, float f10, int i10) {
        if ((i10 & 1) != 0) {
            f6 = Float.NaN;
        }
        if ((i10 & 2) != 0) {
            f10 = Float.NaN;
        }
        return a(abstractC4326r, f6, f10);
    }

    public static final AbstractC4326r c(AbstractC4326r abstractC4326r, float f6) {
        FillElement fillElement;
        if (f6 == 1.0f) {
            fillElement = f24738b;
        } else {
            fillElement = new FillElement(1, f6);
        }
        return abstractC4326r.g(fillElement);
    }

    public static final AbstractC4326r d(AbstractC4326r abstractC4326r, float f6) {
        FillElement fillElement;
        if (f6 == 1.0f) {
            fillElement = f24737a;
        } else {
            fillElement = new FillElement(2, f6);
        }
        return abstractC4326r.g(fillElement);
    }

    public static final AbstractC4326r e(AbstractC4326r abstractC4326r, float f6) {
        return abstractC4326r.g(new SizeElement(0.0f, f6, 0.0f, f6, 5));
    }

    public static final AbstractC4326r f(AbstractC4326r abstractC4326r, float f6, float f10) {
        return abstractC4326r.g(new SizeElement(0.0f, f6, 0.0f, f10, 5));
    }

    public static /* synthetic */ AbstractC4326r g(AbstractC4326r abstractC4326r, float f6, float f10, int i10) {
        if ((i10 & 1) != 0) {
            f6 = Float.NaN;
        }
        if ((i10 & 2) != 0) {
            f10 = Float.NaN;
        }
        return f(abstractC4326r, f6, f10);
    }

    public static final AbstractC4326r h(AbstractC4326r abstractC4326r, float f6) {
        return abstractC4326r.g(new SizeElement(f6, f6, f6, f6, false));
    }

    public static final AbstractC4326r i(AbstractC4326r abstractC4326r, float f6, float f10) {
        return abstractC4326r.g(new SizeElement(f6, f10, f6, f10, false));
    }

    public static final AbstractC4326r j(AbstractC4326r abstractC4326r, float f6) {
        return abstractC4326r.g(new SizeElement(f6, f6, f6, f6, true));
    }

    public static final AbstractC4326r k(AbstractC4326r abstractC4326r, float f6, float f10) {
        return abstractC4326r.g(new SizeElement(f6, f10, f6, f10, true));
    }

    public static AbstractC4326r l(AbstractC4326r abstractC4326r, float f6, float f10, float f11, float f12, int i10) {
        float f13;
        float f14;
        float f15;
        float f16;
        if ((i10 & 1) != 0) {
            f13 = Float.NaN;
        } else {
            f13 = f6;
        }
        if ((i10 & 2) != 0) {
            f14 = Float.NaN;
        } else {
            f14 = f10;
        }
        if ((i10 & 4) != 0) {
            f15 = Float.NaN;
        } else {
            f15 = f11;
        }
        if ((i10 & 8) != 0) {
            f16 = Float.NaN;
        } else {
            f16 = f12;
        }
        return abstractC4326r.g(new SizeElement(f13, f14, f15, f16, true));
    }

    public static final AbstractC4326r m(AbstractC4326r abstractC4326r, float f6) {
        return abstractC4326r.g(new SizeElement(f6, 0.0f, f6, 0.0f, 10));
    }

    public static AbstractC4326r n(AbstractC4326r abstractC4326r, float f6, float f10, int i10) {
        float f11;
        float f12;
        if ((i10 & 1) != 0) {
            f11 = Float.NaN;
        } else {
            f11 = f6;
        }
        if ((i10 & 2) != 0) {
            f12 = Float.NaN;
        } else {
            f12 = f10;
        }
        return abstractC4326r.g(new SizeElement(f11, 0.0f, f12, 0.0f, 10));
    }

    public static AbstractC4326r o(AbstractC4326r abstractC4326r) {
        WrapContentElement wrapContentElement;
        C4317i c4317i = C4310b.f37703p0;
        if (AbstractC3557B.K(c4317i, c4317i)) {
            wrapContentElement = f24742f;
        } else if (AbstractC3557B.K(c4317i, C4310b.f37702o0)) {
            wrapContentElement = f24743g;
        } else {
            wrapContentElement = new WrapContentElement(1, false, new C6473k(1, c4317i), c4317i);
        }
        return abstractC4326r.g(wrapContentElement);
    }

    public static AbstractC4326r p(AbstractC4326r abstractC4326r, C4318j c4318j) {
        WrapContentElement wrapContentElement;
        if (AbstractC3557B.K(c4318j, C4310b.f37697j0)) {
            wrapContentElement = f24744h;
        } else if (AbstractC3557B.K(c4318j, C4310b.f37693Y)) {
            wrapContentElement = f24745i;
        } else {
            wrapContentElement = new WrapContentElement(3, false, new C6473k(2, c4318j), c4318j);
        }
        return abstractC4326r.g(wrapContentElement);
    }

    public static AbstractC4326r q(AbstractC4326r abstractC4326r) {
        WrapContentElement wrapContentElement;
        C4316h c4316h = C4310b.f37706s0;
        if (AbstractC3557B.K(c4316h, c4316h)) {
            wrapContentElement = f24740d;
        } else if (AbstractC3557B.K(c4316h, C4310b.f37705r0)) {
            wrapContentElement = f24741e;
        } else {
            wrapContentElement = new WrapContentElement(2, false, new C6473k(3, c4316h), c4316h);
        }
        return abstractC4326r.g(wrapContentElement);
    }
}
