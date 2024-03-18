package fh;

import android.gov.nist.core.Separators;
import eh.AbstractC2904d;
import id.AbstractC3557B;

/* renamed from: fh.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3088o extends C3085l {

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC2904d f30887c;

    /* renamed from: d  reason: collision with root package name */
    public int f30888d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3088o(C3058A c3058a, AbstractC2904d abstractC2904d) {
        super(c3058a);
        AbstractC3557B.c0("json", abstractC2904d);
        this.f30887c = abstractC2904d;
    }

    @Override // fh.C3085l
    public final void a() {
        this.f30884b = true;
        this.f30888d++;
    }

    @Override // fh.C3085l
    public final void b() {
        this.f30884b = false;
        h(Separators.RETURN);
        int i10 = this.f30888d;
        for (int i11 = 0; i11 < i10; i11++) {
            h(this.f30887c.f29416a.f29447g);
        }
    }

    @Override // fh.C3085l
    public final void c() {
        if (this.f30884b) {
            this.f30884b = false;
        } else {
            b();
        }
    }

    @Override // fh.C3085l
    public final void k() {
        e(' ');
    }

    @Override // fh.C3085l
    public final void l() {
        this.f30888d--;
    }
}
