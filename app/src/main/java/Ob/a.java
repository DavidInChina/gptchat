package Ob;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class a extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f13668Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ b f13669Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f13670h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f13669Z = bVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f13668Y = obj;
        this.f13670h0 |= Integer.MIN_VALUE;
        return this.f13669Z.a(this);
    }
}
