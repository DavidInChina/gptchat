package Oa;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class d extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f13663Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ e f13664Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f13665h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f13664Z = eVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f13663Y = obj;
        this.f13665h0 |= Integer.MIN_VALUE;
        return this.f13664Z.d(null, null, this, false);
    }
}
