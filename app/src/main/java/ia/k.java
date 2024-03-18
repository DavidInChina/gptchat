package Ia;

import Qg.F0;
import ca.C2311c;
import java.util.Map;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class k extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public l f8517Y;

    /* renamed from: Z  reason: collision with root package name */
    public C2311c f8518Z;

    /* renamed from: h0  reason: collision with root package name */
    public Map f8519h0;

    /* renamed from: i0  reason: collision with root package name */
    public C2311c f8520i0;

    /* renamed from: j0  reason: collision with root package name */
    public F0 f8521j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f8522k0;

    /* renamed from: l0  reason: collision with root package name */
    public /* synthetic */ Object f8523l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ l f8524m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f8525n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f8524m0 = lVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f8523l0 = obj;
        this.f8525n0 |= Integer.MIN_VALUE;
        return this.f8524m0.f(null, false, this);
    }
}
