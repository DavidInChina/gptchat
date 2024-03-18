package cg;

import Bg.o0;
import Mf.AbstractC1000i;
import id.AbstractC3557B;
import kg.C4291c;
import kg.C4294f;
import rg.AbstractC5493d;

/* renamed from: cg.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2420k extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public static final C2420k f26642Y = new kotlin.jvm.internal.o(1);

    @Override // wf.k
    public final Object invoke(Object obj) {
        boolean z10;
        AbstractC1000i k10 = ((o0) obj).y0().k();
        if (k10 == null) {
            return Boolean.FALSE;
        }
        C4294f name = k10.getName();
        C4291c c4291c = Lf.d.f11072f;
        if (AbstractC3557B.K(name, c4291c.f()) && AbstractC3557B.K(AbstractC5493d.c(k10), c4291c)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
