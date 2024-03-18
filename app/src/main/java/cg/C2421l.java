package cg;

import Bg.A;
import Mf.AbstractC0994c;
import Pf.AbstractC1146d;
import id.AbstractC3557B;

/* renamed from: cg.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2421l extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public static final C2421l f26643Y = new kotlin.jvm.internal.o(1);

    @Override // wf.k
    public final Object invoke(Object obj) {
        AbstractC0994c abstractC0994c = (AbstractC0994c) obj;
        AbstractC3557B.c0("it", abstractC0994c);
        AbstractC1146d Z10 = abstractC0994c.Z();
        AbstractC3557B.Z(Z10);
        A type = Z10.getType();
        AbstractC3557B.b0("getType(...)", type);
        return type;
    }
}
