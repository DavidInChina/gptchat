package K8;

import I8.E;
import com.google.gson.reflect.TypeToken;

/* loaded from: classes2.dex */
public final class e extends E {

    /* renamed from: a  reason: collision with root package name */
    public E f9541a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f9542b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f9543c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ I8.n f9544d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TypeToken f9545e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f f9546f;

    public e(f fVar, boolean z10, boolean z11, I8.n nVar, TypeToken typeToken) {
        this.f9546f = fVar;
        this.f9542b = z10;
        this.f9543c = z11;
        this.f9544d = nVar;
        this.f9545e = typeToken;
    }

    @Override // I8.E
    public final Object b(P8.b bVar) {
        if (this.f9542b) {
            bVar.X0();
            return null;
        }
        E e10 = this.f9541a;
        if (e10 == null) {
            e10 = this.f9544d.g(this.f9546f, this.f9545e);
            this.f9541a = e10;
        }
        return e10.b(bVar);
    }

    @Override // I8.E
    public final void c(P8.c cVar, Object obj) {
        if (this.f9543c) {
            cVar.F();
            return;
        }
        E e10 = this.f9541a;
        if (e10 == null) {
            e10 = this.f9544d.g(this.f9546f, this.f9545e);
            this.f9541a = e10;
        }
        e10.c(cVar, obj);
    }
}
