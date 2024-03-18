package Gf;

import id.AbstractC3557B;
import java.lang.reflect.Constructor;

/* renamed from: Gf.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0635i extends R4.b {

    /* renamed from: j  reason: collision with root package name */
    public final Constructor f6417j;

    public C0635i(Constructor constructor) {
        AbstractC3557B.c0("constructor", constructor);
        this.f6417j = constructor;
    }

    @Override // R4.b
    public final String F() {
        Class<?>[] parameterTypes = this.f6417j.getParameterTypes();
        AbstractC3557B.b0("getParameterTypes(...)", parameterTypes);
        return kf.q.r3(parameterTypes, "", "<init>(", ")V", C0627b.f6390m0, 24);
    }
}
