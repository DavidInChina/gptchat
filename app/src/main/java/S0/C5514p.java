package s0;

import com.google.android.gms.internal.play_billing.N;

/* renamed from: s0.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5514p extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45072Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C5515q f45073Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5514p(C5515q c5515q, int i10) {
        super(1);
        this.f45072Y = i10;
        this.f45073Z = c5515q;
    }

    public final Double a(double d10) {
        int i10 = this.f45072Y;
        C5515q c5515q = this.f45073Z;
        switch (i10) {
            case 0:
                return Double.valueOf(c5515q.f45085n.c(N.n(d10, c5515q.f45076e, c5515q.f45077f)));
            default:
                return Double.valueOf(N.n(c5515q.f45082k.c(d10), c5515q.f45076e, c5515q.f45077f));
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f45072Y) {
            case 0:
                return a(((Number) obj).doubleValue());
            default:
                return a(((Number) obj).doubleValue());
        }
    }
}
