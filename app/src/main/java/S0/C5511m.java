package s0;

import com.google.android.gms.internal.play_billing.N;

/* renamed from: s0.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5511m implements AbstractC5507i {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45066Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C5515q f45067Z;

    public /* synthetic */ C5511m(C5515q c5515q, int i10) {
        this.f45066Y = i10;
        this.f45067Z = c5515q;
    }

    @Override // s0.AbstractC5507i
    public final double c(double d10) {
        int i10 = this.f45066Y;
        C5515q c5515q = this.f45067Z;
        switch (i10) {
            case 0:
                return N.n(c5515q.f45082k.c(d10), c5515q.f45076e, c5515q.f45077f);
            default:
                return c5515q.f45085n.c(N.n(d10, c5515q.f45076e, c5515q.f45077f));
        }
    }
}
