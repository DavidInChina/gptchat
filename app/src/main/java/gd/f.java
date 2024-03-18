package Gd;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class f extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public g f6285Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f6286Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f6287h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f6288i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ g f6289j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f6290k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f6289j0 = gVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f6288i0 = obj;
        this.f6290k0 |= Integer.MIN_VALUE;
        return g.a(this.f6289j0, this);
    }
}
