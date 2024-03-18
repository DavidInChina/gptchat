package bi;

import Wh.D;
import Wh.t;
import Wh.z;
import ai.j;
import id.AbstractC3557B;
import java.util.List;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final j f26024a;

    /* renamed from: b  reason: collision with root package name */
    public final List f26025b;

    /* renamed from: c  reason: collision with root package name */
    public final int f26026c;

    /* renamed from: d  reason: collision with root package name */
    public final ai.e f26027d;

    /* renamed from: e  reason: collision with root package name */
    public final z f26028e;

    /* renamed from: f  reason: collision with root package name */
    public final int f26029f;

    /* renamed from: g  reason: collision with root package name */
    public final int f26030g;

    /* renamed from: h  reason: collision with root package name */
    public final int f26031h;

    /* renamed from: i  reason: collision with root package name */
    public int f26032i;

    public f(j jVar, List list, int i10, ai.e eVar, z zVar, int i11, int i12, int i13) {
        AbstractC3557B.c0("call", jVar);
        AbstractC3557B.c0("interceptors", list);
        AbstractC3557B.c0("request", zVar);
        this.f26024a = jVar;
        this.f26025b = list;
        this.f26026c = i10;
        this.f26027d = eVar;
        this.f26028e = zVar;
        this.f26029f = i11;
        this.f26030g = i12;
        this.f26031h = i13;
    }

    public static f a(f fVar, int i10, ai.e eVar, z zVar, int i11) {
        if ((i11 & 1) != 0) {
            i10 = fVar.f26026c;
        }
        int i12 = i10;
        if ((i11 & 2) != 0) {
            eVar = fVar.f26027d;
        }
        ai.e eVar2 = eVar;
        if ((i11 & 4) != 0) {
            zVar = fVar.f26028e;
        }
        z zVar2 = zVar;
        int i13 = fVar.f26029f;
        int i14 = fVar.f26030g;
        int i15 = fVar.f26031h;
        fVar.getClass();
        AbstractC3557B.c0("request", zVar2);
        return new f(fVar.f26024a, fVar.f26025b, i12, eVar2, zVar2, i13, i14, i15);
    }

    public final D b(z zVar) {
        AbstractC3557B.c0("request", zVar);
        List list = this.f26025b;
        int size = list.size();
        int i10 = this.f26026c;
        if (i10 < size) {
            this.f26032i++;
            ai.e eVar = this.f26027d;
            if (eVar != null) {
                if (eVar.f24235c.b(zVar.f21336a)) {
                    if (this.f26032i != 1) {
                        throw new IllegalStateException(("network interceptor " + list.get(i10 - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + list.get(i10 - 1) + " must retain the same host and port").toString());
                }
            }
            int i11 = i10 + 1;
            f a5 = a(this, i11, null, zVar, 58);
            t tVar = (t) list.get(i10);
            D a10 = tVar.a(a5);
            if (a10 != null) {
                if (eVar != null && i11 < list.size() && a5.f26032i != 1) {
                    throw new IllegalStateException(("network interceptor " + tVar + " must call proceed() exactly once").toString());
                } else if (a10.f21136l0 != null) {
                    return a10;
                } else {
                    throw new IllegalStateException(("interceptor " + tVar + " returned a response with no body").toString());
                }
            }
            throw new NullPointerException("interceptor " + tVar + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
