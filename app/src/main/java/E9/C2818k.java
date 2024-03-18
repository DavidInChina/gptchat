package e9;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: e9.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2818k extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f29078Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2820m f29079Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f29080h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2818k(C2820m c2820m, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f29079Z = c2820m;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f29078Y = obj;
        this.f29080h0 |= Integer.MIN_VALUE;
        return this.f29079Z.e(null, null, this);
    }
}
