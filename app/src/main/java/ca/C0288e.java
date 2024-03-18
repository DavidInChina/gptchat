package Ca;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: Ca.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0288e extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f2830Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C0290g f2831Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f2832h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0288e(C0290g c0290g, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f2831Z = c0290g;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f2830Y = obj;
        this.f2832h0 |= Integer.MIN_VALUE;
        return this.f2831Z.c(false, this);
    }
}
