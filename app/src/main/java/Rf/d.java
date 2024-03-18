package Rf;

import Cf.k;
import Lg.n;
import dg.w;
import dg.x;
import id.AbstractC3557B;
import kg.C4290b;
import yg.C6588e;

/* loaded from: classes2.dex */
public final class d implements x {

    /* renamed from: a  reason: collision with root package name */
    public final ClassLoader f15501a;

    /* renamed from: b  reason: collision with root package name */
    public final C6588e f15502b = new Object();

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, yg.e] */
    public d(ClassLoader classLoader) {
        this.f15501a = classLoader;
    }

    public final w a(C4290b c4290b, jg.g gVar) {
        c f6;
        AbstractC3557B.c0("classId", c4290b);
        AbstractC3557B.c0("jvmMetadataVersion", gVar);
        String z22 = n.z2(c4290b.h().b(), '.', '$');
        if (!c4290b.g().d()) {
            z22 = c4290b.g() + '.' + z22;
        }
        Class l22 = R4.b.l2(this.f15501a, z22);
        if (l22 != null && (f6 = k.f(l22)) != null) {
            return new w(f6);
        }
        return null;
    }
}
