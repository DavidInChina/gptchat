package Nf;

import Bg.A;
import Bg.D;
import Mf.AbstractC0997f;
import Mf.V;
import java.util.Map;
import kg.C4291c;
import rg.AbstractC5493d;

/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public final A f12803a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f12804b;

    /* renamed from: c  reason: collision with root package name */
    public final V f12805c;

    public d(D d10, Map map, V v10) {
        if (d10 != null) {
            if (map != null) {
                if (v10 != null) {
                    this.f12803a = d10;
                    this.f12804b = map;
                    this.f12805c = v10;
                    return;
                }
                c(2);
                throw null;
            }
            c(1);
            throw null;
        }
        c(0);
        throw null;
    }

    public static /* synthetic */ void c(int i10) {
        String str;
        int i11;
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3 && i10 != 4 && i10 != 5) {
                    objArr[0] = "annotationType";
                } else {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
                }
            } else {
                objArr[0] = "source";
            }
        } else {
            objArr[0] = "valueArguments";
        }
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
                } else {
                    objArr[1] = "getSource";
                }
            } else {
                objArr[1] = "getAllValueArguments";
            }
        } else {
            objArr[1] = "getType";
        }
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            throw new IllegalStateException(format);
        }
    }

    @Override // Nf.c
    public final C4291c a() {
        AbstractC0997f d10 = AbstractC5493d.d(this);
        if (d10 == null) {
            return null;
        }
        if (Dg.m.f(d10)) {
            d10 = null;
        }
        if (d10 == null) {
            return null;
        }
        return AbstractC5493d.c(d10);
    }

    @Override // Nf.c
    public final Map b() {
        Map map = this.f12804b;
        if (map != null) {
            return map;
        }
        c(4);
        throw null;
    }

    @Override // Nf.c
    public final V g() {
        V v10 = this.f12805c;
        if (v10 != null) {
            return v10;
        }
        c(5);
        throw null;
    }

    @Override // Nf.c
    public final A getType() {
        A a5 = this.f12803a;
        if (a5 != null) {
            return a5;
        }
        c(3);
        throw null;
    }

    public final String toString() {
        return mg.m.f39296c.w(this, null);
    }
}
