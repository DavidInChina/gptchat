package Y5;

import c6.j;
import id.AbstractC3557B;
import p5.AbstractC5091c;
import p5.EnumC5090b;

/* loaded from: classes2.dex */
public final class b implements U5.a {

    /* renamed from: Y  reason: collision with root package name */
    public final U5.a f22104Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC5091c f22105Z;

    public b(U5.a aVar, AbstractC5091c abstractC5091c) {
        AbstractC3557B.c0("wrappedEventMapper", aVar);
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f22104Y = aVar;
        this.f22105Z = abstractC5091c;
    }

    @Override // U5.a
    public final Object k(Object obj) {
        j jVar = (j) obj;
        AbstractC3557B.c0("event", jVar);
        j jVar2 = (j) this.f22104Y.k(jVar);
        EnumC5090b enumC5090b = EnumC5090b.f42738Y;
        if (jVar2 == null) {
            P4.a.m0(this.f22105Z, 3, enumC5090b, new a(jVar, 0), null, false, 56);
        } else if (jVar2 != jVar) {
            P4.a.m0(this.f22105Z, 5, enumC5090b, new a(jVar, 1), null, false, 56);
        } else {
            return jVar2;
        }
        return null;
    }
}
