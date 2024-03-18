package cg;

import Bg.A;
import Mf.AbstractC0997f;
import Mf.V;
import java.util.Map;
import kg.C4291c;
import rg.AbstractC5493d;

/* renamed from: cg.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2411b implements Nf.c {

    /* renamed from: a  reason: collision with root package name */
    public static final C2411b f26618a = new Object();

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
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters".toString());
    }

    @Override // Nf.c
    public final V g() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters".toString());
    }

    @Override // Nf.c
    public final A getType() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters".toString());
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}
