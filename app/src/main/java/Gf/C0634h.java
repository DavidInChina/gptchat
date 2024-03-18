package Gf;

import G0.C0588q;
import id.AbstractC3557B;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: Gf.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0634h extends R4.b {

    /* renamed from: j  reason: collision with root package name */
    public final List f6414j;

    public C0634h(Class cls) {
        AbstractC3557B.c0("jClass", cls);
        Method[] declaredMethods = cls.getDeclaredMethods();
        AbstractC3557B.b0("getDeclaredMethods(...)", declaredMethods);
        this.f6414j = kf.q.x3(declaredMethods, new C0588q(21));
    }

    @Override // R4.b
    public final String F() {
        return kf.t.m2(this.f6414j, "", "<init>(", ")V", C0627b.f6389l0, 24);
    }
}
