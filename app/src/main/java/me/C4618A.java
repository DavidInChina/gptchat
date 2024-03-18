package me;

import G0.C0588q;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.C3959i;
import kf.AbstractC4267C;
import l8.AbstractC4344b;

/* renamed from: me.A  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4618A {

    /* renamed from: d  reason: collision with root package name */
    public static final C4628a f39133d = new C4628a(3, 0);

    /* renamed from: e  reason: collision with root package name */
    public static final Fe.a f39134e = new Fe.a("HttpPlainText");

    /* renamed from: a  reason: collision with root package name */
    public final Charset f39135a;

    /* renamed from: b  reason: collision with root package name */
    public final Charset f39136b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39137c;

    public C4618A(Set set, Map map, Charset charset, Charset charset2) {
        Charset charset3;
        AbstractC3557B.c0("charsets", set);
        AbstractC3557B.c0("charsetQuality", map);
        AbstractC3557B.c0("responseCharsetFallback", charset2);
        this.f39135a = charset2;
        List<C3959i> F22 = kf.t.F2(AbstractC4267C.n1(map), new C0588q(14));
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (!map.containsKey((Charset) obj)) {
                arrayList.add(obj);
            }
        }
        List<Charset> F23 = kf.t.F2(arrayList, new C0588q(13));
        StringBuilder sb2 = new StringBuilder();
        for (Charset charset4 : F23) {
            if (sb2.length() > 0) {
                sb2.append(Separators.COMMA);
            }
            sb2.append(Le.a.d(charset4));
        }
        for (C3959i c3959i : F22) {
            Charset charset5 = (Charset) c3959i.f36155Y;
            float floatValue = ((Number) c3959i.f36156Z).floatValue();
            if (sb2.length() > 0) {
                sb2.append(Separators.COMMA);
            }
            double d10 = floatValue;
            if (0.0d <= d10 && d10 <= 1.0d) {
                sb2.append(Le.a.d(charset5) + ";q=" + (AbstractC4344b.Y0(100 * floatValue) / 100.0d));
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        if (sb2.length() == 0) {
            sb2.append(Le.a.d(this.f39135a));
        }
        String sb3 = sb2.toString();
        AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb3);
        this.f39137c = sb3;
        if (charset == null && (charset = (Charset) kf.t.h2(F23)) == null) {
            C3959i c3959i2 = (C3959i) kf.t.h2(F22);
            if (c3959i2 != null) {
                charset3 = (Charset) c3959i2.f36155Y;
            } else {
                charset3 = null;
            }
            charset = charset3;
            if (charset == null) {
                charset = Lg.a.f11131a;
            }
        }
        this.f39136b = charset;
    }
}
