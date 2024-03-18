package pe;

import java.util.Iterator;
import nf.AbstractC4825e;
import pf.AbstractC5156c;
import xe.C6410O;

/* loaded from: classes.dex */
public final class g extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public l f43102Y;

    /* renamed from: Z  reason: collision with root package name */
    public C6410O f43103Z;

    /* renamed from: h0  reason: collision with root package name */
    public Iterator f43104h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f43105i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ l f43106j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f43107k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f43106j0 = lVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f43105i0 = obj;
        this.f43107k0 |= Integer.MIN_VALUE;
        return this.f43106j0.a(null, this);
    }
}
