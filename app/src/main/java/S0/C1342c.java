package S0;

import Ng.AbstractC1070k;
import Ng.C1072l;
import android.graphics.Typeface;
import c8.C2306c;
import r1.AbstractC5355b;

/* renamed from: S0.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1342c extends AbstractC5355b {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f16002e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f16003f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f16004g;

    public C1342c(C1072l c1072l, I i10) {
        this.f16003f = c1072l;
        this.f16004g = i10;
    }

    @Override // r1.AbstractC5355b
    public final void e(int i10) {
        int i11 = this.f16002e;
        Object obj = this.f16003f;
        Object obj2 = this.f16004g;
        switch (i11) {
            case 0:
                ((AbstractC1070k) obj).s(new IllegalStateException("Unable to load font " + ((I) obj2) + " (reason=" + i10 + ')'));
                return;
            default:
                ((C2306c) obj2).f26364m = true;
                ((P4.a) obj).r0(i10);
                return;
        }
    }

    @Override // r1.AbstractC5355b
    public final void f(Typeface typeface) {
        int i10 = this.f16002e;
        Object obj = this.f16003f;
        switch (i10) {
            case 0:
                ((AbstractC1070k) obj).resumeWith(typeface);
                return;
            default:
                C2306c c2306c = (C2306c) this.f16004g;
                Typeface create = Typeface.create(typeface, c2306c.f26354c);
                c2306c.f26365n = create;
                c2306c.f26364m = true;
                ((P4.a) obj).s0(create, false);
                return;
        }
    }

    public C1342c(C2306c c2306c, P4.a aVar) {
        this.f16004g = c2306c;
        this.f16003f = aVar;
    }
}
