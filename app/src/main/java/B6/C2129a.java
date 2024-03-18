package b6;

import M3.H;
import R5.b;
import c6.j;
import id.AbstractC3557B;
import p5.AbstractC5091c;
import t5.AbstractC5675a;
import t5.AbstractC5676b;
import t5.d;

/* renamed from: b6.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2129a implements AbstractC5675a {

    /* renamed from: Y  reason: collision with root package name */
    public final b f25644Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC5091c f25645Z;

    public C2129a(U5.b bVar, AbstractC5091c abstractC5091c) {
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f25644Y = bVar;
        this.f25645Z = abstractC5091c;
    }

    @Override // t5.AbstractC5675a
    public final boolean e(AbstractC5676b abstractC5676b, Object obj) {
        boolean a5;
        j jVar = (j) obj;
        AbstractC3557B.c0("writer", abstractC5676b);
        AbstractC3557B.c0("element", jVar);
        byte[] r02 = H.r0(this.f25644Y, jVar, this.f25645Z);
        if (r02 == null) {
            return false;
        }
        synchronized (this) {
            a5 = abstractC5676b.a(new d(r02));
        }
        return a5;
    }
}
