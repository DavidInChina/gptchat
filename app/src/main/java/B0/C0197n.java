package B0;

import G0.x0;
import android.gov.nist.javax.sip.header.ParameterNames;
import eh.AbstractC2911k;
import eh.C2917q;
import id.AbstractC3557B;
import java.util.List;
import java.util.Map;
import kf.AbstractC4268D;

/* renamed from: B0.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0197n extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f1660Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f1661Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0197n(int i10, kotlin.jvm.internal.B b10) {
        super(1);
        this.f1660Y = i10;
        this.f1661Z = b10;
    }

    public final Boolean a(C0198o c0198o) {
        int i10 = this.f1660Y;
        kotlin.jvm.internal.B b10 = this.f1661Z;
        switch (i10) {
            case 0:
                Object obj = b10.f37622Y;
                if (obj == null && c0198o.f1664u0) {
                    b10.f37622Y = c0198o;
                } else if (obj != null && c0198o.f1663t0 && c0198o.f1664u0) {
                    b10.f37622Y = c0198o;
                }
                return Boolean.TRUE;
            default:
                if (c0198o.f1663t0 && c0198o.f1664u0) {
                    b10.f37622Y = c0198o;
                }
                return Boolean.TRUE;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f1660Y;
        kotlin.jvm.internal.B b10 = this.f1661Z;
        switch (i10) {
            case 0:
                return a((C0198o) obj);
            case 1:
                C0198o c0198o = (C0198o) obj;
                x0 x0Var = x0.f5841Y;
                if (c0198o.f1664u0) {
                    b10.f37622Y = c0198o;
                    if (c0198o.f1663t0) {
                        return x0.f5842Z;
                    }
                    return x0Var;
                }
                return x0Var;
            case 2:
                return a((C0198o) obj);
            case 3:
                List list = (List) obj;
                AbstractC3557B.c0("fields", list);
                return AbstractC4268D.k1(kf.t.S2((Iterable) b10.f37622Y, list));
            case 4:
                Map map = (Map) obj;
                AbstractC3557B.c0("it", map);
                String str = (String) b10.f37622Y;
                C2917q c2917q = Vd.h.f18603a;
                if (str == null) {
                    map.remove(ParameterNames.ID);
                } else {
                    map.put(ParameterNames.ID, AbstractC2911k.b(str));
                }
                return yVar;
            default:
                kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) obj;
                AbstractC3557B.c0("it", bVar);
                b10.f37622Y = bVar;
                return yVar;
        }
    }
}
