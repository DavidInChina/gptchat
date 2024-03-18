package Mb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: Mb.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0950e extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C0954g f11910Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f11911Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C0954g f11912h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f11913i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0950e(C0954g c0954g, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f11912h0 = c0954g;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f11911Z = obj;
        this.f11913i0 |= Integer.MIN_VALUE;
        return C0954g.n(this.f11912h0, this);
    }
}
