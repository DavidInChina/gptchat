package Sf;

import bg.AbstractC2193a;
import bg.AbstractC2196d;
import id.AbstractC3557B;
import java.lang.annotation.Annotation;
import java.util.Collection;
import kg.C4291c;
import kg.C4294f;

/* loaded from: classes.dex */
public final class F extends u implements AbstractC2196d {

    /* renamed from: a  reason: collision with root package name */
    public final D f16593a;

    /* renamed from: b  reason: collision with root package name */
    public final Annotation[] f16594b;

    /* renamed from: c  reason: collision with root package name */
    public final String f16595c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f16596d;

    public F(D d10, Annotation[] annotationArr, String str, boolean z10) {
        AbstractC3557B.c0("reflectAnnotations", annotationArr);
        this.f16593a = d10;
        this.f16594b = annotationArr;
        this.f16595c = str;
        this.f16596d = z10;
    }

    @Override // bg.AbstractC2196d
    public final Collection getAnnotations() {
        return AbstractC3557B.e1(this.f16594b);
    }

    @Override // bg.AbstractC2196d
    public final AbstractC2193a l(C4291c c4291c) {
        AbstractC3557B.c0("fqName", c4291c);
        return AbstractC3557B.E0(this.f16594b, c4291c);
    }

    public final String toString() {
        String str;
        C4294f c4294f;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(F.class.getName());
        sb2.append(": ");
        if (this.f16596d) {
            str = "vararg ";
        } else {
            str = "";
        }
        sb2.append(str);
        String str2 = this.f16595c;
        if (str2 != null) {
            c4294f = C4294f.d(str2);
        } else {
            c4294f = null;
        }
        sb2.append(c4294f);
        sb2.append(": ");
        sb2.append(this.f16593a);
        return sb2.toString();
    }
}
