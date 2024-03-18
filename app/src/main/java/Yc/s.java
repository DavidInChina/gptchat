package Yc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class s extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f22275Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f22276Z;

    /* renamed from: h0  reason: collision with root package name */
    public Wg.a f22277h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f22278i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ t f22279j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f22280k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f22279j0 = tVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f22278i0 = obj;
        this.f22280k0 |= Integer.MIN_VALUE;
        return this.f22279j0.h(null, this);
    }
}
