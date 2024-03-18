package L8;

import I8.E;
import I8.F;
import com.google.gson.reflect.TypeToken;

/* loaded from: classes2.dex */
public final class v extends t {

    /* renamed from: a  reason: collision with root package name */
    public final I8.q f10842a;

    /* renamed from: b  reason: collision with root package name */
    public final I8.n f10843b;

    /* renamed from: c  reason: collision with root package name */
    public final TypeToken f10844c;

    /* renamed from: d  reason: collision with root package name */
    public final F f10845d;

    /* renamed from: e  reason: collision with root package name */
    public final y7.b f10846e = new y7.b(this);

    /* renamed from: f  reason: collision with root package name */
    public final boolean f10847f;

    /* renamed from: g  reason: collision with root package name */
    public volatile E f10848g;

    public v(I8.q qVar, I8.n nVar, TypeToken typeToken, F f6, boolean z10) {
        this.f10842a = qVar;
        this.f10843b = nVar;
        this.f10844c = typeToken;
        this.f10845d = f6;
        this.f10847f = z10;
    }

    @Override // I8.E
    public final Object b(P8.b bVar) {
        I8.q qVar = this.f10842a;
        if (qVar == null) {
            return e().b(bVar);
        }
        I8.r J02 = K8.d.J0(bVar);
        if (this.f10847f) {
            J02.getClass();
            if (J02 instanceof I8.t) {
                return null;
            }
        }
        return qVar.a(J02, this.f10844c.getType(), this.f10846e);
    }

    @Override // I8.E
    public final void c(P8.c cVar, Object obj) {
        e().c(cVar, obj);
    }

    @Override // L8.t
    public final E d() {
        return e();
    }

    public final E e() {
        E e10 = this.f10848g;
        if (e10 == null) {
            E g10 = this.f10843b.g(this.f10845d, this.f10844c);
            this.f10848g = g10;
            return g10;
        }
        return e10;
    }
}
