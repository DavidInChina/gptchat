package ge;

import Fe.u;
import id.AbstractC3557B;
import j0.C3885a;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import me.x;
import wf.k;
import zc.C6821H;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: g  reason: collision with root package name */
    public boolean f31612g;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f31606a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f31607b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f31608c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public o f31609d = C3257a.f31582h0;

    /* renamed from: e  reason: collision with root package name */
    public boolean f31610e = true;

    /* renamed from: f  reason: collision with root package name */
    public boolean f31611f = true;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f31613h = u.f5364a;

    public final void a(x xVar, k kVar) {
        AbstractC3557B.c0("plugin", xVar);
        AbstractC3557B.c0("configure", kVar);
        LinkedHashMap linkedHashMap = this.f31607b;
        linkedHashMap.put(xVar.getKey(), new C3885a((k) linkedHashMap.get(xVar.getKey()), kVar, 5));
        LinkedHashMap linkedHashMap2 = this.f31606a;
        if (linkedHashMap2.containsKey(xVar.getKey())) {
            return;
        }
        linkedHashMap2.put(xVar.getKey(), new C6821H(11, xVar));
    }

    public final void b(f fVar) {
        AbstractC3557B.c0("other", fVar);
        this.f31610e = fVar.f31610e;
        this.f31611f = fVar.f31611f;
        this.f31612g = fVar.f31612g;
        this.f31606a.putAll(fVar.f31606a);
        this.f31607b.putAll(fVar.f31607b);
        this.f31608c.putAll(fVar.f31608c);
    }
}
