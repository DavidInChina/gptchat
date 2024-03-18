package me;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    public static final Fe.a f39271a = new Fe.a("ApplicationPluginRegistry");

    public static final Object a(ge.d dVar, C4628a c4628a) {
        AbstractC3557B.c0("<this>", dVar);
        Object b10 = b(dVar, c4628a);
        if (b10 != null) {
            return b10;
        }
        throw new IllegalStateException("Plugin " + c4628a + " is not installed. Consider using `install(" + c4628a.getKey() + ")` in client config first.");
    }

    public static final Object b(ge.d dVar, x xVar) {
        AbstractC3557B.c0("<this>", dVar);
        AbstractC3557B.c0("plugin", xVar);
        Fe.b bVar = (Fe.b) dVar.f31602o0.d(f39271a);
        if (bVar != null) {
            return bVar.d(xVar.getKey());
        }
        return null;
    }
}
