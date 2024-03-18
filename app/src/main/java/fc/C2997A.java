package fc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import mc.C4616c;
import sd.AbstractC5616e;
import sd.C5615d;
import td.C5756a;

/* renamed from: fc.A  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2997A implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f30106a;

    public C2997A(AbstractC2400f abstractC2400f) {
        this.f30106a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f30106a.get();
        AbstractC3557B.b0("get(...)", obj);
        return new AbstractC5616e((C5615d) obj, "developer_settings", new C5756a(C4616c.Companion.serializer()), new C4616c(false, false, Vc.A.f18524Z, false));
    }
}
