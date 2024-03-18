package y2;

import E2.C0481m;
import android.content.Context;

/* renamed from: y2.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6529p implements w8.l {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50675Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Context f50676Z;

    public /* synthetic */ C6529p(Context context, int i10) {
        this.f50675Y = i10;
        this.f50676Z = context;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, L2.t] */
    @Override // w8.l
    public final Object get() {
        I2.g gVar;
        switch (this.f50675Y) {
            case 0:
                return new C6526m(this.f50676Z);
            case 1:
                return new C0481m(this.f50676Z, new Object());
            case 2:
                return new H2.p(this.f50676Z);
            default:
                Context context = this.f50676Z;
                x8.k0 k0Var = I2.g.f7974n;
                synchronized (I2.g.class) {
                    try {
                        if (I2.g.f7980t == null) {
                            I2.f fVar = new I2.f(context);
                            I2.g.f7980t = new I2.g(fVar.f7969a, fVar.f7970b, fVar.f7971c, fVar.f7972d, fVar.f7973e);
                        }
                        gVar = I2.g.f7980t;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return gVar;
        }
    }
}
